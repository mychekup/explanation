// 인터페이스의 장점
// 자바의 정석 305p [예제7-25]
public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
//		Marine marine = new Marine(); 
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(marine); 
		// Marine 클래스는 Repairable인터페이스를 구현하지 않았기 때문에
		// 오류 발생!

	}

}

interface Repairable{}
class GroundUnit extends Unit{

	GroundUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
	
}

class AirUnit extends Unit{

	AirUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
	
}

class Unit{
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;		
	}
}

class Tank extends GroundUnit implements Repairable{

	Tank() {
		super(150); // Tank의 HP는 150
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{

	Dropship() {
		super(125); // Dropship의 HP는 125
		hitPoint = MAX_HP;
	}	
	
	public String toString(){
		
		return "DropShip";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}
 
class SCV extends GroundUnit implements Repairable{

	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r){
		if(r instanceof Unit){
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP){
				/*Unit의 HP를 증가시킨다.*/
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}	
}
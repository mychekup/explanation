// �������̽��� ����
// �ڹ��� ���� 296p [����7-23]
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit1 ) {
			System.out.println("f�� Unit1 Ŭ������ �ڼ��Դϴ�.");			
		}
		if (f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");			
		}
		if (f instanceof Movable){
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Attackable){
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Object){
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}

	}

}
class Fighter extends Unit1  implements Fightable{

	public void move(int x, int y){
		
	}
	
	public void attack(Unit1  u){
		
		
	}
	
	
}

class Unit1 {
	int currentHp;	// ������ ü��
	int x;			// ������ ��ġ(x��ǥ)
	int y;			// ������ ��ġ(y��ǥ)	
}

interface Fightable extends Movable, Attackable{}
interface Movable {void move(int x, int y);}
interface Attackable{void attack(Unit1  u);}
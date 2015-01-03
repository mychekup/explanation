// 인터페이스의 이해
// 자바의 정석 310p [예제7-26]
/*
class A{
	public void methodA(B b){
		b.methodB();
	}
}

class B{
	public void methodB(){
		System.out.println("methodB()");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
			A a = new A();
			a.methodA(new B());
			System.out.println("====================");
	}

}
*/


// 인터페이스를 매개체로 하여 클래스 A가 인터페이스를 통해 클래스 B의 메서드에 접근하도록 한다.

interface I{
	public abstract void methodB();	
}
class B implements I{

	@Override
	public void methodB() {
		System.out.println("methodB in B class");		
	}	
}
class A{
	void methodA(I i){
	i.methodB();
	}
	
}
public class InterfaceTest{
	public static void main(String[] args){
		A a = new A();
		a.methodA(new B());
	}
}
// 클래스 A를 작성하는데 있어 클래스 B가 사용되지 않았다는 점을 주목.
// 이제 클래스 A와 클래스 B는 'A-B'의 직접적인 관계에서 'A-I-B'의 간접적인 관계로 변경


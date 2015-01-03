// 인터페이스의 이해3
// 자바의 정석 313p [예제7-28]
// 매개변수를 통해 동적으로 제공받을 수 도 있지만 제3의 클래스를 통해서 제공 받을 수도 있다.
// JDBC의 DriverManager클래스가 이런 방식으로 처리
public class InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(); 
		// instanceManager클래스로 인해 B클래스를 넘기지 않아도 된다.
	}
}

class A{
	void methodA(){
		I i = InstanceManager.getInstance();
		// 제3의 클래스의 메서드를 통해 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
		i.methodB();
	}
}

class B implements I{
	public void methodB(){
		System.out.println("methodB in B class");
	}
}

class InstanceManager{ // 제3의 클래스
	public static I getInstance(){  
		return new B();
	}
}

interface I{
	public abstract void methodB();
}
// 인터페이스의 이해2
// 자바의 정석 312p [예제7-27]
class A{
	void autoPlay(I i){ // 매개변수를 통해 인터페이스 I를 구현한 클래스 B와 C 
		i.play();
	}	
}
// 클래스 A가 인터페이스 I를 사용해서 작성되긴 하였으나, 매개변수를 통해 인터페이스 I를 구현한 클래스의 
// 인스턴스를 동적으로 제공받아야 한다. 예로 AWT컴포넌트의 addActionListener(ActionListener I)와
// 클래스 Thread의 생성자인 Thread(Runnable target)가 이와 같은 방식으로 처리

interface I{
	public abstract void play();
}

class B implements I{
	public void play(){
		System.out.println("play in B class");
	}
}

class C implements I{
	public void play(){
		System.out.println("play in C class");
	}
}

public class InterFaceTest2 {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B()); // 인터페이스 I를 구현한 클래스 B를 매개변수로 넘김
		a.autoPlay(new C()); // 인터페이스 I를 구현한 클래스 C를 매개변수로 넘김
	}
}
// 클래스 A를 작성하는데 클래스 B가 관련되지 않았다.

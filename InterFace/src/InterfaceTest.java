// �������̽��� ����
// �ڹ��� ���� 310p [����7-26]
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


// �������̽��� �Ű�ü�� �Ͽ� Ŭ���� A�� �������̽��� ���� Ŭ���� B�� �޼��忡 �����ϵ��� �Ѵ�.

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
// Ŭ���� A�� �ۼ��ϴµ� �־� Ŭ���� B�� ������ �ʾҴٴ� ���� �ָ�.
// ���� Ŭ���� A�� Ŭ���� B�� 'A-B'�� �������� ���迡�� 'A-I-B'�� �������� ����� ����


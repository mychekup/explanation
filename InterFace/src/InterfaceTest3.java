// �������̽��� ����3
// �ڹ��� ���� 313p [����7-28]
// �Ű������� ���� �������� �������� �� �� ������ ��3�� Ŭ������ ���ؼ� ���� ���� ���� �ִ�.
// JDBC�� DriverManagerŬ������ �̷� ������� ó��
public class InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(); 
		// instanceManagerŬ������ ���� BŬ������ �ѱ��� �ʾƵ� �ȴ�.
	}
}

class A{
	void methodA(){
		I i = InstanceManager.getInstance();
		// ��3�� Ŭ������ �޼��带 ���� �������̽� I�� ������ Ŭ������ �ν��Ͻ��� ���´�.
		i.methodB();
	}
}

class B implements I{
	public void methodB(){
		System.out.println("methodB in B class");
	}
}

class InstanceManager{ // ��3�� Ŭ����
	public static I getInstance(){  
		return new B();
	}
}

interface I{
	public abstract void methodB();
}
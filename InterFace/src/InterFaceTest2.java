// �������̽��� ����2
// �ڹ��� ���� 312p [����7-27]
class A{
	void autoPlay(I i){ // �Ű������� ���� �������̽� I�� ������ Ŭ���� B�� C 
		i.play();
	}	
}
// Ŭ���� A�� �������̽� I�� ����ؼ� �ۼ��Ǳ� �Ͽ�����, �Ű������� ���� �������̽� I�� ������ Ŭ������ 
// �ν��Ͻ��� �������� �����޾ƾ� �Ѵ�. ���� AWT������Ʈ�� addActionListener(ActionListener I)��
// Ŭ���� Thread�� �������� Thread(Runnable target)�� �̿� ���� ������� ó��

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
		a.autoPlay(new B()); // �������̽� I�� ������ Ŭ���� B�� �Ű������� �ѱ�
		a.autoPlay(new C()); // �������̽� I�� ������ Ŭ���� C�� �Ű������� �ѱ�
	}
}
// Ŭ���� A�� �ۼ��ϴµ� Ŭ���� B�� ���õ��� �ʾҴ�.

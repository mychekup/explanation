package Exercise;
/*
[7-1]����ī�� 20���� �����ϴ� ����ī�� �� ��(SutdaDeckŬ����)�� ������ ���̴�.
����ī�� 20���� ��� SutdaCard�迭�� �ʱ�ȭ�Ͻÿ�. ��, ����ī��� 1���� 10������ ���ڰ� 
���� ī�尡 �� �־� �ְ�, ���ڰ� 1,3,8�� ��쿡�� �� ���� �� ���� ��(Kwang)�̾�� �Ѵ�.
��, SutdaCard�� �ν��Ͻ� ���� isKwang�� ���� true�̾�� �Ѵ�.
*/
class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		/*
		 �迭 SutdaCard�� ������ �ʱ�ȭ.
		 */
		for(int i=0; i<10; i++){
			if(i==0 || i==2 || i==7){
				cards[i] = new SutdaCard(i+1, true);
				cards[i+10] = new SutdaCard(i+1, false);
			}
			else{
				cards[i] = new SutdaCard(i+1, false);
				cards[i+10] = new SutdaCard(i+1, false);
			}
		}
		
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()��� ObjectŬ������ toString()�� �������̵��ߴ�.
	public String toString(){
		return num + (isKwang ? "K":"");
	}
}
public class Exercise7_1 {
	
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++){
			System.out.print(deck.cards[i] + ", ");
		}
	}
}

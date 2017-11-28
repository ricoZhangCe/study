package study;

public class Test {
	String str = new String("good");
	char[] ch ={'a','b','c'};
	public void change(String str,char ch[]){
		str = "test OK";
		ch[0] = 'g';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test= new Test();
		test.change(test.str, test.ch);
		System.out.println(test.str+"and");
		System.out.println(test.ch);
	}

}

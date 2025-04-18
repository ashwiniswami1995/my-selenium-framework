package ThisTestSample;

public class ThisTest {
	 int number;
	 String name;

	ThisTest(int number, String name) {
		this();
		this.number = number;
		this.name = name;// 'this' refers to the instance variable
		System.out.println("under constructor  "+name +"  "+number);
	}

	ThisTest() {
		System.out.println("default constructor");

	}

	public static void main(String[] args) {

		ThisTest obj = new ThisTest(10, "ash");
		System.out.println(obj.name + " " + obj.number);
		ThisTest obj1 = new ThisTest(11, "atish");
		ThisTest obj2 = new ThisTest(11, "aaaaaaa");

		System.out.println(obj1.name + " " + obj1.number);
		System.out.println(obj1.name + " " + obj2.number);


	}
}



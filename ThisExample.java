package day9_constructors;

//this keyword can be used to call variable | method|constructor 
public class ThisExample {

	int code;
	ThisExample()
	{
		code=22;
	}
	ThisExample(int code)
	{
		this();
		
		this.code=code;
		this.show();
	}
	void show()
	{
		System.out.println("ssdksd");
	}
	public static void main(String[] args) {
		
	}

}

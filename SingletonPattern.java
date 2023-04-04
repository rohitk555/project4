package day9_constructors;
//singleton design pattern 
//1 ) only single object per class should be created 
//2)  make private constructor 
//3) create object of class inside class
//4) create factory method that return same class object 
class DbCon
{
	String con;
	
	static DbCon d= new DbCon();
	
	private DbCon()
	{
		con="localhost:3306/db";
	}
	
	void show()
	{
		System.out.println(con);
	}
	//factory method
	static  DbCon getCon()
	{
		return d;
	}
}
public class SingletonPattern {

	public static void main(String[] args) {
		
  DbCon e= DbCon.getCon();

  DbCon e1= DbCon.getCon();

  DbCon e2= DbCon.getCon();
  e.show();
  System.out.println(e.hashCode());
  System.out.println(e1.hashCode());
  System.out.println(e2.hashCode());
  
	}

}

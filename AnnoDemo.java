class MyClass 
{
	private String msg;
	MyClass(String m)
	{
		msg = m;
	}

	String getMsg(){
		return msg;
	}
}
class AnnoDemo
{
	public static void main(String[] args) 
	{
		MyClass myObj = new MyClass();
		System.out.println(myObj.getMsg());
	}
}

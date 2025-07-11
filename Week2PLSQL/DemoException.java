class MyException extends Exception{
	public MyException(String msg){
	super(msg);
    }
}
public class DemoException{
	public static void main(String args[]){
		try{
	           m1();
		}
		catch(MyException e){
			 System.out.println(e.getMessage());
		}
		System.out.println("Program End");
	}	
	public static void m1() throws MyException{
		throw new MyException("custom exception");
	}
}
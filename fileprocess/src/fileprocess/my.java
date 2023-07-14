package fileprocess;

public class my {
public int sub10n(int num) throws foodExcept  {
	if(num<10) {
		 throw new Exception("num is smaller than 10");}
	
	
return num-10;
}
public class foodExcept extends Exception{
	
	public foodExcept(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public foodExcept(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public foodExcept(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public foodExcept(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
}
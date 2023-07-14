package lambdasfunc;

public class appl {
	public static void main(String args[]) {
		cal sum=(a,b) -> a+b;
		System.out.println(sum.cal(5, 5));
		
	
	cal zerodiv=(a,b)-> {
			if(a==0)
			{
				return 0;
			}
			return a/b;
	};
	
	System.out.println(zerodiv.cal(15, 5));
	
	inface<String> str=(s) -> {
		String res=" ";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		return res;
	};
	System.out.println(str.walk("Isha"));
	
	
	inface<Integer> f=(n) -> {
		int r=1;
		for(int i=1;i<=n;i++) {
			r=i*r;
		}
		return r;
	};
	System.out.println(f.walk(3));
}}

interface cal
{
	public int cal(int a,int b);
}
interface inface <T>{
	public T walk(T t);
}
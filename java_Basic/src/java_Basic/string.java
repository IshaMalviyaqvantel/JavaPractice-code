package java_Basic;

public class string {

	public static void main(String[] args) {
		String st="Isha";
		System.out.println(st);
		System.out.println("The length of given string :  "+st.length());
        String str="ABCDE";
        System.out.println(str.substring(3));
        System.out.println(str.substring(1,4));
        String a="hello";
        String b="there";
        
      System.out.println(a.charAt(4))  ;
      
        if(a.equals("hello")) {
        System.out.println(a);
        }
if(b.equalsIgnoreCase("THere")) {
	System.out.println("print here");
}

	String s=" there are yogi there";
	System.out.println(s.indexOf("there"));
	System.out.println(s.indexOf("there", 7));
	System.out.println(s.lastIndexOf("yogi"));
	}

}

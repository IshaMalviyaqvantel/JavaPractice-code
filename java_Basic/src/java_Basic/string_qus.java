package java_Basic;

public class string_qus {
	public static void main(String args[]) {
		String st="I m Isha mal"+" Isha working at qvantal"+"Isha do serially & sincerely ";
		stcon(st); 
	} 

	public static  void   stcon(String st) {
	int i=0;
	
			int f=st.indexOf("Isha",i);
			
			int s=f+4;
			int e= st.indexOf(" ", s);
			System.out.println(st.substring(s,e));
			i=e+1;
		}


}

package java_Basic;
import java.util.*;

public class switch_case {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		 int day= sc.nextInt();
		 String st;
		 
		 switch(day){
		 case 1: st="Monday";
		 break;
		 case 2: st="tuesday";
		 break;
		 case 3: st="wednesday";
		 break;
		 case 4: st="thrusday";
		 break;
		 case 5: st="friday";
		 break;
		 case 6: st="saturday";
		 break;
		 case 7: st="sunday";
		 break;
		 default: st="not exist";
		 break;
			}
		System.out.println(st);
		}


	}


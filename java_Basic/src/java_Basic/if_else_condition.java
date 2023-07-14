package java_Basic;
import java.util.*;
public class if_else_condition {
	public static void main(String args[]) {
		 Scanner sc= new Scanner(System.in);
		 
			int favt=75;
			int curt=40   ;
			String opinion;
			if(curt<favt-30) {
				opinion= "pretty cold";
				
				
			}
			else if(curt< favt-20) {
				opinion=" cold out";
			}
			else if(curt>favt+10) {
				opinion ="hot out";
			
			}
			else {opinion="beautiful day";}
				System.out.println(opinion);

	}
	

}

package afjdfkjdfok;
import java.util.*;
public class CalcGross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
			int e =	s.nextInt();
			int temp = e;
		int grosscount = 0;
		int dozencount=0;
		if(e>143) {
		grosscount = e/144;  //2
		
		System.out.println(grosscount);
		}
		e=e-144*grosscount;
		
		if(e>11&&e<=143) {
			
		dozencount = e/12;
		System.out.println(dozencount); 
		}
		e= e-12*dozencount;
		if(e<12)
			System.out.println(e);
		
	}

}

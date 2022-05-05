/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double Analog1=sc.nextDouble();
	   double Analog2=sc.nextDouble();
	    if(Analog1>56 && Analog2>550)
	    {
	        double s1= Analog1-56;
	        double s2=Analog2-550;
	        double p1=(s1/56)*100;
	        double p2=(s2/550)*100;
	        double avg=(p1+p2)/2;
	        System.out.println(avg+"% Rotten");
	    }
	    else if(Analog1<56 && Analog2<550)
	    {
	        
	        double s1= 56-Analog1;
	        double s2=550-Analog2;
	        double p1=(s1/56)*100;
	        double p2=(s2/550)*100;
	        double avg=(p1+p2)/2;
	        System.out.println(avg+"% Fresh");
	    }
	    else{
	        System.out.println("Rotten");
	    }
	    
	}
}

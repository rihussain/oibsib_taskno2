import java.util.*;

//Number Guessing Game
public class numg
{
    
	public static void main(String[] args) {
	    Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int fn=r.nextInt(101),gn,i=10;  //fn-- from digits from 0-100(i.e.,101-1)
	
		boolean f=true;
		
		while(f&&i!=0)
		{
		    System.out.print("Enter your number: ");
		    gn=sc.nextInt();
		    if(gn==fn)
		    {
		        System.out.println("Correct! and Your score is: "+i--);
		        f=false;
		    }
		    else
		    {
		       System.out.println(gn<fn?"Lesser!":"Greater!");
		       i--; 
		    }
		}
		if(i==0)
		    System.out.print("You're out of points!!!");
		 
		        
	}
}

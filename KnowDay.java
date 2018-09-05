//day on which u r born
import java.util.Scanner;
class KnowDay
{
	public static void main(String args[])
	{
		System.out.println("Enter your date of birth in this format");
		System.out.println("DD	MM	YYYY");
		Scanner sc=new Scanner(System.in);
		int DD=sc.nextInt();
		int MM=sc.nextInt();
		int YYYY=sc.nextInt();
		int Jan=1,Oct=1,Sun=1,May=2,Mon=2,Aug=3,Tue=3,Nov=4,Feb=4,Mar=4,Wed=4,Jun=5,Thur=5,Sept=6,Dec=6,Fri=6,Apr=0,Jul=0,Sat=0;
		int num=YYYY%100;
		int r,s=0,d,yk;
		String Day[]={"Sat","Sun","Mon","Tue","Wed","Thur","Fri"};
		if(YYYY>=1700 && YYYY<1800)
			yk=4;
		else if(YYYY>=1800 && YYYY<1900)
			yk=2;
		else if(YYYY>=2000)
			yk=6;
		else
			yk=0;
		if((YYYY%4==0 && YYYY%100!=0)||(YYYY%4==0 && YYYY%100==0 && YYYY%400==0))
		{
			if((DD>31 && MM==1)||(DD>29 && MM==2)||(DD>31 && MM==3)||(DD>30 && MM==4)||(DD>31 && MM==5)||(DD>30 && MM==6)||(DD>31 && MM==7)||(DD>31 && MM==8)||(DD>30 && MM==9)||(DD>31 && MM==10)||(DD>30 && MM==11)||(DD>31 && MM==12))
			{
				System.out.println("Invalid date and month value");
			}
			else
			{
				switch(MM)
				{
					case 1: r=num/4;
					        s=s+r+DD;
				    		s=s+0;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 2: r=num/4;
					        s=s+r+DD;
				    		s=s+3;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
								System.out.println("ur DOB is "+DD+" January "+YYYY);
							    System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 3: r=num/4;
					        s=s+r+DD;
				    		s=s+4;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 4: r=num/4;
					        s=s+r+DD;
				    		s=s+0;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 5: r=num/4;
					        s=s+r+DD;
				    		s=s+2;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 6: r=num/4;
					        s=s+r+DD;
				    		s=s+5;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 7: r=num/4;
					        s=s+r+DD;
				    		s=s+0;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 8: r=num/4;
					        s=s+r+DD;
				    		s=s+3;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 9: r=num/4;
					        s=s+r+DD;
				    		s=s+6;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 10: r=num/4;
					        s=s+r+DD;
				    		s=s+1;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 11: r=num/4;
					        s=s+r+DD;
				    		s=s+4;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					case 12: r=num/4;
					        s=s+r+DD;
				    		s=s+6;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]+" and u r born in a leap year");
							}
							break;
					default: System.out.println("invalid choice");
	       		}
			}
	   }
	    else
	    {
			if((DD>31 && MM==1)||(DD>28 && MM==2)||(DD>31 && MM==3)||(DD>30 && MM==4)||(DD>31 && MM==5)||(DD>30 && MM==6)||(DD>31 && MM==7)||(DD>31 && MM==8)||(DD>30 && MM==9)||(DD>31 && MM==10)||(DD>30 && MM==11)||(DD>31 && MM==12))
			{
				System.out.println("Invalid date and month value");
			}
			else
			{
				switch(MM)
				{
					case 1: r=num/4;
					        s=s+r+DD;
				    		s=s+1;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 2: r=num/4;
					        s=s+r+DD;
				    		s=s+4;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
								System.out.println("ur DOB is "+DD+" January "+YYYY);
						        System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 3: r=num/4;
					        s=s+r+DD;
				    		s=s+4;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 4: r=num/4;
					        s=s+r+DD;
				    		s=s+0;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 5: r=num/4;
					        s=s+r+DD;
				    		s=s+2;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 6: r=num/4;
					        s=s+r+DD;
				    		s=s+5;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 7: r=num/4;
					        s=s+r+DD;
				    		s=s+0;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 8: r=num/4;
					        s=s+r+DD;
				    		s=s+3;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 9: r=num/4;
					        s=s+r+DD;
				    		s=s+6;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 10: r=num/4;
					        s=s+r+DD;
				    		s=s+1;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 11: r=num/4;
					        s=s+r+DD;
				    		s=s+4;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					case 12: r=num/4;
					        s=s+r+DD;
				    		s=s+6;
							s=s+yk;
							s=s+num;
							d=s%7;
							if(d==Sun || d==Mon || d==Tue || d==Wed || d==Thur || d==Fri || d==Sat)
							{
							      System.out.println("ur DOB is "+DD+" January "+YYYY);
							      System.out.println("the day u r born is "+Day[d]);
							}
							break;
					default: System.out.println("invalid choice");
		  		}
	  		}
		}
	}
}

import java.util.*;
class Movie
{
    public static final String[] Movie_Hall = {"Audi A1","Audi A2","Audi A3"};
    public String[] movieName = {"three idiot","discovery","lpki"}; 
    public static final String[] genre= {"avengers","jeet","tanhaji"};
    public static final int No_Of_Seats[] = {40,50,60};
    public int price[] = {250,350,400};
    public Movie() {
    	System.out.println("Welcome to cinema hall !!");
    	
    }
}
class Booking extends Movie
{
    protected String name;
    protected String email;
    protected long phone;
    protected int Audi;
    protected int seat;
    public void read() 
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your email: ");
        email = sc.next();
        System.out.println("Enter your phone number: ");
        try {
            phone = sc.nextLong();
            System.out.println("you want to go in which audi?");
            System.out.println("Press 1 for Audi - A1\n Press 2 for Audi -A2\n Press 3 for Audi -A3");
            Audi = sc.nextInt();
            System.out.println("No. of seats you want to book");
            seat = sc.nextInt();
            if(No_Of_Seats[Audi-1] < seat)
            {
                System.out.println("Oops!! There are " + No_Of_Seats[Audi-1] + " available seats for " + movieName[Audi-1]);
                
            }
        } 
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Thanks for your time");
        }
        
        No_Of_Seats[Audi-1] = No_Of_Seats[Audi-1] - seat;
    }
    public void show()
    {
        System.out.println("Name : "+name + " Email : " + email+" Phone Number : " + phone+ "Movie Name : "+ movieName[Audi-1]+"Booking Seat : " + seat);
    }
    public void audiRev() {
    	int audiRev=seat*price[Audi-1];
    	System.out.println("Revenue Collected By  "+  Movie.Movie_Hall[Audi-1]+" is "+audiRev);
    	
    }
    public int audiTotal()
    {
    	return seat*price[Audi-1];
    }
}

public class MyArray
{
	public static void main (String []args) 
	{
		
		Movie m = new Movie();
		Booking b[];
		b = new Booking[5];
		int k=0;
		while(k<5)
		{
		    System.out.println("\n1. List Movie Hall with Movie Name\n2. Book your seats\n3. List Booking\n4. Revenue By Audi\n5. Total Revenue");
		    Scanner sc=new Scanner(System.in);
		    int n = sc.nextInt();
		    switch(n)
    		{
    		    case 1:
            		for ( int i =0; i<3 ; i++)
            		{ 
            			System.out.println(" "+"Movie Hall :" +Movie.Movie_Hall[i] +" \t"+" Movie Name :" + m.movieName[i] + " \t"+" Movie Type :" + Movie.genre[i] +" \t "+"Number Of Seats : " + m.No_Of_Seats[i] + "\t "+"Price :" + m.price[i]);
            		}
            		break;
            	case 2:
            	    b[k] = new Booking();
            	    b[k].read();
            	    k++;
            	    break;
            	 case 3:
            	     for(int l=0;l<k;l++)
            	     b[l].show();
            	     break;
		         case 4:
		        	 for(int i=0;i<k;i++)
	            	     b[i].audiRev();
	            	     break;
		         case 5:
		        	 int totalRev = 0;
		        	 for(int i=0;i<k;i++)
		        	 {
		        		 totalRev += b[i].audiTotal();
		        	 }
		        	 System.out.print("Total Revenue By  All Audi  is :"  +totalRev);
	            	     break;
		        

		         default:
		            	 System.out.println("You Press the Wrong Input");
		            	 break;
	            	  
            	 
    		}
		}
	    
	}
}



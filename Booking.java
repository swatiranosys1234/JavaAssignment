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
            System.out.println("Which Audi do you want to go?");
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


//Tourism Management System
import java.util.*;

//import javax.xml.transform.Source;
import java.time.LocalDate; 
class Tour
{
	int userCnt  = 0;
	int n,userType , year ,month , day;
	double amt;
	String name,eMail,uPass,cPass,st,login_name,login_pass,tourDate,tb="no",enterChoice="no";
	
	void viewTours()
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println();
		boolean f=true;
        while(f)
		{
			System.out.println();
			System.out.println("---->Available tours");
			System.out.println();
			System.out.println("1. City tour");
			System.out.println("2. Nature tour");
			System.out.println("3. Historical tour");
			System.out.println("4. Exit!");
            System.out.println();
			System.out.print("Enter your choice from available tours : ");
			int ch = sc.nextInt();
            System.out.println();
			
			switch(ch){
			case 1:{
					System.out.println("1.  Sheemla Manali ");
					System.out.println("2.  Delhi ");
					System.out.println("3.  Kerela ");
					System.out.println("4.  Goa ");
					System.out.println("5.  EXIT!");
					
					System.out.println();
					System.out.print("Enter your choice from avilable places : ");
					int userType = sc.nextInt();
                    System.out.println();
					
					
					if(userType == 1){
						st="Sheemla Manali";
						shimlaManaliTour();
					}
					else if(userType==2){
						st="Delhi";
						delhiTour();
					}
					else if(userType==3){
						st="Kerala";
						keralaTour();
					}
					else if(userType==4){
						st="Goa";
						goaTour();
					}
					else if(userType==5)
					break;	
					else
					{
						System.out.println("Invalid Choice : ");	
						break;
					}
				}
				sc.nextLine();
				System.out.println("Do you want to book tour for "+ st +" ? " );
				tb=sc.nextLine();
				if(tb.equalsIgnoreCase("yes"))
				{
					bookedTourDetails();
				}
				else{
					System.out.println("OPPS! , YOU CAN EXPLORE OTHER PLACES.");
				}
				break;
					case 2:
					{
					System.out.println("1.  Udaypur ");
					System.out.println("2.  Kashmir ");
					System.out.println("3.  Bangluru-Ooty ");
					System.out.println("4.  EXIT ");
                    System.out.println();
					System.out.print("Enter your choice from avilable places : ");
					userType = sc.nextInt();
					System.out.println();
					if(userType == 1){
						st="Udaypur";
						udaipurTour();
					}
					else if(userType==2){
						st="Kashmir";
						kashmirTour();
					}
					else if(userType==3){
						st="bangluru-Ooty";
						bangluruOotyTour();
					}
					else if(userType==4)
					break;
					else
					{
						System.out.println("Invalid Choice : ");	
						break;
					}
				}
				sc.nextLine();
                System.out.println();
				System.out.println("Do you want to book tour for "+st+" ? " );
				tb=sc.nextLine();
                System.out.println();
				if(tb.equalsIgnoreCase("yes"))
				{
                    System.out.println();
					bookedTourDetails();
				}
				else{
					System.out.println("OPPS! , YOU CAN EXPLORE OTHER PLACES.");
				}
				break;

            case 3:{
					System.out.println("1.  Lonavala ");
					System.out.println("2.  Leh Laddakh ");
					System.out.println("3.  Matheran ");
					System.out.println("4.  EXIT ");
                    System.out.println();
					System.out.print("Enter your choice from avilable places : ");
					userType = sc.nextInt();
                    System.out.println();
					
					if(userType == 1){
						st="Lonavala";
						lonavalaTour();
					}
					else if(userType==2){
						st="Leh Laddakh";
						lehladakhTour();
					}
					else if(userType==3){
						st="Matheran";
						matheranTour();
					}
					else if(userType==4)
					break;
					else
					{
						System.out.println("Invalid Choice : ");	
						break;
					}
				}
				sc.nextLine();
				System.out.println(" Do you want to book tour for "+st+" ? " );
				tb=sc.nextLine();
				if(tb.equalsIgnoreCase("yes"))
				{
                    System.out.println();
					bookedTourDetails();
				}
				else{
					System.out.println("OPPS! , YOU CAN EXPLORE OTHER PLACES.");
				}
				break;
			case 4 :
					System.out.println("Do you want to book any tour(Yes/No)?");
					sc.nextLine();
					enterChoice = sc.nextLine();
                    System.out.println();
                    
					if(enterChoice.equalsIgnoreCase("yes"))
					{
                        System.out.print("Enter tour name : " );
                        st = sc.nextLine();
                        System.out.println();
                        checkSelectedTour();
                        System.out.println();
						System.out.println("                                               ------You have to full fill below details------                                     " );
                        System.out.println();
						bookedTourDetails();
					}
					else
					{
						System.out.println("                                THANK YOU FOR USING OUR TOURISM SYSTEM!                ");
					}
					f= false;
					break;
					
            default:
                    System.out.println("Invalid choice, please try again.");
                    System.out.println();
					break;
			}
		}
	}
	void shimlaManaliTour()
	{
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Solang Vally");
		System.out.println(" 2 : Rohtang ");
		System.out.println(" 3 : Kurfi");
		System.out.println(" 4 : The Ridge");
		System.out.println(" 5 : Chadwick falls");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : The Legacy Hotel");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("15000/person for 7 Days and 6 Nights");
		System.out.println();
	}
	
	void keralaTour()
	{
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Munnar ");
		System.out.println(" 2 : Kochi");
		System.out.println(" 3 : Thekkady Alleppey");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : The Avenue Regent");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("12000/person for 5 Days and 4 Nights");
		System.out.println();
		
	}
	void kashmirTour()
	{
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
        System.out.println(" 1 : Gulmarg ");
		System.out.println(" 2 : Shalimar bagh");
		System.out.println(" 3 : Vaishnodevi");
		System.out.println(" 4 : Indira gandhi");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Mirage");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("13000/person for 7 Days 6 Nights");
        System.out.println();
		
	}
	
	void delhiTour()	
	{
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Tajmahal ");
		System.out.println(" 2 : India gate");
		System.out.println(" 3 : Akshardham");
		System.out.println(" 4 : Lotus temple ");
		System.out.println(" 5 : National museum");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Erose");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("10000/person for 5 Days and 4 Nights");
		System.out.println();
	}
	
	void lehladakhTour()
	{
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Leh palace  ");
		System.out.println(" 2 : Khardungala");
		System.out.println(" 3 : Maganetic hill");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Zostel");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("14000/person for 5 Days and 4 Nights");
        System.out.println();
		
	}
	
	void bangluruOotyTour(){
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Avalanche lake  ");
		System.out.println(" 2 : Doddabetta Peak");
		System.out.println(" 3 : Pykara waterfall");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Lemon tree hotel");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("12000/person for 5 Days and 4 Nights");
        System.out.println();
		
	}
	
	void goaTour(){
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Palolem beach  ");
		System.out.println(" 2 : Panaji ");
		System.out.println(" 3 : Agonda ");
		System.out.println(" 4 : Velha Goa ");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Le Meridien Hotel");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("14000/person for 5 Days and 4 Nights");
        System.out.println();
		
	}
	
	void matheranTour(){
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Louisa Point   ");
		System.out.println(" 2 : Matheran Hill Station");
		System.out.println(" 3 : Chhatrapati shivaji maharaj Ladder ");
		System.out.println(" 4 : Panorama point ");
		System.out.println(" 5 : King George Point ");
		System.out.println(" 6 : Echo point ");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Treebo Trend Cecil");
		System.out.println();
		System.out.println("                                                 **************PACKAGE**************          ");
        System.out.println();
		System.out.println("9000/person for 3 Days and 2 Nights");
        System.out.println();
		
	}
	
	void lonavalaTour(){
		System.out.println("                                                 ***************PLACES***************         ");
        System.out.println();
		System.out.println(" 1 : Delle Advanture Park  ");
		System.out.println(" 2 : Kune Falls ");
		System.out.println(" 3 : karla Caves ");
		System.out.println(" 4 : Visapur Killa ");
		System.out.println(" 5 : Lions point ");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Citrus Hotel");
        System.out.println();
		System.out.println("                                                 ************** PACKAGE **************          ");
        System.out.println();
		System.out.println("13000/person for 6 Days and 5 Nights");
        System.out.println();
		
	}
	void udaipurTour(){
		System.out.println("                                                 *************** PLACES ***************         ");
        System.out.println();
		System.out.println(" 1 : Bagore ki haveli  ");
		System.out.println(" 2 : Sajjangarh Monsoon Place ");
		System.out.println(" 3 : Ambrai ghat ");
		System.out.println(" 4 : City Palace ");
		System.out.println();
		System.out.println("                                                **************** HOTEL ******************       ");
        System.out.println();
		System.out.println("Provided hotel by us : Bhanwar Villa ");
		System.out.println();
		System.out.println("                                                 ************** PACKAGE **************          ");
        System.out.println();
		System.out.println("11000/person for 4 Days and 3 Nights");
        System.out.println();
		
	}	
	
	void bookedTourDetails()
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("                                                ************** BOOKING PROCESS **************                             ");
        System.out.println();
		
        System.out.print("Enter total number of members : ");
		n = sc.nextInt();
        Member m[] = new Member[n];
		sc.nextLine();
        
		for(int i = 0 ;i<n;i++)
		{
			System.out.println();
            m[i] = new Member();
			System.out.println("                                              -------------> Details of Member  "+(i+1)+" <-----------   ");
			System.out.print("Enter name  : ");
			name = sc.nextLine();
			System.out.print("Enter email : ");
			eMail = sc.nextLine();
            System.out.println();
		}  
        System.out.println(); 	
		selectedTour();
	}
	void checkDate(){
		LocalDate startDate = LocalDate.of(2023,3,1);
        LocalDate endDate = LocalDate.of(2023, 6, 30);
		Scanner sc =new Scanner(System.in);
        //Create the date object to check
        
		while(true){
			//Use the isAfter() and isBefore() method to check date
			
			System.out.print("Enter the tour day(1-31) : ");
			day = sc.nextInt();
			System.out.print("Enter the tour month(3-6) : ");
			month = sc.nextInt();
			System.out.print("Enter the tour year(2023) : ");
			year = sc.nextInt();
			System.out.println();
			LocalDate dateToValidate = LocalDate.of( year, month ,  day);
			if(dateToValidate.isAfter(startDate) && dateToValidate.isBefore(endDate))
			{
				//System.out.println("The date "+dateToValidate+" lies between the two dates");
				break;
			}
			else
			{
				System.out.println("OOPS!!" + dateToValidate +" does not lie between the two dates.\nPlease enter vaild date");
				System.out.println();
				
			}
		}
        
	}
	void selectedTour()
	{
		Scanner sc =new Scanner(System.in);
		checkDate();
		System.out.println();
        System.out.println("Tour name : "+ st);
		System.out.println();
        checkSelectedTour();
        System.out.println();
	
		System.out.println("On " + day + "-" + month + "-" + year + "  , a tour is successfully reserved for " + st + ".");
        System.out.println();
		System.out.println("Do you want to print reciept ? ");
		String pr=sc.nextLine();
		if(pr.equalsIgnoreCase("yes"))
		{
            System.out.println();
			printReciept();
		}
    }
	void checkSelectedTour(){
        Scanner sc = new Scanner(System.in);
		if(st.equalsIgnoreCase("Sheemla Manali"))
		{
			amt=15000;
			shimlaManaliTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("kerala"))
		{
			amt=12000;
			keralaTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("delhi"))
		{
			amt=10000;
			delhiTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("goa"))
		{
			amt=14000;
			goaTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("bangluru-Ooty"))
		{
			amt=12000;
			bangluruOotyTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("lonavala"))
		{
			amt=13000;
			lonavalaTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("kashmir"))
		{
			amt=13000;
			kashmirTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("Leh Laddakh"))
		{
			amt=14000;
			lehladakhTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
		else if(st.equalsIgnoreCase("matheran"))
		{
			amt=9000;
			matheranTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}		
		else if(st.equalsIgnoreCase("udaypur"))
		{
			amt=11000;
			udaipurTour();
			System.out.println("\nYour final bill for "+n+" members -> " +n*amt);
		}
        else{
            System.out.println("ENTER VAILD PLACE!!!");
			System.out.println();
            System.out.println("Enter tour name : ");
            st = sc.nextLine();
			System.out.println();
        }
		
		
	}

	void printReciept()
	{
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Number of members : "+n);
		System.out.println("Tour Name         : "+st);
		System.out.println("Tour Date	: " + day+"-" + month + "-" + year  );
		System.out.println("Amount/person     : "+amt);
		System.out.println("Amount/person     : "+n*amt);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
	}
}
class Member extends Tour
{
	
	String name,eMail,uPass,cPass,phNo;
	String shimlaManali,delhi,kerala,kashmir,matheran,goa,lehladakh,lonavala,bangluruOoty,udaipur;
	
	void signUp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name         : ");
		name = sc.nextLine();
		System.out.print("Enter Your E-mail       : ");
		eMail = sc.nextLine();
		checkPhn();
		System.out.println();
		System.out.println("						-----> LOGIN <----- 													");
		login();
	}

	void checkPhn(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Phone Number : ");
		phNo = sc.nextLine();
		if(phNo.length()==10)
		{
			setPass();
		}
		else{
            System.out.println();
			System.out.println("PLEASE ENTER VAILD PHONE NUMBER!! \nTRY AGAIN!");
            System.out.println();
			checkPhn();
		}
	}
	void setPass()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Password     : ");
		uPass = sc.nextLine();
		System.out.print("Confirm Password        : ");
		cPass = sc.nextLine();
		if(uPass.equals(cPass))
		{
			System.out.println();
			System.out.println("                                            ****SUCCESSFULLY REGISTERED****                                     ");
			System.out.println();
		}
		else
		{
            System.out.println();
			System.out.println("PLEASE ENTER VAILD PASSWORD!!!");
            System.out.println();
			setPass();
		}
	}	
	void login()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Enter your name : " );
		login_name = sc.nextLine();
		System.out.print("Enter your password : ");
		login_pass = sc.nextLine();
		
		if(login_name.equalsIgnoreCase(name) && (login_pass.equals(uPass))){
			System.out.println();
			System.out.println("					*****YOU ARE SUCESSFULLY LOGIN*****  										");
			System.out.println();
		}
		else{
			System.out.println();
			System.out.println("INVAILD PASSWORD OR NAME!!!");
			System.out.println();
			login();
		}
	}
	void tourData()
	{
		int choice= 0;
		boolean b = true;
        while(b)
		{
			Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Please select an option");
            System.out.println();
            System.out.println("1. View available tours");
            System.out.println("2. Check tour booking.");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Select an option : ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    viewTours();
                    break;
                case 2:
                    if(tb.equalsIgnoreCase("yes") || enterChoice.equalsIgnoreCase("yes")){
                        printReciept();
                    }
                    else{
                        System.out.println("PLEASE SELECT TOUR WHICH YOU WANT TO BOOK");
					    viewTours();
                    }
					
                    break;
                case 3:
					b = false;
                    System.out.println("                                THANK YOU FOR USING OUR TOURISM SYSTEM!                ");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
					break;
            }
        } 
    }
}
class TourismMgmt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                            WELCOME TO OUR TOURISM MANAGEMENT SYSTEM                                                        ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Member m = new Member();
		System.out.println("                                                -----> SIGN UP <-----                                                                ");
		m.signUp();
        System.out.println();
        System.out.println("                                                ------> MAIN MENU <-------                                                                ");
		m.tourData();
	}
}
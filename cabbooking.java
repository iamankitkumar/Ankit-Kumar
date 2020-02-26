import java.util.Scanner;
class cabbooking
{
    String cab_name;
    String cab_number;
    String cab_location;
    String cab_destination;
    cabbooking()
    {
        System.out.println("Welcome to Cab Booking");
    }
            void detail()
            {
                cab_name="Red Taxi";
                cab_number="TN89NM0632";
                cab_location="Coimbatore";
                cab_destination="Chennai";
                System.out.print("CAB NAME:"+cab_name+"\n"+"CAB NUMBER:"+cab_number+"\n"+"CAB Location:"+cab_location+"\n"+"CAB DESTINATION"+cab_destination+"\n");
            }
        }
            class traveller extends cabbooking
            {
                String name;
                String mobile;
                String p_name[]=new String[20];
                float wallet[]=new float[20];
                float fare[]=new float[20];
                String m_bil[]=new String[15];
                int i,num;
            
               void detail()
             {
                Scanner y=new Scanner(System.in);
                 System.out.print("enter wallet name ");
                 name=y.next();
                 System.out.print("enter wallet customer number");
                 mobile=y.next();
               
                 System.out.print("wallet name "+name);
                  
                  System.out.print(" wallet customer number "+ mobile);
              
               
               }
               void get(int numb, String p_name[], String m_bil[])
               {
                  int no=numb;

                for(int i=0;i<numb;i++)
               {
                   this.p_name[i]=p_name[i];
                   this.m_bil[i]=m_bil[i];
                }
               }
               void get(int numb)
               {
                int i;
                Scanner z=new Scanner(System.in);
                for(i=0;i<numb;i++)
                {
                    System.out.print("enter wallet balance of"+(i+1)+"traveller");
               
                    wallet[i]=z.nextFloat();
                }
                Scanner x=new Scanner(System.in);
                for(i=0;i<numb;i++)
                {
                    System.out.print("enter fare ammount of"+(i+1)+"traveller");
                    fare[i]=x.nextFloat();
                    wallet[i]=wallet[i]-fare[i];
                }
               }
               void display(int numb)
               {
                   int i ;
                   int number=numb;
                   for(i=0;i<number;i++){
                System.out.print("traveler name of"+(i+1)+"is"+p_name[i]);
                System.out.print("traveler mobille number of"+(i+1)+"is"+m_bil[i]);
                System.out.print("traveler wallet balance of"+(i+1)+"is"+wallet[i]);

                   }
               }
           }
           class cabtravel
           { static int numb;
               public static void main(String arg[])
               {
                   cabbooking book;
                   traveller tra=new traveller();
                  int i,no;
                   String p_name[]=new String[100];
                   String m_bil[]=new String[100];
                   Scanner l=new Scanner(System.in);
                   do{
                    System.out.println("To know the cab details, Enter 1");
                    System.out.println("To know cab booking details, Enter 2");
                    System.out.println("To book tickets, Enter 3");
                    System.out.println("To enter wallet balance details, Enter 4");
                    System.out.println("To display passenger details, Enter 5");
                    System.out.println("To Exit, Enter 6");
        
                    System.out.println();
                System.out.println("enter your choice");
                no=l.nextInt();
               
            switch(no)
        {
            
            case 1:
            book=new cabbooking();
            book.detail();
            break;
            case 2:
            System.out.print("Enter number of Booking Details: ");
            book=new traveller();
            book.detail();
            break;
            case 3:
            Scanner x=new Scanner(System.in);
                System.out.print("Enter number of traveller: ");
                
                numb=x.nextInt();
                 for( i=0;i<numb;i++)
                 {
                 System.out.print("Enter traveller name:");
                 p_name[i]=x.next();
                 System.out.print("Enter traveller mobile Number:");
                 m_bil[i]=x.next();
                 System.out.print("\n");}
                 tra.get(numb,p_name,m_bil);
            break;
            case 4:
             tra.get(numb);
                 break;
                 case 5:
                 tra.display(numb);
                 break;
                 case 6:
                 System.exit(0);
        } }while(no>0);

               }
           }
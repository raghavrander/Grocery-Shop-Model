import java.util.*;
import java.util.Date;
class Grocery
{
    Scanner SC = new Scanner (System.in);
    int choice;
    int abt;
    double no;
    double total;
    double total1;
    double total2;
    double total3;
    double tax;
    double totaltax;
    int billno;
    int decision;
    void logo()
    {
        String str="WELCOME TO \"EASY SHOPPING\" STORE";
        int a=0;
        for(int i=0;i<str.length();i++)
        {
            char b=str.charAt(i);
            System.out.print(b);
            for( int j=0;j<50000000;j++)
            {
            }

        }
        for(int i=0;i<1000000000;i++)
        {
        }
    }

    void main_choices()
    {
        do
        {
            System.out.print("\f");
            System.out.println("1.Food Grains");
            System.out.println("2.Snack foods");
            System.out.println("3.Dairy Products");
            System.out.println("4.About us");
            System.out.println("5.Exit");
            System.out.println("");
            System.out.println("Enter Your Choice");
            choice=SC.nextInt();
            System.out.print("\f");
            switch(choice)
            {
                case 1:
                System.out.print("\f");
                Foodgrain ob1=new Foodgrain();
                ob1.menu1();
                break;
                case 2:
                System.out.print("\f");
                Snackfood ob2=new Snackfood();
                ob2.menu2();
                break;
                case 3:
                System.out.print("\f");
                Dairyproduct ob3=new Dairyproduct();
                ob3.menu3();
                break;
                case 4:
                System.out.print("\f");
                System.out.println("***********************Welcome To Easy Shopping***********************");
                System.out.println();
                System.out.println("ISO-9001 CERTIFIED");
                System.out.println("● We have been working since 2009 and catering to all the needs of our customers.");
                System.out.println("● We have our outlets in many different Indian cities like Delhi, Chennai, Kolkata etc. and serving over a million people");
                System.out.println("● It will be a pleasure for us to serve you");
                System.out.println("● THANK YOU AND CONTINUE SHOPPING!");
                System.out.println("Enter 5 to go to main menu");
                abt =SC.nextInt();
                if(abt!=5)
                {
                    System.out.println("Invalid Option. Kindly Enter 5");
                    abt=SC.nextInt();
                }
                if(abt==5)
                {
                    main_choices();
                }
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Wrong Choice!");
            }
            System.out.println("Do You Want Anything Else? 1-Yes 0-No");
            decision=SC.nextInt();
        }while(decision!=0);
    }

    void bill()
    {
        System.out.print("\f");
        System.out.println("******************************************************************************************");
        System.out.println("********************************************BILL******************************************");
        System.out.println("******************************************************************************************");
        no=Math.random()*10000;
        billno=(int)no;
        Date date = new Date();
        System.out.println("DATE: "+date);
        System.out.println();
        System.out.println("BILL NO.: "+billno);
        System.out.println();
        for(int i=0;i<5;i++)
        {
            if(Foodgrain.qfg[i]>0)
            {
                System.out.println(Foodgrain.fg[i]+"\t\t"+Foodgrain.qfg[i]+"\t\t"+Foodgrain.afg[i]);
            }
            total1+=Foodgrain.afg[i];
        }
        for(int i=0;i<12;i++)
        {
            if(Snackfood.qsnack[i]>0)
            {
                System.out.println(Snackfood.snack[i]+"\t\t"+Snackfood.qsnack[i]+"\t\t"+Snackfood.asnack[i]);
            }
            total2+=Snackfood.asnack[i];
        }
        for(int i=0;i<5;i++)
        {
            if(Dairyproduct.qdp[i]>0)
            {
                System.out.println(Dairyproduct.dp[i]+"\t\t"+Dairyproduct.qdp[i]+"\t\t"+Dairyproduct.adp[i]);
            }
            total3+=Dairyproduct.adp[i];
        }
        total=total1+total2+total3;
        tax=(18.0/100.0)*total;
        totaltax=total+tax;
        totaltax=Math.round(totaltax);
        System.out.println();
        System.out.println("                                YOUR TOTAL: "+totaltax);
        System.out.println("GST levied : 18%");
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<THANK YOUR FOR SHOPPING WITH US!>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println("**************PLEASE VISIT AGAIN!!****************");
    }

    public static void main(String args[])
    {
        Grocery ob=new Grocery();
        ob.logo();
        ob.main_choices();
        ob.bill();
    }
}


import java.util.Scanner;
class Dairyproduct
{
    static String dp[]=new String[5];
    static double adp[]=new double[5];
    static double qdp[]=new double[5];
    void menu3()
    {
        Scanner SC = new Scanner(System.in);
        int dairy;
        int cheese;
        int gocheese;
        int brittania;
        int amul;
        int butter;
        double milk;

        System.out.println("1.Cheese");
        System.out.println("2.Butter");
        System.out.println("3.Milk (Rs.62/litre)");
        System.out.println("");
        System.out.println("Enter Your Choice");
        dairy=SC.nextInt();
        while(dairy>3 || dairy<=0)
        {
            System.out.println("Wrong Choice!");
            System.out.println("Please Enter Again");
            dairy=SC.nextInt();
        }
        switch(dairy)
        {
            case 1:
            System.out.print("\f");
            System.out.println("1.Go Cheese (Rs.68/pkt of 100g)");
            System.out.println("2.Brittania Cheese (Rs.125/pkt of 200g)");
            System.out.println("3.Amul Cheese (Rs.114/pkt of 200g)");
            System.out.println("");
            System.out.println("Enter Your Choice");
            cheese=SC.nextInt();
            while(cheese>5 || cheese<=0)
            {
                System.out.println("Wrong Choice");
                System.out.println("Please Enter Again");
                cheese=SC.nextInt();
            }
            switch(cheese)
            {
                case 1:
                dp[0]="Go Cheese";
                System.out.println("Enter number of packets");
                gocheese=SC.nextInt();
                gocheese=SC.nextInt();

                while(gocheese<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    gocheese=SC.nextInt();
                }
                qdp[0]=qdp[0]+gocheese;
                adp[0]=adp[0]+gocheese*68;
                break;
                case 2:
                dp[1]="Brittania Cheese";
                System.out.println("Enter number of packets");
                brittania=SC.nextInt();

                while(brittania<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    brittania=SC.nextInt();
                }
                qdp[1]=qdp[1]+brittania;
                adp[1]=adp[1]+brittania*125;
                break;
                case 3:
                dp[2]="Amul Cheese";
                System.out.println("Enter number of packets");
                amul=SC.nextInt();

                while(amul<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    amul=SC.nextInt();
                }
                qdp[2]=qdp[2]+amul;
                adp[2]=adp[2]+amul*114;
                break;
            }
            break;
            case 2:
            System.out.print("\f");
            System.out.println("We have best quality of Amul Butter (Rs.45/pkt of 100g)");
            System.out.println("Enter number of packs");
            butter=SC.nextInt();
            dp[3]="Amul Butter";

            while(butter<=0)
            {
                System.out.println("Invalid Quantity! Please Enter Again");
                butter=SC.nextInt();
            }
            qdp[3]=qdp[3]+butter;
            adp[3]=adp[3]+butter*45;
            break;
            case 3:
            System.out.println("Enter Quantity of milk in litres");
            milk=SC.nextDouble();
            dp[4]="Milk";

            while(milk<=0)
            {
                System.out.println("Invalid Quantity! Please Enter Again");
                milk=SC.nextDouble();
            }
            qdp[4]=qdp[4]+milk;
            adp[4]=adp[4]+milk*62;
            break;
        }

    }
}


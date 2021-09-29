import java.util.Scanner;
class Snackfood
{
    static String snack[]=new String[12];
    static double asnack[]=new double[12];
    static double qsnack[]=new double[12];
    void menu2()
    {
        Scanner SC = new Scanner(System.in);
        int confectionery;
        int biscuit;
        int chocolate;
        int chips;
        int parleg;
        int oreo;
        int dairymilk;
        int star_5;
        int tea;
        int society;
        int tata;
        int supercup;
        int coffee;
        int nescafe;
        int bru;
        int lays;
        int pringles;
        int cornitos;

        System.out.println("1.Biscuits");
        System.out.println("2.Chocolates");
        System.out.println("3.Tea");
        System.out.println("4.Coffee");
        System.out.println("5.Chips");
        System.out.println("");
        System.out.println("Enter your desired snack");
        confectionery=SC.nextInt();
        while(confectionery>5 || confectionery<=0)
        {
            System.out.println("Wrong Choice!");
            System.out.println("Please Enter Again");
            confectionery=SC.nextInt();
        }
        switch(confectionery)
        {
            case 1:
            System.out.print("\f");
            System.out.println("1.Parle G (Rs.20/pkt)");
            System.out.println("2.Oreo (Rs.35/pkt)");
            System.out.println("Enter your choice");
            biscuit=SC.nextInt();
            while(biscuit>2 || biscuit<=0)
            {
                System.out.println("Wrong Choice");
                System.out.println("Please Enter Again");
                biscuit=SC.nextInt();
            }
            switch(biscuit)
            {
                case 1:
                System.out.println("Enter number of packets");
                parleg=SC.nextInt();
                snack[0]="ParleG";
                while(parleg<=0)
                {
                    System.out.println("Enter Valid Quantity");
                    parleg=SC.nextInt();
                }
                qsnack[0]=qsnack[0]+parleg;
                asnack[0]=asnack[0]+parleg*20;
                break;
                case 2:
                System.out.println("Enter number of packets");
                oreo=SC.nextInt();
                snack[1]="Oreo";

                while(oreo<=0)
                {
                    System.out.println("Enter Valid Quantity");
                    oreo=SC.nextInt();
                }
                qsnack[1]=qsnack[1]+oreo;
                asnack[1]=asnack[1]+oreo*20;
                break;
            }
            break;
            case 2:
            System.out.print("\f");
            System.out.println("1.Dairy Milk Silk (Rs.55/pkt)");
            System.out.println("2.5 Star (10/pkt)");
            System.out.println("Enter Your Choice");
            chocolate=SC.nextInt();
            while(chocolate>2 || chocolate<=0)
            {
                System.out.println("Wrong Choice");
                System.out.println("Please Enter Again");
                chocolate=SC.nextInt();
            }
            switch(chocolate)
            {
                case 1:
                System.out.println("Enter number of packets");
                dairymilk=SC.nextInt();
                snack[2]="Dairy Milk Silk";
                while(dairymilk<=0)
                {
                    System.out.println("Please enter valid qsnack");
                    dairymilk=SC.nextInt();
                }
                qsnack[2]=qsnack[2]+dairymilk;
                asnack[2]=asnack[2]+dairymilk*55;
                break;
                case 2:
                System.out.println("Enter number of packets");
                star_5=SC.nextInt();
                snack[3]="5 Star";
                while(star_5<=0)
                {
                    System.out.println("Please enter valid qsnack");
                    star_5=SC.nextInt();
                }
                qsnack[3]=qsnack[3]+star_5;
                asnack[3]=asnack[3]+star_5*55;
                break;
            }
            break;
            case 3:
            System.out.print("\f");
            System.out.println("1.Tata Tea (Rs.375/kg)");
            System.out.println("2.Society (Rs.355/kg)");
            System.out.println("3.Super Cup (Rs.340/kg)");
            System.out.println("");
            System.out.println("Enter Your Choice");
            tea=SC.nextInt();
            while(tea>3 || tea<=0)
            {
                System.out.println("Wrong Choice");
                System.out.println("Please Enter Again");
                tea=SC.nextInt();
            }
            switch(tea)
            {
                case 1:
                snack[4]="Tata Tea";
                System.out.println("Enter number of packs");
                tata=SC.nextInt();

                while(tata<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    tata=SC.nextInt();
                }
                qsnack[4]=qsnack[4]+tata;
                asnack[4]=asnack[4]+tata*375;
                break;
                case 2:
                snack[5]="Society";
                System.out.println("Enter number of packs");
                society=SC.nextInt();

                while(society<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    society=SC.nextInt();
                }
                qsnack[5]=qsnack[5]+society;
                asnack[5]=asnack[5]+society*355;
                break;
                case 3:
                snack[6]="Super Cup";
                System.out.println("Enter number of packs");
                supercup=SC.nextInt();

                while(supercup<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    supercup=SC.nextInt();
                }
                qsnack[6]=qsnack[6]+supercup;
                asnack[6]=asnack[6]+supercup*340;
                break;
            }
            break;
            case 4:
            System.out.print("\f");
            System.out.println("1.Nescafe (Rs.100/pkt of 250g)");
            System.out.println("2.Bru Gold (Rs.80/pkt of 250g)");
            System.out.println("Enter Your Choice");
            coffee=SC.nextInt();
            while(coffee>2 || coffee<=0)
            {
                System.out.println("Wrong Choice");
                System.out.println("Please Enter Again");
                coffee=SC.nextInt();
            }
            switch(coffee)
            {
                case 1:
                snack[7]="Nescafe";
                System.out.println("Enter number of packs");
                nescafe=SC.nextInt();
                while(nescafe<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    nescafe=SC.nextInt();
                }
                qsnack[7]=qsnack[7]+nescafe;
                asnack[7]=asnack[7]+nescafe*100;
                break;
                case 2:
                snack[8]="Bru Gold";
                System.out.println("Enter number of packs");
                bru=SC.nextInt();

                while(bru<=0)
                {
                    System.out.println("Invalid Quantity! Please Enter Again");
                    bru=SC.nextInt();
                }

                qsnack[8]=qsnack[8]+bru;
                asnack[8]=asnack[8]+bru*80;
            }
            case 5:
            System.out.print("\f");
            System.out.println("1.Lays (Rs.20/pkt)");
            System.out.println("2.Pringles (Rs.89/pkt)");
            System.out.println("3.Cornitos (Rs.33/pkt)");               
            System.out.println("");
            System.out.println("Enter Your Choice");
            chips=SC.nextInt();
            while(chips>3 || chips<=0)
            {
                System.out.println("Wrong Choice");
                System.out.println("Please Enter Again");
                chips=SC.nextInt();
            }
            switch(chips)
            {
                case 1:
                snack[9]="Lays";
                System.out.println("Enter number of packets");
                lays=SC.nextInt();

                while(lays<=0)
                {
                    System.out.println("Invalid Quantity! Please enter again");
                    lays=SC.nextInt();
                }
                qsnack[9]=qsnack[9]+lays;
                asnack[9]=asnack[9]+lays*20;
                break;
                case 2:
                snack[10]="Pringles";
                System.out.println("Enter number of packets");
                pringles=SC.nextInt();

                while(pringles<=0)
                {
                    System.out.println("Invalid Quantity! Please enter again");
                    pringles=SC.nextInt();
                }
                qsnack[10]=qsnack[10]+pringles;
                asnack[10]=asnack[10]+pringles*89;
                break;
                case 3:
                snack[11]="Cornitos";
                System.out.println("Enter number of packets");
                cornitos=SC.nextInt();

                while(cornitos<=0)
                {
                    System.out.println("Invalid Quantity! Please enter again");
                    cornitos=SC.nextInt();
                }
                qsnack[11]=qsnack[11]+cornitos;
                asnack[11]=asnack[11]+cornitos*33;
                break;
            }
        }
    }
}


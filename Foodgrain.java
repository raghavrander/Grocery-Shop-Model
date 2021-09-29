import java.util.Scanner;
class Foodgrain
{
    static String fg[]=new String[5];
    static double afg[]=new double[5];
    static double qfg[]=new double[5];
    void menu1()
    {
        Scanner SC = new Scanner(System.in);
        int grains;
        double wheat;
        double rice;
        double pulses;
        double sugar;
        double maize;

        System.out.println("1.Wheat (Rs.26/kg)");
        System.out.println("2.Rice (Rs.51/kg)");
        System.out.println("3.Pulses (Rs.77/kg");
        System.out.println("4.Sugar (Rs.40/kg)");
        System.out.println("5.Maize (Rs.35/kg)");
        System.out.println("");
        System.out.println("Enter Your Desired Grain's Number");
        grains=SC.nextInt();
        while(grains>5 || grains<=0)
        {
            System.out.println("Wrong Choice!");
            System.out.println("Please Enter Again");
            grains=SC.nextInt();
        }
        switch(grains)
        {         
            case 1:
            System.out.println("What Quantity of Wheat Do You Want?");
            System.out.println("Kindly enter weight in kgs.");
            wheat=SC.nextDouble();
            fg[0]="Wheat";
            while(wheat<=0.0)
            {
                System.out.println("Invalid Quantity!! Please Enter Again");
                wheat=SC.nextDouble();
            }
            qfg[0]=qfg[0]+wheat;
            afg[0]=afg[0]+wheat*26.0;
            break;
            case 2:
            System.out.println("What Quantity of Rice Do You Want?");
            System.out.println("Kindly enter weight in kgs.");
            rice=SC.nextDouble();
            fg[1]="Rice";
            while(rice<=0.0)
            {
                System.out.println("Invalid Quantity!! Please Enter Again");
                rice=SC.nextDouble();
            }
            qfg[1]=qfg[1]+rice;
            afg[1]=afg[1]+rice*51.0;
            break;
            case 3:
            System.out.println("What Quantity of Pulses Do You Want?");
            System.out.println("Kindly enter weight in kgs.");
            pulses=SC.nextDouble();
            fg[2]="Pulses";
            while(pulses<=0.0)
            {
                System.out.println("Invalid Quantity!! Please Enter Again");
                pulses=SC.nextDouble();
            }
            qfg[2]=qfg[2]+pulses;
            afg[2]=afg[2]+pulses*51.0;
            break;
            case 4:
            System.out.println("What Quantity of Sugar Do You Want?");
            System.out.println("Kindly enter weight in kgs.");
            sugar=SC.nextDouble();
            fg[3]="Sugar";
            while(sugar<=0.0)
            {
                System.out.println("Invalid Quantity!! Please Enter Again");
                sugar=SC.nextDouble();
            }
            qfg[3]=qfg[3]+sugar;
            afg[3]=afg[3]+sugar*51.0;
            break;
            case 5:
            System.out.println("What Quantity of Maize Do You Want?");
            System.out.println("Kindly enter weight in kgs.");
            maize=SC.nextDouble();
            fg[4]="Maize";
            while(maize<=0.0)
            {
                System.out.println("Invalid Quantity!! Please Enter Again");
                maize=SC.nextDouble();
            }
            qfg[4]=qfg[4]+maize;
            afg[4]=afg[4]+maize*35;
            break;
        }

    }
}


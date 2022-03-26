import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class main_test {

    public static void main(String[] args) throws IOException {

        int i = 1;
        int ask;
        float larg = 0;
        float small = 100000;
        Scanner sc = new Scanner(System.in);
        Vector<User> user1 = new Vector<>();
        read.Read_From_File(user1, args[0]);

        System.out.println("***Chose one of the option**\n1 - To Print out all the list\n2 - To Print Largest Mag" +
                "\n3 - To Print Smallest Mag\n0 - to Exit");
        ask = sc.nextInt();
        while (ask != 0) {
            i= 1 ;
            System.out.printf("----------------------------------------------------------\n");
            System.out.printf("Number    Mag                  Time                Place\n");
            System.out.printf("----------------------------------------------------------\n");
            if (ask == 1) {
                for (Object userAsObject : user1) {
                    User user = (User) userAsObject;
                    System.out.printf("%d -       %.2f - %s - %s\n", i, user.Mag, user.Time, user.Place);
                    i++;
                }
                System.out.printf("----------------------------------------------------------\n");
            } else if (ask == 2) {
                for (Object userAsObject : user1) {
                    User user = (User) userAsObject;
                    if(user.Mag > larg) {
                        larg = user.Mag;
                        System.out.printf("%d -       %.2f - %s - %s\n", i, user.Mag, user.Time, user.Place);
                        i++;
                    }
                }
                System.out.printf("----------------------------------------------------------\n");

            } else if (ask == 3) {
                for (Object userAsObject : user1) {
                    User user = (User) userAsObject;
                    if(user.Mag < small) {
                        small = user.Mag;
                        System.out.printf("%d -       %.2f - %s - %s\n", i, user.Mag, user.Time, user.Place);
                        i++;
                    }
                }
                System.out.printf("----------------------------------------------------------\n");
            }
            else
            {
                System.out.printf("*******\ninvalid input\n*******\n");
            }
            System.out.println("***Chose one of the option**\n1 - To Print out all the list\n2 - To Print 10 Largest Mag" +
                    "\n3 - To Print 10 Smallest Mag\n0 - to Exit");
            ask = sc.nextInt();
        }

    }
}

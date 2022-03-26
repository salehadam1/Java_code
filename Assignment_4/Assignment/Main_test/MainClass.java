import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class MainClass {

    public static void main(String[] args) throws IOException {

        int i = 1;
        int ask;
        Scanner sc = new Scanner(System.in);
        Vector<user> user1 = new Vector<>();
        Read_File.Read_From_File(user1, args[0]);
        double Averag = 0;
        double total = 0;
        System.out.println("***Chose one of the option**\n1 - To Print out all the list\n2 - To  Display the 10 Largest Earthquakes" +
                "\n3 - To  Display the 10 nearest earthquakes to My location\n" +
                "4 - To Display the average magnitude of Earthquakes\n" +
                "5 - To Display the average magnitude of Explosions\n" +
                "6 - To Display the average magnitude of Ice Quake\n" +
                "7 - To Display the average magnitude of Quarry Blast\n" +
                "0 - to Exit");
        ask = sc.nextInt();

        while (ask != 0) {
            if (ask == 1) {
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.printf("Number    Mag    Latitude     longitude              Time                   Place                   type\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                for (Object userAsObject : user1) {
                    user user = (user) userAsObject;
                    System.out.printf("%d -       %.2f - %f - %f - %s - %s - %s\n", i, user.Mag, user.Latitude, user.longitude, user.Time, user.Place, user.type);
                    i++;
                }
            } else if (ask == 2) {
                i = 1;
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.printf("Number    Mag    Latitude     longitude              Time                   Place                   type\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                Comparator<user> comparator;
                comparator = new Large_Comparator();
                Collections.sort(user1, comparator);
                for (Object userAsObject : user1) {
                    user user = (user) userAsObject;
                    if (user.type.equalsIgnoreCase("Earthquake")) {
                        if (i <= 10) {
                            System.out.printf("%d -       %.2f - %f - %f - %s - %s - %s\n", i, user.Mag, user.Latitude, user.longitude, user.Time, user.Place, user.type);
                            i++;
                        }
                    }
                }
            } else if (ask == 3) {
                i = 1;
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.printf("Nearest earthquakes to my location of Latitude: 53.34350465 and longitude: -8.873374084151076 Galway Ireland\n");
                System.out.printf("Number    Mag    Latitude     longitude              Time                   Place                   Type       Distance\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                Comparator<user> comparator;
                comparator = new Nearest();
                Collections.sort(user1, comparator);
                for (Object userAsObject : user1) {
                    user user = (user) userAsObject;
                    if (user.type.equalsIgnoreCase("Earthquake")) {
                        if (i <= 10) {
                            System.out.printf("%d -       %.2f - %f - %f - %s - %s - %s - %f\n", i, user.Mag, user.Latitude, user.longitude, user.Time, user.Place, user.type, user.locat);
                            i++;
                        }
                    }
                }
            } else if (ask == 4) {
                i = 0;
                total = 0;
                Averag = 0;
                for (Object userAsObject : user1) {
                    user user = (user) userAsObject;
                    if (user.type.equalsIgnoreCase("Earthquake")) {
                        total = total + user.Mag;
                        i++;
                    }
                }
                Averag = total / i;
                System.out.println("----------------------------------------------------------");
                System.out.printf("The average magnitude of Earthquakes is: %.2f\n", Averag);
                System.out.println("**********************************************************");
            } else if (ask == 5) {
                i = 0;
                total = 0;
                Averag = 0;
                for (Object userAsObject : user1) {
                    user user = (user) userAsObject;
                    if (user.type.equalsIgnoreCase("Explosion")) {
                        total = total + user.Mag;
                        i++;
                    }
                }
                Averag = total / i;
                System.out.println("----------------------------------------------------------");
                System.out.printf("The average magnitude of Explosions is: %.2f\n", Averag);
                System.out.println("**********************************************************");
            } else if (ask == 6) {
                i = 0;
                total = 0;
                Averag = 0;
                for (Object userAsObject : user1) {
                    user user = (user) userAsObject;
                    if (user.type.equalsIgnoreCase("Ice Quake")) {
                        total = total + user.Mag;
                        i++;
                    }
                }
                Averag = total / i;
                System.out.println("----------------------------------------------------------");
                System.out.printf("The average magnitude of Ice Quake is: %.2f\n", Averag);
                System.out.println("**********************************************************");
            } else if (ask == 7) {
                i = 0;
                total = 0;
                Averag = 0;
                for (Object userAsObject : user1) {
                    user user = (user) userAsObject;
                    if (user.type.equalsIgnoreCase("Quarry Blast")) {
                        total = total + user.Mag;
                        i++;
                    }
                }
                Averag = total / i;
                System.out.println("----------------------------------------------------------");
                System.out.printf("The average magnitude of Quarry Blast is: %.2f\n", Averag);
                System.out.println("**********************************************************");
            } else {
                System.out.println("***wrong input***");
            }
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("***Chose one of the option**\n1 - To Print out all the list\n2 - To  Display the 10 Largest Earthquakes" +
                    "\n3 - To  Display the 10 nearest earthquakes to My location\n" +
                    "4 - To Display the average magnitude of Earthquakes\n" +
                    "5 - To Display the average magnitude of Explosions\n" +
                    "6 - To Display the average magnitude of Ice Quake\n" +
                    "7 - To Display the average magnitude of Quarry Blast\n" +
                    "0 - to Exit");
            ask = sc.nextInt();
        }
    }
}

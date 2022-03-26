import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

public class main_test {
    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int count;
        int ask;
        Vector<user> user1 = new Vector<>();
        filereader.Read_From_File(user1, args[0]);


        System.out.println("***Chose one of the option**\n1 - To Display Earthquakes\n" +
                "2 - To Display Explosions\n" +
                "3 - To Display Ice Quake\n" +
                "4 - To Display Quarry Blast\n" +
                "0 - to Exit");
        ask = sc.nextInt();
        while(ask != 0)
        {
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.printf("    Mag     Latitude    longitude           Time                    Place                       Type \n");
            System.out.println("--------------------------------------------------------------------------------------------------------");

            if(ask == 1)
            {
                List<user> Earthquakes = user1.stream()
                        .filter(e-> e.getType().equalsIgnoreCase("Earthquake"))
                        .collect(Collectors.toList());
                count = (int) Earthquakes.stream().count();
                System.out.println(Earthquakes);
                System.out.println("********************\nthere is : "+count+" Earthquake in the past 30 days\n********************");
            }
            else if(ask == 2)
            {
                List<user> Explosion = user1.stream()
                        .filter(e-> e.getType().equalsIgnoreCase("Explosion"))
                        .collect(Collectors.toList());
                count = (int) Explosion.stream().count();
                System.out.println(Explosion);
                System.out.println("********************\nthere is : "+count+" Explosion in the past 30 days\n********************");
            }
            else if(ask == 3)
            {
                List<user> Ice_Quake = user1.stream()
                        .filter(e-> e.getType().equalsIgnoreCase("Ice Quake"))
                        .collect(Collectors.toList());
                count = (int) Ice_Quake.stream().count();
                System.out.println(Ice_Quake);
                System.out.println("********************\nthere is : "+count+" Ice Quake in the past 30 days\n********************");
            }
            else if(ask == 4)
            {
                List<user> Quarry_Blast = user1.stream()
                        .filter(e-> e.getType().equalsIgnoreCase("Quarry Blast"))
                        .collect(Collectors.toList());
                count = (int) Quarry_Blast.stream().count();
                System.out.println(Quarry_Blast);
                System.out.println("********************\nthere is : "+count+" Quarry Blast in the past 30 days\n********************");
            }
            else
            {
                System.out.println("Wrong input pleas chose one of the option");
            }
            System.out.println("***Chose one of the option**\n1 - To Display Earthquakes\n" +
                    "2 - To Display Explosions\n" +
                    "3 - To Display Ice Quake\n" +
                    "4 - To Display Quarry Blast\n" +
                    "0 - to Exit");
            ask = sc.nextInt();
        }
    }
}

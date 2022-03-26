import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

public class main_text {

    public static void main(String[] args) throws IOException {

        int i = 0;
        int ask;
        double num = 0;
        Scanner sc = new Scanner(System.in);
        user newuser = new user();
        Vector<user> user1 = new Vector<>();
        read_file.Read_From_File(user1, args[0]);
        //System.out.println(user1);
        System.out.println("chose one of the option\n1- 10 highest gusts.\n2- 10 lowest rainfall.\n3- 10 highest rainfall.\n0- exit");
        i = sc.nextInt();
        while (i != 0) {
            if (i == 1) {
                List<String> highest_gusts = user1.stream()
                        .sorted(Comparator.comparingDouble(user::getMaxgt).reversed())
                        .limit(10)
                        .map(e->e.getYears()+"/"+e.getMonth()+"  "+e.getMaxgt()+"\n")
                        .collect(Collectors.toList());
                System.out.println(highest_gusts);
            } else if (i == 2) {
                List<String> lowest_rainfall = user1.stream()
                        .sorted(Comparator.comparingDouble(user::getRain))
                        .limit(10)
                        .map(e->e.getYears()+"/"+e.getMonth()+"  "+e.getRain()+"\n")
                        .collect(Collectors.toList());
                System.out.println(lowest_rainfall);
            } else if (i == 3) {
                List<String> highest_rainfall = user1.stream()
                        .sorted(Comparator.comparingDouble(user::getRain).reversed())
                        .limit(10)
                        .map(e->e.getYears()+"/"+e.getMonth()+"  "+e.getRain()+"\n")
                        .collect(Collectors.toList());
                System.out.println(highest_rainfall);
            } else {
                System.out.println("Wrong Enter");
            }
            System.out.println("chose one of the option\n1- 10 highest gusts.\n2- 10 lowest rainfall.\n3- 10 highest rainfall.\n0- exit");
            i = sc.nextInt();
        }
    }
}

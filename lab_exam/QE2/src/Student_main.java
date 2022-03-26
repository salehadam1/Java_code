import java.util.*;
import java.util.stream.Collectors;

public class Student_main {

    public static void main(String[] args){

       // List<Student> s1 = new ArrayList<>();
        int i;
        Scanner sc = new Scanner(System.in);
        Vector<Student> s1 = new Vector<>();

        s1.add(new Student(1,"a","b","Galway",34.5,60));
        s1.add(new Student(2,"c","d","Galway",89,45));
        s1.add(new Student(3,"e","f","Dublin",66,88.9));
        s1.add(new Student(4,"g","h","Cork",55,99));
        s1.add(new Student(5,"I","j","Dublin",100,100));



        System.out.println("chose one of the option\n1- Display all the student details from a user inputted City." +
                "\n2- the highest Java mark." +
                "\n3- the lowest Java mark." +
                "\n4- the highest  Embedded Systems mark." +
                "\n5- the lowest  Embedded Systems mark." +
                "\n6- Display all the student details sorted by firstName aphetically." +
                "\n0- exit");
                i = sc.nextInt();

        while (i != 0) {
            if(i == 1) {
                System.out.println("Enter City name");
                String name = sc.next();
                List<Student> City_name = s1.stream()
                        .filter(e -> e.getCity().equalsIgnoreCase(name))
                        .collect(Collectors.toList());
                System.out.println(City_name);
            }
            else if(i == 2) {
                List<String> highest_Java = s1.stream()
                        .sorted(Comparator.comparingDouble(Student::getAdvanced_Java_Result).reversed())
                        .map(e -> e.getFirstName() + " " + e.getLastName() + "  the highest Java mark " + e.getAdvanced_Java_Result() + "\n")
                        .collect(Collectors.toList());
                System.out.println(highest_Java);
            }
            else if(i == 3) {
                List<String> lowest_Java = s1.stream()
                        .sorted(Comparator.comparingDouble(Student::getAdvanced_Java_Result))
                        .map(e -> e.getFirstName() + " " + e.getLastName() + "  the lowest Java mark " + e.getAdvanced_Java_Result() + "\n")
                        .collect(Collectors.toList());
                System.out.println(lowest_Java);
            }
            else if(i == 4) {
                List<String> highest_Embedded = s1.stream()
                        .sorted(Comparator.comparingDouble(Student::getEmbedded_Systems_Result).reversed())
                        .map(e -> e.getFirstName() + " " + e.getLastName() + "  the highest  Embedded Systems mark " + e.getEmbedded_Systems_Result() + "\n")
                        .collect(Collectors.toList());
                System.out.println(highest_Embedded);
            }
            else if(i == 5) {

                List<String> lowest_Embedded = s1.stream()
                        .sorted(Comparator.comparingDouble(Student::getEmbedded_Systems_Result))
                        .map(e -> e.getFirstName() + " " + e.getLastName() + "  the lowest  Embedded Systems mark " + e.getEmbedded_Systems_Result() + "\n")
                        .collect(Collectors.toList());
                System.out.println(lowest_Embedded);
            }
            else if(i == 6)
            {
                List<Student> sorted_List = s1.stream()
                        .sorted(Comparator.comparing(Student::getFirstName))
                        .collect(Collectors.toList());
                System.out.println(sorted_List);
            }
            else{
                System.out.println("Wrong Enter");
            }

            System.out.println("chose one of the option\n1- Display all the student details from a user inputted City." +
                    "\n2- the highest Java mark." +
                    "\n3- the lowest Java mark." +
                    "\n4- the highest  Embedded Systems mark." +
                    "\n5- the lowest  Embedded Systems mark." +
                    "\n0- exit");
            i = sc.nextInt();

        }


    }
}

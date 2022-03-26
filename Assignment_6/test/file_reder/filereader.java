import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class filereader {
    public static void Read_From_File(Vector<user> users, String pathToFile) throws IOException {

        FileReader fileReader = new FileReader(pathToFile);
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            int lineCounter = -1;
            while ((line = reader.readLine()) != null) {
                //lineCounter++;
                try
                {
                    String[] split = line.split(",");
                    user newUser = new user(Double.valueOf(split[4]),Double.valueOf(split[1]),Double.valueOf(split[2]),split[0],split[13]+","+split[14],split[15]);
                    users.add(newUser);
                    //System.out.println(newUser);

                }catch (Exception e){
                    System.out.print("Error in file Ignore ");
                }
                //String[] split = line.split(",");

               // if(lineCounter == 0)
               // {
                    //skip the frist line
                //}
                //else
                //{
                    //location loc1 = new location(Double.valueOf(split[1]), Double.valueOf(split[2]));
                    //location loc2 = new location(53.34350465, -8.873374084151076);
                    //double newloc = loc1.distanceTo(loc2);
                    //user newUser = new user(Double.valueOf(split[4]),Double.valueOf(split[1]),Double.valueOf(split[2]),split[0],split[13]+","+split[14],split[15]);
                    //users.add(newUser);
                //}
            }
        }
    }
}

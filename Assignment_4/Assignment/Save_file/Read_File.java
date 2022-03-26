import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Read_File {
    public static void Read_From_File(Vector<user> users, String pathToFile) throws IOException {

        FileReader fileReader = new FileReader(pathToFile);
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            int lineCounter = -1;
            while ((line = reader.readLine()) != null) {
                lineCounter++;
                String[] split = line.split(",");

                if(lineCounter == 0)
                {
                    //skip the frist line
                }
                else
                {
                    location loc1 = new location(Double.valueOf(split[1]), Double.valueOf(split[2]));
                    location loc2 = new location(53.34350465, -8.873374084151076);
                    double newloc = loc1.distanceTo(loc2);
                    user newUser = new user(Float.valueOf(split[4]),Float.valueOf(split[1]),Float.valueOf(split[2]),split[0],split[13]+","+split[14],split[15],newloc);
                    users.add(newUser);
                }
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class read {

    public static void Read_From_File(Vector<User> users, String pathToFile) throws IOException {

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
                    User newUser = new User(Float.valueOf(split[4]),split[0],split[13]);
                    users.add(newUser);
                }
            }
        }
    }
}

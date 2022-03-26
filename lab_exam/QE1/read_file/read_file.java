import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class read_file {

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

                    user newUser = new user(Integer.valueOf(split[0]),Integer.valueOf(split[1]),Double.valueOf(split[2])
                            ,Double.valueOf(split[3]),Double.valueOf(split[4]),Double.valueOf(split[5]),Double.valueOf(split[6])
                            ,Double.valueOf(split[7]),Double.valueOf(split[8]),Double.valueOf(split[9]),Double.valueOf(split[10]),Double.valueOf(split[11]));
                    users.add(newUser);
                }
            }
        }
    }
}


import java.util.Comparator;

public class Nearest implements Comparator<user> {
    public int compare(user first, user second) {
        if (first.locat < second.locat) {
            return -1;
        }

        if (first.locat > second.locat)  {
            return 1;
        }

        return 0;
    }
}

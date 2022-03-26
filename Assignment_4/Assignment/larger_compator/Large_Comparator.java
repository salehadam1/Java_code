import java.util.Comparator;

public class Large_Comparator implements Comparator<user> {

    public int compare(user first, user second) {
        if (first.Mag < second.Mag) {
            return 1;
        }

        if (first.Mag > second.Mag)  {
            return -1;
        }

        return 0;
    }

}

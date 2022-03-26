public class User {

    public static User fromValues(String[] values) {
        //String Mag = values[0];
        float Mag = Float.valueOf(values[0]);
        String Time = values[1];
        String Place = values[2];
        return new User(Mag, Time, Place);
    }

    public float Mag;
    public String Time;
    public String Place;

    public User(float mag, String time, String place) {
        this.Mag = mag;
        this.Time = time;
        this.Place = place;
    }
}

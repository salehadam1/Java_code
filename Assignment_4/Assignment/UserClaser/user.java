public class user {
    public static user fromValues(String[] values) {

        double Mag = Double.valueOf(values[0]);
        double Latitude = Double.valueOf(values[1]);
        double longitude = Double.valueOf(values[2]);
        String Time = values[3];
        String Place = values[4];
        String type = values[5];
        double locat = Double.valueOf(values[7]);
        return new user(Mag,Latitude,longitude,Time, Place,type,locat);
    }

    public double Mag;
    public double Latitude;
    public double longitude;
    public String Time;
    public String Place;
    public String type;
    public double locat;

    public user(double mag,double Latitude,double longitude, String time, String place, String type,double locat) {
        this.Mag = mag;
        this.Latitude = Latitude;
        this.longitude = longitude;
        this.Time = time;
        this.Place = place;
        this.type = type;
        this.locat = locat;
    }

}

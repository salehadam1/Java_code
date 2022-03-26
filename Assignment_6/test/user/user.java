import java.text.DecimalFormat;

public class user {
    public static user fromValues(String[] values) {

        double Mag = Double.valueOf(values[0]);
        double Latitude = Double.valueOf(values[1]);
        double longitude = Double.valueOf(values[2]);
        String Time = values[3];
        String Place = values[4];
        String type = values[5];
        //double locat = Double.valueOf(values[7]);
        return new user(Mag,Latitude,longitude,Time, Place,type);
    }

    public double Mag;
    public double Latitude;
    public double longitude;
    public String Time;
    public String Place;
    public String type;
    //public double locat;

    public user()
    {

    }
    public user(double mag,double Latitude,double longitude, String time, String place, String type) {
        this.Mag = mag;
        this.Latitude = Latitude;
        this.longitude = longitude;
        this.Time = time;
        this.Place = place;
        this.type = type;
        //this.locat = locat;
    }
    public double getMag() {
        return Mag;
    }

    public void setMag(double mag) {
        Mag = mag;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

        /*public double getLocat() {
            return locat;
        }

        public void setLocat(double locat) {
            this.locat = locat;
        }*/

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "{" +
                " | " + df.format(Mag) +
                " | " + Latitude +
                " | " + longitude +
                " | " + Time + '\'' +
                " | " + Place + '\'' +
                " | " + type + '\'' +
                // " | " + locat +
                "}\n";
    }
 /*public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");

        //return "data_user{" + "Mag=" + Mag + ", Latitude=" + Latitude + ", longitude=" + longitude + ", Time='" + Time + '\'' + ", Place='" + Place + '\'' + ", type='" + type + '\'' + ", distance=" + locat + '}'+"\n";
        return  " {"+Time + "  " + Place + "   " + type+"   "+ df.format(Mag)+ "      " + df.format(Latitude ) + "      " + df.format(longitude) + "      " + df.format(locat) +"}\n";
    }*/

}

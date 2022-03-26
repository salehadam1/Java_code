import java.text.DecimalFormat;

public class user {
    public static user fromValues(String[] values) {

        int years =Integer.valueOf(values[0]);
        int month = Integer.valueOf(values[1]);
        double meant = Double.valueOf(values[2]);
        double maxtp = Double.valueOf(values[3]);
        double mintp = Double.valueOf(values[4]);
        double mnmax = Double.valueOf(values[5]);
        double mnmin = Double.valueOf(values[6]);
        double rain = Double.valueOf(values[7]);
        double gmin = Double.valueOf(values[8]);
        double wdsp = Double.valueOf(values[9]);
        double maxgt = Double.valueOf(values[10]);
        double sun = Double.valueOf(values[11]);

        return new user(years,month,meant,maxtp,mintp,mnmax,mnmin,rain,gmin,wdsp,maxgt,sun);
    }

    public int years ;
    public int month ;
    public double meant ;
    public double maxtp ;
    public double mintp ;
    public  double mnmax ;
    public  double mnmin ;
    public double rain ;
    public double gmin ;
    public double wdsp ;
    public  double maxgt ;
    public  double sun ;

    public user()
    {

    }

    public user(int years, int month, double meant, double maxtp, double mintp, double mnmax, double mnmin, double rain, double gmin, double wdsp, double maxgt, double sun) {
        this.years = years;
        this.month = month;
        this.meant = meant;
        this.maxtp = maxtp;
        this.mintp = mintp;
        this.mnmax = mnmax;
        this.mnmin = mnmin;
        this.rain = rain;
        this.gmin = gmin;
        this.wdsp = wdsp;
        this.maxgt = maxgt;
        this.sun = sun;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getMeant() {
        return meant;
    }

    public void setMeant(double meant) {
        this.meant = meant;
    }

    public double getMaxtp() {
        return maxtp;
    }

    public void setMaxtp(double maxtp) {
        this.maxtp = maxtp;
    }

    public double getMintp() {
        return mintp;
    }

    public void setMintp(double mintp) {
        this.mintp = mintp;
    }

    public double getMnmax() {
        return mnmax;
    }

    public void setMnmax(double mnmax) {
        this.mnmax = mnmax;
    }

    public double getMnmin() {
        return mnmin;
    }

    public void setMnmin(double mnmin) {
        this.mnmin = mnmin;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getGmin() {
        return gmin;
    }

    public void setGmin(double gmin) {
        this.gmin = gmin;
    }

    public double getWdsp() {
        return wdsp;
    }

    public void setWdsp(double wdsp) {
        this.wdsp = wdsp;
    }

    public double getMaxgt() {
        return maxgt;
    }

    public void setMaxgt(double maxgt) {
        this.maxgt = maxgt;
    }

    public double getSun() {
        return sun;
    }

    public void setSun(double sun) {
        this.sun = sun;
    }

    @Override
    public String toString() {
        return "user{" +
                "years=" + years +
                ", month=" + month +
                ", meant=" + meant +
                ", maxtp=" + maxtp +
                ", mintp=" + mintp +
                ", mnmax=" + mnmax +
                ", mnmin=" + mnmin +
                ", rain=" + rain +
                ", gmin=" + gmin +
                ", wdsp=" + wdsp +
                ", maxgt=" + maxgt +
                ", sun=" + sun +
                "}\n";
    }
}

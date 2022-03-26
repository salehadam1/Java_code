public class Student {





    public int id;
    public String firstName;
    public  String lastName;
    public String City;
    public  double  Advanced_Java_Result;
    public  double Embedded_Systems_Result;

    public Student(int id, String firstName, String lastName, String city, double advanced_Java_Result, double embedded_Systems_Result) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        City = city;
        Advanced_Java_Result = advanced_Java_Result;
        Embedded_Systems_Result = embedded_Systems_Result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public double getAdvanced_Java_Result() {
        return Advanced_Java_Result;
    }

    public void setAdvanced_Java_Result(double advanced_Java_Result) {
        Advanced_Java_Result = advanced_Java_Result;
    }

    public double getEmbedded_Systems_Result() {
        return Embedded_Systems_Result;
    }

    public void setEmbedded_Systems_Result(double embedded_Systems_Result) {
        Embedded_Systems_Result = embedded_Systems_Result;
    }

    @Override
    public String toString() {
        return "{" +
                " | " + id +
                " | " + firstName + '\'' +
                " | " + lastName + '\'' +
                " | " + City + '\'' +
                " | " + Advanced_Java_Result +
                " | " + Embedded_Systems_Result +
                "}\n";
    }
}

import java.sql.SQLOutput;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String city;
    boolean hasPet;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String city) {
        this.firstName = firstName;
        this.city = city;
    }

    public Person(String firstName, String city, boolean hasPet) {
        this(firstName, city);//constructor chaining
        this.hasPet = hasPet;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        };
        return false;
    }
}

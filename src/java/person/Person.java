package person;
import java.io.Serializable;

/**
 *
 * @author TyHalvorsen
 */
public class Person implements Serializable {
    private String firstName;
    private String lastName;
    public Person(){
        firstName = "";
        lastName = "";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastName;
    }
}

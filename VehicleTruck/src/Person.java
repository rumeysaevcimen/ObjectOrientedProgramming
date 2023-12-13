import java.util.Objects;

public class Person {

    private String name;

    public Person() {
        this.name = "";
    }

    public Person(String theName) {
        this.name = theName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String theName) {
        this.name = theName;
    }

    public String toString() {
        return name;
    }


    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Person person = (Person) other;
        return Objects.equals(name, person.name);
    }
}

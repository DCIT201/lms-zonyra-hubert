package LMS;

public class Patron {
    private int id;
    private String name;// Name of the patron
    private String email;
    private String phoneNumber;

    // Constructor: Initializes the patron's name
    public Patron(String name)  {
        this.name = name;
    }

    public Patron(int id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Get the name of the patron
    public String getName() {
        return name;
    }
}

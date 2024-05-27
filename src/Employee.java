public class Employee {
    private final int id;
    private final long phoneNumber;
    private final String name;
    private int exp;

    public Employee(int id, long phoneNumber, String name, int exp) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.exp = exp;
    }

    public int getId() {
        return id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "ID: " + id + " " + "Phone number: " + phoneNumber + " " + "Name: " + name + " " + "Experience: " + exp;
    }
}


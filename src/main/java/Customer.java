public class Customer {

    private int id;
    private String name;

    public Customer() {
        System.out.println("==== Object creation started ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
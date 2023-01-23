package hasA;

public class Vehical {
    int Id;
    String model;
    public Vehical(int id, String model) {
        Id = id;
        this.model = model;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //@Override
    public String showmethod() {
        return "Vehical{" +
                "Id=" + Id +
                ", model='" + model + '\'' +
                '}';
    }
}

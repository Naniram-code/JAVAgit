package hasA;

public class Driver {
    private String name;
    private Vehical vehical;

    public Driver(String name, Vehical vehical) {
        this.name = name;
        this.vehical = vehical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehical getVehical() {
        return vehical;
    }

    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }

   // @Override
    public String showDriverDiscription() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", vehical=" + vehical.showmethod() +
                '}';
    }
}
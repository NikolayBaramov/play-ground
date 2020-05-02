package Task19_Ferrari_SU;

public class Ferrari implements Car {
    private String driverName;
    private static final String model = "488-Spider";

    public Ferrari(String driverName){
        this.driverName = driverName;
    }

    public String getModel(){
        return model;
    }

    public String getDriverName(){
        return this.driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas(){
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString(){
        return this.getModel()+"/"+this.brakes()+"/"+this.gas()+"/"+this.getDriverName();
    }

}

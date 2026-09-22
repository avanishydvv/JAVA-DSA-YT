package TRANSPORT;

public class motorcycle extends vehicle{
    public String handleBarstyle;

    public String suspensionType;

    motorcycle(String name,String model,int noOfTyres,String handleBarstyle,String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarstyle =handleBarstyle;
        this.suspensionType = suspensionType;

    }

    public void wheelie(){
        System.out.println("Motorcycle is doing wheelie "+ name);
    }
}

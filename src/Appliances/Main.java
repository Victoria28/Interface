package Appliances;


public class Main {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        TV tv= new TV();

        Switcher switcher=new Switcher();



        switcher.addElectricityConsumer(lamp);
        switcher.addElectricityConsumer(tv);
        switcher.addElectricityConsumer(new VacuumCleaner());


        switcher.turnOn();

    }

}

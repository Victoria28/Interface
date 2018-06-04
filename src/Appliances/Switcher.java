package Appliances;

import java.util.ArrayList;

public class Switcher {

    ArrayList<ElectricityConsumer> consumerList = new ArrayList<>();


    public void turnOn(){
        System.out.println("the switcher is turned on");
        activateAllConsumers();
    }

    public void addElectricityConsumer( ElectricityConsumer elConsumer){
        consumerList.add(elConsumer);




    }

    public void activateAllConsumers(){
        for (ElectricityConsumer electricityConsumer:consumerList) {
            electricityConsumer.switchOn();

        }
    }

}

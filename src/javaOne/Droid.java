package javaOne;

public class Droid {

    String name;
    int batteryLevel;

    //constructor
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    //toString method
    public String toString(){
        return "Hello, I am the droid:" + name;
    }

    //performTask method
    public void performTask(String task){
        System.out.println(name + " is performing " + task);
        batteryLevel -= 10;
    }

    //report batter level method
    public void energyReport(){
        System.out.println(batteryLevel);
    }

    //exchange battery level method
    public void energyTransfer(int batteryTransfer){
        batteryLevel += batteryTransfer;
    }

    public static void main(String[] args){
        Droid codey = new Droid("Codey");

        System.out.println(codey.toString());
        codey.performTask("dancing");
        codey.performTask("cleaning");
        codey.performTask("drawing");

    }



}

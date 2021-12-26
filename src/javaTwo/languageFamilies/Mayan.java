package javaTwo.languageFamilies;

public class Mayan extends Language{

    public Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
    }

    //override method to print info about Mayan langauge that called method
    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " +
                regionsSpoken + ". The language follows the word order: " + this.wordOrder + "\n" +
                        "Fun fact: " + this.name + " is an ergative language.");
    }
}

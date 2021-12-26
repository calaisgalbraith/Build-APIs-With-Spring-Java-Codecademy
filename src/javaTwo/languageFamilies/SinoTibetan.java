package javaTwo.languageFamilies;

public class SinoTibetan extends Language{

    public SinoTibetan(String name, int numSpeakers) {
        super(name, numSpeakers, "Asia", "subject-object-verb");

        //change word order if name is Chinese
        if(this.name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }

    }

}

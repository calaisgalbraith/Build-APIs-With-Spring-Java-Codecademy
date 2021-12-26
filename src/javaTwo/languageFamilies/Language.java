package javaTwo.languageFamilies;

//project to practice child/parent relationships with real world language families


public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    //constructor
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    //prints out the information about language that called method
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " +
               regionsSpoken + ". The language follows the word order: " + this.wordOrder);
    }


    public static void main(String[] args) {
        Language english = new Language("English", 400000000, "United States", "subject-verb-object");

        english.getInfo();
    }
}

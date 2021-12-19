package javaOne;

public class MadLibs {

    public static void main(String[] args) {
        String name1 = "Jubilee";

        String adjective1 = "fluffy";
        String adjective2 = "hairy";
        String adjective3 = "cute";

        String verb1 = "slide";

        String noun1 = "dog";
        String noun2 = "beardedDragon";
        String noun3 = "sink";
        String noun4 = "rice";
        String noun5 = "computer";
        String noun6 = "chicken";

        String name2 = "Chanel";

        int number = 13;

        String place1 = "San Antonio";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}

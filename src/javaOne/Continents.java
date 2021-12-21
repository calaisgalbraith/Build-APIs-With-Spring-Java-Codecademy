package javaOne;

import java.util.Scanner;

public class Continents {

    public static void displayContinent(int continent){
        //display info based on which continent selected
        switch(continent){
            case 1: System.out.println("North America: Mexico City, Mexico");
                break;
            case 2: System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3: System.out.println("Europe: Moscow, Russia");
                break;
            case 4: System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5: System.out.println("Asia: Shanghai, China");
                break;
            case 6: System.out.println("Australia: Sydney, Australia");
                break;
            case 7: System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:   System.out.println("Undefined continent!");

        }
    }

    //print out continent & largest city in that continent
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ask user to select continent
        System.out.println("Select a continent & see it's largest city!\n" +
                "1: North America\n" +
                "2: South America\n" +
                "3: Europe\n" +
                "4: Africa\n" +
                "5: Asia\n" +
                "6: Australia\n" +
                "7: Antarctica");

        int a = sc.nextInt();
        displayContinent(a);

    }


}

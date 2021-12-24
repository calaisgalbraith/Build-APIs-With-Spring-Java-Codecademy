package javaTwo;

public class DNA {

    //determines if a protein is present in a strand of DNA

    public static void containsProtein(String dna){

        //checks if contains start codon & end codon
        if(dna.contains("ATG") && dna.contains("TGA")){

            //get index of start codon
            int startIndex = dna.indexOf("ATG");

            //get index of end codon
            int endIndex = dna.indexOf("TGA");

            //string to hold nucleotide between start and end codon
            String nucleotide = dna.substring(startIndex + 3, endIndex);

            //check if length of nucleotides is a multiple of 3
            if(nucleotide.length() % 3 == 0){
                System.out.println("Contains a protein.");
            }
            else{
                System.out.println("Does not contain a protein.");
            }

        }

        else{
            System.out.println("Does not contain a protein.");
        }
    }

    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        containsProtein(dna1);
        containsProtein(dna2);
        containsProtein(dna3);
    }
}

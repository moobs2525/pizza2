public class Pyramide {

    public static void main(String[] args) {
        //  The following string is provided
        //  String values = “321456987”;
        // Draw a line for each digit with ‘*’
        // Example
        // For the digit 3 and 2 the following lines will be drawn:
        //***
        //**


        String values = "123456789";
        int height = 9;
        //char numValues =values.charAt(0);
        //int tal = numValues;
        for (int i = 0; i < values.length(); i++) {

            // henter cifrene i values
            char cifre = values.charAt(i);

            // konverterer til int(nummer) værdier
            int number = Character.getNumericValue(cifre);

            // udregn antal mellemrum før stjernerne
            int spaces = values.length() - (i + 1);

            // print mellemrum
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

                //laver numrene om til *
                for (int j = 0; j < number; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

        System.out.println();
            System.out.print("       " + "*");
            System.out.println();
            System.out.print("      " + "* *");
            System.out.println();
            System.out.print("     " + "* * *");
            System.out.println();
            System.out.print("    " + "* * * *");
            System.out.println();
            System.out.print("   " + "* * * * *");
            System.out.println();
            System.out.print("  " + "* * * * * *");
            System.out.println();
            System.out.print(" " + "* * * * * * *");
            System.out.println();
            System.out.print("* * * * * * * *");

        }
    }




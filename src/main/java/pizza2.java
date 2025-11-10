import java.util.Scanner;

public class pizza2 {



        public static void main(String[] args) {
            System.out.println("1. Margheritha: Tomato, cheese \t\t\t\t\t\t\t\t\tPrice DKK 60 \n2. Hawaii: Tomato, cheese, ham, pineapple \t\t\t\t\t\tPrice DKK 75 \n3. Italiano: Tomato, cheese, pepperoni \t\t\t\t\t\t\tPrice DKK 70\n4. Cappriosa: tomato, cheese, ham, mushrooms \t\t\t\t\tprice DDK 75\n5. Torino: tomato, cheese, bacon, sausage \t\t\t\t\t\tPrice DDK 65\n6. Kebab: tomato, cheese, kebab, salat, dressing \t\t\t\tPrice DDK 85\n7. Milano: tomato, cheese, pepperoni, ham, green pepper\t\t\tPrice DDK 90\n8. Lambada: tomato, cheese, pepperoni, kebab, onion\t\t\t\tPrice DDK 95\n9. Vinizia: tomato, cheese, ham, sausage\t\t\t\t\t\tPrice DDK 55\n10. Special Tomato anchovies, crab \t\t\t\t\t\t\t\tPrice DKK 80\n");

            System.out.println("Which pizza do you want? Enter number:");

                        Scanner input = new Scanner(System.in);
            int pizzaChoice = input.nextInt();
            double price = 0;
            int sizeChoice;

            if (pizzaChoice == 1) {
                price = 60;
            } else if (pizzaChoice == 2) {
                price = 75;
            } else if (pizzaChoice == 3) {
                price = 70;
            } else if (pizzaChoice == 4) {
                price = 75;
            } else if (pizzaChoice == 5) {
                price = 65;
            } else if (pizzaChoice == 6) {
                price = 85;
            } else if (pizzaChoice == 7) {
                price = 90;
            } else if (pizzaChoice == 8) {
                price = 95;
            } else if (pizzaChoice == 9) {
                price = 55;
            } else if (pizzaChoice == 10) {
                price = 80;
            } else {
                System.out.println("Invalid choice");
            }


            System.out.println("Do you want a Child (1), Standard (2), or Family (3) size?");
            sizeChoice = input.nextInt();

            // Justerer prisen baseret på størrelse
            if (sizeChoice == 1) {
                System.out.println("Prisen er DKK " + (price * 0.75));
            } else if (sizeChoice == 2) {
                System.out.println("Prisen er DKK " + price);
            } else if (sizeChoice == 3) {
                System.out.println("Prisen er DKK " + (price * 1.5));
            }
        }
    }


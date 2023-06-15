package day21_multiDimensionalArray;

public class items {
    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"}, {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        System.out.println(items[0][1]+ "\t" + items[0][1] + "\t" + items[0][2] + items[0][3] +"\n" + items[1][0] + "\t" + items[1][1] + "\t" + items[1][2] +"\t" +items[1][3] +"\n" + items[2][0] + "\t" + items[2][1] + "\t" + items[2][2] +"\t" + items[2][3] + "\t" + items[2][4]);

        System.out.println("----------------------------------------------------------------------------");

        System.out.println(items[0][3] + "\t" + items[0][2] + "\t" + items[0][1] + items[0][0] + "\n" + items[1][3] + "\t" + items[1][2] + items[1][1] + "\t" + items[1][0] + "\n" + items[2][4] +"\t" + items[2][3]+ "\t" + items[2][2] + "\t" + items[2][1] + "\t" +items[2][0]);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println();

    }
}
/*
 Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */

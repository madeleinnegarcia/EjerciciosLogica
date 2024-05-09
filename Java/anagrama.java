
import java.util.Scanner;

public class anagrama {

    public static boolean EsAnagrama(String word1, String word2) {
        StringBuilder builder1 = new StringBuilder(word1);
        StringBuilder builder2 = new StringBuilder(word2);

        String word1envertida = builder1.reverse().toString();
        String word2envertida = builder2.reverse().toString();
        if ((word1envertida.equals(word2)) ||
                (word1.equals(word2envertida))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Ingresa una palbra: ");

        String palabra1 = scanner1.nextLine();

        System.out.println("Ingresa la siguiente palabra: ");

        String palabra2 = scanner2.nextLine();

        System.out.println(EsAnagrama(palabra1, palabra2));

        scanner1.close();
        scanner2.close();

    }

}

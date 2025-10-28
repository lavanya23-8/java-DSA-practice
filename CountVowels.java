import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels in the given string: " + count);

        sc.close();
    }
}

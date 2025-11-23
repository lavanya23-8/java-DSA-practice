public class VowelCount {
    public static void main(String[] args) {
        String s = "Hello Java";
        int count = 0;

        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1)
                count++;
        }

        System.out.println("Vowel Count = " + count);
    }
}

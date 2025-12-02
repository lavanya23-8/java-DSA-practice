public class CountVowels {
    public static void main(String[] args) {
        String s = "Programming";
        long count = s.chars()
                      .mapToObj(c -> (char) c)
                      .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                      .count();
        System.out.println("Vowels: " + count);
    }
}

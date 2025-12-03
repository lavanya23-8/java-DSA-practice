public class RemoveChar {
    public static void main(String[] args) {
        String s = "banana";
        char remove = 'a';

        String result = s.replace(remove + "", "");
        System.out.println(result);
    }
}

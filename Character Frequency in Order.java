public class Main {
    public static void main(String[] args) {
        String s = "programming";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(s.indexOf(ch) == i) {
                long count = s.chars().filter(c -> c == ch).count();
                System.out.println(ch + " = " + count);
            }
        }
    }
}

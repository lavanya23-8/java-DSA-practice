public class Main {
    public static void main(String[] args) {
        String s = "Java makes coding fun";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            sb.append(new StringBuilder(w).reverse()).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

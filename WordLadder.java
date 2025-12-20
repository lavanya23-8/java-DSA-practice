import java.util.*;

public class WordLadder {
    public static int ladderLength(String begin, String end, List<String> dict) {
        Set<String> set = new HashSet<>(dict);
        Queue<String> q = new LinkedList<>();
        q.add(begin);
        int level = 1;

        while (!q.isEmpty()) {
            for (int s = q.size(); s > 0; s--) {
                String w = q.poll();
                if (w.equals(end)) return level;

                char[] ch = w.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    char old = ch[i];
                    for (char c='a'; c<='z'; c++) {
                        ch[i] = c;
                        String nw = new String(ch);
                        if (set.remove(nw)) q.add(nw);
                    }
                    ch[i] = old;
                }
            }
            level++;
        }
        return 0;
    }
}

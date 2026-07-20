import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean present(String w, String row) {
        for (char c : w.toCharArray()) {

            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    public String[] findWords(String[] words) {
        List<String> r = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (String w : words) {

            String lowerW = w.toLowerCase();
            
            char firstChar = lowerW.charAt(0);

            if (row1.indexOf(firstChar) != -1) {
                if (present(lowerW, row1)) {
                    r.add(w);
                }
            } else if (row2.indexOf(firstChar) != -1) {
                if (present(lowerW, row2)) {
                    r.add(w);
                }
            } else if (row3.indexOf(firstChar) != -1) {
                if (present(lowerW, row3)) { 
                    r.add(w);
                }
            }
        }

        return r.toArray(new String[0]);
    }
}


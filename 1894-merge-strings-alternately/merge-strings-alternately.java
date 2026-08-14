class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str = "";
        String counter = "word1";
        int len = word1.length() + word2.length();

        for (int i = 0; i < len; i++) {
            if (counter.equals("word1")) {
                str += word1.charAt(0);
                word1 = word1.substring(1);
                counter = "word2";
            } else if (counter.equals("word2")) {
                str += word2.charAt(0);
                word2 = word2.substring(1);
                counter = "word1";
            }

            if (word1.isEmpty() || word2.isEmpty()) {
                break;
            }
        }

        if (!word1.isEmpty()) {
            str += word1;
        } else if (!word2.isEmpty()) {
            str += word2;
        }

        return str;
    }
}
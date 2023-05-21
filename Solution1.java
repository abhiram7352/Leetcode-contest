class Solution1 {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i <= j) {
            if (ch[i] != cha[j]) {
                if (ch[i] > ch[j]) {
                    ch[i] = ch[j];
                } else {
                    ch[j] = ch[i];
                }
            }
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
}
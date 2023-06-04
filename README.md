# Leetcode-contest
Will upload all the leetcode contest's code here.
Maximize String Length
java code -->
class Solution {
    public int minimizedStringLength(String s){
         int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(s.charAt(i));
        }
        return hs.size();
    }
}
                                               
2717. Semi-Ordered Permutation
  java code -->  
  class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
       
        int oneEnd = 0;
        int nEnd = 0;
        
        for (int i = 0; i < n; i++) {
            int value = nums[i];
            
            if (value == 1 || value == n) {
                if(value == 1)
                    oneEnd = i;
                else
                    nEnd = i;
            }
        }
        int diff = n-nEnd;
        diff--;
        int total = oneEnd+diff;
        if(oneEnd>nEnd) total--;
        return total;
    }
}

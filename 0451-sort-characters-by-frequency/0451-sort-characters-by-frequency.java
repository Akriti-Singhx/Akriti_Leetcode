class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];

        // frequency count
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        StringBuilder ans = new StringBuilder();

        // baar-baar highest frequency wala character dhundo
        for (int count = s.length(); count > 0; count--) {

            for (int i = 0; i < 128; i++) {

                if (freq[i] == count) {

                    for (int j = 0; j < count; j++) {
                        ans.append((char)i);
                    }
                }
            }
        }

        return ans.toString();
    }
}
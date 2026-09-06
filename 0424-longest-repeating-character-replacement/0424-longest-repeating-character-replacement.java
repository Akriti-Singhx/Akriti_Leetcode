class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int maxfreq=0;
        int maxlength=0;

        int j=0;

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            // current character ki ferquency badhayenge 
            freq[ch- 'A']++;

            //maxfreq ko update karenge 
            maxfreq= Math.max(maxfreq, freq[ch- 'A']);

            int windowlength = i-j +1;

            int changes = windowlength- maxfreq;

            // agar changes k se zyada hue tb 
            while(changes>k){
                freq[s.charAt(j)- 'A']--;
                j++;

                // again calculating window lwngth and maxfreq
                windowlength= i-j+1;
                changes= windowlength - maxfreq;
            }
             maxlength = Math.max(maxlength, i-j + 1);
        }
        return maxlength;

    }
}
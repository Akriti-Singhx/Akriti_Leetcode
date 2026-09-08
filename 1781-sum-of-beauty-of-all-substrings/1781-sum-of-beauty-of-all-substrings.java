class Solution {
    public int beautySum(String s) {
        int beauty=0;
        // sabse pahle loop chalega 
        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();

            // ab ye wala loop substring ko expand krne k liye
            for(int j=i; j<s.length(); j++){

                // har ek character ko integer me convert karenge 
                char ch= s.charAt(j);
                // ab agar koi element aaya aur wo pahle se hai toh +1 ho jayega aur agar pahle se nhi tha toh wo map me naya element ban k add hoga

                // agar ch map me hai toh 0 + 1 hoga jo ki 0 ki jahgah 1 aa jayega aur agar ch fir se aaya tohh 1+1 hoga aur 1 ki jagah 2 set ho jayega.

                map.put(ch, map.getOrDefault(ch,0) +1);

                // ab iske bad maximuma aur min freq ko find karenge 

                int maxfreq=0;
                int minfreq= Integer.MAX_VALUE;

                // map ki values me se frequency find karenge 
                for(int freq: map.values()){
                     maxfreq = Math.max(freq, maxfreq);
                     minfreq= Math.min(freq, minfreq);
                }
                beauty += maxfreq- minfreq;
            }
            
        }
        return beauty;
    }
}
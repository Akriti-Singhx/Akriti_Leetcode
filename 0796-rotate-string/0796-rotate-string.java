class Solution {
    public boolean rotateString(String s, String goal) {
        // agar s ki length goal k length k barabar na ho .
        if(s.length() != goal.length()){
            return false;
        }

        // iska logic ye hai ki s ko do bar add kr dnge aur goal agar usme hua toh true ho jayega . 
        String combined = s+s;
        return combined.contains(goal);
    }
}

// abcde + abcde = abcdeabcde
 // goal = cdeab --> true
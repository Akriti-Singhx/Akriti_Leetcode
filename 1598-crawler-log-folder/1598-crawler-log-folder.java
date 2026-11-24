class Solution {
    public int minOperations(String[] logs) {
        // isme hame teen logs diye gaye hai , jab ../ aayega toh depth -- hoga . jab ./ aaywga toh continue karega , aur jb x/ aayega toh depth ++ hoga 

        int depth = 0;
        for(String log:logs){
            if(log.equals("../")){
                if(depth >0){
                    depth--;
                }
            }else if(log.equals("./")){
                continue;
            }else{
                depth++;
            }
        }
        return depth;
    }
}
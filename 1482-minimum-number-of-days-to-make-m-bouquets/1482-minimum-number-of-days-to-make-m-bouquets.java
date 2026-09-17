class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowers= (long) m*k;
        if(totalFlowers > bloomDay.length){
            return -1;
        }

        int low= Integer.MAX_VALUE;
        int high= Integer.MIN_VALUE;

        for(int day: bloomDay){
            low= Math.min(day, low);
            high= Math.max(day,high);
        }

        int answer= -1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            int bouquets=0;
            int count=0;

             for (int day : bloomDay) {

                if (day <= mid) {
                    // Flower has bloomed
                    count++;

                    if (count == k) {
                        bouquets++;
                        count = 0;
                    }

                } else {
                    // Consecutive sequence broke
                    count = 0;
                }
            }

            // binary search on mid
            if(bouquets >= m){
                answer= mid;
                high= mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return answer;
    }
}
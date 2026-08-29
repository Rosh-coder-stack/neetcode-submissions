class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            pq.add(new int[]{nums[i], i});

            if(i >= k - 1) {

                while(pq.peek()[1] <= i - k) {
                    pq.poll();
                }

                int max = pq.peek()[0];

                ans.add(max);
            }
        }

        return ans.stream()
           .mapToInt(Integer::intValue)
           .toArray();
    }
}
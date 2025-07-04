class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] index = new int[10001];
        int ans[] = new int [nums1.length];
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[] nextGreater = new int[n];

        Arrays.fill(nextGreater, -1);

        // Building index[] map
        for(int i =0;i<n;i++){
            index[nums2[i]] = i; 
        }

        // Using stack to fill MONOTONIC nextGreater[]

        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && nums2[st.peek()] < nums2[i]){
                nextGreater[st.pop()] = nums2[i];
            }
            st.push(i);
        }

        // filling ans[]
        for(int i =0;i<nums1.length;i++){
            ans[i] = nextGreater[index[nums1[i]]];
        }

        return ans;

    }
}
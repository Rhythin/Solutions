class Solution {
    public int[] twoSum(int[] a, int target) {
        // O(n) with hashmap
        int n=a.length;
        int ans[]=new int[2];
        HashMap<Integer, Integer> hm=new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(hm.containsKey(target-a[i])){
                ans[0]=hm.get(target-a[i]);
                ans[1]=i;
                return ans;
            }
            else{
                hm.put(a[i],i);
            }
        }
        return ans;
    }
}
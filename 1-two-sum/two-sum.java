class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],0);
        for(int i=1;i<arr.length;i++)
        {
            int required=target-arr[i];

            if(map.containsKey(required))
            {
                return new int[] {map.get(required),i};
            }
            else
                map.put(arr[i],i);
        }

        return new int[] {-1,-1};
        
    }
}
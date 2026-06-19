import java.util.Hashtable;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Hashtable<Integer, Integer> hs = new Hashtable<>();
        
        // Find matching elements (Intersection)
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    hs.put(nums1[i], i);
                }
            }
        }
        
        int[] result = new int[hs.size()];
        int index = 0;
        
        for (int key : hs.keySet()) {
            result[index] = key;
            index++;
        }
        
        return result;
    }
}

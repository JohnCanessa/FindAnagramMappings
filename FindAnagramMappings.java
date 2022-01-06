import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 * LeetCode 760. Find Anagram Mappings
 * https://leetcode.com/problems/find-anagram-mappings/
 */
public class FindAnagramMappings {


    /**
     * Return an index mapping array mapping from nums1 to nums2 where 
     * mapping[i] = j means the ith element in nums1 appears in nums2 at index j. 
     * If there are multiple answers, return any of them.
     * 
     * Execution: O(n) - Space: O(n)
     * Runtime: 1 ms, faster than 87.62% of Java online submissions.
     * Memory Usage: 37.8 MB, less than 58.41% of Java online submissions.
     * 
     * 51 / 51 test cases passed.
     * Status: Accepted
     * Runtime: 1 ms
     * Memory Usage: 37.8 MB
     */
    static public int[] anagramMappings(int[] nums1, int[] nums2) {
 
        // **** initialization ****
        int[] mappings                  = new int[nums1.length];
        HashMap<Integer, Integer> hm    = new HashMap<>();

        // **** populate hashmap with contents of nums2 - O(n) ****
        for (int i = 0; i < nums2.length; i++)
            hm.put(nums2[i], i);

        // ???? ????
        System.out.println("<<< hm: " + hm.toString());

        // **** traverse nums1 populating mappings using the hashmap - O(n) ****
        for (int i = 0; i < nums1.length; i++)
            mappings[i] = hm.get(nums1[i]);

        // **** return mappings array ****
        return mappings;
    }


    /**
     * Test scaffold.
     * !!!! NOT PART OF THE SOLUTION !!!!
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read nums1 array ****
        int[] nums1 = Arrays.stream(br.readLine().trim().split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        // **** read nums2 array ****
        int[] nums2 = Arrays.stream(br.readLine().trim().split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        // **** close buffered reader ****
        br.close();
        
        // ???? ????
        System.out.println("main <<< nums1: " + Arrays.toString(nums1));
        System.out.println("main <<< nums2: " + Arrays.toString(nums2));

        // **** call function of interest and display result ****
        System.out.println("main <<< anagramMappings: " + Arrays.toString(anagramMappings(nums1, nums2)));
    }

}
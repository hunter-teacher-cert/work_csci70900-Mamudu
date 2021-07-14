
// Verical Bargraph

public class BarGraphVertical
{
    /***
    vertBarGraphify(nums) takes a list of non-negative integers and prints a set of vertical bars visualizing the magnitude of the value at each index. Exempli gratia, for x = {0,1,2,3}:
    vertBarGraphify(x) 
          *
        * *
      * * *
    0 1 2 3
    and for x = {1,0,3,2}:
    vertBarGraphify(x) -> 
        *
        * *
    *   * *
    0 1 2 3
    **/

    public static void barGraphify(int[] nums)
    {
        for(int i=0; i < nums.length; i++)
        for (int j=nums.length; j < i; j--)
        {
            System.out.println(i + ": " + "=".repeat(nums[i]));
            System.out.println(j + ": " + " ".repeat(num[j]));
        }
    }

    public static void main(String []args)
    {
      int[]nums1 = {0,1,2,3}; // provided example
      int[]nums2 = {1,0,3,2}; // provided example
      int[]nums3 = {1,9,2,6,7,10}; // our own example

    barGraphify(nums1);

    }
}

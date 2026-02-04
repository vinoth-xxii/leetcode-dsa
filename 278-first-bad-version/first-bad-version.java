/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //My third revision
        //it askes for minimal calls, and it's sorted - Binary Search
        //if the half you pick returns false, then bad once are in 2nd half
        /*if the half you pick return true, then either it must be the inital bad
           or the previous once is the cause - this is the root problem to solve
        */
        //which means searching the 1st half if search space is present. Else return left

        int left = 1; //starting with 1, as mentioned in constrain
        int right = n;
        int middle;

        while(left<=right){
            middle = left + (right - left)/2;
            
            if(!isBadVersion(middle)){ //if it's not the bad version
                left = middle + 1;     //no need return like in binarySeach, wrong to do so
            }
            else{
                right = middle - 1;
            }
        }

        return left;

    }
}
package Redoone;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
      int ans =  EatingSpeed(piles, h);
        System.out.println(ans);
    }

    static int EatingSpeed(int[] piles, int h) {
        //minimum speed of eating banana is 1.
        int min = 1;
        int max = 0;
        for (int pile : piles) {
            max = Math.max(pile, max);
        }
        //now we found the space.
        while (min < max) {
            //finding the speed in mid value.
            int mid = min + (max - min) / 2;
            int hours = 0; //minimum hours to finish.
            //finding the total hours it ate with current speed.
            //for each loop.
            for (int pile :piles) {
                hours += (pile + mid - 1) / mid;
            }
            if(hours > h) {
                min = mid + 1;
            }
            else {
                max = mid;
            }
        }
        return max;
    }
}

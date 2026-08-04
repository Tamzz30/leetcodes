class Solution {
    public int countElements(int[] arr) {
       int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        int count = 0;
        for (int num : arr) {
            if (num > min && num < max)
                count++;
        }

        return count;
       // return count;
    }}

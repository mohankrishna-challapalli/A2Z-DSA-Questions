class Solution {
    public int reverse(int x) {
        long reversedNum = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            reversedNum = reversedNum * 10 + pop;

            if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) reversedNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int x = 123;
        int result = solution.reverse(x);
        System.out.println(result);  // Output: 321
    }
}

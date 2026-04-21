class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str = str + digits[i];
        }

        long n = Long.parseLong(str);  
        n = n + 1;

        String result = String.valueOf(n);

        int[] ans = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            ans[i] = result.charAt(i) - '0';
        }

        return ans;
    }
}

public class Palindrome_number {
    public boolean isPalindrome(int x) {
        int check = x;
        int reverse = 0;
        if(x<0)
            return false;
        while(x>0)
        {
            int digit = x % 10;
            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && digit > 7))
                return false;
            if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && digit < -8))
                return false;
            reverse = reverse * 10 + digit;
            x = x / 10;

        }
        return check==reverse;
    }
}

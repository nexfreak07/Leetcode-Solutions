public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String reverse = "";
        String Original = "";
        int length = s.length();
        for(int i=0; i<length; i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                Original = Original + s.charAt(i);
            }
        }

        for(int i=length-1; i>=0; i--)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                reverse = reverse + s.charAt(i);
            }
        }
        reverse = reverse.toLowerCase();
        Original = Original.toLowerCase();
        System.out.println(Original);
        return Original.equals(reverse);

    }
}

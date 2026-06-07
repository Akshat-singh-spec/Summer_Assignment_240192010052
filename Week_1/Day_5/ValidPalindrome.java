class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String str = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i)))
            sb.append(str.charAt(i));
        }
        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i))
            return false;
        }
        return true;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] hash1 = new int [256];
        for(int i=0;i<ransomNote.length();i++){
            hash1[ransomNote.charAt(i)] +=1;
        }
        int [] hash2 = new int [256];
        for(int i=0;i<magazine.length();i++){
            hash2[magazine.charAt(i)] +=1;
        }
        for(int i=0;i<ransomNote.length();i++){
            char charac = ransomNote.charAt(i);
            if(hash1[charac] > hash2[charac] )
            return false;
        }
        return true;
    }
}
class Solution {
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
    public String sortVowels(String s) {
        ArrayList<Character> vowels=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowels.add(s.charAt(i));

            }
        }
        Collections.sort(vowels);
        StringBuilder ans=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
               ans.append( vowels.get(j));
               j++;
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();

        
    }
}
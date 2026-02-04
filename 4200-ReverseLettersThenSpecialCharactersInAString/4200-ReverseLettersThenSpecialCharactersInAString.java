// Last updated: 2/4/2026, 3:29:07 PM
class Solution {
    public String reverseByType(String s) {
        
        char[] arr = s.toCharArray();
        List<Character>letters=new ArrayList<>();
        List<Character>specials=new ArrayList<>();
        for(char ch:arr){
            if(Character.isLowerCase(ch)){
                letters.add(ch);
            }
            else specials.add(ch);
        }
        Collections.reverse(letters);
        Collections.reverse(specials);
        int li=0,si=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=letters.get(li++);
            }
            else{
                arr[i]=specials.get(si++);
            }
        }
        return new String(arr);
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char a = pattern.charAt(i);
            if(map.containsValue(arr[i]) && !arr[i].equals(map.get(a))){
                return false;
            }
            else{
                map.put(a,arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            char a = pattern.charAt(i);
            if(!map.get(a).equals(arr[i])){
                return false;
            }
        }
        return true;
    }
}
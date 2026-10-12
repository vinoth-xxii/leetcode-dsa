class Solution {
    public String reverse(String str){
        //use StringBuilder for mutability
        StringBuilder res = new StringBuilder(str);
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++; right--;
        }

        return res.toString();
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            result.append(reverse(arr[i]));

            if(i != arr.length - 1){
                result.append(" ");
            }
        }

        return result.toString();
    }
}
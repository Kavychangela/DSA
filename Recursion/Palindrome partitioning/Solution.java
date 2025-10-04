import java.util.*;

class Solution {
    private void solve(int index, String s, List<String> path, List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(path));
            return;
        } 

        for(int i = index; i < s.length(); i++){
            if (isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                solve(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    private Boolean isPalindrome(String s, int start, int end){
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        solve(0, s, path, res);
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        List<List<String>> result = solution.partition(s);
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}
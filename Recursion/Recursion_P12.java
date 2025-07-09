           // Problem :-This code is a Java program that removes duplicate characters from a string using recursion.
// It uses a boolean array to keep track of characters that have already been added to the new string.
// The `removeduplicate` method recursively processes each character in the input string, checking if it has already been added to the new string.
// If a character is already present, it skips adding it; otherwise, it appends the character to the new string and marks it as added in the boolean array.
// The program prints the new string without duplicates at the end of the recursion. 
// Problem: Remove Duplicates from a String using Recursion
// Description: Given a string, the task is to remove duplicate characters from it using recursion.
// Approach: Use a boolean array to track characters that have already been added to the new string. The recursion processes each character, checking if it has been added before. If not, it appends the character to the new string and marks it as added.
// Time Complexity: O(n) where n is the length of the string, as each character is processed once.
// Space Complexity: O(n) for the new string and the boolean array. 

public class Recursion_P12 {
    public static int removeduplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return 0;
        }

        char currentchar = str.charAt(idx);
        if(map[currentchar - 'a'] == true){
            //present
            return removeduplicate(str, idx + 1, newstr, map);
        }else{
            //not present
            map[currentchar - 'a'] = true;
            newstr.append(currentchar);
            return removeduplicate(str, idx + 1, newstr, map);
        }
    }
    public static void main(String args[]){
 String str = "appnnacollege";
        boolean map[] = new boolean[26]; //for a-z
        StringBuilder newstr = new StringBuilder("");
        removeduplicate(str, 0, newstr, map);
        //System.out.println(newstr);
    }
}

/*
  Name: Chikweze Chukwubuikem
  Student ID: 31531764

  Lab1 has two methods and a main method
  First method: isAnagram()
    0. This method checks whether two Strings make an anagram by:
    1. Converting the strings to character arrays
    2. Creating a frequency array of length 26
    3. Of each appearance of a character in String a, the element in charFrequency is increased by 1
    4. Of each appearance of a character in String a, the element in charFrequency is
        decreased by 1 thus keeping all the values of charFrequency at 0.


 */
public class Lab1{

    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        char[] char_a = a.toCharArray();
        char[] char_b = b.toCharArray();

        int[] charFrequency = new int[26] ;

        for(int i = 0; i <a.length(); i++){
            int i_char = char_a[i]-'a';
            charFrequency[i_char]++;
        }

        for(int i = 0; i <b.length(); i++){
            int i_char = char_b[i]-'a';
            charFrequency[i_char]--;
        }

        for(int i = 0; i <26; i++){
            if(charFrequency[i] != 0) return false;
        }

        return true;
    }

    public static boolean isRotation(String a, String b){
        return (a.length() == b.length() && (a+a).contains(b));
    }

    public static void main(String[] args){
        String a = args[0];
        String b = args[1];

        if(isAnagram(a,b)){
            System.out.println("An anagram");
        }else
            System.out.println("Not an anagram");

        if(isRotation(a,b)){
            System.out.println("A String Rotation");
        }else
            System.out.println("Is not a string rotation");

    }
}
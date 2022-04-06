import java.util.Arrays;

class Test {

  static boolean checkLength(String first, String second, String third, String result) {
    if (first.length() + second.length() != result.length()) {
      return false;
    }
    else {
      return true;
    }
  }

  static String sortString(String str) {
  
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);

    str = String.valueOf(charArray);

    return str;
  }

  static boolean shuffleCheck(String first, String second, String third, String result) {
    
    // sort each string to make comparison easier
    first = sortString(first);
    second = sortString(second);
    third =sortString(third);
    result = sortString(result);

    // variables to track each character of 3 strings
    int i = 0, j = 0, k = 0, l =0 ;

    // iterate through all characters of result
    while (l != result.length()) {

      // check if first character of result matches
      // with first character of first string
      if (i < first.length() && first.charAt(i) == result.charAt(k))
        i++;

      // check if first character of result matches
      // with the first character of second string
      else if (j < second.length() && second.charAt(j) == result.charAt(k))
        j++;
      
      else if (k < third.length() && third.charAt(k) == result.charAt(k))
        k++;
      
      // if the character doesn't match
      else {
        return false;
      }

      // access next character of result
      l++;
    }

    // after accessing all characters of result
    // if either first or second has some characters left
    if(i < first.length() || j < second.length() || k < third.length()) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {

    String first = "abc";
    String second = "def";
    String third ="dabecf";
    String[] results = {"daebfc", "cdbeaf", "dabecf"};

    // call the method to check if result string is
    // shuffle of the string first and second
    for (String result : results) {
      if (checkLength(first, second, third, result) == true && shuffleCheck(first, second, third, result) == true) {
        System.out.println(result + " is a valid shuffle of " + first + " and " + second + "and " + third);
      }
      else {
        System.out.println(result + " is not a valid shuffle of " + first + " and " + second + "and" +third);
      }
    }
  }
}
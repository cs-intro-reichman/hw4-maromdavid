public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char[] strChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
           strChar[i] = c;
        }
        str = new String(strChar);
        return str;
    }

    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);
        char[] strChar1 = new char[str1.length()];
        char[] strChar2 = new char[str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            strChar1[i] = str1.charAt(i);
        }
        for (int j = 0; j < str2.length(); j++) {
            strChar2[j] = str2.charAt(j);
        }
        if (strChar1.length < strChar2.length) {
            return false;
        }
        for(int i = 0;i <= str1.length() - str2.length(); i++)
        {
            boolean match = true;
            for(int j = 0; j < strChar2.length; j++){
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if(match) {
                return true;
            }
        }
        return false; 
    }
}


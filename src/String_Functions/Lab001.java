package String_Functions;

public class Lab001 {
    public static void main(String[] args) {
        String str1  = "Hello";
        String str2  = "Hello";
        String str3 = new String("Hello"); // Creates a new object on the heap area

        System.out.println(str1 == str2); //rue, both refer to the same object in the string constant pool
        System.out.println(str1 == str3);  // false, str3 is a new object in the heap area
        System.out.println(str1.equals(str3));  // true, because the values in both the strings are same

        // Practice
        String name = "Nayana";
        String name2 = "Nayana Gowda";

        //1.charAT()
        System.out.println(name.charAt(3));

        //2.concat()
        System.out.println(name.concat(" Gowda"));

        //3.length()
        System.out.println(name.length());

        //4.equals()
        System.out.println(name.equals("NAYANA"));

        //5.equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("NAYANA"));

        //6.indexOf()
        System.out.println(name.indexOf('y'));

        //7.length()
        System.out.println(name.length());

        //8.replace( , )
        System.out.println(name.replace('y', 'Y'));

        //9.substring( , )
        System.out.println(name.substring(1, 3));

        //10.split()
        String name4 = "Nayana Gowda";
        String [] split = name4.split(" ");
        System.out.println(split[0]);
        System.out.println(split[1]);

        //11.substring(,)
        System.out.println(name.substring(3,6));

        //12.toLowerCase()
        System.out.println("NAYANA".toLowerCase());

        //13.toUpperCase()
        System.out.println("NAYANA".toUpperCase());

        // 13. replaceAll()
        System.out.println(name2.replaceAll(" ", " GOWDA "));

        // 14. startsWith()
        System.out.println(name.startsWith("N"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. isEmpty()
        System.out.println(name.isEmpty());

        // 17. trim()
        String name3 = "    Nayana Gowda     ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Nayana"));

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("nayana"));

        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("a"));

        // 21. repeat()
        System.out.println(name.repeat(2));

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder("The");
        stringBuilder.append(" Testing Academy ");
        System.out.println(stringBuilder);

        //StringBuffer
        StringBuffer sb = new StringBuffer("Nayana");
        sb.append(" Learning JAVA ");
        System.out.println(sb);

        //StringBuffer2
        StringBuffer stringBuffer = new StringBuffer("Nayana");
        stringBuffer.reverse();
        System.out.println(stringBuffer);





    }
}

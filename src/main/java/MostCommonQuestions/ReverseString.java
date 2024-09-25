package MostCommonQuestions;

public class ReverseString {
    public static String reverseString(String name){
         String reverseName = "";

         for(int i=name.length()-1;i>=0;i--){
             reverseName+= name.charAt(i);
         }
         return reverseName;
    }

    public static String reverseStringStringBuilder(String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        String reverseName= stringBuilder.reverse().toString();
        return reverseName;
    }


    public static void main(String[] args){
        String result = reverseString("Krishna");
        String strBuilderresult = reverseStringStringBuilder("Hello");

        System.out.println("Reverse of my String is: " + result);
        System.out.println("Reverse of my String is: " + strBuilderresult);

    }
}

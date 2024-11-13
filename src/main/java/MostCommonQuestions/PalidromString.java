package MostCommonQuestions;
public class PalidromString {

    public static boolean revStringMethod(String OriginalString){
        String lowerCase = OriginalString.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(lowerCase);
       String revString = stringBuilder.reverse().toString();
       return lowerCase.equals( revString);
    }

    public static void main(String[] args){
        String OriginalString = "Madam";
        if(revStringMethod(OriginalString)){
            System.out.println(OriginalString + " is a palidrom");
        }
        else {
            System.out.println(OriginalString + "Is not a palidrom");

        }
    }
}

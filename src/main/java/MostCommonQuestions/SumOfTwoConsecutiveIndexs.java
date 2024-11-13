package MostCommonQuestions;

public class SumOfTwoConsecutiveIndexs {
    public static int sumOfTwoConsecutiveIndexsMethod(String Name){

        int result= 0 ;

        for (int i=0; i<Name.length()-1;i++){
            if (Character.isLowerCase(Name.charAt(i)) && Character.isLowerCase(Name.charAt(i+1))) {
                result = i + (i + 1);
                return result;
            }
        }
        return result;

    }

    public static void main(String[] args){

        int resultfinal = sumOfTwoConsecutiveIndexsMethod("KriSHNA");
        System.out.println(resultfinal);

    }


}

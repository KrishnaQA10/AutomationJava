package MostCommonQuestions;

public class FactorialOfNumber {

    public static int factorialNo(int number){
        int factorial = 1;
        for(int i=1;i<=number;i++){
            factorial*= i;
        }
        return factorial;
    }

    public static int factoailUsingRecursion(int n){
        if (n==0) {
            return 1;
        }
        return n*factoailUsingRecursion(n-1);

    }


    public static void main (String[] args){
        int finalFacrorialValue = factorialNo(5);
       // int recurstionfactorial = factoailUsingRecursion(3);
        System.out.println("Value of given factorial: " + finalFacrorialValue);
        System.out.println("VAlue of factorial with recursion method: " + factoailUsingRecursion(3));
    }
}

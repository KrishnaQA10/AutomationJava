package MostCommonQuestions;

public class PhysicsBook extends Books {
     void colourOfBook(){
         super.colourOfBook();
        String colour = "Yellow";
        System.out.println("Physics Book colour is " + colour);
    }

    public static void main (String[] args){
        Books B = new Books ();
        PhysicsBook py = new PhysicsBook();
        System.out.println("Pages in the book is "+ B.pages(67));
        py.colourOfBook();
       
}
}
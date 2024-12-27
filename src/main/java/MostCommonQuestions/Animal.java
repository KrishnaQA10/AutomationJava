package MostCommonQuestions;

public class Animal {

    static String name;
    static String colour;
    Animal (String name , String colour){
        Animal.name = name;
        Animal.colour = colour;
    }

    static void speak(){
        System.out.println(name + " is a good Animal with " +colour+ " Colour");

    }

    public static void main (String[] args){
        Animal dog = new Animal("Kitty","Black");
        speak();
        Animal cat = new Animal("Meaw","pink");
        speak();
        Students S = new Students();
    }






}

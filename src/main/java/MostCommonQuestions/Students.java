package MostCommonQuestions;
//Concept on encapsulation where we can hide some private variable it cannot manipulate, and we cannot access private variable put side the class
class Students {
    private String name = "Krishna";
    private int age = 25;

    //getter method

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setter method

    public void setName(String name){
        this.name= name ;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
    public static void main (String[] args){
        Students S = new Students();
        System.out.println(S.getName() + " and " + S.getAge());

    }


}

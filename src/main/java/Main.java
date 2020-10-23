public class Main {

    // this is a field on my class
    private int myInt = 3;

    // this is our entry point for our program
    public static void main(String[] args) {

        // from left to right
        // int is your type
        // firstNumber is your identifier
        // 1 is the literal value
        int firstNumber = 2;

        // not that expressions can be very complex
        // the right hand side of this statement is ordered in such a way
        // that 1/2 will resolve first
        int secondNUmber = (1/2)+1;

        String myString = "Lionel";
        Main main = new Main();
        System.out.println(main.myOtherString);

        // if firstNumber is equal to 1
        // then go ahead and print to the console
        if (true){
            System.out.println("that variable is holding the number 1");
        } else if (firstNumber == 2) {
            System.out.println("that variable is holding the number 2");
        } else {
            System.out.println("I don't know what the deal is with that variable");
        }

        if(firstNumber/2 == 1){
            System.out.println("Yeah thats true");
        }

        // ternary operator
        // this is a shorthand for an if-else statement
        String result = firstNumber/2 == 1 ? "yeah you know it" : " ";

        // you can nest ternaries but its not best practice
        String otherResult = firstNumber/2 == 1 ? "yeah you know it" : firstNumber/2 == 4 ? " " : " ";

        System.out.println(result);


        // ***Strings***
        // Strings are immutable, you cannot change it once its declared
        // String class is final

        // the StringBuilder allows you to manipulate Strings
        StringBuilder str1 = new StringBuilder("This is a String");

        // below is an example of Java utilizing the string pool
        // the literal "one" for both variables are the same in memory
        String one = "two";
        String anotherOne = "two";
        one = "one";

        System.out.println(one == anotherOne);

        // location is the same due to the String Pool implementation
        System.out.println(one.hashCode());
        System.out.println(anotherOne.hashCode());



        // Arrays
        // a container object of indexed fixed values of the same type
        // keep in mind that syntax is important
        // curly braces will represent an array literal
        int[] myInts = {1, 4, 5, 67};
        Object[] myObjects = {1, 3, false, true, "hello"};
        String[] myStrings = {"hello", "world"};
        int[] oneValueArr = {1};
        // this array can only hold up to 10 elements
        // there are no values at any index
        int[] anArray = new int[10];

        boolean[] trueFalse = {true, false, true, true};
        boolean[] trueFalseTwo = new boolean[10];

        // you can declare an array like this but its considered not best practice
        int otherArray[] = {1, 3, 5};



    }


    private String myOtherString = "Beato";

}
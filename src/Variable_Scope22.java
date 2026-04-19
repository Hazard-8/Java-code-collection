public class Variable_Scope22 {

    static int x = 5; // CLASS -> can be accessed inside another methods and main

    public static void main(String[] args){

        // variable scope = where a variable can be accessed

        // Local scope can't see each other, and it's legal to have two local scopes with same name

        System.out.println(x);
        int x = 1; // LOCAL                                             (Class) vs    (Local)
        System.out.println(x); // If a scope variable is declared inside class and (main or method)
                               // java prefer Local, over class scope

        doSomething();

    }
    static void doSomething(){
        System.out.println(x);
        int y = x + 2;           //Just assigning class scope variable.
        System.out.println(y);
        int x = 2;
        System.out.println(x);
    }
}

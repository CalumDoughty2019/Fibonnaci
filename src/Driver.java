public class Driver {
    public static void main(String[] args){
        Fibonnaci fibonnaci = new Fibonnaci();

        long start = System.currentTimeMillis();
        System.out.println("Iterative: " + fibonnaci.iterativeFib(100));
        System.out.println("Time Taken: " + (System.currentTimeMillis() - start));

        System.out.println();
        start = System.currentTimeMillis();
        System.out.println("Recursive: " + fibonnaci.recursiveFib(100));
        System.out.println("Time Taken: " + (System.currentTimeMillis() - start));
    }
}

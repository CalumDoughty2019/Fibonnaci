public class Fibonnaci {

    //iterative approach
    public long iterativeFib(int x){
        if(x <= 1){
            return x;
        }

        long fib = 1;
        long prevFib = 1;

        for(int i = 2; i < x; i++){ //i = 2         //i = 3
            long temp = fib;        //temp = 1      //temp = 2
            fib = fib + prevFib;    //fib = 2       //fib = 3
            prevFib = temp;         //prevfib = 1   //prevfib = 2
        }

        return fib;
    }

    public long recursiveFib(int x){
        if(x <= 2){ //base case
            return 1;
        }
        return recursiveFib(x-1) + recursiveFib(x-2);
    }
}

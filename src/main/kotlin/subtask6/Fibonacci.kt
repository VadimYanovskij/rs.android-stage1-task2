package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
    //    throw NotImplementedError("Not implemented")
        var fib0 = 0
        var fib1 = 1
        var fib2 = fib0 + fib1
        while ( fib1 * fib2 < n ) {
            fib0 = fib1
            fib1 = fib2
            fib2 = fib0 + fib1
        }
        return if ( fib1 * fib2 == n ) intArrayOf ( fib1, fib2, 1 )
                  else intArrayOf( fib1, fib2, 0 )
    }
}

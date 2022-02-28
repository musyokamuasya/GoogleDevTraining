

fun main() {
    /*
    * The main program where all the functions are called. This is the main entry into the code
    * */
    println("This program prints sum of 6 and 8")
    println(sum(6, 8))
}
/* Introduction to functions.
This is an example of basic function which takes in two numbers
The two numbers are of type int, and the function returns the sum of the two numbers which is an integer
*/
fun sum (firstNumber:Int, secondNumber:Int):Int {
    return firstNumber + secondNumber
}


fun main() {
    /*
    * The main program where all the functions are called. This is the main entry into the code
    * */
    println("This program prints sum of 6 and 8")
    println(myName("Musyoka", "Muasya"));
}
/*
* This is the second way of returning a function.
* Instead of creating a return block, you can handle the summation directly after the return time
* This is an example of expressive Kotlin programming
* */
fun myName (firstName: String, secondName:String):String {
    return "My name is $firstName $secondName"
}
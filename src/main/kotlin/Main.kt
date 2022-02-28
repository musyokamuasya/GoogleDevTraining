

fun main() {
    /*
    * The main program where all the functions are called. This is the main entry into the code
    * */
    println("This program prints sum of 6 and 8")
    println(myName("Hey", "Musyoka", "Muasya"));
}
/*
* A function takes in two strings, first name and second name
* */
fun myName (salutations: String = "Mr", firstName: String, secondName:String):String {
    return "My name is $salutations $firstName $secondName"
}
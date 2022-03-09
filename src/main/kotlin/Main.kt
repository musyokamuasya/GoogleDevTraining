
fun main() {
    val rectangle = Rectangle(5, 12.0)
    println("The area is ${rectangle.area}")
}

class Rectangle(var height: Int, var length: Double){
    var area = height * length
}

class Rectangle(var height: Int, var length: Double){
    var area = height * length
}
fun main() {
    val rectangle = Rectangle(5, 12.0)
    println("The area is ${rectangle.area}")

    val learners = listOf("Bakari", "Rukia", "Musyoka", "Mohamed", "Mwanamtiti")

    for(name in learners.indices) {
        println("Learner at index $name is ${learners[name]}")
    }
}




package OOP

class cars (owner:String , model:String, seats:String,colour:String ,price:Int) {

    init {
        println("The owner is $owner")
        println("Model of the car is $model")
        println("The car has $seats in number")
        println("The car is $colour")
        println("Cost is $price")


    }
}

fun main(args: Array<String>) {

    var cars_one = cars(owner = "Victor", model = "BMW", seats = "5", colour = "silver", price = 5000000 )



}
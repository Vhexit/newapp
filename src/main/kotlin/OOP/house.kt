package OOP

class house (owner:String, bedrooms:String, price:Int) {

    init {
        println("Owner is $owner")
        println("Number of bedrooms are $bedrooms")
        println("Asking price $price")
    }
}

fun main(args: Array<String>) {

    var house_one = house(owner = "Victor Chege", bedrooms = "2", price = 50000)
    var house_two = house(owner = "Peter Job", bedrooms = "4", price = 100000)
    var house_three = house(owner = "Chris Motiso", bedrooms = "3", price = 70000)






}
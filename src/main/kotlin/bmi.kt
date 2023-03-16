fun main(args: Array<String>) {

    print("Enter your details")

    println("Enter your weight")
    var weight:Int = readLine()!!.toInt()

    println("Enter your height")
    var height: Float = readLine()!!.toFloat()

    var bmi = weight / (height * height)

    if (bmi <=18){
        println("underweight")
    }
    else if (bmi <=29){
        println("normal weight")
    }
    else if (bmi <=34){
        println("overweight")
    }
    else{
        println("Obese")
    }



}
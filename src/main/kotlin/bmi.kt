fun main(args: Array<String>) {

    val weight = 75.0 // weight in kg
    val height = 180.0 // height in cm

    val heightinMeters = height / 100.0
    val bmi = weight / (heightinMeters * heightinMeters)

    println("BMI: %.2f kg/m^2".format(bmi))


}
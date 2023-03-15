fun main(args: Array<String>) {

    print("Enter Student Marks")

    var marks:Int = readLine()!!.toInt()

    if (marks >80){
        println("A")
        print("Congratulations")
    }
    else if(marks >70){
        println("A-")
        print("Almost there")
        }

    else if (marks >60){
        println("B")
        print("Trail")
    }
    else {
        println("E")
        print("fail")
    }










}
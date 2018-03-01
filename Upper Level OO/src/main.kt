fun main(args: Array<String>){

    val  sample1: Byte = 0x64
    var sample2: Byte = 100
    val heartRate = 85
    var deposits: Double = 135002766.0
    val acceleration = 9.800
    var mass = 14.6
    var distance: Double = 129.763001
    var lost = true
    var expensive = true
    var choice = 2

    //val integral: Char = '\u{222B}'
    //    Declare a constant that is a character type named integral that has a value of “\u{222B}”

    val greeting = "hello"
    var name = "karen"

    if(sample1 == sample2){
        println("The samples are equal.")
    }
    else{
        println("The samples are not equal.")
    }

    if( 80 >= heartRate >= 40){
        println("Heart rate is normal.")
    }
    else{
        println("Heart rate is not normal.")
    }

    if(deposits >=100000000){
        println("You are exceedingly wealthy.")
    }
    else{
        println("Sorry you are so poor.")
    }

    var  force = mass*acceleration
    println("force = $force")
    println("$distance is the distance")

    if(lost and expensive){
        println("I am really sorry! I will get the manager.")
    }
    else if(lost and !expensive){
        println("Here is coupon for 10% off.")
    }

//    Use the Kotlin “when” expression and the variable choice to display
// “You chose 1.” if choice is 1,
// “You chose 2.” if choice is 2,
// “You chose 3.” if choice is 3,
// and
// “You made an unknown choice. if choice is something other than 1, 2, or 3.

   //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! println("$integral is an integral")

    for (i in 5..10){println("i = $i")}
//
//    int age = 0
//    while(age<4){
//        println("age = "+age)
//        age++
//    }
//
//    println(greeting + ", myPawprint is " + myPawprint)

}

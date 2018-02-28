class Person(var firstName: String, private var lastName: String, private var age: Int)  {
    var companyName: String = firstName + " " this.lastName " and sons"
        get() = companyName
        set Value = firstName + " " lastName " and sons"
    fun happyBirthday() {
        this.age += 1
        println("Hello, my name is ${firstName} my last name is ${lastName} and I am $age years old")
    }

    fun printAgeString(){
        println("Hi my first name is ${firstName} my last name is ${lastName} and i'm ${age} years old")
    }

}

fun main(args : Array<String>) {
    var abe = Person("fred","evinston",42)
    abe.printAgeString()
    abe.happyBirthday()
println(abe.getLastName)
}
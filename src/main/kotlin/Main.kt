fun main() {
    personDetails("Lucy",23,"Kenya")
    personDetails("Julian",25,"Nigeria")

    println(addition(99,53,77,62))

    println(numsAverage(70,56,93,23,52))

    var fullname=   "June Wairuri"
    println(fullname)
    var age=22
    println(age)
    var phonenumber="0710955698"
    println(phonenumber)
    var email="junewairuri@gmail.com"
    println(email)
    var weight=50.3
    println("50.3 kgs")
    var citizen="Ugandan"
    println( "is ugandan citizen")

}
//1. Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)
fun personDetails(name:String,age:Int,nationality:String){
    println("Hello my name is $name,I am $age years old and I am from $nationality")
}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum=num1+num2+num3+num4
    return sum
}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun numsAverage(num1: Int,num2: Int,num3: Int,num4: Int,num5: Int):Int{
    var sum=num1+num2+num3+num4+num5

    return  sum/5

}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personsRecords(fullname:String,age: Int,phonenumber:String,email:String,weight:Double,citizen:String){

}
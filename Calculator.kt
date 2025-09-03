import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)

    println("==== Simple Calculator ====")
    print("Enter firts number: ")
    val num1 = reader.nextDouble()

    print("Enter an operator (+, -, *, /): ") 
    val operator = reader.next()

    print("Enter second number: ")
    val num2 = reader.nextDouble()


    val result = when (operator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Error: Division by zero"
        else -> "Error: Invalid operator"
    }

    println("Result; $result")
}

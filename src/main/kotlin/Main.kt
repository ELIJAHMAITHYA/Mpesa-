//import java.util.ArrayList
//
//data class User(
//    val name: String,
//    val number: String,
//    val pin: String,
//    var accountBalance: String
//)
//
//fun RegisterUser()  {
//
//    val Users = ArrayList<User>()
//    println("Enter Your name")
//    val UserName = readln()
//    println("Enter Your Number")
//    val UserNumber = readln()
//    println("Enter Your Pin")
//    val UserPin = readln()
//    println("Enter the account Balance")
//    val UserBalance = readln()
//
//    val userObject = User(UserName,UserNumber,UserPin,UserBalance)
//    Users.add(userObject)
//
//}
//
//fun userDeposit(userDeposit: User) {
//    val userInstance =
//    println("Enter amount To deposit")
//    val amountToDeposit = readln().toDouble()
//    println("Enter your Pin")
//    val UserPin = readln()
//    if (UserPin == userDeposit.pin) {
//        userDeposit.accountBalance += amountToDeposit
//        println("You have succesfully deposited ${amountToDeposit} ksh to your account. Your new balance is ${userDeposit.accountBalance}")
//    }
//}
//
//fun main(args: Array<String>) {
//    val userRegister = RegisterUser()
//    println(userRegister)
//    val deposit = userDeposit()
//
//
//}
import java.util.ArrayList

data class User(
    val name: String,
    val number: String,
    val pin: String,
    var accountBalance: Double // Changed the data type to Double for account balance
)

fun registerUser(): User { // Changed the function name to follow Kotlin naming conventions and made it return a User
    val users = ArrayList<User>()
    println("Enter Your name")
    val userName = readLine() ?: ""
    println("Enter Your Number")
    val userNumber = readLine() ?: ""
    println("Enter Your Pin")
    val userPin = readLine() ?: ""
    println("Enter the account Balance")
    val userBalance = readLine()?.toDoubleOrNull() ?: 0.0 // Changed to read and convert to Double

    val userObject = User(userName, userNumber, userPin, userBalance)
    users.add(userObject)
    return userObject
}

fun userDeposit(user: User) {
    println("Enter amount To deposit")
    val amountToDeposit = readLine()?.toDoubleOrNull() ?: 0.0 // Changed to read and convert to Double
    println("Enter your Pin")
    val userPin = readLine() ?: ""

    if (userPin == user.pin) {
        user.accountBalance += amountToDeposit
        println("You have successfully deposited $amountToDeposit ksh to your account. Your new balance is ${user.accountBalance} ksh")
    } else {
        println("Invalid PIN. Deposit failed.")
    }
}

fun main(args: Array<String>) {
    val registeredUser = registerUser()
    println(registeredUser)
    userDeposit(registeredUser)
}

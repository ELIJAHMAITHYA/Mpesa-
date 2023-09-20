data class User(
    val name: String,
    val number: String,
    val pin: String,
    val accountBalance: Double
)

fun RegisterUser() {
    println("Enter Your name")
    val UserName = readln()
    println("Enter Your Number")
    val UserNumber = readln()
    println("Enter Your Pin")
    val UserPin = readln()
    println("Enter the account Balance")
    val UserBalance = readln()
}

fun userDeposit(userDeposit: User, amountToDeposit: Double) {
    println("Enter amount To deposit")
    val amountToDeposit = readln()
    println("Enter your Pin")
    val UserPin = readln()
    if (UserPin == userDeposit.pin) {
        userDeposit.accountBalance += amountToDeposit
        println("You have succesfully deposited ${amountToDeposit} ksh to your account. Your new balance is ${userDeposit.accountBalance}")
    }
}


fun main(args: Array<String>) {
    val userRegister = RegisterUser()
    println(userRegister)

}

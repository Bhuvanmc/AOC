
fun welcome()="Welcome to Acceldata Observability Cloud"
val products = arrayOf("Pulse On-prem", "Torch-reliability", "Flow-pipelines", "Pulse on-cloud")

fun printProducts()
{
    products.forEach { item -> println(item) }
}
fun main(args: Array<String>) {
    println(welcome())
    println("branch AOC_103")
    printProducts()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
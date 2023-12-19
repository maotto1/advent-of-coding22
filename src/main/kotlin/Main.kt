import java.io.File
import java.nio.file.Paths

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val result = readInput("testData")

    println("$result")
}

fun readInput(fileName: String) : List<String> {
    val path = Paths.get("").toAbsolutePath().toString()
    val internalPath = "src/main/resources"
    return File("$path/$internalPath/$fileName").readLines()
}

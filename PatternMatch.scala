import scala.io.StdIn

object PatternMatch {
   def main(args: Array[String]): Unit = {
        val input = StdIn.readInt()

        input match{
            case _ if input <= 0 => println("Negative/Zero is input")
            case _ if input % 2 == 0 => println("Even number is given")
            case _ => println("Odd number is given")
        }
    }
}

object BankInterest {
  def calculateInterest: Double => Double = {
        case depositAmount if depositAmount <= 20000 => depositAmount * 0.02 
        case depositAmount if depositAmount <= 200000 => depositAmount * 0.04 
        case depositAmount if depositAmount <= 2000000 => depositAmount * 0.035 
        case depositAmount => depositAmount * 0.065 
    }
    def main(args:Array[String]):Unit={
        val depositAmount1 = 15000.0 
        val depositAmount2 = 50000.0 
        val depositAmount3 = 2500000.0 

        val interest1 = calculateInterest(depositAmount1)
        val interest2 = calculateInterest(depositAmount2)
        val interest3 = calculateInterest(depositAmount3)

        println(s"Interest for Rs. 15,000: Rs. $interest1")
        println(s"Interest for Rs. 50,000: Rs. $interest2")
        println(s"Interest for Rs. 2,500,000: Rs. $interest3")
    }
}

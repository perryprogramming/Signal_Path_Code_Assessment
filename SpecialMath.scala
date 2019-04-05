object SpecialMath extends App {
  println("Enter integer:")
  var n: Int = scala.io.StdIn.readInt()
  //var totmap = new Array[Int](n+1)
  var out = init(n)
  println("Output: " + out)
  //val acc: BigInt = 0
  //val arr = Array.iterate(1,n + 1)(n + specialMath((n - 1),acc) + specialMath((n - 2),acc))
  def init(n: Int): BigInt = {
    var totmap =  new collection.mutable.HashMap[Int, BigInt]()

    def specialMath(i: Int): BigInt = {
      totmap.getOrElseUpdate(
        i, i match {
          case 0 => 0
          case 1 => 1
          case _ => i + specialMath(i - 1) + specialMath(i - 2)
    //case _ => arr
        }
      )
    }
    specialMath(n)
  }
  //specialMath(n)
}

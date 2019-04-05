/*_************************************************************************************************************
* 
* This Scala script was converted from the following python script:
*
****************************************************
*
*        import sys
*        def specialMath(n):
*	   if(n==0):
*		return 0
*	   elif(n==1):
*		return 1
*	 return n + specialMath(n-1)	+ specialMath(n-2)
*        print specialMath(int(sys.argv[1]))
*
****************************************************
*
* @in: n: user is prompted for term in integer sequence: specialMath(n) = n + specialMath(n-1) + specialMath(n-2)
* @out: output: the sum of the integer sequence
*
***************************************************
*
* Results of Part 2: show output of integer 90:
*
* Enter integer:
* 90
* Output: 19740274219868223074
*
***************************************************
*
* Ruth Perry April 4, 2019 For Signal Path Coding Assessment
*
************************************************************************************************************_*/
object SpecialMath extends App {
  println("Enter integer:")
  var n: Int = scala.io.StdIn.readInt()
  var out = init(n)
  println("Output: " + out)
  
  def init(n: Int): BigInt = {

    //store sequence in hash map to prevent stack overflow with integers >40
    var totmap =  new collection.mutable.HashMap[Int, BigInt]()

    def specialMath(i: Int): BigInt = {

      // pull from hash map or update
      totmap.getOrElseUpdate(
        i, i match {
          case 0 => 0
          case 1 => 1
          case _ => i + specialMath(i - 1) + specialMath(i - 2)
       })}
    specialMath(n)
  }
}

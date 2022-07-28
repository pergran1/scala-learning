package lectures

object default_args extends App{

  // default value for acc
  def trFact(n: Int, acc: Int = 1): Int =
    if(n<=1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10,2)

  def savePicture(format: String = "jpeg", width: Int, height: Int): Unit = println("saving picture")

  savePicture( width = 800,height =  600)
  savePicture( height =  600, width = 800)  // can change order when naming parameters
}

// Scala program to illustrate
// the concept of abstract class

// Abstract class with the final method
abstract class myauthor2
{
  final def mymethod()
  {
    println("Final method")
  }
}

// GFG class extends abstract class
class GFG3 extends myauthor2{}

object AbstractExample4
{

  // Main method
  def main(args: Array[String])
  {

    // objects of GFG class
    var obj = new GFG3()
    obj.mymethod()
  }
}
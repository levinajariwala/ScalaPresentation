// Abstract class
abstract class myauthor
{

  // abstract method
  def details()
}

// GFG class extends abstract class
class GFG extends myauthor
{
  def details()
  {
    println("Author name: Test")
    println("Topic name: Abstract class in Scala")
  }
}

object AbstractExample1
{
  // Main method
  def main(args: Array[String])
  {
    // objects of GFG class
    var obj = new GFG()
    obj.details()
  }
}
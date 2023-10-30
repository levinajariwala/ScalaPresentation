// Scala program to illustrate
// the concept of abstract class

// Abstract class with constructor
// And the constructor contain two arguments
abstract class myauthor1(name: String,
                        topic: String)
{
  def details()
}

// GFG class extends abstract class
class GFG2(name: String, topic: String) extends
  myauthor1(name, topic)
{
  def details()
  {
    println("Author name: " + name)
    println("Topic name: " + topic)
  }
}

object AbstractExample3
{

  // Main method
  def main(args: Array[String])
  {

    // objects of GFG class
    var obj = new GFG2("Test", "Abstract class")
    obj.details()
  }
}
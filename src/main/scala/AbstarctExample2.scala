// Abstract class with fields
abstract class Geek
{
  var name : String = "test name"
  var tutorial: String = "Scala"
  def portal()
}

// GFG class extends abstract class
class GFG1 extends Geek
{

  // Abstract class method accessing
  // fields of the abstract class
  def portal()
  {
    println("Portal name: " + name)

  }

  // GFG class method accessing
  // fields of the abstract class
  def tutdetails()
  {
    println("Tutorial name: " + tutorial)
  }
}

object AbstarctExample2
{

  // Main method
  def main(args: Array[String])
  {

    // objects of GFG class
    var obj = new GFG1()
    obj.portal()
    obj.tutdetails()
  }
}
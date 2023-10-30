// A Scala program to illustrate
// the concept of the Companion object

// Companion class
class ExampleofCompanion
{

  // Variables of Companion class
  var str1 = "Hello";
  var str2 = "Tutorial of Companion object";

  // Method of Companion class
  def show()
  {
    println(str1);
    println(str2);
  }
}

// Companion object
object ExampleofCompanion
{
  def main(args: Array[String])
  {
    var obj = new ExampleofCompanion();
    obj.show();
  }
}
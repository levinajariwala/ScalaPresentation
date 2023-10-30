trait MyTrait1
{
  // Abstract method
  def greeting
}

//Trait 2
trait MyTrait2
{
  // Non-abstract method
  def tutorial
  {
    println("This is a tutorial" +
      "of Traits in Scala")
  }
}

// MyClass inherits multiple traits
class MyClass1 extends MyTrait1 with MyTrait2
{
  // Implementation of abstract method
  def greeting()
  {
    println("Welcome to Scala tutorial")
  }
}

object TraitExample3
{
  // Main method
  def main(args: Array[String])
  {
    val obj = new MyClass1();
    obj.greeting
    obj.tutorial
  }
}
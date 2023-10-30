
trait Printable {
  def print(): Unit = {
    println("Printing...")
  }
}

class MyClass extends Printable {
  override def print(): Unit = {
    println("MyClass printing...")
  }
}

object TraitExample1 {
  def main(args: Array[String]): Unit = {
    val myClass = new MyClass()
    myClass.print()  // Output: "MyClass printing..."
  }
}
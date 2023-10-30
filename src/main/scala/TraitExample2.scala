// Trait
trait MyTrait
{
  def pet
  def pet_color
}

// ClassEx inherits trait
class ClassEx extends MyTrait
{
  // Implementation of methods of MyTrait
  def pet()
  {
    println("Pet: Dog")
  }
  def pet_color()
  {
    println("Pet_color: White")
  }
  // Class method
  def pet_name()
  {
    println("Pet_name: Dollar")
  }
}

object TraitExample2
{
  // Main method
  def main(args: Array[String])
  {
    val obj = new ClassEx();
    obj.pet();
    obj.pet_color();
    obj.pet_name();
  }
}
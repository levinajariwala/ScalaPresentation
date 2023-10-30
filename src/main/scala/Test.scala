// Scala program to illustrate the implementation of inheritance
import scala.collection.mutable.ArrayBuffer

object Test  // Driver code
{
  def main(args: Array[String])
  {
    val dog = new Dog("Harry")
    val cat = new Cat("Sally")
    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)

    val d = new IrishSetter("Big Red")
    println(d.numLegs)
    println(d.tailColor)
    d.walk
    d.wagTail
    d.stopTail
    d.stop

  }
}
trait Pet {
  val name: String
}
class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

trait HasLegs {
  def numLegs: Int
  def walk: Unit
  def stop = println("Stopped walking")
}
trait HasTail {
  def tailColor: String
  def wagTail = println("Tail is wagging")
  def stopTail = println("Tail is stopped")
}

class IrishSetter(name: String) extends HasLegs with HasTail {
  val numLegs = 4
  val tailColor = "Red"
  def walk() = println("I’m walking")
  override def toString = s"$name is a Dog"
}
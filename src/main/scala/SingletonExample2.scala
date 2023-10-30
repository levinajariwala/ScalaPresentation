// A Scala program to illustrate
// how to call method inside singleton object

// Singleton object with named
// as Exampleofsingleton
object Exampleofsingleton
{

  // Variables of singleton object
  var str1 = "Welcome ! GeeksforGeeks";
  var str2 = "This is Scala language tutorial";

  // Method of singleton object
  def display()
  {
    println(str1);
    println(str2);
  }
}

// Singleton object with named as Main
object SingletonExample2
{
  def main(args: Array[String])
  {

    // Calling method of singleton object
    Exampleofsingleton.display();
  }
}
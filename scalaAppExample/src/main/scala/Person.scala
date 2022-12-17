class Person(val name: String, val age: Int) {
  def greet(): String = "Hi, my name is "+this.name
  def greet(yourName: String): String = s"Hi $yourName, my name is $name"
}

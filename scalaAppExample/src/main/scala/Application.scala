object Application extends App {
  var person = new Person("Miguel",37)
  println(person.greet())
  println(person.greet("Vito"))
  println("La persona se llama "+person.name+" y tiene "+person.age+" años.")
}

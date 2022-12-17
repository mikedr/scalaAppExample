object Application extends App {
  var person = new Person("Miguel",37)
  println(person.greet())
  println("La persona se llama "+person.name+" y tiene "+person.age+" años.")
}

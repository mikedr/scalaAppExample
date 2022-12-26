object Application extends App {
  def aWriter = new Writer("Mario","Puzo",1920)
  println("Nombre del escritor: "+aWriter.fullName())

  def aNovel = new Novel("The Godfather", 1969, aWriter)
  println("Tiempo de autor: "+aNovel.authorAge()+" años")

  def otherWriter = new Writer("Jorge","Borges", 1899)
  println(aNovel.name+" está escrita por: "+otherWriter.fullName()+"?: "+aNovel.isWrittenBy(otherWriter))

  def unaCopia = aNovel.copy(aNovel,1980)
  println("La copia se publicó en: "+unaCopia.yearRelease)
}

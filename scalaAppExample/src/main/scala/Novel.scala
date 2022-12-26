class Novel(val name: String, val yearRelease: Int, val author: Writer) {
  def authorAge(): Int = yearRelease - author.yearBirth

  def isWrittenBy(otherAuthor: Writer): Boolean = {
    otherAuthor.firstName.equals(author.firstName) && otherAuthor.surname.equals(author.surname)
  }

  def copy(novel: Novel, newReleaseYear: Int): Novel = {
    var newNovel = new Novel(novel.name, newReleaseYear, novel.author)
    return newNovel
  }
}

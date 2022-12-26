class Writer(val firstName: String, val surname: String, val yearBirth: Int) {
  def fullName(): String = s"$firstName $surname"
}

class Counter(val counter: Int) {
  def getCount(): Int = return counter
  def incCount(): Counter = new Counter(counter+1)
  def incCount(amount: Int): Counter = new Counter(counter + amount)
  def decCount():Counter = new Counter(counter-1)
  def decCount(amount: Int): Counter = new Counter(counter - amount)
}

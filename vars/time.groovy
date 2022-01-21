import groovy.time.*

def duratio() {
  def timeStart = new Date()
  // Some code you want to time
  def timeStop = new Date()
  //TimeDuration duration = TimeCategory.minus(timeStop, timeStart)

  return TimeCategory.minus(timeStop, timeStart)
}

// 1. Write a function that takes a number and returns Even or Odd
def evenOrOdd(x: Int): String = {
  if x % 2 == 0 then "Even" else "Odd"
}
// 2. Write a match expression that takes the name of the day of the week and returns Workday orWeekend
def dayType(day: String): String = day match
case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Workday"
case "Saturday" | "Sunday" => "Weekend"
case _ => "Invalid day"
// 3. Make a simple for -cycle that prints numbers from 10 to 1
def print100Times(): Unit = for i <- 1 to 10 do println(i)
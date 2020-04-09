package subtask2


class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
  //      throw NotImplementedError("Not implemented")
        var result: String = ""
        when(minute.toInt()){
            0 -> result = numWrite(hour) + " o' clock"
            15 -> result = "quarter past " + numWrite(hour)
            in 1..29 -> result = numWrite(minute) + " minutes past " + numWrite(hour)
            30 -> result = "half past " + numWrite(hour)
            45 -> {
                val hour2 = hour.toInt()+1
                result = "quarter to " + numWrite(hour2.toString())
            }
            in 31..59 -> {
                val hour2 = hour.toInt()+1
                val minute2 = 60 - minute.toInt()
                result = numWrite(minute2.toString()) + " minutes to " + numWrite(hour2.toString())
            }

        }

        return result
    }

    fun numWrite (num: String): String{
        var str: String = ""
        val numbers = arrayOf("one", "two", "three", "four", "five",
                                            "six", "seven", "eight", "nine", "ten",
                                            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                                            "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                                            "twenty one", "twenty two", "twenty three", "twenty four",
                                            "twenty five", "twenty six", "twenty seven", "twenty eight",
                                            "twenty nine")
        str = numbers[num.toInt()-1]
        return  str
    }
}

package subtask2


class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
  //      throw NotImplementedError("Not implemented")
        return when(minute.toInt()){
            0 -> numWrite(hour) + " o' clock"
            15 -> "quarter past " + numWrite(hour)
            in 1..29 -> numWrite(minute) + " minutes past " + numWrite(hour)
            30 -> "half past " + numWrite(hour)
            45 -> "quarter to " + numWrite((hour.toInt()+1).toString())
            in 31..59 -> numWrite((60-minute.toInt()).toString()) + " minutes to " + numWrite((hour.toInt()+1).toString())
            else -> ""
        }

    }

    fun numWrite (num: String): String{
        val numbers = arrayOf("one", "two", "three", "four", "five",
                                            "six", "seven", "eight", "nine", "ten",
                                            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                                            "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                                            "twenty one", "twenty two", "twenty three", "twenty four",
                                            "twenty five", "twenty six", "twenty seven", "twenty eight",
                                            "twenty nine")
        return numbers[num.toInt()-1]
    }
}

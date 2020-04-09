package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //    throw NotImplementedError("Not implemented")

        var d = day.toInt()
        val m = month.toInt()
        var y = year.toInt()
        var result: String = "Такого дня не существует"

        try {
            val date = LocalDate.of(y, m, d)
            result = date.format(DateTimeFormatter.ofPattern("d MMMM, EEEE"))
        } finally {
            return result
        }

    }

}

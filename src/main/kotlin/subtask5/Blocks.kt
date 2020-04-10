package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
     //   throw NotImplementedError("Not implemented")
        val array = blockA.toMutableList().filter { it!!::class == blockB }
        return when (blockB) {
            String::class -> array.joinToString("")
            Int::class -> array.sumBy { it.toString().toInt() }
            LocalDate::class -> array.stream().map{ it as LocalDate }.max(LocalDate::compareTo).get().format(
                DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            else -> ""
        }
    }
}

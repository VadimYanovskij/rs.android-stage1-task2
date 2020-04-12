package subtask4

import java.lang.StringBuilder

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
     //   throw NotImplementedError("Not implemented")
        val vowels = "eyuioa"
        val consonants = "bcdfghjklmnpqrstvwxz"
        var listString = inputString.trim().split(" ").filter { it != "\n" }.filter { it != "" }.toMutableList()
        if (listString.size==0) return ""

        var count = ""

        if (inputString.toLowerCase().replace(Regex("[^a-z]"), "").toSet().size == 26) {
            listString.forEachIndexed { i, word ->
                count = listString[i]
                    .replace(Regex("[^aeioyu]"), "")
                    .length.toString()
                listString[i] = count + listString[i] }
            vowels.forEach { vowel -> listString = listString.map { element ->
                element.replace(vowel, vowel.toUpperCase()) } as MutableList<String>
                    }

            listString.sortBy { it[0] }
            return  listString.joinToString(" ")

        } else {
            listString.forEachIndexed { i, word ->
                count = listString[i]
                    .replace(Regex("[^bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXYZ]"), "")
                    .length.toString()
                listString[i] = count + listString[i]
            }

            consonants.forEach { consonant -> listString = listString.map { element ->
                element.replace(consonant, consonant.toUpperCase()) } as MutableList<String>
                    }

            listString.sortBy { it[0] }
            return  listString.joinToString(" ")
        }
    }
}

package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
    //    throw NotImplementedError("Not implemented")
        var rez=""
        var result = "NO"
        for (itemA in a)
            for (itemB in b) {
                if (itemA==itemB || itemA==itemB+32 ) rez += itemA
            }
        if (b.indices==rez.indices)
            for (i in b.indices)
                if (b[i]==rez[i] || b[i]+32==rez[i]) result = "YES"
    return result
    }
}

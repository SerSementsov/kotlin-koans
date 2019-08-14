class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator() = DateIterator(this)
}

class DateIterator(val range: DateRange) : Iterator<MyDate> {
    var current = range.start

    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }

    override fun hasNext() = current <= range.end
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

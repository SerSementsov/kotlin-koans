class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(date: MyDate) : Boolean {
        return date in start..endInclusive
    }

    override fun toString(): String {
        return "[${start.year}/${start.month}/${start.dayOfMonth}] - " +
                "[${endInclusive.year}/${endInclusive.month}/${endInclusive.dayOfMonth}]"
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}

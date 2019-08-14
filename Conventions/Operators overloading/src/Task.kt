import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) {
}

enum class TimeInterval {
    DAY, WEEK, YEAR;
}

operator fun TimeInterval.times(n: Int) : RepeatedTimeInterval = RepeatedTimeInterval(this, n)

class RepeatedTimeInterval(val interval: TimeInterval, val number: Int)

operator fun MyDate.plus(interval: TimeInterval): MyDate = addTimeIntervals(interval, 1)
operator fun MyDate.plus(interval: RepeatedTimeInterval): MyDate = addTimeIntervals(interval.interval, interval.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

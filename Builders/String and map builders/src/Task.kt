import java.util.*

fun <K,V> buildMap(build: HashMap<K, V>.() -> Unit): HashMap<K, V> {
    val map = HashMap<K, V>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

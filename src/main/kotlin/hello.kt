import harfbuzz.*
import kotlinx.cinterop.toKString

fun main(args: Array<String>) {
    println("Hello, HarfBuzz!")
    println(hb_version_string()?.toKString())
}

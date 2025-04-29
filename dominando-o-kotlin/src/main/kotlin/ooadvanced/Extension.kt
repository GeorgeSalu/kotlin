package ooadvanced

fun String.hide(): String {
    return "".padEnd( length , '*')
}
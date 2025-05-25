package br.com.secao7

data class Coordinates(var x: Int,var y: Int) {

    operator fun plus(other: Coordinates): Coordinates {
        return Coordinates(x + other.x, y + other.y)
    }

}

package exceptions

class InvalidValueException(val value: Double) : RuntimeException() {

    override val message = "Value $value is not valid"

}
package exceptions

class InsufficientFundsException(val currentBalance: Double): RuntimeException() {
}
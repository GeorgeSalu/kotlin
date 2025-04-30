package br.com.rest.exceptions

import java.lang.RuntimeException

class UnsuportedMathOperationException(exception: String?): RuntimeException(exception) {


}
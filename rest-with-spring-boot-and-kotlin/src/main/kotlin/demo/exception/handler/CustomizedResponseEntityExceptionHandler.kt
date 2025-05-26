package demo.exception.handler

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.RestController


@ControllerAdvice
@RestController
class CustomizedResponseEntityExceptionHandler : ResponseEntityExceptionHandler() {
    @org.springframework.web.bind.annotation.ExceptionHandler(java.lang.Exception::class)
    fun handleAllExceptions(ex: java.lang.Exception, request: WebRequest): ResponseEntity<ExceptionResponse?> {
        val exceptionResponse: ExceptionResponse =
            ExceptionResponse(
                java.util.Date(),
                ex.message,
                request.getDescription(false)
            )
        return ResponseEntity<ExceptionResponse?>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR)
    }


    @org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFoundException::class)
    fun handleBadRequestExceptions(ex: java.lang.Exception, request: WebRequest): ResponseEntity<ExceptionResponse?> {
        val exceptionResponse: ExceptionResponse =
            ExceptionResponse(
                java.util.Date(),
                ex.message,
                request.getDescription(false)
            )
        return ResponseEntity<ExceptionResponse?>(exceptionResponse, HttpStatus.NOT_FOUND)
    }
}

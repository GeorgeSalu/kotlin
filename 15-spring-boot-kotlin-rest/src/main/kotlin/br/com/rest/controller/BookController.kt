package br.com.rest.controller

import br.com.rest.data.vo.v1.BookVO
import br.com.rest.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/book/v1")
class BookController {

    @Autowired
    private lateinit var service: BookService

    @GetMapping
    fun findAll(): List<BookVO> {
        return service.findAll()
    }

}
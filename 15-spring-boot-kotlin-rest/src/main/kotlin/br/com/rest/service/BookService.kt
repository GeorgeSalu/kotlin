package br.com.rest.service

import br.com.rest.controller.BookController
import br.com.rest.data.vo.v1.BookVO
import br.com.rest.mapper.DozerMapper
import br.com.rest.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo

import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class BookService {

    @Autowired
    private lateinit var repository: BookRepository

    private val logger = Logger.getLogger(BookService::class.java.name)

    fun findAll(): List<BookVO> {
        logger.info("finding all books")
        val books = repository.findAll()
        val vos = DozerMapper.parseListObjects(books, BookVO::class.java)
        for (book in vos) {
            val withSelfRel = linkTo(BookController::class.java).slash(book.key).withSelfRel()
            book.add(withSelfRel)
        }
        return  vos
    }

}
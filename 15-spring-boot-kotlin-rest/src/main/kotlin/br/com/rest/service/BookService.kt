package br.com.rest.service

import br.com.rest.controller.BookController
import br.com.rest.data.vo.v1.BookVO
import br.com.rest.exceptions.RequiredObjectIsNullException
import br.com.rest.exceptions.ResourceNotFoundException
import br.com.rest.mapper.DozerMapper
import br.com.rest.model.Book
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

    fun findById(id: Long): BookVO {
        logger.info("finding one book with id $id")
        var book = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("no records fnound for this id") }
        val bookVO: BookVO = DozerMapper.parseObject(book, BookVO::class.java)
        val withSelfRel = linkTo(BookController::class.java).slash(bookVO.key).withSelfRel()
        bookVO.add(withSelfRel)
        return bookVO
    }

    fun create(book: BookVO?) : BookVO{
        if (book == null) throw RequiredObjectIsNullException()
        logger.info("Creating one book with title ${book.title}!")
        var entity: Book = DozerMapper.parseObject(book, Book::class.java)
        val bookVO: BookVO = DozerMapper.parseObject(repository.save(entity), BookVO::class.java)
        val withSelfRel = linkTo(BookController::class.java).slash(bookVO.key).withSelfRel()
        bookVO.add(withSelfRel)
        return bookVO
    }

}
package br.com.rest.mockito.service

import br.com.rest.repository.BookRepository
import br.com.rest.service.BookService
import br.com.rest.unitests.mapper.mocks.MockBook
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


import org.mockito.Mockito.`when`
import java.util.*
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock


import org.mockito.MockitoAnnotations
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class BookServiceTest {

    private lateinit var inputObject: MockBook

    @InjectMocks
    private lateinit var service: BookService

    @Mock
    private lateinit var repository: BookRepository

    @BeforeEach
    fun setUpMock() {
        inputObject = MockBook()
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun findAll() {
        val list = inputObject.mockEntityList()
        `when`(repository.findAll()).thenReturn(list)

        val books = service.findAll()

        assertNotNull(books)
        assertEquals(14, books.size)

        val bookOne = books[1]

        assertNotNull(bookOne)
        assertNotNull(bookOne.key)
        assertNotNull(bookOne.links)
        assertTrue(bookOne.links.toString().contains("</api/book/v1/1>;rel=\"self\""))
        assertEquals("Some Title1", bookOne.title)
        assertEquals("Some Author1", bookOne.author)
        assertEquals(25.0, bookOne.price)

        val bookFour = books[4]

        assertNotNull(bookFour)
        assertNotNull(bookFour.key)
        assertNotNull(bookFour.links)
        assertTrue(bookFour.links.toString().contains("</api/book/v1/4>;rel=\"self\""))
        assertEquals("Some Title4", bookFour.title)
        assertEquals("Some Author4", bookFour.author)
        assertEquals(25.0, bookFour.price)

        val bookSeven = books[7]

        assertNotNull(bookSeven)
        assertNotNull(bookSeven.key)
        assertNotNull(bookSeven.links)
        assertTrue(bookSeven.links.toString().contains("</api/book/v1/7>;rel=\"self\""))
        assertEquals("Some Title7", bookSeven.title)
        assertEquals("Some Author7", bookSeven.author)
        assertEquals(25.0, bookSeven.price)
    }

}
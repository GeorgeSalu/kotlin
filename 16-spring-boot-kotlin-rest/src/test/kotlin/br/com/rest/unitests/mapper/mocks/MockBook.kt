package br.com.rest.unitests.mapper.mocks

import br.com.rest.data.vo.v1.BookVO
import br.com.rest.model.Book

class MockBook {

    fun mockEntityList(): ArrayList<Book> {
        val books: ArrayList<Book> = ArrayList<Book>()
        for (i in 0..13) {
            books.add(mockEntity(i))
        }
        return books
    }

    fun mockVOList(): ArrayList<BookVO> {
        val books: ArrayList<BookVO> = ArrayList()
        for (i in 0..13) {
            books.add(mockVO(i))
        }
        return books
    }

    fun mockEntity(number: Int) = Book(
        id = number.toLong(),
        author = "Some Author$number",
        price = 25.0,
        title = "Some Title$number"
    )

    fun mockVO(number: Int) = BookVO(
        key = number.toLong(),
        author = "Some Author$number",
        price = 25.0,
        title = "Some Title$number"
    )
}
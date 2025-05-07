package br.com.rest.mockito.service

import br.com.rest.repository.PersonRepository
import br.com.rest.service.PersonService
import br.com.rest.unitests.mapper.mocks.MockPerson

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock

import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.jupiter.MockitoExtension
import java.util.Optional

@ExtendWith(MockitoExtension::class)
class PersonServiceTest {

    private lateinit var inputObject: MockPerson

    @InjectMocks
    private lateinit var service: PersonService

    @Mock
    private lateinit var repository: PersonRepository

    @BeforeEach
    fun setUpMock() {
        inputObject = MockPerson()
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun findAll() {
    }

    @Test
    fun findById() {
        val person = inputObject.mockEntity(1)
        person.id = 1L
        `when`(repository.findById(1)).thenReturn(Optional.of(person))

        val result = service.findById(1)

        assertNotNull(result)
        assertNotNull(result.key)
        assertNotNull(result.links)
        assertTrue(result.links.toString().contains("/api/person/v1/1"))
    }

    @Test
    fun create() {
    }

    @Test
    fun update() {
    }

    @Test
    fun delete() {
    }

}
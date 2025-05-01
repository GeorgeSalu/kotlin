package br.com.rest.service

import br.com.rest.exceptions.ResourceNotFoundException
import br.com.rest.model.Person
import br.com.rest.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    @Autowired
    private lateinit var repository: PersonRepository

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findAll(): List<Person> {
        logger.info("finding all person")

        return repository.findAll()
    }

    fun findById(id: Long): Person {
        logger.info("finding one person")

        return repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})
    }

    fun create(person: Person) : Person {
        logger.info("create one person")
        return repository.save(person)
    }

    fun update(person: Person) : Person {
        logger.info("update one person")
        var entity = repository.findById(person.id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        entity.gender = person.gender
        return repository.save(entity)
    }

    fun delete(id: Long) {
        var person = repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})

        repository.delete(person)
    }


}
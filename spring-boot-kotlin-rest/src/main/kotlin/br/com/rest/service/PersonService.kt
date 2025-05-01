package br.com.rest.service

import br.com.rest.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    val counter: AtomicLong = AtomicLong()

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findAll(): List<Person> {
        logger.info("finding all person")

        val persons: MutableList<Person> = ArrayList()

        for(i in 0..7) {
            val person = mockPerson(i)
            persons.add(person)
        }

        return persons
    }

    fun findById(id: Long): Person {
        logger.info("finding one person")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Leandro"
        person.lastName = "costa"
        person.address = "minas gerais"
        person.gender = "male"
        return person
    }

    fun create(person: Person) : Person {
        return person
    }

    fun update(person: Person) : Person {
        return person
    }

    fun delete(id: Long) {

    }

    private fun mockPerson(i: Int): Person {
        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Leandro $i"
        person.lastName = "costa"
        person.address = "minas gerais"
        person.gender = "male"
        return person
    }

}
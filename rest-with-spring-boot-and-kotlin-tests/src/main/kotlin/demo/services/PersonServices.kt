package demo.services

import demo.exception.ResourceNotFoundException
import demo.model.Person
import demo.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class PersonServices {

    @Autowired
    private lateinit var repository: PersonRepository

    fun create(person: Person): Person = repository.save(person)

    fun findAll(): List<Person> {
        return repository.findAll()
    }

    fun findById(id: Long): Person {
        return repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("No records found for this ID") })
    }

    fun update(person: Person): Person {
        val entity: Person = repository.findById(person.id!!)
            .orElseThrow({ ResourceNotFoundException("No records found for this ID") })

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        entity.gender = person.gender

        return repository.save(entity)
    }

    fun delete(id: Long) {
        val entity: Person = repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("No records found for this ID") })
        repository.delete(entity)
    }
}
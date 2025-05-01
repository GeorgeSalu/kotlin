package br.com.rest.service

import br.com.rest.data.vo.v1.PersonVO
import br.com.rest.exceptions.ResourceNotFoundException
import br.com.rest.mapper.DozerMapper
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

    fun findAll(): List<PersonVO> {
        logger.info("finding all person")
        val persons = repository.findAll()
        return DozerMapper.parseListObjects(persons, PersonVO::class.java)
    }

    fun findById(id: Long): PersonVO {
        logger.info("finding one person")

        var person = repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})
        return DozerMapper.parseObject(person, PersonVO::class.java)
    }

    fun create(person: PersonVO) : PersonVO {
        logger.info("create one person")
        var entity: Person  = DozerMapper.parseObject(person, Person::class.java)
        return DozerMapper.parseObject(repository.save(entity), PersonVO::class.java)
    }

    fun update(person: PersonVO) : PersonVO {
        logger.info("update one person")
        var entity = repository.findById(person.id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        entity.gender = person.gender
        return DozerMapper.parseObject(repository.save(entity), PersonVO::class.java)
    }

    fun delete(id: Long) {
        var entity = repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})

        repository.delete(entity)
    }


}
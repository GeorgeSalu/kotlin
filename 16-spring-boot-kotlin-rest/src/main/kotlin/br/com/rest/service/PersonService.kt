package br.com.rest.service

import br.com.rest.controller.PersonController
import br.com.rest.data.vo.v1.PersonVO
import br.com.rest.exceptions.RequiredObjectIsNullException
import br.com.rest.data.vo.v2.PersonVO as PersonVOV2
import br.com.rest.exceptions.ResourceNotFoundException
import br.com.rest.mapper.DozerMapper
import br.com.rest.mapper.custom.PersonMapper
import br.com.rest.model.Person
import br.com.rest.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class PersonService {

    @Autowired
    private lateinit var repository: PersonRepository

    @Autowired
    private lateinit var mapper: PersonMapper

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findAll(): List<PersonVO> {
        logger.info("finding all person")
        val persons = repository.findAll()
        val vos =  DozerMapper.parseListObjects(persons, PersonVO::class.java)
        for (person in vos) {
            val withSelfRel = linkTo( PersonController::class.java).slash(person.key).withSelfRel()
            person.add(withSelfRel)
        }
        return vos
    }

    fun findById(id: Long): PersonVO {
        logger.info("finding one person with id $id")

        var person = repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})
        val personVO: PersonVO = DozerMapper.parseObject(person, PersonVO::class.java)
        val withSelfRel = linkTo( PersonController::class.java).slash(personVO.key).withSelfRel()
        personVO.add(withSelfRel)
        return personVO
    }

    fun create(person: PersonVO?) : PersonVO {
        if (person == null) throw RequiredObjectIsNullException()
        logger.info("create one person")
        var entity: Person  = DozerMapper.parseObject(person, Person::class.java)
        val personVO: PersonVO = DozerMapper.parseObject(repository.save(entity), PersonVO::class.java)
        val withSelfRel = linkTo( PersonController::class.java).slash(personVO.key).withSelfRel()
        personVO.add(withSelfRel)
        return personVO
    }

    fun update(person: PersonVO?) : PersonVO {
        if (person == null) throw RequiredObjectIsNullException()
        logger.info("update one person")
        var entity = repository.findById(person.key)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        entity.gender = person.gender
        val personVO: PersonVO = DozerMapper.parseObject(repository.save(entity), PersonVO::class.java)
        val withSelfRel = linkTo( PersonController::class.java).slash(personVO.key).withSelfRel()
        personVO.add(withSelfRel)
        return personVO
    }

    fun delete(id: Long) {
        var entity = repository.findById(id)
            .orElseThrow({ ResourceNotFoundException("no records found for this id")})

        repository.delete(entity)
    }


}
package br.com.rest.controller

import br.com.rest.data.vo.v1.PersonVO
import br.com.rest.data.vo.v2.PersonVO as PersonVOV2
import br.com.rest.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/person/v1")
class PersonController {

    @Autowired
    private lateinit var service: PersonService

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    fun findAll() : List<PersonVO> {
        return service.findAll()
    }

    @GetMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    fun findById(@PathVariable(value = "id") id: Long) : PersonVO {
        return service.findById(id)
    }

    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    fun create(@RequestBody person: PersonVO) : PersonVO {
        return service.create(person)
    }

    @PostMapping(value = ["/v2"],produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    fun createV2(@RequestBody person: PersonVOV2) : PersonVOV2 {
        return service.createV2(person)
    }

    @PutMapping(produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    fun update(@RequestBody person: PersonVO) : PersonVO {
        return service.update(person)
    }

    @DeleteMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    fun delete(@PathVariable(value = "id") id: Long) : ResponseEntity<*> {
        service.delete(id)
        return ResponseEntity.noContent().build<Any>()
    }

}
package demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController {
    @Autowired
    private val service: PersonServices? = null

    @GetMapping
    fun findAll(): MutableList<Person?> {
        return service.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long?): Person {
        return service.findById(id)
    }

    @PostMapping
    fun create(@RequestBody person: Person?): Person {
        return service.create(person)
    }

    @PutMapping
    fun update(@RequestBody person: Person?): Person {
        return service.update(person)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long?): ResponseEntity<*> {
        service.delete(id)
        return ResponseEntity.ok().build<Any?>()
    }
}
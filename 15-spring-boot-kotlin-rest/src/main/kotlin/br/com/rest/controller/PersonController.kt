package br.com.rest.controller

import br.com.rest.data.vo.v1.PersonVO
import br.com.rest.service.PersonService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@CrossOrigin
@RestController
@RequestMapping("/api/person/v1")
@Tag(name = "People", description = "Endpoints for managing people")
class PersonController {

    @Autowired
    private lateinit var service: PersonService

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    @Operation(summary = "finds all people", description = "finds all people",
        tags = ["people"],
        responses = [
            ApiResponse(
                description = "Success",
                responseCode = "200",
                content = [
                    Content(array = ArraySchema(schema = Schema(implementation = PersonVO::class)))
                ]
            ),
            ApiResponse(description = "No Content", responseCode = "204", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Bad Request", responseCode = "400", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Unauthorized", responseCode = "401", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Not Found", responseCode = "404", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Internal Server Error", responseCode = "500", content = [
                Content(schema = Schema(implementation = Unit::class))
            ])
        ]
    )
    fun findAll() : List<PersonVO> {
        return service.findAll()
    }

    @CrossOrigin(origins = ["http://localhost:8080"])
    @GetMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    @Operation(summary = "finds a people", description = "finds a people",
        tags = ["people"],
        responses = [
            ApiResponse(
                description = "Success",
                responseCode = "200",
                content = [
                    Content(schema = Schema(implementation = PersonVO::class))
                ]
            ),
            ApiResponse(description = "No Content", responseCode = "204", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Bad Request", responseCode = "400", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Unauthorized", responseCode = "401", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Not Found", responseCode = "404", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Internal Server Error", responseCode = "500", content = [
                Content(schema = Schema(implementation = Unit::class))
            ])
        ]
    )
    fun findById(@PathVariable(value = "id") id: Long) : PersonVO {
        return service.findById(id)
    }

    @CrossOrigin(origins = ["http://localhost:8080"])
    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    @Operation(summary = "adds a new person", description = "adds a new person",
        tags = ["people"],
        responses = [
            ApiResponse(
                description = "Success",
                responseCode = "200",
                content = [
                    Content(schema = Schema(implementation = PersonVO::class))
                ]
            ),
            ApiResponse(description = "Bad Request", responseCode = "400", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Unauthorized", responseCode = "401", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Internal Server Error", responseCode = "500", content = [
                Content(schema = Schema(implementation = Unit::class))
            ])
        ]
    )
    fun create(@RequestBody person: PersonVO) : PersonVO {
        return service.create(person)
    }

    @PutMapping(produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    @Operation(summary = "updates a person information", description = "updates a person information",
        tags = ["people"],
        responses = [
            ApiResponse(
                description = "Success",
                responseCode = "200",
                content = [
                    Content(schema = Schema(implementation = PersonVO::class))
                ]
            ),
            ApiResponse(description = "No Content", responseCode = "204", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Bad Request", responseCode = "400", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Unauthorized", responseCode = "401", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Not Found", responseCode = "404", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Internal Server Error", responseCode = "500", content = [
                Content(schema = Schema(implementation = Unit::class))
            ])
        ]
    )
    fun update(@RequestBody person: PersonVO) : PersonVO {
        return service.update(person)
    }

    @DeleteMapping(value = ["/{id}"], produces = [MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE])
    @Operation(summary = "delete a person", description = "delete a person",
        tags = ["people"],
        responses = [
            ApiResponse(description = "No Content", responseCode = "204", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Bad Request", responseCode = "400", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Unauthorized", responseCode = "401", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Not Found", responseCode = "404", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]),
            ApiResponse(description = "Internal Server Error", responseCode = "500", content = [
                Content(schema = Schema(implementation = Unit::class))
            ])
        ]
    )
    fun delete(@PathVariable(value = "id") id: Long) : ResponseEntity<*> {
        service.delete(id)
        return ResponseEntity.noContent().build<Any>()
    }

}
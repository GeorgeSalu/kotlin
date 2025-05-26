package demo.repository

import demo.model.Person
import org.springframework.data.jpa.repository.JpaRepository

@org.springframework.stereotype.Repository
interface PersonRepository : JpaRepository<Person?, kotlin.Long?>
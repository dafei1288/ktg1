package com.dafei1288.kt.wswdb

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}
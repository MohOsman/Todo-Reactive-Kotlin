package com.osman.todo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class TaskService  @Autowired constructor(val tasKRepository: TaskRepository)  {

    fun createTask(task : Task) : Mono<Task> = tasKRepository.save(task)
    fun getTask(id: String): Mono<Task> = tasKRepository.findById(id)
    fun getAllTasks(): Flux<Task> = tasKRepository.findAll()
    fun deleteTask(id: String): Mono<Void>  = tasKRepository.deleteById(id)

}
package com.osman.todo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : ReactiveMongoRepository<Task, String>

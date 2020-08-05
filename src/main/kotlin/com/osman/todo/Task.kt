package com.osman.todo

import org.springframework.data.annotation.Id



data class Task(@Id val id : String, val title: String, val description : String, val dueDate : String, val done : Boolean)
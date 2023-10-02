package repository

import entity.Todolist

interface TodoListRepository {

    fun findAll(): MutableList<Todolist>

    fun insert(todo: Todolist): Unit

    fun delete(number: Int): Boolean
}
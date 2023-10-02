package services

import entity.Todolist

interface TodoListService {

    fun showTodolist(): MutableList<Todolist>

    fun addTodoList(todo: String): Unit

    fun removeTodoList(number: Int): Unit
}
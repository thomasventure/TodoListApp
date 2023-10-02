package repository

import entity.Todolist

class TodoListRepositoryImpl: TodoListRepository {

    val todoList: MutableList<Todolist> = mutableListOf()

    override fun findAll(): MutableList<Todolist> {
        return todoList
    }

    override fun insert(todo: Todolist) {
        todoList.add(todo)
    }

    override fun delete(number: Int): Boolean {
        todoList.removeAt(number - 1)
        return true
    }
}
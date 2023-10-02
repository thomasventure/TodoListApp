package services

import entity.Todolist
import repository.TodoListRepository


class TodoListServiceImpl(private val repository: TodoListRepository): TodoListService {

    override fun showTodolist(): MutableList<Todolist> {
        return repository.findAll()

    }

    override fun addTodoList(todo: String) {
        val todolist = Todolist(todo)
        repository.insert(todolist)
        println("SUKSES MENAMBAH TODO:" + todolist.todo)
    }

    override fun removeTodoList(number: Int) {
        val success: Boolean = repository.delete(number)

        if (success) {
            println("SUKSES MENGHAPUS TODOLIST$number")
        }else{
            println("GAGAL MENGHAPUS TODOLIST$number")
        }
    }
}
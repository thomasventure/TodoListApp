package view

import services.TodoListService
import utils.InputUtil

class TodoListView(private val todolistService: TodoListService) {

    fun showTodoList(){
        while (true){
            println("TODOLIST")
            val model = todolistService.showTodolist()
            for (data in 0  until  model.size){
                val result = model[data]
                val no = data+1
                println("$no . ${result.todo}")
            }

            println("MENU : ")
            println("1. Tambah")
            println("2. Hapus")
            println("3. Keluar")

            var input = InputUtil.input("Pilih")

            when (input) {
                "1" -> {
                    addTodoList()
                }
                "2" -> {
                    removeTodoList()
                }
                "3" -> {
                    break
                }
                else -> {
                    println("Pilihan tidak dimengerti")
                }
            }
        }
    }

    private fun addTodoList(){
        println("Menambah TODOLIST")
        val todo = InputUtil.input("Todo (x jika batal)")
        if (todo == "x"){
            //batal
        }else{
            todolistService.addTodoList(todo)
        }
    }

    private fun removeTodoList(){
        println("Menghapus TODOLIST")
        val todo = InputUtil.input("Todo (x jika batal)")
        if (todo == "x"){
            //batal
        }else{
            todolistService.removeTodoList(Integer.valueOf(todo))
        }
    }
}
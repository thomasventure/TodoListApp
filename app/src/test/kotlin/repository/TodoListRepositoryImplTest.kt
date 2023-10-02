package repository

import entity.Todolist
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class TodoListRepositoryImplTest{


    private lateinit var repository: TodoListRepositoryImpl

    @BeforeEach
    fun setUp() {
        repository = TodoListRepositoryImpl()
    }

    @Test
    fun testFindAll(){
        repeat(10){
            val todo = Todolist(it.toString())
            repository.todoList.add(todo)
            repository.todoList.removeAll(listOf(todo))
        }

        assertNotNull(repository.todoList)
    }

    @Test
    fun testInsert(){
        val todo1 = Todolist("mencoba")
        val todo2 = Todolist("mencoba2")
        repository.insert(todo1)
        repository.insert(todo2)
        assertNotNull(repository.todoList)
        assertEquals(repository.todoList[0],todo1)
        assertEquals(repository.todoList[1],todo2)
    }

    @Test
    fun testDelete(){
        val todo1 = Todolist("mencoba")
        repository.insert(todo1)
        val data = repository.delete(1)
        assertTrue(data)
        assertNotNull(repository.todoList)
    }
}
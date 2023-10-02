package services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import repository.TodoListRepositoryImpl

class TodoListServiceImplTest{


    private lateinit var todoListService: TodoListServiceImpl

    @BeforeEach
    fun setUp() {
        val repository = TodoListRepositoryImpl()
        todoListService = TodoListServiceImpl(repository)
    }


}
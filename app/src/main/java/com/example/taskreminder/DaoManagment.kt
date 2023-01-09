package com.example.taskreminder

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface DaoManagment {


    @Query("SELECT*FROM tasks_table ORDER BY id ASC")
    fun getAllTasks(): Flow<List<EntityManagment>>


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(myTasks: EntityManagment)

    @Query("DELETE FROM tasks_table")
    suspend fun deleteAll()
}
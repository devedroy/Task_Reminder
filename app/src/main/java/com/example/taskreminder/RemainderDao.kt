package com.example.taskreminder

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

interface RemainderDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(remainder:RemainderEntities)

    @Delete()
    suspend fun delete(remainder: RemainderEntities)

    @Query(value = "SELECT * FROM task_remainder ORDER BY id ASC")
    suspend fun getAllTasks(): List<RemainderEntities>

    @Update()
    suspend fun update(remainder: RemainderEntities)



}
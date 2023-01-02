package com.example.taskreminder

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class RemainderEntities(
    val taskEntities: String,
    val taskDescription: String, val taskId: Int
) {
    @Entity(tableName = "task_remainder")
    class Task(
        @ColumnInfo(name = "title") val taskEntities: String,
        @ColumnInfo(name = "description") val taskDescription: String,
        @ColumnInfo(name = "id") val taskId: Int,

        ) {
        @PrimaryKey(autoGenerate = true)
        var id = 0
    }

}
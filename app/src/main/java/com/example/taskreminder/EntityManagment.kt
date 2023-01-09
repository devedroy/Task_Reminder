package com.example.taskreminder

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Tasks_table")
data class EntityManagment(
    @PrimaryKey val id:Int,
    @ColumnInfo(name = "title") val Titlle: String?,
    @ColumnInfo(name = "description") val Description: String?,
    @ColumnInfo(name="taskId")val TaskId: Int
)

package com.sirketismi.noteapp.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.sirketismi.noteapp.model.NoteEntity

@Dao
interface NotesDao {
    @Query("SELECT * FROM noteentity")
    fun getAll() : LiveData<List<NoteEntity>>

    @Insert
    suspend fun insert(noteEntity: NoteEntity)

    @Delete
    suspend fun delete(noteEntity: NoteEntity)
}
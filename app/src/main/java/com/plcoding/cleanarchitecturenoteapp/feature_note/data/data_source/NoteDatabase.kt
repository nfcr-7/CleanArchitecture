package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)

// La classe NoteDatabase est une classe abstraite qui étend RoomDatabase, la classe de base pour l'accès à la base de données Room.
// La classe NoteDatabase contient un membre abstrait, noteDao, qui donne accès à l'objet NoteDao.

abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}
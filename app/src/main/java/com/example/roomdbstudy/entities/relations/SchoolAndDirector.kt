package com.example.roomdbstudy.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdbstudy.entities.Director
import com.example.roomdbstudy.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)

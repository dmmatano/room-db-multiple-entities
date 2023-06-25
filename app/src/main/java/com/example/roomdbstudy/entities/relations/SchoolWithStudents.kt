package com.example.roomdbstudy.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdbstudy.entities.School
import com.example.roomdbstudy.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)

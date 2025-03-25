package com.openclassrooms.arista.domain.model

import com.openclassrooms.arista.data.entity.ExerciseDto

data class Exercise(
    val id: Long? = null,
    var startTime: Long,
    var duration: Int,
    var category: String,
    var intensity: Int
) {
    fun toDto(): ExerciseDto {
        return ExerciseDto(id, startTime, duration, category, intensity)
    }

    companion object {
        fun fromDto(it: ExerciseDto): Exercise {
            return Exercise(it.id, it.startTime, it.duration, it.category, it.intensity)
        }
    }
}
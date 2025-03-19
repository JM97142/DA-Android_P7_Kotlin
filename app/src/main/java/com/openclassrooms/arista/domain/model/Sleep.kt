package com.openclassrooms.arista.domain.model

import com.openclassrooms.arista.data.entity.SleepDto

data class Sleep(@JvmField
                 var id: Long,
                 var startTime: Long,
                 var duration: Int,
                 var quality: Int
) {
    companion object {
        fun fromDto(it: SleepDto): Sleep {
            return Sleep(it.id, it.startTime, it.duration, it.quality)
        }
    }
}

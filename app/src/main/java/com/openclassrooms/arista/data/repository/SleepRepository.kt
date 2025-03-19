package com.openclassrooms.arista.data.repository

import android.util.Log
import com.openclassrooms.arista.data.FakeApiService
import com.openclassrooms.arista.data.dao.SleepDtoDao
import com.openclassrooms.arista.domain.model.Sleep
import kotlinx.coroutines.flow.first

class SleepRepository(private val sleepDao: SleepDtoDao) {

    // Get all sleep records
    suspend fun getAllSleeps(): List<Sleep> {
        return sleepDao.getAllSleep(
            userId = 1
        )
                .first()
                .map { Sleep.fromDto(it) }
        }
}
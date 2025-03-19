package com.openclassrooms.arista.data.repository

import com.openclassrooms.arista.data.FakeApiService
import com.openclassrooms.arista.data.dao.UserDtoDao
import com.openclassrooms.arista.data.entity.UserDto
import com.openclassrooms.arista.domain.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserRepository(private val userDao: UserDtoDao) {

    suspend fun getUserbyId(id:Long): Flow<User> {
        return userDao.getUserById(id)
            .map { User.fromDto(it) }
    }

    suspend fun insertUser(user: User) {
        userDao.insertUser(user.toDto())
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUserById(user.id)
    }
}
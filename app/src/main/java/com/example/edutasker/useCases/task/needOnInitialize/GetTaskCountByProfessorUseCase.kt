package com.example.edutasker.useCases.task.needOnInitialize

import com.example.edutasker.repo.IDatabaseRepository

class GetTaskCountByProfessorUseCase(
    private val repo: IDatabaseRepository
) {
    suspend operator fun invoke(profId: String): Int {
        return repo.getTaskCountByProfessor(profId)
    }
}

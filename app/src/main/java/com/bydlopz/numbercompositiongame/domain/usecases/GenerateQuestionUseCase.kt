package com.bydlopz.numbercompositiongame.domain.usecases

import com.bydlopz.numbercompositiongame.domain.entity.Question
import com.bydlopz.numbercompositiongame.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {

        private const val COUNT_OF_OPTIONS = 6
    }
}
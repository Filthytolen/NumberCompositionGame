package com.bydlopz.numbercompositiongame.domain.repository

import com.bydlopz.numbercompositiongame.domain.entity.GameSettings
import com.bydlopz.numbercompositiongame.domain.entity.Level
import com.bydlopz.numbercompositiongame.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
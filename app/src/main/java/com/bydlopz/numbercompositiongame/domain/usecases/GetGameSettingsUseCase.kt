package com.bydlopz.numbercompositiongame.domain.usecases

import com.bydlopz.numbercompositiongame.domain.entity.GameSettings
import com.bydlopz.numbercompositiongame.domain.entity.Level
import com.bydlopz.numbercompositiongame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
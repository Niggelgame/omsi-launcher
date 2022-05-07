package dev.nycode.omsilauncher.setup

enum class SetupScreen {
    GAME_DIRECTORY,
    STEAM,
    START_SETUP;

    companion object {
        val VALUES = values().toList()
    }
}

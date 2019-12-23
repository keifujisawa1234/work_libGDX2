package net.ebisobaya.jumpactiongame

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.Game

class JumpActionGame(val mRequestHandler: ActivityRequestHandler) : Game() {
    lateinit var batch: SpriteBatch

    override fun create() {
        batch = SpriteBatch()

        // GameScreenを表示する
        setScreen(GameScreen(this))
    }
}
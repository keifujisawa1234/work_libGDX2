package jp.techacademy.kei.fujisawa.jumpactiongame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : Sprite(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 0.8f
        val ENEMY_HEIGHT = 0.8f

        // 状態
        val ENEMY_EXIST = 0
        val ENEMY_NONE = 1

    }

    var mState: Int = 0
    var mTouch: Int = 0


    init {
        setSize(Enemy.ENEMY_WIDTH, Enemy.ENEMY_HEIGHT)
        mState = Enemy.ENEMY_EXIST
    }

    fun get() {
        mState = Enemy.ENEMY_NONE
        mTouch = 1
        setAlpha(0f)
    }

}
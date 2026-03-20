package com.example.benchmark

import androidx.benchmark.macro.junit4.BaselineProfileRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Direction
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BaselineProfileGenerator {

    @get:Rule
    val baselineProfileRule = BaselineProfileRule()

    @Test
    fun generate() {
        baselineProfileRule.collect(
            packageName = "com.example.kryptx",
            includeInStartupProfile = true
        ) {
            pressHome()
            startActivityAndWait()

            val cryptoList = device.wait(Until.findObject(By.res("crypto_list")), 5_000)

            if (cryptoList != null) {
                cryptoList.setGestureMargin(device.displayWidth / 5)

                repeat(2) {
                    cryptoList.fling(Direction.DOWN)
                    device.waitForIdle()
                }
                cryptoList.fling(Direction.UP)
                device.waitForIdle()

                val coinItem = cryptoList.findObject(By.res("coin_item"))

                if (coinItem != null) {
                    coinItem.click()

                    device.wait(Until.findObject(By.res("detail_screen")), 5_000)
                    device.waitForIdle()
                } else {
                    throw AssertionError("Could not find a 'coin_item' to click.")
                }

            } else {
                throw AssertionError("Could not find 'crypto_list'.")
            }
        }
    }
}
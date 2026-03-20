package com.example.benchmark

import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.StartupTimingMetric
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Direction
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleStartupBenchmark {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun startup() = benchmarkRule.measureRepeated(
        packageName = "com.example.kryptx",
        metrics = listOf(StartupTimingMetric()),
        compilationMode = CompilationMode.Partial(),
        iterations = 5,
        startupMode = StartupMode.COLD
    ) {
        pressHome()
        startActivityAndWait()
    }

    @Test
    fun scrollAndNavigate() = benchmarkRule.measureRepeated(
        packageName = "com.example.kryptx",
        metrics = listOf(FrameTimingMetric()),
        compilationMode = CompilationMode.Partial(),
        iterations = 5,
        startupMode = StartupMode.COLD
    ) {
        pressHome()
        startActivityAndWait()

        val cryptoList = device.wait(Until.findObject(By.res("crypto_list")), 5_000)

        if (cryptoList != null) {

            cryptoList.setGestureMargin(device.displayWidth / 5)

            cryptoList.fling(Direction.DOWN)
            device.waitForIdle()
            cryptoList.fling(Direction.DOWN)
            device.waitForIdle()

            cryptoList.fling(Direction.UP)
            device.waitForIdle()

            val coinItem = cryptoList.findObject(By.res("coin_item"))
            if (coinItem != null) {
                coinItem.click()

                device.wait(Until.findObject(By.res("detail_screen")), 5_000)
            }
        }
    }
}
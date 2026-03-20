package com.example.kryptx.di

import com.example.kryptx.core.data.networking.HttpClientFactory
import com.example.kryptx.crypto.data.networking.RemoteCoinDataSource
import com.example.kryptx.crypto.domain.CoinDataSource
import com.example.kryptx.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}
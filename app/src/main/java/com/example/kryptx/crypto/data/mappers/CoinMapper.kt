package com.example.kryptx.crypto.data.mappers

import com.example.kryptx.crypto.data.networking.dto.CoinDto
import com.example.kryptx.crypto.data.networking.dto.CoinPriceDto
import com.example.kryptx.crypto.domain.Coin
import com.example.kryptx.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.systemDefault())

    )
}
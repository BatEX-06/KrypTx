package com.example.kryptx.crypto.presentation.coin_list

import com.example.kryptx.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}
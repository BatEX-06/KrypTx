package com.example.kryptx.crypto.presentation.coin_list

import androidx.compose.runtime.Immutable
import com.example.kryptx.crypto.presentation.models.CoinUI

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val isRefreshing : Boolean = false,
    val coins: List<CoinUI> = emptyList(),
    val selectedCoin: CoinUI? = null
)

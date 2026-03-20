package com.example.kryptx.crypto.presentation.coin_list

import com.example.kryptx.crypto.presentation.models.CoinUI

sealed interface CoinListAction {
    data class OnCoinCLick(val coinUI: CoinUI) : CoinListAction
    data object OnRefresh : CoinListAction
}
package com.example.kryptx.crypto.presentation.coin_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.kryptx.core.presentation.components.ShimmerListItem
import com.example.kryptx.crypto.presentation.coin_list.components.CoinListItem
import com.example.kryptx.crypto.presentation.coin_list.components.previewCoin
import com.example.kryptx.ui.theme.KrypTxTheme

@Composable
fun CoinListScreen(
    state: CoinListState,
    onAction: (CoinListAction) -> Unit,
    modifier: Modifier = Modifier
) {
    PullToRefreshBox(
        isRefreshing = state.isRefreshing,
        onRefresh = { onAction(CoinListAction.OnRefresh) },
        modifier = modifier.fillMaxSize()
    ) {
        if (state.isLoading) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .testTag("crypto_list"),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(15) {
                    ShimmerListItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.05f)
                    )
                }
            }
        } else if (state.coins.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "No coins found.\nPlease check your connection.",
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Button(onClick = { onAction(CoinListAction.OnRefresh) }) {
                        Text(text = "Retry")
                    }
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .testTag("crypto_list"),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(state.coins) { coinUI ->
                    CoinListItem(
                        coinUI = coinUI,
                        onClick = {
                            onAction(CoinListAction.OnCoinCLick(coinUI))
                        },
                        modifier = Modifier.fillMaxWidth()
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun CoinListScreenDataPreview() {
    KrypTxTheme {
        CoinListScreen(
            state = CoinListState(
                isLoading = false,
                coins = (1..10).map {
                    previewCoin.copy(id = it.toString())
                }
            ),
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
            onAction = {}
        )
    }
}

@PreviewLightDark
@Composable
private fun CoinListScreenLoadingPreview() {
    KrypTxTheme {
        CoinListScreen(
            state = CoinListState(
                isLoading = true,
                coins = emptyList()
            ),
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
            onAction = {}
        )
    }
}
package com.rek.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Lightweight wrapper for RekBoard UI.
 *
 * Integration note: In the Rek-Chess app, replace the existing RekBoardView usage with a call
 * to ZipRekBoardView and forward these parameters from the RekGameViewModel's uiState:
 *
 * - board: BoardState
 * - selectedPosition: Position?
 * - legalMoves: List<Move>
 * - onTileClicked: (Position) -> Unit
 * - boardTheme / pieceTheme etc.
 *
 * This wrapper intentionally does not duplicate game logic; it delegates interaction
 * callbacks to the host app's ViewModel.
 */

@Composable
fun ZipRekBoardView(
    board: Any?, // placeholder type to keep this file self-contained in the UI repo
    selectedPosition: Any? = null,
    legalMoves: List<Any> = emptyList(),
    onTileClicked: (Any) -> Unit = {},
    modifier: Modifier = Modifier
) {
    ZipTheme {
        Box(modifier = modifier
            .size(320.dp)
            .background(androidx.compose.ui.graphics.Color.Transparent),
            contentAlignment = Alignment.Center) {
            Card {
                Text(text = "[ZIP BOARD VIEW - assets required for full look]")
            }
        }
    }
}

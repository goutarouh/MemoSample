package com.example.memosample.feature_memo_presentation.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.memosample.feature_memo_presentation.MemoListViewModel


@Composable
fun MemoListScreenComposable(
  viewModel: MemoListViewModel = viewModel()
) {
  val uiState = viewModel.uiState.collectAsState().value
}
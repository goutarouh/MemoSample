package com.example.memosample.feature_memo_presentation.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.memosample.feature_memo_presentation.model.MemoUiModel
import com.example.memosample.feature_memo_presentation.model.MemoItemEvent

@Composable
fun ComposableMemo(
  memoUiModel: MemoUiModel,
  doEvent: (MemoItemEvent) -> Unit
) {
  Row(
    verticalAlignment = Alignment.CenterVertically
  ) {
    Text(text = memoUiModel.title)
  }
}

@Preview
@Composable
fun PreviewMemoItem() {
}



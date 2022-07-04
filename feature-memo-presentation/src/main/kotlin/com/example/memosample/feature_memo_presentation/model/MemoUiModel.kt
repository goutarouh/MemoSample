package com.example.memosample.feature_memo_presentation.model

import com.example.memosample.feature_memo_repository.model.MemoApiModel

data class MemoUiModel(
  val title: String,
  val content: String
) {

  companion object {
    fun fromMemoModel(memoApiModel: MemoApiModel): MemoUiModel {
      return MemoUiModel(
        title = memoApiModel.title,
        content = memoApiModel.contents
      )
    }
  }

}
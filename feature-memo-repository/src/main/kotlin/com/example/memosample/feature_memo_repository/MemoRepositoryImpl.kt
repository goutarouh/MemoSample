package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoModel

internal class MemoRepositoryImpl: MemoRepository {
  override suspend fun fetchMemoList(): List<MemoModel> {
    TODO()
  }
}
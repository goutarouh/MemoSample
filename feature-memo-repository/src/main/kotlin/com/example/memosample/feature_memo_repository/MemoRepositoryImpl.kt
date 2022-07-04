package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoModel
import javax.inject.Inject

internal class MemoRepositoryImpl @Inject constructor(): MemoRepository {
  override suspend fun fetchMemoList(): List<MemoModel> {
    TODO()
  }
}
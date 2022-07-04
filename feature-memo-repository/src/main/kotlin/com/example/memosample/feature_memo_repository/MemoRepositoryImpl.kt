package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoApiModel
import kotlinx.coroutines.delay
import java.time.LocalDate
import javax.inject.Inject

class MemoRepositoryImpl @Inject constructor(): MemoRepository {
  override suspend fun fetchMemoList(): List<MemoApiModel> {
    delay(3000)
    return MemoModelList
  }
}

val MemoModelList = List(10) {
  MemoApiModel(
    title = "memo$it",
    contents = "memo-memo-memo $it",
    startDate = LocalDate.now(),
    endDate = LocalDate.now(),
    achievementRate = 0
  )
}
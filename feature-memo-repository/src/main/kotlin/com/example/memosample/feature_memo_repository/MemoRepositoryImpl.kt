package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.time.LocalDate
import javax.inject.Inject

class MemoRepositoryImpl @Inject constructor(): MemoRepository {
  override suspend fun fetchMemoList(): Flow<List<MemoModel>> {
    delay(2000)
    return flow {
      emit(MemeModelList)
    }
  }
}

val MemeModelList = List(10) {
  MemoModel(
    title = "memo$it",
    contents = "memo-memo-memo $it",
    startDate = LocalDate.now(),
    endDate = LocalDate.now(),
    achievementRate = 0
  )
}
package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoApiModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.time.LocalDate
import javax.inject.Inject

class MemoRepositoryImpl @Inject constructor(): MemoRepository {
  override suspend fun fetchMemoList(): Flow<List<MemoApiModel>> {
    delay(2000)
    return flow {
      emit(MemeModelList)
    }
  }
}

val MemeModelList = List(10) {
  MemoApiModel(
    title = "memo$it",
    contents = "memo-memo-memo $it",
    startDate = LocalDate.now(),
    endDate = LocalDate.now(),
    achievementRate = 0
  )
}
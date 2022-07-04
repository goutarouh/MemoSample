package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoModel
import kotlinx.coroutines.flow.Flow

interface MemoRepository {

  suspend fun fetchMemoList(): Flow<List<MemoModel>>

}
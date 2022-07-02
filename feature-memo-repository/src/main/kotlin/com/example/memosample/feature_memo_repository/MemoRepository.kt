package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoModel

internal interface MemoRepository {

  suspend fun fetchMemoList(): List<MemoModel>

}
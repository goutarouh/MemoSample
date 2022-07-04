package com.example.memosample.feature_memo_repository

import com.example.memosample.feature_memo_repository.model.MemoApiModel

interface MemoRepository {

  suspend fun fetchMemoList(): List<MemoApiModel>

}
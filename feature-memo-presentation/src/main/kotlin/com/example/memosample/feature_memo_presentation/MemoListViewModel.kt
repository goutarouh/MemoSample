package com.example.memosample.feature_memo_presentation

import androidx.lifecycle.ViewModel
import com.example.memosample.feature_memo_repository.MemoRepository
import com.example.memosample.feature_memo_repository.model.MemoModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MemoListViewModel @Inject constructor(
  private val memoRepository: MemoRepository
): ViewModel() {


  fun fetchMemoList(): List<MemoModel> {
    TODO()
  }

}
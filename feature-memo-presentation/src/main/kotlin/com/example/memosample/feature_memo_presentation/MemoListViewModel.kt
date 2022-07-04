package com.example.memosample.feature_memo_presentation

import androidx.lifecycle.ViewModel
import com.example.memosample.feature_memo_repository.model.MemoModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MemoListViewMode @Inject constructor(): ViewModel() {


  fun fetchMemoList(): List<MemoModel> {
    TODO()
  }

}
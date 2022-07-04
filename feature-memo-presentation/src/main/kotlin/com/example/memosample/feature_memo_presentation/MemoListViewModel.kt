package com.example.memosample.feature_memo_presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.memosample.feature_memo_presentation.model.MemoListUiState
import com.example.memosample.feature_memo_presentation.model.MemoUiModel
import com.example.memosample.feature_memo_repository.MemoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MemoListViewModel @Inject constructor(
  private val memoRepository: MemoRepository
): ViewModel() {

  private val _uiState = MutableStateFlow(MemoListUiState())
  val uiState: StateFlow<MemoListUiState> = _uiState.asStateFlow()

  init {
    fetchMemoList()
  }

  private var fetchJob: Job? = null

  fun fetchMemoList() {
    fetchJob?.cancel()
    fetchJob = viewModelScope.launch {
      val memoList = memoRepository.fetchMemoList().map { memoApiModel ->
        MemoUiModel.fromMemoModel(memoApiModel)
      }
      _uiState.update {
        it.copy(memoList = memoList)
      }
    }
  }
}
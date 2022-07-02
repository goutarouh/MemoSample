package com.example.memosample.feature_memo_repository.model

import androidx.annotation.IntRange
import java.time.LocalDate

data class MemoModel(

  val title: String,

  val contents: String,

  val startDate: LocalDate,

  val endDate: LocalDate,

  @IntRange(from = MIN_ACHIEVEMENT_RATE.toLong(), to = MAX_ACHIEVEMENT_RATE.toLong())
  val achievementRate: Int
) {

  val isAchieved: Boolean
    get() = achievementRate == MAX_ACHIEVEMENT_RATE

  companion object {
    const val MIN_ACHIEVEMENT_RATE: Int = 0
    const val MAX_ACHIEVEMENT_RATE: Int = 100
  }

}

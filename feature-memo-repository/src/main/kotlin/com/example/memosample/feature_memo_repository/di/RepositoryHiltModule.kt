package com.example.memosample.feature_memo_repository.di

import com.example.memosample.feature_memo_repository.MemoRepository
import com.example.memosample.feature_memo_repository.MemoRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryHiltModule {

  @Binds
  internal abstract fun bindMemoRepository(
    memoRepositoryImpl: MemoRepositoryImpl
  ): MemoRepository

}
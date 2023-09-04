package com.example.hiltexample

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
abstract class BindsModule{
    //외부 라이브러리 객체에서는 동작하지 않음
    @StarbucksImpl
    @Binds
    abstract fun StarbucksImpl(starbucks: Starbucks) : StoreInterface

    @AbleDImpl
    @Binds
    abstract fun AbleDImpl(ableD: AbleD) : StoreInterface

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class StarbucksImpl

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class AbleDImpl
}
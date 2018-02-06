package com.kishorebabu.android.whohasthekey.common.injection.component

import com.kishorebabu.android.whohasthekey.common.injection.module.ApplicationTestModule
import com.kishorebabu.android.whohasthekey.injection.component.AppComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationTestModule::class))
interface TestComponent : AppComponent
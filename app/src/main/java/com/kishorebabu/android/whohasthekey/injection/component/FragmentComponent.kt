package com.kishorebabu.android.whohasthekey.injection.component

import com.kishorebabu.android.whohasthekey.injection.PerFragment
import com.kishorebabu.android.whohasthekey.injection.module.FragmentModule
import dagger.Subcomponent

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent
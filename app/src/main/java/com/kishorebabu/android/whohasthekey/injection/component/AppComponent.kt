package com.kishorebabu.android.whohasthekey.injection.component

import android.app.Application
import android.content.Context
import com.kishorebabu.android.whohasthekey.data.DataManager
import com.kishorebabu.android.whohasthekey.data.remote.PokemonApi
import com.kishorebabu.android.whohasthekey.injection.ApplicationContext
import com.kishorebabu.android.whohasthekey.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun dataManager(): DataManager

    fun pokemonApi(): PokemonApi
}

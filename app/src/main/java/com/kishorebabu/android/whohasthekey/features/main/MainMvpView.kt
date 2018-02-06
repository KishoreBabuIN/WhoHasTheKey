package com.kishorebabu.android.whohasthekey.features.main

import com.kishorebabu.android.whohasthekey.features.base.MvpView

interface MainMvpView : MvpView {

    fun showPokemon(pokemon: List<String>)

    fun showProgress(show: Boolean)

    fun showError(error: Throwable)

}
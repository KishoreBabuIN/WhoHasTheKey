package com.kishorebabu.android.whohasthekey.features.detail

import com.kishorebabu.android.whohasthekey.data.model.Pokemon
import com.kishorebabu.android.whohasthekey.data.model.Statistic
import com.kishorebabu.android.whohasthekey.features.base.MvpView

interface DetailMvpView : MvpView {

    fun showPokemon(pokemon: Pokemon)

    fun showStat(statistic: Statistic)

    fun showProgress(show: Boolean)

    fun showError(error: Throwable)

}
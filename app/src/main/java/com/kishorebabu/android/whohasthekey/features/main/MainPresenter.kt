package com.kishorebabu.android.whohasthekey.features.main

import com.kishorebabu.android.whohasthekey.data.DataManager
import com.kishorebabu.android.whohasthekey.features.base.BasePresenter
import com.kishorebabu.android.whohasthekey.injection.ConfigPersistent
import com.kishorebabu.android.whohasthekey.util.rx.scheduler.SchedulerUtils
import javax.inject.Inject

@ConfigPersistent
class MainPresenter @Inject
constructor(private val dataManager: DataManager) : BasePresenter<MainMvpView>() {

    fun getPokemon(limit: Int) {
        checkViewAttached()
        mvpView?.showProgress(true)
        dataManager.getPokemonList(limit)
                .compose(SchedulerUtils.ioToMain<List<String>>())
                .subscribe({ pokemons ->
                    mvpView?.apply {
                        showProgress(false)
                        showPokemon(pokemons)
                    }
                }) { throwable ->
                    mvpView?.apply {
                        showProgress(false)
                        showError(throwable)
                    }
                }
    }
}
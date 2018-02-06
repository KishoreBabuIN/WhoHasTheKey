package com.kishorebabu.android.whohasthekey.injection.component

import com.kishorebabu.android.whohasthekey.features.base.BaseActivity
import com.kishorebabu.android.whohasthekey.features.detail.DetailActivity
import com.kishorebabu.android.whohasthekey.features.main.MainActivity
import com.kishorebabu.android.whohasthekey.injection.PerActivity
import com.kishorebabu.android.whohasthekey.injection.module.ActivityModule
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)
}

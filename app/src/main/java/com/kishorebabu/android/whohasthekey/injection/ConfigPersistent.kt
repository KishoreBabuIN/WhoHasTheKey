package com.kishorebabu.android.whohasthekey.injection


import com.kishorebabu.android.whohasthekey.injection.component.ConfigPersistentComponent
import javax.inject.Scope

/**
 * A scoping annotation to permit dependencies confirm to the life of the
 * [ConfigPersistentComponent]
 */
@Scope @Retention annotation class ConfigPersistent
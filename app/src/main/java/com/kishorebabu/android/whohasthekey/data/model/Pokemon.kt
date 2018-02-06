package com.kishorebabu.android.whohasthekey.data.model

data class Pokemon(
        val id: String,
        val name: String,
        val sprites: Sprites,
        val stats: List<Statistic>)
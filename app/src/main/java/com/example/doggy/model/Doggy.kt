package com.example.doggy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Doggy(
    @StringRes val name :Int,
    @StringRes val  date : Int,
    @DrawableRes val photu :Int
)

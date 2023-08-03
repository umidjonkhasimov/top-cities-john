package uz.gita.topcities_john.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.Serializable

data class CityData(
    val id: Int = 0,
    @DrawableRes
    val img1: Int,
    @DrawableRes
    val img2: Int,
    val city: String,
    val country: String,
    val visitors: String,
    val population: String,
    val area: String,
    val gdp: String,
    val rank: String,
    @StringRes
    val info: Int
) : Serializable
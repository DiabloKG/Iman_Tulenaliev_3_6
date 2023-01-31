package com.example.iman_tulenaliev

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Footbalist(
    var description: String,
    var name: String,
    var image: String
) : Parcelable
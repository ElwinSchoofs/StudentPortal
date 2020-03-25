package com.example.level3_task2_studentportal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.net.URL

@Parcelize
data class Portal(
    val title: String,
    val url: String
): Parcelable
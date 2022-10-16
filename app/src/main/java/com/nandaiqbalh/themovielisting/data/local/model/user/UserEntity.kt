package com.nandaiqbalh.themovielisting.data.local.model.user

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "users")
@Parcelize
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    var userId: Long = 0,

    @ColumnInfo(name = "username")
    var username: String? = "",

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "password")
    var password: String? = "",

    @ColumnInfo(name = "fullName")
    var fullName: String? = "",

    @ColumnInfo(name = "dateOfBirth")
    var dateOfBirth: String? = "",

    @ColumnInfo(name = "address")
    var address: String? = ""
): Parcelable
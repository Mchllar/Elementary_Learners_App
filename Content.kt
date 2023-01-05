package com.example.elementarylearnersaid

import android.os.Parcel
import android.os.Parcelable

data class Content(
    var titleImage : Int,
    var description : String
)

//Research
//    :Parcelable {
//    constructor(parcel: Parcel) : this(
//        parcel.readInt(),
//        parcel.readString()!!
//    ) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeInt(titleImage)
//        parcel.writeString(description)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Content> {
//        override fun createFromParcel(parcel: Parcel): Content {
//            return Content(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Content?> {
//            return arrayOfNulls(size)
//        }
//    }
//}

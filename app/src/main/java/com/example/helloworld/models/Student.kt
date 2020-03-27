package com.example.helloworld.models

import android.os.Parcel
import android.os.Parcelable

data class Student(var name: String, var lastName: String, var age: Int, var isDeveloper: Boolean = false) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        // Tenemos que escribir los valores en el mismo orden en el que leemos en el constructor
        parcel.writeString(name)
        parcel.writeString(lastName)
        parcel.writeInt(age)
        parcel.writeByte(if (isDeveloper) 1 else 0)
    }

    /**
     * Describe el tipo de contenido del objeto Parceable
     * 0 siempre se usa, el otro valor es 1 o CONTENTS_FIELD_DESCRIPTOR,
     * para tipos de objetos que implementa un File Descriptor
     */
    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Student> {
        /**
         * Esto creará el objeto desde el parcel llamando al constructor SECUNDARIO
         */
        override fun createFromParcel(parcel: Parcel) = Student(parcel)

        /**
         * Esto ayudará a serializar arrays de objetos del mismo tipo que esta clase (Student)
         */
        override fun newArray(size: Int) = arrayOfNulls<Student?>(size)
    }
}
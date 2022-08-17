package com.example.myphotoloaderapp.UI.details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.myphotoloaderapp.data.MyPhoto
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailsFragmentArgs(
  val photo: MyPhoto
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(MyPhoto::class.java)) {
      result.putParcelable("photo", this.photo as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(MyPhoto::class.java)) {
      result.putSerializable("photo", this.photo as Serializable)
    } else {
      throw UnsupportedOperationException(MyPhoto::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __photo : MyPhoto?
      if (bundle.containsKey("photo")) {
        if (Parcelable::class.java.isAssignableFrom(MyPhoto::class.java) ||
            Serializable::class.java.isAssignableFrom(MyPhoto::class.java)) {
          __photo = bundle.get("photo") as MyPhoto?
        } else {
          throw UnsupportedOperationException(MyPhoto::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__photo == null) {
          throw IllegalArgumentException("Argument \"photo\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"photo\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__photo)
    }
  }
}

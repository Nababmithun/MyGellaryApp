package com.example.myphotoloaderapp.UI.gallery

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.myphotoloaderapp.R
import com.example.myphotoloaderapp.data.MyPhoto
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class GalleryFragmentDirections private constructor() {
  private data class ActionGalleryFragmentToDetailsFragment(
    val photo: MyPhoto
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_galleryFragment_to_detailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
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
  }

  companion object {
    fun actionGalleryFragmentToDetailsFragment(photo: MyPhoto): NavDirections =
        ActionGalleryFragmentToDetailsFragment(photo)
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.myphotoloaderapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.myphotoloaderapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGalleryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnPhotoRetry;

  @NonNull
  public final ProgressBar loadingMain;

  @NonNull
  public final RecyclerView rvPhotos;

  @NonNull
  public final TextView tvEmptyGallery;

  @NonNull
  public final TextView tvErrorGallery;

  private FragmentGalleryBinding(@NonNull RelativeLayout rootView, @NonNull Button btnPhotoRetry,
      @NonNull ProgressBar loadingMain, @NonNull RecyclerView rvPhotos,
      @NonNull TextView tvEmptyGallery, @NonNull TextView tvErrorGallery) {
    this.rootView = rootView;
    this.btnPhotoRetry = btnPhotoRetry;
    this.loadingMain = loadingMain;
    this.rvPhotos = rvPhotos;
    this.tvEmptyGallery = tvEmptyGallery;
    this.tvErrorGallery = tvErrorGallery;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_gallery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGalleryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_photo_retry;
      Button btnPhotoRetry = rootView.findViewById(id);
      if (btnPhotoRetry == null) {
        break missingId;
      }

      id = R.id.loading_main;
      ProgressBar loadingMain = rootView.findViewById(id);
      if (loadingMain == null) {
        break missingId;
      }

      id = R.id.rv_photos;
      RecyclerView rvPhotos = rootView.findViewById(id);
      if (rvPhotos == null) {
        break missingId;
      }

      id = R.id.tv_empty_gallery;
      TextView tvEmptyGallery = rootView.findViewById(id);
      if (tvEmptyGallery == null) {
        break missingId;
      }

      id = R.id.tv_error_gallery;
      TextView tvErrorGallery = rootView.findViewById(id);
      if (tvErrorGallery == null) {
        break missingId;
      }

      return new FragmentGalleryBinding((RelativeLayout) rootView, btnPhotoRetry, loadingMain,
          rvPhotos, tvEmptyGallery, tvErrorGallery);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
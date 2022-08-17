package com.example.myphotoloaderapp.UI.gallery;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.myphotoloaderapp.data.PhotoRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class GalleryViewModel_AssistedFactory implements ViewModelAssistedFactory<GalleryViewModel> {
  private final Provider<PhotoRepository> repository;

  @Inject
  GalleryViewModel_AssistedFactory(Provider<PhotoRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public GalleryViewModel create(SavedStateHandle arg0) {
    return new GalleryViewModel(repository.get(), arg0);
  }
}

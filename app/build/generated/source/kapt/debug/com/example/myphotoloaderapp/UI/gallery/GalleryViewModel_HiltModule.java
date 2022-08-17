package com.example.myphotoloaderapp.UI.gallery;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = GalleryViewModel.class
)
public interface GalleryViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.myphotoloaderapp.UI.gallery.GalleryViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(GalleryViewModel_AssistedFactory factory);
}

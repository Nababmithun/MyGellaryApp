package com.example.myphotoloaderapp.UI.gallery;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import com.example.myphotoloaderapp.R;
import com.example.myphotoloaderapp.data.MyPhoto;
import com.example.myphotoloaderapp.databinding.FragmentGalleryBinding;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.fragment_gallery.*;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/example/myphotoloaderapp/UI/gallery/GalleryFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$OnItemPressListener;", "()V", "_binding", "Lcom/example/myphotoloaderapp/databinding/FragmentGalleryBinding;", "binding", "getBinding", "()Lcom/example/myphotoloaderapp/databinding/FragmentGalleryBinding;", "viewmodel", "Lcom/example/myphotoloaderapp/UI/gallery/GalleryViewModel;", "getViewmodel", "()Lcom/example/myphotoloaderapp/UI/gallery/GalleryViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "OnItemClick", "", "photo", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class GalleryFragment extends androidx.fragment.app.Fragment implements com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.OnItemPressListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewmodel$delegate = null;
    private com.example.myphotoloaderapp.databinding.FragmentGalleryBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myphotoloaderapp.UI.gallery.GalleryViewModel getViewmodel() {
        return null;
    }
    
    private final com.example.myphotoloaderapp.databinding.FragmentGalleryBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void OnItemClick(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.data.MyPhoto photo) {
    }
    
    public GalleryFragment() {
        super();
    }
}
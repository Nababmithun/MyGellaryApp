package com.example.myphotoloaderapp.UI.details;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.myphotoloaderapp.R;
import com.example.myphotoloaderapp.data.MyPhoto;
import com.example.myphotoloaderapp.databinding.FragmentDetailsBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.nononsenseapps.filepicker.FilePickerActivity;
import com.skydoves.progressview.ProgressView;
import com.stfalcon.imageviewer.StfalconImageViewer;
import com.tonyodev.fetch2.*;
import com.tonyodev.fetch2core.DownloadBlock;
import java.io.File;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010!\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\b\u0010+\u001a\u00020\"H\u0002J\u0012\u0010,\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010$H\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010$2\u0006\u0010/\u001a\u000200H\u0002J\"\u00101\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000100H\u0016J\u0012\u00106\u001a\u00020\"2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0018\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u001a\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020@2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010%\u001a\u00020&H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006C"}, d2 = {"Lcom/example/myphotoloaderapp/UI/details/DetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/myphotoloaderapp/UI/details/DetailsFragmentArgs;", "getArgs", "()Lcom/example/myphotoloaderapp/UI/details/DetailsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/myphotoloaderapp/databinding/FragmentDetailsBinding;", "getBinding", "()Lcom/example/myphotoloaderapp/databinding/FragmentDetailsBinding;", "setBinding", "(Lcom/example/myphotoloaderapp/databinding/FragmentDetailsBinding;)V", "contentResolver", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "setContentResolver", "(Landroid/content/ContentResolver;)V", "fetch", "Lcom/tonyodev/fetch2/Fetch;", "getFetch", "()Lcom/tonyodev/fetch2/Fetch;", "setFetch", "(Lcom/tonyodev/fetch2/Fetch;)V", "viewModel", "Lcom/example/myphotoloaderapp/UI/details/DetailsViewModel;", "getViewModel", "()Lcom/example/myphotoloaderapp/UI/details/DetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "enqueueDownloadRequest", "", "request", "Lcom/tonyodev/fetch2/Request;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "fillImageView", "photo", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "grantStoragePermission", "initializeDownloader", "makeDownloadDialog", "download", "makeDownloadRequest", "pathData", "Landroid/content/Intent;", "onActivityResult", "requestCode", "", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onViewCreated", "view", "Landroid/view/View;", "provideFetchListener", "Lcom/tonyodev/fetch2/FetchListener;", "app_debug"})
public final class DetailsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.example.myphotoloaderapp.databinding.FragmentDetailsBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public android.content.ContentResolver contentResolver;
    @org.jetbrains.annotations.NotNull()
    public com.tonyodev.fetch2.Fetch fetch;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myphotoloaderapp.databinding.FragmentDetailsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.databinding.FragmentDetailsBinding p0) {
    }
    
    private final com.example.myphotoloaderapp.UI.details.DetailsFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myphotoloaderapp.UI.details.DetailsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.ContentResolver getContentResolver() {
        return null;
    }
    
    public final void setContentResolver(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tonyodev.fetch2.Fetch getFetch() {
        return null;
    }
    
    public final void setFetch(@org.jetbrains.annotations.NotNull()
    com.tonyodev.fetch2.Fetch p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fillImageView(com.example.myphotoloaderapp.data.MyPhoto photo) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void initializeDownloader() {
    }
    
    private final void grantStoragePermission() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final com.tonyodev.fetch2.Request makeDownloadRequest(android.content.Intent pathData) {
        return null;
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetDialog makeDownloadDialog(com.tonyodev.fetch2.Request download) {
        return null;
    }
    
    private final void enqueueDownloadRequest(com.tonyodev.fetch2.Fetch fetch, com.tonyodev.fetch2.Request request, com.google.android.material.bottomsheet.BottomSheetDialog dialog) {
    }
    
    private final com.tonyodev.fetch2.FetchListener provideFetchListener(com.google.android.material.bottomsheet.BottomSheetDialog dialog) {
        return null;
    }
    
    public DetailsFragment() {
        super();
    }
}
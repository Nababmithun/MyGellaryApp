package com.example.myphotoloaderapp.Util.Common;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.io.File;
import java.io.FileOutputStream;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\b\u00f8\u0001\u0000\u001a,\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\b\u00f8\u0001\u0000\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\n\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000b\u00a2\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014H\u0086\b\u00f8\u0001\u0000\u001a\u0012\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001b"}, d2 = {"aboveApi", "", "api", "", "included", "", "block", "Lkotlin/Function0;", "belowApi", "TAG", "", "T", "", "(Ljava/lang/Object;)Ljava/lang/String;", "edit", "Landroid/content/SharedPreferences;", "preferApply", "f", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "loadFromUrl", "Landroid/widget/ImageView;", "imageUrl", "saveFile", "Landroid/graphics/Bitmap;", "path", "app_debug"})
public final class OtherKt {
    
    /**
     * Extension method to load imageView from url.
     */
    public static final void loadFromUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadFromUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl) {
    }
    
    /**
     * Extension method to write preferences.
     */
    public static final void edit(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$edit, boolean preferApply, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> f) {
    }
    
    /**
     * Extension method to check is aboveApi.
     */
    public static final void aboveApi(int api, boolean included, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    /**
     * Extension method to check is belowApi.
     */
    public static final void belowApi(int api, boolean included, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    /**
     * Extension method to save Bitmap to specified file path.
     */
    public static final void saveFile(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$saveFile, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    /**
     * Extension method to get the TAG name for all object
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.String TAG(@org.jetbrains.annotations.NotNull()
    T $this$TAG) {
        return null;
    }
}
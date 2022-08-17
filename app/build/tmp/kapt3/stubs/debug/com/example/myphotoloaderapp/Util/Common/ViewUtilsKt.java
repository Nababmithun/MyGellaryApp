package com.example.myphotoloaderapp.Util.Common;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0003\u001a\n\u0010\t\u001a\u00020\u0003*\u00020\u0003\u001a-\u0010\n\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\u0006\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0013H\u0086\b\u00f8\u0001\u0000\u001a\n\u0010\u0014\u001a\u00020\u0003*\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0015"}, d2 = {"click", "", "T", "Landroid/view/View;", "block", "Lkotlin/Function1;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getBitmap", "Landroid/graphics/Bitmap;", "invisible", "longClick", "", "snack", "message", "", "length", "", "f", "Lcom/google/android/material/snackbar/Snackbar;", "Lkotlin/ExtensionFunctionType;", "toggleVisibility", "app_debug"})
public final class ViewUtilsKt {
    
    /**
     * Show a snackbar with [message]
     */
    public static final void snack(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snack, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @com.google.android.material.snackbar.BaseTransientBottomBar.Duration()
    int length, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.material.snackbar.Snackbar, kotlin.Unit> f) {
    }
    
    /**
     * Extension method to get a view as bitmap.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap getBitmap(@org.jetbrains.annotations.NotNull()
    android.view.View $this$getBitmap) {
        return null;
    }
    
    /**
     * Toggle a view's visibility
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View toggleVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toggleVisibility) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View invisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$invisible) {
        return null;
    }
    
    /**
     * Set an onclick listener
     */
    public static final <T extends android.view.View>void click(@org.jetbrains.annotations.NotNull()
    T $this$click, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
    }
    
    /**
     * Extension method to set OnClickListener on a view.
     */
    public static final <T extends android.view.View>void longClick(@org.jetbrains.annotations.NotNull()
    T $this$longClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> block) {
    }
}
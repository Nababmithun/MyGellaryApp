package com.example.myphotoloaderapp.Util.Common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.core.content.ContextCompat;
import es.dmoral.toasty.Toasty;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0006\u001a\u0012\u0010\u0017\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006\u001a\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0006\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0002\u001a*\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#\u001a%\u0010$\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0014\u001a\u0019\u0010%\u001a\u00020&\"\n\b\u0000\u0010\'\u0018\u0001*\u00020(*\u00020\u0002H\u0086\b\u001a5\u0010%\u001a\u00020&\"\n\b\u0000\u0010\'\u0018\u0001*\u00020(*\u00020\u00022\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00100*\u00a2\u0006\u0002\b+H\u0086\b\u00f8\u0001\u0000\u001a\"\u0010,\u001a\u0004\u0018\u00010\u0010\"\n\b\u0000\u0010\'\u0018\u0001*\u00020-*\u0004\u0018\u00010\u0002H\u0086\b\u00a2\u0006\u0002\u0010.\u001a%\u0010/\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0014\u001a%\u00100\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\n*\u00020\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0006*\u00020\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u00061"}, d2 = {"connectivityManager", "Landroid/net/ConnectivityManager;", "Landroid/content/Context;", "getConnectivityManager", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "displayHeight", "", "getDisplayHeight", "(Landroid/content/Context;)I", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "(Landroid/content/Context;)Landroid/util/DisplayMetrics;", "displayWidth", "getDisplayWidth", "errorToasty", "", "text", "", "duration", "(Landroid/content/Context;Ljava/lang/CharSequence;I)Lkotlin/Unit;", "getColor", "id", "getColorCompat", "color", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getLayoutInflater", "Landroid/view/LayoutInflater;", "inflateLayout", "Landroid/view/View;", "layoutId", "parent", "Landroid/view/ViewGroup;", "attachToRoot", "", "infoToasty", "intent", "Landroid/content/Intent;", "T", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "startActivity", "Landroid/app/Activity;", "(Landroid/content/Context;)Lkotlin/Unit;", "successToasty", "toast", "app_debug"})
public final class ContextUtilsKt {
    
    /**
     * Extension method to provide simpler access to {@link ContextCompat#getColor(int)}.
     */
    public static final int getColorCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorCompat, int color) {
        return 0;
    }
    
    public static final int getDisplayWidth(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$displayWidth) {
        return 0;
    }
    
    public static final int getDisplayHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$displayHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.util.DisplayMetrics getDisplayMetrics(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$displayMetrics) {
        return null;
    }
    
    /**
     * Extension method to show toast for Context.
     */
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Unit toast(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
        return null;
    }
    
    /**
     * Extension method to Get Color for resource for Context.
     */
    public static final int getColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColor, @androidx.annotation.ColorRes()
    int id) {
        return 0;
    }
    
    /**
     * Extension method to Get Drawable for resource for Context.
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDrawable, @androidx.annotation.DrawableRes()
    int id) {
        return null;
    }
    
    /**
     * InflateLayout
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflateLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$inflateLayout, @androidx.annotation.LayoutRes()
    int layoutId, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, boolean attachToRoot) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.net.ConnectivityManager getConnectivityManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$connectivityManager) {
        return null;
    }
    
    /**
     * Extension method to provide quicker access to the [LayoutInflater] from [Context].
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.view.LayoutInflater getLayoutInflater(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getLayoutInflater) {
        return null;
    }
    
    /**
     * Toasty
     */
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Unit successToasty(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$successToasty, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Unit infoToasty(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$infoToasty, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Unit errorToasty(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$errorToasty, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
        return null;
    }
}
package com.example.myphotoloaderapp.Util.Common;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.IdRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a-\u0010\t\u001a\u00020\u0004*\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r\u00a2\u0006\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"getContentView", "Landroid/view/ViewGroup;", "Landroid/app/Activity;", "setStatusBarColor", "", "color", "", "iconColorType", "Lcom/example/myphotoloaderapp/Util/Common/StatusIconColorType;", "setupActionBar", "Landroidx/appcompat/app/AppCompatActivity;", "toolbarId", "action", "Lkotlin/Function1;", "Landroidx/appcompat/app/ActionBar;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public final class ActivityUtilsKt {
    
    public static final void setStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$setStatusBarColor, int color, @org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.Util.Common.StatusIconColorType iconColorType) {
    }
    
    /**
     * Setup actionbar
     */
    public static final void setupActionBar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$setupActionBar, @androidx.annotation.IdRes()
    int toolbarId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.appcompat.app.ActionBar, kotlin.Unit> action) {
    }
    
    /**
     * Extension method to get ContentView for ViewGroup.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.view.ViewGroup getContentView(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$getContentView) {
        return null;
    }
}
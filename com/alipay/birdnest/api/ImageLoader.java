package com.alipay.birdnest.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.birdnest.api.BirdNestEngine;

/* loaded from: classes3.dex */
public interface ImageLoader {

    /* loaded from: classes3.dex */
    public interface ILayoutListener {
        void requestLayout(int i, int i2);
    }

    /* loaded from: classes3.dex */
    public interface IViewAttachedListener {
        void recycleDetachedView();

        void viewAttachedToWindow();
    }

    void clearCache(int i);

    void loadImage(BirdNestEngine birdNestEngine, View view, String str, String str2, int[] iArr, boolean z, String str3, String str4, int i, boolean z2, ILayoutListener iLayoutListener, FBResourceClient fBResourceClient, BirdNestEngine.ResourceProvider.Callback callback, Bundle bundle);

    Drawable loadLocalDrawable(BirdNestEngine.ResourceProvider resourceProvider, Context context, String str, String str2, int[] iArr, boolean z, View view, boolean z2, boolean z3);
}

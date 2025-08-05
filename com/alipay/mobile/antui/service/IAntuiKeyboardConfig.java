package com.alipay.mobile.antui.service;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public interface IAntuiKeyboardConfig {
    Drawable getBackspaceDrawable(Context context, boolean z);

    Drawable getDownArrowDrawable(Context context);

    Typeface getNumberTypeface(Context context);
}

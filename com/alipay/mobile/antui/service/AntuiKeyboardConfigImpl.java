package com.alipay.mobile.antui.service;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class AntuiKeyboardConfigImpl implements IAntuiKeyboardConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.antui.service.IAntuiKeyboardConfig
    public Typeface getNumberTypeface(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("e11bdd21", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.alipay.mobile.antui.service.IAntuiKeyboardConfig
    public Drawable getDownArrowDrawable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("939ae288", new Object[]{this, context}) : context.getResources().getDrawable(R.drawable.down_arrow);
    }

    @Override // com.alipay.mobile.antui.service.IAntuiKeyboardConfig
    public Drawable getBackspaceDrawable(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("abe08e60", new Object[]{this, context, new Boolean(z)});
        }
        if (z) {
            return context.getResources().getDrawable(R.drawable.backspace_btn_big_selector);
        }
        return context.getResources().getDrawable(R.drawable.backspace_btn_small_selector);
    }
}

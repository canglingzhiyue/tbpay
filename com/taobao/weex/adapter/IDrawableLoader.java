package com.taobao.weex.adapter;

import android.graphics.drawable.Drawable;

/* loaded from: classes9.dex */
public interface IDrawableLoader {

    /* loaded from: classes9.dex */
    public interface AnimatedTarget extends DrawableTarget {
        void setAnimatedDrawable(Drawable drawable);
    }

    /* loaded from: classes9.dex */
    public interface DrawableTarget {
        void setDrawable(Drawable drawable, boolean z);
    }

    /* loaded from: classes9.dex */
    public interface StaticTarget extends DrawableTarget {
        @Override // com.taobao.weex.adapter.IDrawableLoader.DrawableTarget
        void setDrawable(Drawable drawable, boolean z);
    }

    void setDrawable(String str, DrawableTarget drawableTarget, DrawableStrategy drawableStrategy);
}

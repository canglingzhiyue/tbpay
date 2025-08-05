package com.taobao.android;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public interface AliUrlImageViewInterface {
    AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder(String str);

    AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder(String str, int i);

    void setAutoRelease(boolean z);

    void setCornerRadius(float f, float f2, float f3, float f4);

    void setDarkModeOverlay(boolean z, int i);

    void setEnableSizeInLayoutParams(boolean z);

    void setImageUrl(String str);

    void setImageUrl(String str, j jVar);

    void setOrientation(int i);

    void setPlaceHoldForeground(Drawable drawable);

    void setPlaceHoldImageResId(int i);

    void setRatio(float f);

    void setReusableImageShape(boolean z);

    void setShape(int i);

    void setSkipAutoSize(boolean z);

    void setStrategyConfig(Object obj);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);

    void succListener(i<l> iVar);
}

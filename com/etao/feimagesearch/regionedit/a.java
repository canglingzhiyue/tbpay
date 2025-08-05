package com.etao.feimagesearch.regionedit;

import android.view.View;

/* loaded from: classes3.dex */
public interface a {
    float getDragBottomEdgeLimit();

    float getDragTopEdgeLimit();

    int getHeight();

    View getHolderView();

    View getImageView();

    int getTouchSlop();

    int getWidth();

    void setImageScale(float f);

    void setImageTranslationX(float f);

    void setImageTranslationY(float f);

    void setSelfDefinedSelected();
}

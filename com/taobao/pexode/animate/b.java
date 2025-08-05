package com.taobao.pexode.animate;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public interface b {
    void dispose();

    AnimatedDrawableFrameInfo getFrameInfo();

    int getHeight();

    int getWidth();

    int getXOffset();

    int getYOffset();

    void renderFrame(int i, int i2, Bitmap bitmap);
}

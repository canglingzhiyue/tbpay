package com.taobao.taolive.uikit.favor;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public interface b {
    void destroy();

    void setDrawables(ArrayList<Drawable> arrayList);

    void setFavorDuration(int i);

    void setScaleFactor(double d);

    void startFakeFavor();

    void stopFakeFavor();
}

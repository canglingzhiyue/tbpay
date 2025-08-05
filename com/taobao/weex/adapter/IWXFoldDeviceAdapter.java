package com.taobao.weex.adapter;

import android.app.Activity;
import android.graphics.Rect;

/* loaded from: classes9.dex */
public interface IWXFoldDeviceAdapter {

    /* loaded from: classes9.dex */
    public interface screenChangeListener {
        void onChange();
    }

    float getScaleRadio(Activity activity);

    Rect getWidowRect(Activity activity);

    boolean isFoldDevice();

    boolean isGalaxyFold();

    boolean isMateX();

    boolean isTablet();

    void registerScreenChangeListener(screenChangeListener screenchangelistener);

    void unRegisterScreenChangeListener(screenChangeListener screenchangelistener);
}

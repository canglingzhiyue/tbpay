package com.taobao.message.kit.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.taobao.message.uikit.util.ObserverScreenListener;

/* loaded from: classes7.dex */
public interface IToLargeScreenProvider {
    int ap2DesignScalePx(Context context, float f);

    void autoSetRequestedOrientation(Activity activity);

    Activity getActivityFromContext(Context context);

    int getDesignWindowWidth(Context context);

    int getMaxWindowWidth(Context context);

    boolean isLargeScreen(Context context);

    Boolean isOpenHeader(Activity activity);

    String isOpenHeaderStr(Activity activity);

    int px2DesignScaleAp(Context context, float f);

    void registerOnScreenChangedObserver(ObserverScreenListener observerScreenListener);

    void startActivityForResultRoute(Activity activity, Intent intent, int i);

    void startActivityForResultRoute(Fragment fragment, Intent intent, int i);

    void startActivityRoute(Context context, Intent intent);

    void unRegisterOnScreenChangedObserver(ObserverScreenListener observerScreenListener);
}

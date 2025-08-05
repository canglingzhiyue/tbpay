package com.taobao.pha.core.controller;

import android.net.Uri;
import android.support.v4.app.Fragment;

/* loaded from: classes7.dex */
public interface d {
    boolean attachToHost(Fragment fragment);

    boolean back();

    boolean downgrade(Uri uri, DowngradeType downgradeType, Boolean bool);

    long getNavStartTime();

    int getNavigationBarHeight();

    @Deprecated
    int getNotchHeight();

    int getStatusBarHeight();

    boolean isFragment();

    boolean isImmersiveStatus();

    boolean isNavigationBarHidden();

    boolean isTrustedUrl(String str);
}

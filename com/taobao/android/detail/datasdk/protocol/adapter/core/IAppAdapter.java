package com.taobao.android.detail.datasdk.protocol.adapter.core;

import android.app.Application;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface IAppAdapter extends Serializable {
    String getAppKey();

    String getAppVersion();

    Application getApplication();

    int getStatusBarHeight();

    String getTTID();

    int getsNavigtionBarHeight();
}

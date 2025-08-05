package com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core;

import android.app.Application;
import java.io.Serializable;

/* loaded from: classes7.dex */
public interface IAppAdapter extends Serializable {
    String getAppVersion();

    Application getApplication();

    int getStatusBarHeight();

    String getTTID();

    String getUTDID();

    boolean isDebug();
}

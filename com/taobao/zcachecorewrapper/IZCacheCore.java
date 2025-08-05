package com.taobao.zcachecorewrapper;

import com.taobao.zcachecorewrapper.model.AppInfo;
import com.taobao.zcachecorewrapper.model.Error;

@Deprecated
/* loaded from: classes9.dex */
public interface IZCacheCore {

    /* loaded from: classes9.dex */
    public interface AppInfoCallback {
        void onReceive(AppInfo appInfo, Error error);
    }

    /* loaded from: classes9.dex */
    public interface UpdateCallback {
        void finish(String str, Error error);
    }
}

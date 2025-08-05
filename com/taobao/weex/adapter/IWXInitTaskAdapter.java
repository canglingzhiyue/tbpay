package com.taobao.weex.adapter;

/* loaded from: classes.dex */
public interface IWXInitTaskAdapter {

    /* loaded from: classes9.dex */
    public interface Callback {
        void onRemoteFailed(String str, String str2);

        void onRemoteInstalled();
    }

    void doInit(Callback callback);

    boolean hasInit();
}

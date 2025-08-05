package com.taobao.weex.adapter;

import com.taobao.weex.WXSDKInstance;

/* loaded from: classes9.dex */
public interface IWXJscProcessManager {
    boolean enableBackUpThreadCache();

    boolean enableBackupThread();

    long rebootTimeout();

    boolean shouldReboot();

    boolean withException(WXSDKInstance wXSDKInstance);
}

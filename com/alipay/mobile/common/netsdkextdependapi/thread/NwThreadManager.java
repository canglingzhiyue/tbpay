package com.alipay.mobile.common.netsdkextdependapi.thread;

/* loaded from: classes3.dex */
public interface NwThreadManager {
    boolean addIdleTask(Runnable runnable, String str, int i);

    void executeNormalTask(Runnable runnable);
}

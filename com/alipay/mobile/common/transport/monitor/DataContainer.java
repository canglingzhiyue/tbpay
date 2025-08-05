package com.alipay.mobile.common.transport.monitor;

/* loaded from: classes3.dex */
public interface DataContainer {
    String getDataItem(String str);

    void putDataItem(String str, String str2);

    void removeDataItem(String str);

    void timeItemDot(String str);

    void timeItemDot(String str, long j);

    void timeItemRelease(String str);
}

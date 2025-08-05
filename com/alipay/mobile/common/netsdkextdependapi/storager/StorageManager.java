package com.alipay.mobile.common.netsdkextdependapi.storager;

import java.io.Serializable;

/* loaded from: classes3.dex */
public interface StorageManager {
    Serializable getSerializable(String str);

    boolean remove(String str);

    boolean saveSerializable(String str, Serializable serializable, long j);
}

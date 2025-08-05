package com.taobao.android.tscheduleprotocol;

import java.io.Serializable;

/* loaded from: classes6.dex */
public interface ScheduleCache<K, T, V> extends Serializable {
    void fetch(Object obj, ScheduleCacheCallBack scheduleCacheCallBack, Object... objArr);

    void finish(K k, T t, Object... objArr);

    void prefetch(K k, V v, Object... objArr);
}

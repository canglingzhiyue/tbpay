package com.taobao.android.behavir.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class LinkedMapWithMaxSize<K, V> extends LinkedHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mSize;

    static {
        kge.a(840774154);
    }

    public LinkedMapWithMaxSize(int i) {
        this.mSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > this.mSize;
    }
}

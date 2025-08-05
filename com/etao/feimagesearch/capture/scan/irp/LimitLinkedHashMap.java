package com.etao.feimagesearch.capture.scan.irp;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class LimitLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int maxSize;

    static {
        kge.a(2133768284);
    }

    public LimitLinkedHashMap(int i) {
        super(i, 0.75f, false);
        this.maxSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > this.maxSize;
    }
}

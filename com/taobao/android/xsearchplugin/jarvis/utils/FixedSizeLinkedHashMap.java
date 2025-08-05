package com.taobao.android.xsearchplugin.jarvis.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mMaxSize;

    static {
        kge.a(114077497);
    }

    public FixedSizeLinkedHashMap(int i) {
        super(16, 0.75f, false);
        this.mMaxSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > this.mMaxSize;
    }

    public void setMaxSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2c5079", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxSize = i;
        }
    }
}

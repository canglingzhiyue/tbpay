package com.taobao.search.mmd.rebuild;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes7.dex */
public final class PageRebuildModelMap<E, T> extends LinkedHashMap<E, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int cacheSize;

    static {
        kge.a(796943052);
    }

    public PageRebuildModelMap() {
        this(0, 1, null);
    }

    public static /* synthetic */ Object ipc$super(PageRebuildModelMap pageRebuildModelMap, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1952759047:
                return super.keySet();
            case -1280511290:
                return super.entrySet();
            case 648458174:
                return super.values();
            case 845773819:
                return new Integer(super.size());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<E, T>> entrySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this}) : getEntries();
    }

    public Set getEntries() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6aee8610", new Object[]{this}) : super.entrySet();
    }

    public Set getKeys() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("2d9cf820", new Object[]{this}) : super.keySet();
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : super.size();
    }

    public Collection getValues() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("7d4fad88", new Object[]{this}) : super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<E> keySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this}) : getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<T> values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this}) : getValues();
    }

    public /* synthetic */ PageRebuildModelMap(int i, int i2, o oVar) {
        this((i2 & 1) != 0 ? 3 : i);
    }

    public final int getCacheSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6be5a9e7", new Object[]{this})).intValue() : this.cacheSize;
    }

    public final void setCacheSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c66f9b", new Object[]{this, new Integer(i)});
        } else {
            this.cacheSize = i;
        }
    }

    public PageRebuildModelMap(int i) {
        this.cacheSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<E, T> entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > this.cacheSize;
    }
}

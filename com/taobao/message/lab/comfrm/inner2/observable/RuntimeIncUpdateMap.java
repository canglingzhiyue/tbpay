package com.taobao.message.lab.comfrm.inner2.observable;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public final class RuntimeIncUpdateMap<V> extends HashMap<String, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Set<String> changeKeySet;

    static {
        kge.a(-1741916382);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(RuntimeIncUpdateMap runtimeIncUpdateMap, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1272099756:
                super.clear();
                return null;
            case -605927644:
                return super.put((RuntimeIncUpdateMap) objArr[0], objArr[1]);
            case 1518226411:
                return super.remove(objArr[0]);
            case 1728293580:
                super.putAll((Map) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((String) obj, (String) obj2);
    }

    public RuntimeIncUpdateMap(int i) {
        super(i);
        this.changeKeySet = new HashSet(4);
    }

    public static <V> RuntimeIncUpdateMap<V> copy(RuntimeIncUpdateMap<V> runtimeIncUpdateMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeIncUpdateMap) ipChange.ipc$dispatch("699b2", new Object[]{runtimeIncUpdateMap});
        }
        RuntimeIncUpdateMap<V> runtimeIncUpdateMap2 = new RuntimeIncUpdateMap<>(runtimeIncUpdateMap.size());
        runtimeIncUpdateMap2.putAllInner(runtimeIncUpdateMap);
        ((RuntimeIncUpdateMap) runtimeIncUpdateMap2).changeKeySet.addAll(((RuntimeIncUpdateMap) runtimeIncUpdateMap).changeKeySet);
        return runtimeIncUpdateMap2;
    }

    private void putAllInner(Map<? extends String, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fc9c3a", new Object[]{this, map});
        } else {
            super.putAll(map);
        }
    }

    public V put(String str, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("fd14d676", new Object[]{this, str, v});
        }
        this.changeKeySet.add(str);
        return (V) super.put((RuntimeIncUpdateMap<V>) str, (String) v);
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2235247", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("StringMapObservable.remove not support" + obj);
        }
        this.changeKeySet.add(String.valueOf(obj));
        return super.remove(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.changeKeySet.addAll(keySet());
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends String, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
            return;
        }
        this.changeKeySet.addAll(map.keySet());
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("StringMapObservable.remove not support" + obj);
        }
        this.changeKeySet.add(String.valueOf(obj));
        return (V) super.remove(obj);
    }

    public Set<String> resetChangeKeySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6d121ff8", new Object[]{this});
        }
        HashSet hashSet = new HashSet(this.changeKeySet);
        this.changeKeySet.clear();
        return hashSet;
    }
}

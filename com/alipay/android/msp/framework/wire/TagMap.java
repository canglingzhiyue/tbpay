package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public abstract class TagMap<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Comparator<? super Map.Entry<Integer, ?>> b = new Comparator<Map.Entry<Integer, ?>>() { // from class: com.alipay.android.msp.framework.wire.TagMap.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Map.Entry<Integer, ?> entry, Map.Entry<Integer, ?> entry2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue() : entry.getKey().compareTo(entry2.getKey());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public List<T> f4901a;

    public abstract boolean containsKey(int i);

    public abstract T get(int i);

    private static <T> List<T> a(Map<Integer, T> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{map});
        }
        TreeSet treeSet = new TreeSet(b);
        treeSet.addAll(map.entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public TagMap(Map<Integer, T> map) {
        this.f4901a = a(map);
    }

    public Collection<T> values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this}) : this.f4901a;
    }

    /* loaded from: classes3.dex */
    public static final class Compact<T> extends TagMap<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Object[] b;
        public int c;

        public static <T> Compact<T> compactTagMapOf(Map<Integer, T> map, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Compact) ipChange.ipc$dispatch("f699ffa6", new Object[]{map, new Integer(i)}) : new Compact<>(map, i);
        }

        private Compact(Map<Integer, T> map, int i) {
            super(map);
            this.c = -1;
            this.c = i;
            this.b = new Object[i + 1];
            for (Map.Entry<Integer, T> entry : map.entrySet()) {
                Integer key = entry.getKey();
                if (key.intValue() <= 0) {
                    throw new IllegalArgumentException("Input map key is negative or zero");
                }
                this.b[key.intValue()] = entry.getValue();
            }
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final T get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
            }
            if (i <= this.c) {
                return (T) this.b[i];
            }
            return null;
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final boolean containsKey(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff844fa0", new Object[]{this, new Integer(i)})).booleanValue() : i <= this.c && this.b[i] != null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Sparse<T> extends TagMap<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<Integer, T> b;

        public static <T> Sparse<T> sparseTagMapOf(Map<Integer, T> map) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Sparse) ipChange.ipc$dispatch("c1ef9ed1", new Object[]{map}) : new Sparse<>(map);
        }

        private Sparse(Map<Integer, T> map) {
            super(map);
            this.b = map;
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final T get(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)}) : this.b.get(Integer.valueOf(i));
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final boolean containsKey(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff844fa0", new Object[]{this, new Integer(i)})).booleanValue() : this.b.containsKey(Integer.valueOf(i));
        }
    }

    public static <T> TagMap<T> of(Map<Integer, T> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (TagMap) ipChange.ipc$dispatch("1a49ebf", new Object[]{map});
        }
        int i = -1;
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (intValue > i) {
                i = intValue;
            }
        }
        int size = map.size();
        if (i <= 64 || size / i > 0.75f) {
            z = true;
        }
        if (z) {
            return Compact.compactTagMapOf(map, i);
        }
        return Sparse.sparseTagMapOf(map);
    }
}

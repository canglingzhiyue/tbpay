package com.squareup.wire;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes4.dex */
abstract class h<T> {
    private static final Comparator<? super Map.Entry<Integer, ?>> b = new Comparator<Map.Entry<Integer, ?>>() { // from class: com.squareup.wire.h.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Map.Entry<Integer, ?> entry, Map.Entry<Integer, ?> entry2) {
            return entry.getKey().compareTo(entry2.getKey());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    List<T> f8130a;

    /* loaded from: classes4.dex */
    static final class a<T> extends h<T> {
        Object[] b;
        int c;

        private a(Map<Integer, T> map, int i) {
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

        public static <T> a<T> a(Map<Integer, T> map, int i) {
            return new a<>(map, i);
        }

        @Override // com.squareup.wire.h
        public T a(int i) {
            if (i > this.c) {
                return null;
            }
            return (T) this.b[i];
        }

        @Override // com.squareup.wire.h
        public boolean b(int i) {
            return i <= this.c && this.b[i] != null;
        }
    }

    /* loaded from: classes4.dex */
    static final class b<T> extends h<T> {
        Map<Integer, T> b;

        private b(Map<Integer, T> map) {
            super(map);
            this.b = map;
        }

        public static <T> b<T> b(Map<Integer, T> map) {
            return new b<>(map);
        }

        @Override // com.squareup.wire.h
        public T a(int i) {
            return this.b.get(Integer.valueOf(i));
        }

        @Override // com.squareup.wire.h
        public boolean b(int i) {
            return this.b.containsKey(Integer.valueOf(i));
        }
    }

    protected h(Map<Integer, T> map) {
        this.f8130a = c(map);
    }

    public static <T> h<T> a(Map<Integer, T> map) {
        int b2 = b(map);
        return a(map.size(), b2) ? a.a(map, b2) : b.b((Map) map);
    }

    private static boolean a(int i, int i2) {
        return i2 <= 64 || ((float) i) / ((float) i2) > 0.75f;
    }

    private static <T> int b(Map<Integer, T> map) {
        int i = -1;
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (intValue > i) {
                i = intValue;
            }
        }
        return i;
    }

    private static <T> List<T> c(Map<Integer, T> map) {
        TreeSet treeSet = new TreeSet(b);
        treeSet.addAll(map.entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public abstract T a(int i);

    public Collection<T> a() {
        return this.f8130a;
    }

    public abstract boolean b(int i);
}

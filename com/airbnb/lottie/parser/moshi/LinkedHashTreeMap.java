package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.akh;

/* loaded from: classes2.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.c entrySet;
    final f<K, V> header;
    private LinkedHashTreeMap<K, V>.d keySet;
    int modCount;
    int size;
    f<K, V>[] table;
    int threshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private f<K, V> f1788a;
        private int b;
        private int c;
        private int d;

        a() {
        }

        f<K, V> a() {
            f<K, V> fVar = this.f1788a;
            if (fVar.f1794a != null) {
                akh.c("stacktTop.parent is not null to trigger IllegalStateException");
            }
            return fVar;
        }

        void a(int i) {
            this.b = ((Integer.highestOneBit(i) << 1) - 1) - i;
            this.d = 0;
            this.c = 0;
            this.f1788a = null;
        }

        void a(f<K, V> fVar) {
            fVar.c = null;
            fVar.f1794a = null;
            fVar.b = null;
            fVar.i = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            fVar.f1794a = this.f1788a;
            this.f1788a = fVar;
            this.d++;
            int i3 = this.b;
            if (i3 > 0) {
                int i4 = this.d;
                if ((i4 & 1) == 0) {
                    this.d = i4 + 1;
                    this.b = i3 - 1;
                    this.c++;
                }
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.d & i6) == i6) {
                    int i7 = this.c;
                    if (i7 == 0) {
                        f<K, V> fVar2 = this.f1788a;
                        f<K, V> fVar3 = fVar2.f1794a;
                        f<K, V> fVar4 = fVar3.f1794a;
                        fVar3.f1794a = fVar4.f1794a;
                        this.f1788a = fVar3;
                        fVar3.b = fVar4;
                        fVar3.c = fVar2;
                        fVar3.i = fVar2.i + 1;
                        fVar4.f1794a = fVar3;
                        fVar2.f1794a = fVar3;
                    } else {
                        if (i7 == 1) {
                            f<K, V> fVar5 = this.f1788a;
                            f<K, V> fVar6 = fVar5.f1794a;
                            this.f1788a = fVar6;
                            fVar6.c = fVar5;
                            fVar6.i = fVar5.i + 1;
                            fVar5.f1794a = fVar6;
                        } else if (i7 != 2) {
                        }
                        this.c = 0;
                    }
                    i5 <<= 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private f<K, V> f1789a;

        b() {
        }

        public f<K, V> a() {
            f<K, V> fVar = this.f1789a;
            if (fVar == null) {
                return null;
            }
            f<K, V> fVar2 = fVar.f1794a;
            fVar.f1794a = null;
            f<K, V> fVar3 = fVar.c;
            while (true) {
                f<K, V> fVar4 = fVar2;
                fVar2 = fVar3;
                if (fVar2 == null) {
                    this.f1789a = fVar4;
                    return fVar;
                }
                fVar2.f1794a = fVar4;
                fVar3 = fVar2.b;
            }
        }

        void a(f<K, V> fVar) {
            f<K, V> fVar2 = null;
            while (true) {
                f<K, V> fVar3 = fVar2;
                fVar2 = fVar;
                if (fVar2 == null) {
                    this.f1789a = fVar3;
                    return;
                } else {
                    fVar2.f1794a = fVar3;
                    fVar = fVar2.b;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    final class c extends AbstractSet<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.e<Map.Entry<K, V>>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.c.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                /* renamed from: a */
                public Map.Entry<K, V> next() {
                    return b();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            f<K, V> findByEntry;
            if ((obj instanceof Map.Entry) && (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) != null) {
                LinkedHashTreeMap.this.removeInternal(findByEntry, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* loaded from: classes2.dex */
    final class d extends AbstractSet<K> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.e<K>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.d.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return b().f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class e<T> implements Iterator<T> {
        f<K, V> b;
        f<K, V> c = null;
        int d;

        e() {
            this.b = LinkedHashTreeMap.this.header.d;
            this.d = LinkedHashTreeMap.this.modCount;
        }

        final f<K, V> b() {
            f<K, V> fVar = this.b;
            this.b = fVar.d;
            this.c = fVar;
            return fVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != LinkedHashTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            f<K, V> fVar = this.c;
            if (fVar == null) {
                return;
            }
            LinkedHashTreeMap.this.removeInternal(fVar, true);
            this.c = null;
            this.d = LinkedHashTreeMap.this.modCount;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        f<K, V> f1794a;
        f<K, V> b;
        f<K, V> c;
        f<K, V> d;
        f<K, V> e;
        final K f;
        final int g;
        V h;
        int i;

        f() {
            this.f = null;
            this.g = -1;
            this.e = this;
            this.d = this;
        }

        f(f<K, V> fVar, K k, int i, f<K, V> fVar2, f<K, V> fVar3) {
            this.f1794a = fVar;
            this.f = k;
            this.g = i;
            this.i = 1;
            this.d = fVar2;
            this.e = fVar3;
            fVar3.d = this;
            fVar2.e = this;
        }

        public f<K, V> a() {
            f<K, V> fVar = this;
            for (f<K, V> fVar2 = this.b; fVar2 != null; fVar2 = fVar2.b) {
                fVar = fVar2;
            }
            return fVar;
        }

        public f<K, V> b() {
            f<K, V> fVar = this;
            for (f<K, V> fVar2 = this.c; fVar2 != null; fVar2 = fVar2.c) {
                fVar = fVar2;
            }
            return fVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.h;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.h;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        public String toString() {
            return this.f + "=" + this.h;
        }
    }

    LinkedHashTreeMap() {
        this(null);
    }

    LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new f<>();
        this.table = new f[16];
        f<K, V>[] fVarArr = this.table;
        this.threshold = (fVarArr.length / 2) + (fVarArr.length / 4);
    }

    private void doubleCapacity() {
        this.table = doubleCapacity(this.table);
        f<K, V>[] fVarArr = this.table;
        this.threshold = (fVarArr.length / 2) + (fVarArr.length / 4);
    }

    static <K, V> f<K, V>[] doubleCapacity(f<K, V>[] fVarArr) {
        int length = fVarArr.length;
        f<K, V>[] fVarArr2 = new f[length << 1];
        b bVar = new b();
        a aVar = new a();
        a aVar2 = new a();
        for (int i = 0; i < length; i++) {
            f<K, V> fVar = fVarArr[i];
            if (fVar != null) {
                bVar.a(fVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    f<K, V> a2 = bVar.a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                aVar.a(i2);
                aVar2.a(i3);
                bVar.a(fVar);
                while (true) {
                    f<K, V> a3 = bVar.a();
                    if (a3 == null) {
                        break;
                    } else if ((a3.g & length) == 0) {
                        aVar.a(a3);
                    } else {
                        aVar2.a(a3);
                    }
                }
                f<K, V> fVar2 = null;
                fVarArr2[i] = i2 > 0 ? aVar.a() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    fVar2 = aVar2.a();
                }
                fVarArr2[i4] = fVar2;
            }
        }
        return fVarArr2;
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void rebalance(f<K, V> fVar, boolean z) {
        while (fVar != null) {
            f<K, V> fVar2 = fVar.b;
            f<K, V> fVar3 = fVar.c;
            int i = 0;
            int i2 = fVar2 != null ? fVar2.i : 0;
            int i3 = fVar3 != null ? fVar3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                f<K, V> fVar4 = fVar3.b;
                f<K, V> fVar5 = fVar3.c;
                int i5 = fVar5 != null ? fVar5.i : 0;
                if (fVar4 != null) {
                    i = fVar4.i;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    rotateRight(fVar3);
                }
                rotateLeft(fVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                f<K, V> fVar6 = fVar2.b;
                f<K, V> fVar7 = fVar2.c;
                int i7 = fVar7 != null ? fVar7.i : 0;
                if (fVar6 != null) {
                    i = fVar6.i;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    rotateLeft(fVar2);
                }
                rotateRight(fVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                fVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f1794a;
        }
    }

    private void replaceInParent(f<K, V> fVar, f<K, V> fVar2) {
        f<K, V> fVar3 = fVar.f1794a;
        fVar.f1794a = null;
        if (fVar2 != null) {
            fVar2.f1794a = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.g;
            f<K, V>[] fVarArr = this.table;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.b == fVar) {
            fVar3.b = fVar2;
        } else {
            fVar3.c = fVar2;
        }
    }

    private void rotateLeft(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.b;
        f<K, V> fVar3 = fVar.c;
        f<K, V> fVar4 = fVar3.b;
        f<K, V> fVar5 = fVar3.c;
        fVar.c = fVar4;
        if (fVar4 != null) {
            fVar4.f1794a = fVar;
        }
        replaceInParent(fVar, fVar3);
        fVar3.b = fVar;
        fVar.f1794a = fVar3;
        int i = 0;
        fVar.i = Math.max(fVar2 != null ? fVar2.i : 0, fVar4 != null ? fVar4.i : 0) + 1;
        int i2 = fVar.i;
        if (fVar5 != null) {
            i = fVar5.i;
        }
        fVar3.i = Math.max(i2, i) + 1;
    }

    private void rotateRight(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.b;
        f<K, V> fVar3 = fVar.c;
        f<K, V> fVar4 = fVar2.b;
        f<K, V> fVar5 = fVar2.c;
        fVar.b = fVar5;
        if (fVar5 != null) {
            fVar5.f1794a = fVar;
        }
        replaceInParent(fVar, fVar2);
        fVar2.c = fVar;
        fVar.f1794a = fVar2;
        int i = 0;
        fVar.i = Math.max(fVar3 != null ? fVar3.i : 0, fVar5 != null ? fVar5.i : 0) + 1;
        int i2 = fVar.i;
        if (fVar4 != null) {
            i = fVar4.i;
        }
        fVar2.i = Math.max(i2, i) + 1;
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        f<K, V> fVar = this.header;
        f<K, V> fVar2 = fVar.d;
        while (fVar2 != fVar) {
            f<K, V> fVar3 = fVar2.d;
            fVar2.e = null;
            fVar2.d = null;
            fVar2 = fVar3;
        }
        fVar.e = fVar;
        fVar.d = fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new c();
        this.entrySet = cVar2;
        return cVar2;
    }

    f<K, V> find(K k, boolean z) {
        f<K, V> fVar;
        int i;
        f<K, V> fVar2;
        Comparator<? super K> comparator = this.comparator;
        f<K, V>[] fVarArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (fVarArr.length - 1) & secondaryHash;
        f<K, V> fVar3 = fVarArr[length];
        if (fVar3 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                int compareTo = comparable != null ? comparable.compareTo(fVar3.f) : comparator.compare(k, (K) fVar3.f);
                if (compareTo != 0) {
                    f<K, V> fVar4 = compareTo < 0 ? fVar3.b : fVar3.c;
                    if (fVar4 == null) {
                        fVar = fVar3;
                        i = compareTo;
                        break;
                    }
                    fVar3 = fVar4;
                } else {
                    return fVar3;
                }
            }
        } else {
            fVar = fVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        f<K, V> fVar5 = this.header;
        if (fVar != null) {
            fVar2 = new f<>(fVar, k, secondaryHash, fVar5, fVar5.e);
            if (i < 0) {
                fVar.b = fVar2;
            } else {
                fVar.c = fVar2;
            }
            rebalance(fVar, true);
        } else if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
            akh.c(k.getClass().getName() + " is not Comparable");
            return new f<>(fVar, k, secondaryHash, fVar5, fVar5.e);
        } else {
            fVar2 = new f<>(fVar, k, secondaryHash, fVar5, fVar5.e);
            fVarArr[length] = fVar2;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return fVar2;
    }

    f<K, V> findByEntry(Map.Entry<?, ?> entry) {
        f<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.h, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    f<K, V> findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        f<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.keySet = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            akh.c("key == null");
            return v;
        }
        f<K, V> find = find(k, true);
        V v2 = find.h;
        find.h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.h;
        }
        return null;
    }

    void removeInternal(f<K, V> fVar, boolean z) {
        int i;
        if (z) {
            fVar.e.d = fVar.d;
            fVar.d.e = fVar.e;
            fVar.e = null;
            fVar.d = null;
        }
        f<K, V> fVar2 = fVar.b;
        f<K, V> fVar3 = fVar.c;
        f<K, V> fVar4 = fVar.f1794a;
        int i2 = 0;
        if (fVar2 == null || fVar3 == null) {
            if (fVar2 != null) {
                replaceInParent(fVar, fVar2);
                fVar.b = null;
            } else if (fVar3 != null) {
                replaceInParent(fVar, fVar3);
                fVar.c = null;
            } else {
                replaceInParent(fVar, null);
            }
            rebalance(fVar4, false);
            this.size--;
            this.modCount++;
            return;
        }
        f<K, V> b2 = fVar2.i > fVar3.i ? fVar2.b() : fVar3.a();
        removeInternal(b2, false);
        f<K, V> fVar5 = fVar.b;
        if (fVar5 != null) {
            i = fVar5.i;
            b2.b = fVar5;
            fVar5.f1794a = b2;
            fVar.b = null;
        } else {
            i = 0;
        }
        f<K, V> fVar6 = fVar.c;
        if (fVar6 != null) {
            i2 = fVar6.i;
            b2.c = fVar6;
            fVar6.f1794a = b2;
            fVar.c = null;
        }
        b2.i = Math.max(i, i2) + 1;
        replaceInParent(fVar, b2);
    }

    f<K, V> removeInternalByKey(Object obj) {
        f<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }
}

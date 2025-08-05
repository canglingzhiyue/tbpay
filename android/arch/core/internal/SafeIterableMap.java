package android.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import tb.riy;

/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    private Entry<K, V> mEnd;
    private WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap<>();
    private int mSize = 0;
    private Entry<K, V> mStart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Entry<K, V> implements Map.Entry<K, V> {
        final K mKey;
        Entry<K, V> mNext;
        Entry<K, V> mPrevious;
        final V mValue;

        Entry(K k, V v) {
            this.mKey = k;
            this.mValue = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.mKey.equals(entry.mKey) && this.mValue.equals(entry.mValue);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.mKey;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.mValue;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.mKey + "=" + this.mValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface SupportRemove<K, V> {
        void supportRemove(Entry<K, V> entry);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a<K, V> extends d<K, V> {
        a(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        @Override // android.arch.core.internal.SafeIterableMap.d
        Entry<K, V> a(Entry<K, V> entry) {
            return entry.mNext;
        }

        @Override // android.arch.core.internal.SafeIterableMap.d
        Entry<K, V> b(Entry<K, V> entry) {
            return entry.mPrevious;
        }
    }

    /* loaded from: classes2.dex */
    private static class b<K, V> extends d<K, V> {
        b(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        @Override // android.arch.core.internal.SafeIterableMap.d
        Entry<K, V> a(Entry<K, V> entry) {
            return entry.mPrevious;
        }

        @Override // android.arch.core.internal.SafeIterableMap.d
        Entry<K, V> b(Entry<K, V> entry) {
            return entry.mNext;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c implements SupportRemove<K, V>, Iterator<Map.Entry<K, V>> {
        private Entry<K, V> b;
        private boolean c;

        private c() {
            this.c = true;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Entry<K, V> entry;
            if (this.c) {
                this.c = false;
                entry = SafeIterableMap.this.mStart;
            } else {
                Entry<K, V> entry2 = this.b;
                entry = entry2 != null ? entry2.mNext : null;
            }
            this.b = entry;
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c) {
                return SafeIterableMap.this.mStart != null;
            }
            Entry<K, V> entry = this.b;
            return (entry == null || entry.mNext == null) ? false : true;
        }

        @Override // android.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
            Entry<K, V> entry2 = this.b;
            if (entry == entry2) {
                this.b = entry2.mPrevious;
                this.c = this.b == null;
            }
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class d<K, V> implements SupportRemove<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        Entry<K, V> f1046a;
        Entry<K, V> b;

        d(Entry<K, V> entry, Entry<K, V> entry2) {
            this.f1046a = entry2;
            this.b = entry;
        }

        private Entry<K, V> b() {
            Entry<K, V> entry = this.b;
            Entry<K, V> entry2 = this.f1046a;
            if (entry == entry2 || entry2 == null) {
                return null;
            }
            return a(entry);
        }

        abstract Entry<K, V> a(Entry<K, V> entry);

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Entry<K, V> entry = this.b;
            this.b = b();
            return entry;
        }

        abstract Entry<K, V> b(Entry<K, V> entry);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // android.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
            if (this.f1046a == entry && entry == this.b) {
                this.b = null;
                this.f1046a = null;
            }
            Entry<K, V> entry2 = this.f1046a;
            if (entry2 == entry) {
                this.f1046a = b(entry2);
            }
            if (this.b == entry) {
                this.b = b();
            }
        }
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.mEnd, this.mStart);
        this.mIterators.put(bVar, false);
        return bVar;
    }

    public Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    protected Entry<K, V> get(K k) {
        Entry<K, V> entry = this.mStart;
        while (entry != null && !entry.mKey.equals(k)) {
            entry = entry.mNext;
        }
        return entry;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.mStart, this.mEnd);
        this.mIterators.put(aVar, false);
        return aVar;
    }

    public SafeIterableMap<K, V>.c iteratorWithAdditions() {
        SafeIterableMap<K, V>.c cVar = new c();
        this.mIterators.put(cVar, false);
        return cVar;
    }

    public Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Entry<K, V> put(K k, V v) {
        Entry<K, V> entry = new Entry<>(k, v);
        this.mSize++;
        Entry<K, V> entry2 = this.mEnd;
        if (entry2 == null) {
            this.mStart = entry;
            this.mEnd = this.mStart;
            return entry;
        }
        entry2.mNext = entry;
        entry.mPrevious = entry2;
        this.mEnd = entry;
        return entry;
    }

    public V putIfAbsent(K k, V v) {
        Entry<K, V> entry = get(k);
        if (entry != null) {
            return entry.mValue;
        }
        put(k, v);
        return null;
    }

    public V remove(K k) {
        Entry<K, V> entry = get(k);
        if (entry == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            for (SupportRemove<K, V> supportRemove : this.mIterators.keySet()) {
                supportRemove.supportRemove(entry);
            }
        }
        if (entry.mPrevious != null) {
            entry.mPrevious.mNext = entry.mNext;
        } else {
            this.mStart = entry.mNext;
        }
        if (entry.mNext != null) {
            entry.mNext.mPrevious = entry.mPrevious;
        } else {
            this.mEnd = entry.mPrevious;
        }
        entry.mNext = null;
        entry.mPrevious = null;
        return entry.mValue;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}

package com.alibaba.ut.abtest.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.cez;
import tb.kge;

/* loaded from: classes.dex */
public class i<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f4200a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    static {
        kge.a(92463067);
    }

    public int b(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4eaa414", new Object[]{this, k, v})).intValue();
        }
        return 1;
    }

    public V c(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("45d4372c", new Object[]{this, k});
        }
        return null;
    }

    public i(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.f4200a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V a(K k) {
        V put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("9798556e", new Object[]{this, k});
        }
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f4200a.get(k);
            if (v != null) {
                this.g++;
                return v;
            }
            this.h++;
            V c = c(k);
            if (c == null) {
                return null;
            }
            synchronized (this) {
                this.e++;
                put = this.f4200a.put(k, c);
                if (put != null) {
                    this.f4200a.put(k, put);
                } else {
                    this.b += c(k, c);
                }
            }
            if (put != null) {
                return put;
            }
            a(this.c);
            return c;
        }
    }

    public final V a(K k, V v) {
        V put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("218a0212", new Object[]{this, k, v});
        }
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += c(k, v);
            put = this.f4200a.put(k, v);
            if (put != null) {
                this.b -= c(k, put);
            }
        }
        a(this.c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ut.abtest.internal.util.i.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L1a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r1[r2] = r3
            java.lang.String r5 = "a821939b"
            r0.ipc$dispatch(r5, r1)
            return
        L1a:
            monitor-enter(r4)
            int r0 = r4.b     // Catch: java.lang.Throwable -> L8a
            if (r0 < 0) goto L6b
            java.util.LinkedHashMap<K, V> r0 = r4.f4200a     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L2b
            int r0 = r4.b     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L6b
        L2b:
            int r0 = r4.b     // Catch: java.lang.Throwable -> L8a
            if (r0 <= r5) goto L69
            java.util.LinkedHashMap<K, V> r0 = r4.f4200a     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L38
            goto L69
        L38:
            java.util.LinkedHashMap<K, V> r0 = r4.f4200a     // Catch: java.lang.Throwable -> L8a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L8a
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L4c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8a
            return
        L4c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8a
            java.util.LinkedHashMap<K, V> r3 = r4.f4200a     // Catch: java.lang.Throwable -> L8a
            r3.remove(r1)     // Catch: java.lang.Throwable -> L8a
            int r3 = r4.b     // Catch: java.lang.Throwable -> L8a
            int r0 = r4.c(r1, r0)     // Catch: java.lang.Throwable -> L8a
            int r3 = r3 - r0
            r4.b = r3     // Catch: java.lang.Throwable -> L8a
            int r0 = r4.f     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + r2
            r4.f = r0     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8a
            goto L1a
        L69:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8a
            return
        L6b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L8a
            r0.append(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8a
            throw r5     // Catch: java.lang.Throwable -> L8a
        L8a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.internal.util.i.a(int):void");
    }

    public final V b(K k) {
        V remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("eeb6464d", new Object[]{this, k});
        }
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f4200a.remove(k);
            if (remove != null) {
                this.b -= c(k, remove);
            }
        }
        return remove;
    }

    public final boolean a(cez<V> cezVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e34c6f84", new Object[]{this, cezVar})).booleanValue();
        }
        if (cezVar == null) {
            return false;
        }
        synchronized (this) {
            for (Object obj : new HashSet(this.f4200a.keySet())) {
                if (cezVar.test(a((i<K, V>) obj))) {
                    b(obj);
                    z = true;
                }
            }
        }
        return z;
    }

    private int c(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("318acf15", new Object[]{this, k, v})).intValue();
        }
        int b = b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(-1);
        }
    }

    public final synchronized int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final synchronized Map<K, V> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        return new LinkedHashMap(this.f4200a);
    }

    public final synchronized String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.g + this.h;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
    }
}

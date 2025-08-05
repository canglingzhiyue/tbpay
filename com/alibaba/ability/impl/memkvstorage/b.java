package com.alibaba.ability.impl.memkvstorage;

import android.os.SystemClock;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.bfy;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b INSTANCE;
    public static final int MAX_LRU_CACHE_SIZE = 1048576;
    public static final int MAX_TTL = 100000;

    /* renamed from: a  reason: collision with root package name */
    private static final bfy f1912a;
    private static final Object b;
    private static final Map<String, a> c;
    private static final d d;

    private final LruCache<String, Object> a() {
        IpChange ipChange = $ipChange;
        return (LruCache) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("8330bd19", new Object[]{this}) : d.getValue());
    }

    private final boolean b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66fff", new Object[]{this, new Long(j)})).booleanValue() : j <= 0;
    }

    public final boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : j > ((long) 100000);
    }

    static {
        kge.a(-1099918959);
        b bVar = new b();
        INSTANCE = bVar;
        f1912a = new bfy("mega-mem-storage", 1);
        b = new Object();
        c = new LinkedHashMap();
        d = e.a(new MemStorage$lruMap$2(bVar));
    }

    private b() {
    }

    public static final /* synthetic */ bfy a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("eb6647af", new Object[]{bVar}) : f1912a;
    }

    public static final /* synthetic */ Object b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b8a8fd31", new Object[]{bVar}) : b;
    }

    public static final /* synthetic */ Map c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a632cff5", new Object[]{bVar}) : c;
    }

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Future<Object> f1913a;
        private long b;
        private final String c;
        private final Object d;
        private final boolean e;

        static {
            kge.a(801927933);
            kge.a(-1390502639);
        }

        public a(String key, Object value, boolean z) {
            q.d(key, "key");
            q.d(value, "value");
            this.c = key;
            this.d = value;
            this.e = z;
        }

        public final Object c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.d;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.b - SystemClock.elapsedRealtime();
        }

        public final void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            this.b = SystemClock.elapsedRealtime() + j;
            this.f1913a = bfy.a(b.a(b.INSTANCE), this, j, null, 4, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (b.b(b.INSTANCE)) {
                if (SystemClock.elapsedRealtime() >= this.b) {
                    b.c(b.INSTANCE).remove(this.c);
                }
                t tVar = t.INSTANCE;
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            Future<Object> future = this.f1913a;
            if (future == null) {
                return;
            }
            future.cancel(true);
        }
    }

    public final int a(String data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, data})).intValue();
        }
        q.d(data, "data");
        byte[] bytes = data.getBytes(kotlin.text.d.UTF_8);
        q.b(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes.length;
    }

    public final boolean a(String key, Object value, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("777ebca2", new Object[]{this, key, value, new Long(j), new Boolean(z)})).booleanValue();
        }
        q.d(key, "key");
        q.d(value, "value");
        if (b(j)) {
            return false;
        }
        synchronized (b) {
            if (INSTANCE.a(j)) {
                a aVar = c.get(key);
                if (aVar != null) {
                    aVar.b();
                    c.remove(key);
                }
                INSTANCE.a().put(key, value);
            } else {
                if (INSTANCE.a().get(key) != null) {
                    INSTANCE.a().remove(key);
                }
                a aVar2 = new a(key, value, z);
                a aVar3 = c.get(key);
                if (aVar3 != null) {
                    aVar3.b();
                }
                c.put(key, aVar2);
                aVar2.a(j);
            }
        }
        return true;
    }

    public static /* synthetic */ Object a(b bVar, String str, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("651b97b", new Object[]{bVar, str, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return bVar.a(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r5 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.memkvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1e
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r5)
            r1[r4] = r2
            java.lang.String r4 = "e4f24a90"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            return r4
        L1e:
            java.lang.String r0 = "key"
            kotlin.jvm.internal.q.d(r4, r0)
            java.lang.Object r0 = com.alibaba.ability.impl.memkvstorage.b.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.alibaba.ability.impl.memkvstorage.b$a> r1 = com.alibaba.ability.impl.memkvstorage.b.c     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L51
            com.alibaba.ability.impl.memkvstorage.b$a r1 = (com.alibaba.ability.impl.memkvstorage.b.a) r1     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L45
            if (r5 != 0) goto L3d
            boolean r5 = r1.d()     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L3d
            java.util.Map<java.lang.String, com.alibaba.ability.impl.memkvstorage.b$a> r5 = com.alibaba.ability.impl.memkvstorage.b.c     // Catch: java.lang.Throwable -> L51
            r5.remove(r4)     // Catch: java.lang.Throwable -> L51
        L3d:
            if (r1 == 0) goto L45
            java.lang.Object r5 = r1.c()     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L4f
        L45:
            com.alibaba.ability.impl.memkvstorage.b r5 = com.alibaba.ability.impl.memkvstorage.b.INSTANCE     // Catch: java.lang.Throwable -> L51
            android.util.LruCache r5 = r5.a()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L51
        L4f:
            monitor-exit(r0)
            return r5
        L51:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.memkvstorage.b.a(java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.memkvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L16
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            java.lang.String r4 = "c56c56fe"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            return r4
        L16:
            java.lang.String r0 = "key"
            kotlin.jvm.internal.q.d(r4, r0)
            java.lang.Object r0 = com.alibaba.ability.impl.memkvstorage.b.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.alibaba.ability.impl.memkvstorage.b$a> r1 = com.alibaba.ability.impl.memkvstorage.b.c     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L3f
            com.alibaba.ability.impl.memkvstorage.b$a r1 = (com.alibaba.ability.impl.memkvstorage.b.a) r1     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L33
            r1.b()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L33
            java.lang.Object r1 = r1.c()     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L3d
        L33:
            com.alibaba.ability.impl.memkvstorage.b r1 = com.alibaba.ability.impl.memkvstorage.b.INSTANCE     // Catch: java.lang.Throwable -> L3f
            android.util.LruCache r1 = r1.a()     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r0)
            return r1
        L3f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.memkvstorage.b.c(java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r1 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r7, long r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.memkvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L24
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r7 = 2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r8)
            r1[r7] = r2
            java.lang.String r7 = "8123b0d6"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L24:
            java.lang.String r0 = "key"
            kotlin.jvm.internal.q.d(r7, r0)
            boolean r0 = r6.b(r8)
            if (r0 == 0) goto L30
            return r3
        L30:
            java.lang.Object r0 = com.alibaba.ability.impl.memkvstorage.b.b
            monitor-enter(r0)
            com.alibaba.ability.impl.memkvstorage.b r1 = com.alibaba.ability.impl.memkvstorage.b.INSTANCE     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.a(r8)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L5e
            java.util.Map<java.lang.String, com.alibaba.ability.impl.memkvstorage.b$a> r8 = com.alibaba.ability.impl.memkvstorage.b.c     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L97
            com.alibaba.ability.impl.memkvstorage.b$a r8 = (com.alibaba.ability.impl.memkvstorage.b.a) r8     // Catch: java.lang.Throwable -> L97
            if (r8 == 0) goto L5c
            com.alibaba.ability.impl.memkvstorage.b r9 = com.alibaba.ability.impl.memkvstorage.b.INSTANCE     // Catch: java.lang.Throwable -> L97
            android.util.LruCache r9 = r9.a()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r8.c()     // Catch: java.lang.Throwable -> L97
            r9.put(r7, r1)     // Catch: java.lang.Throwable -> L97
            r8.b()     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, com.alibaba.ability.impl.memkvstorage.b$a> r9 = com.alibaba.ability.impl.memkvstorage.b.c     // Catch: java.lang.Throwable -> L97
            r9.remove(r7)     // Catch: java.lang.Throwable -> L97
            if (r8 != 0) goto L95
        L5c:
            monitor-exit(r0)
            return r3
        L5e:
            java.util.Map<java.lang.String, com.alibaba.ability.impl.memkvstorage.b$a> r1 = com.alibaba.ability.impl.memkvstorage.b.c     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L97
            com.alibaba.ability.impl.memkvstorage.b$a r1 = (com.alibaba.ability.impl.memkvstorage.b.a) r1     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L6d
            r1.a(r8)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L91
        L6d:
            com.alibaba.ability.impl.memkvstorage.b r1 = com.alibaba.ability.impl.memkvstorage.b.INSTANCE     // Catch: java.lang.Throwable -> L97
            android.util.LruCache r1 = r1.a()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L90
            com.alibaba.ability.impl.memkvstorage.b$a r4 = new com.alibaba.ability.impl.memkvstorage.b$a     // Catch: java.lang.Throwable -> L97
            r4.<init>(r7, r1, r3)     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, com.alibaba.ability.impl.memkvstorage.b$a> r5 = com.alibaba.ability.impl.memkvstorage.b.c     // Catch: java.lang.Throwable -> L97
            r5.put(r7, r4)     // Catch: java.lang.Throwable -> L97
            r4.a(r8)     // Catch: java.lang.Throwable -> L97
            com.alibaba.ability.impl.memkvstorage.b r8 = com.alibaba.ability.impl.memkvstorage.b.INSTANCE     // Catch: java.lang.Throwable -> L97
            android.util.LruCache r8 = r8.a()     // Catch: java.lang.Throwable -> L97
            r8.remove(r7)     // Catch: java.lang.Throwable -> L97
            goto L91
        L90:
            r1 = 0
        L91:
            if (r1 != 0) goto L95
            monitor-exit(r0)
            return r3
        L95:
            monitor-exit(r0)
            return r2
        L97:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.memkvstorage.b.a(java.lang.String, long):boolean");
    }

    public final long d(String key) {
        long a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e9", new Object[]{this, key})).longValue();
        }
        q.d(key, "key");
        synchronized (b) {
            a aVar = c.get(key);
            a2 = aVar != null ? aVar.a() : 0L;
        }
        return a2;
    }
}

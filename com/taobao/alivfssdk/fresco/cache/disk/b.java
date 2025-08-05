package com.taobao.alivfssdk.fresco.cache.disk;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.common.CacheEventListener;
import com.taobao.alivfssdk.fresco.cache.common.g;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.common.statfs.StatFsHelper;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import tb.dij;
import tb.dim;
import tb.din;
import tb.dio;
import tb.kge;

/* loaded from: classes.dex */
public class b implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int START_OF_VERSIONING = 1;
    public static Pattern b;
    private static final long c;
    private static final long d;
    private final long e;
    private long f;
    private long h;
    private final CacheEventListener i;
    private final long k;
    private final com.taobao.alivfssdk.fresco.cache.disk.a m;
    private final d n;
    private final CacheErrorLogger o;
    private final CountDownLatch g = new CountDownLatch(1);
    private final Object q = new Object();
    private final StatFsHelper l = StatFsHelper.a();
    private long j = -1;
    private final a p = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f8510a = new HashSet();

    /* renamed from: com.taobao.alivfssdk.fresco.cache.disk.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0335b {

        /* renamed from: a  reason: collision with root package name */
        public final long f8513a;
        public final long b;
        public final long c;

        static {
            kge.a(1509122941);
        }

        public C0335b(long j, long j2, long j3) {
            this.f8513a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public static /* synthetic */ Object a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("47542234", new Object[]{bVar}) : bVar.q;
    }

    public static /* synthetic */ void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            b(context, str);
        }
    }

    public static /* synthetic */ boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29abef03", new Object[]{bVar})).booleanValue() : bVar.e();
    }

    public static /* synthetic */ com.taobao.alivfssdk.fresco.cache.disk.a c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alivfssdk.fresco.cache.disk.a) ipChange.ipc$dispatch("1aa2f5cd", new Object[]{bVar}) : bVar.m;
    }

    public static /* synthetic */ CountDownLatch d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("bda521e7", new Object[]{bVar}) : bVar.g;
    }

    static {
        kge.a(1093462701);
        kge.a(388520157);
        kge.a(1771241726);
        c = TimeUnit.HOURS.toMillis(2L);
        d = TimeUnit.MINUTES.toMillis(30L);
        b = Pattern.compile("[^a-zA-Z0-9\\.\\-]");
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f8512a = false;
        private long b = -1;
        private long c = -1;

        static {
            kge.a(-2020139852);
        }

        public synchronized boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            return this.f8512a;
        }

        public synchronized void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.f8512a = false;
            this.c = -1L;
            this.b = -1L;
        }

        public synchronized void a(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            this.c = j2;
            this.b = j;
            this.f8512a = true;
        }

        public synchronized void b(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f80629", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            if (this.f8512a) {
                this.b += j;
                this.c += j2;
            }
        }

        public synchronized long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            return this.b;
        }

        public synchronized long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
            }
            return this.c;
        }
    }

    public b(com.taobao.alivfssdk.fresco.cache.disk.a aVar, d dVar, C0335b c0335b, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, dim dimVar, final Context context, ExecutorService executorService) {
        this.e = c0335b.b;
        this.f = c0335b.c;
        this.h = c0335b.c;
        this.m = aVar;
        this.n = dVar;
        this.i = cacheEventListener;
        this.k = c0335b.f8513a;
        this.o = cacheErrorLogger;
        executorService.execute(new Runnable() { // from class: com.taobao.alivfssdk.fresco.cache.disk.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (b.a(b.this)) {
                    b.b(b.this);
                    b.a(context, b.c(b.this).b());
                }
                b.d(b.this).countDown();
            }
        });
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.e
    public Collection<a.InterfaceC0334a> a() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.m.f();
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.e
    public dij a(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        dij dijVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dij) ipChange.ipc$dispatch("901830f1", new Object[]{this, bVar});
        }
        dio.c("DiskStorageCache", "- getResource: key=" + bVar + ", thread=" + VExecutors.currentThread());
        f a2 = new f().a(bVar);
        try {
            synchronized (this.q) {
                List<String> g = g(bVar);
                String str = null;
                dijVar = null;
                for (int i = 0; i < g.size(); i++) {
                    str = g.get(i);
                    a2.a(str);
                    dijVar = this.m.b(str, bVar, bVar);
                    if (dijVar != null) {
                        break;
                    }
                }
                if (dijVar == null) {
                    this.f8510a.remove(str);
                } else {
                    this.f8510a.add(str);
                }
            }
            return dijVar;
        } catch (IOException e) {
            this.o.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, "DiskStorageCache", "getResource", e);
            a2.a(e);
            CacheEventListener cacheEventListener = this.i;
            if (cacheEventListener != null) {
                cacheEventListener.c(a2);
            }
            return null;
        }
    }

    private a.b a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("bc8a7cd5", new Object[]{this, str, bVar});
        }
        c();
        return this.m.a(str, bVar, bVar);
    }

    private dij a(a.b bVar, com.taobao.alivfssdk.fresco.cache.common.b bVar2, String str) throws IOException {
        dij a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dij) ipChange.ipc$dispatch("103976ce", new Object[]{this, bVar, bVar2, str});
        }
        synchronized (this.q) {
            a2 = bVar.a(bVar2, bVar2);
            this.f8510a.add(str);
            this.p.b(a2.b(), 1L);
        }
        return a2;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.e
    public dij a(com.taobao.alivfssdk.fresco.cache.common.b bVar, g gVar) throws IOException {
        String f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dij) ipChange.ipc$dispatch("8fad7a6e", new Object[]{this, bVar, gVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        f a2 = new f().a(bVar);
        synchronized (this.q) {
            f = f(bVar);
        }
        a2.a(f);
        try {
            a.b a3 = a(f, bVar);
            a3.a(gVar, bVar, bVar);
            dij a4 = a(a3, bVar, f);
            a2.a(a4.b()).b(this.p.c()).d(System.currentTimeMillis() - currentTimeMillis);
            if (this.i != null) {
                this.i.b(a2);
            }
            if (!a3.a()) {
                dio.b("DiskStorageCache", "Failed to delete temp file");
            }
            return a4;
        } catch (IOException e) {
            a2.a(e);
            CacheEventListener cacheEventListener = this.i;
            if (cacheEventListener != null) {
                cacheEventListener.d(a2);
            }
            dio.b("DiskStorageCache", "Failed inserting a file into the cache", e);
            throw e;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.e
    public boolean b(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36e145b5", new Object[]{this, bVar})).booleanValue();
        }
        synchronized (this.q) {
            try {
                try {
                    List<String> g = g(bVar);
                    if (g.size() > 0) {
                        String str = g.get(0);
                        f a2 = new f().a(bVar);
                        a2.a(str);
                        long b2 = this.m.b(str, bVar);
                        this.f8510a.remove(str);
                        a2.a(b2).b(this.p.c());
                        if (b2 < 0) {
                            z = false;
                        }
                        return z;
                    }
                } catch (IOException e) {
                    CacheErrorLogger cacheErrorLogger = this.o;
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.DELETE_FILE;
                    cacheErrorLogger.a(cacheErrorCategory, "DiskStorageCache", "delete: " + e.getMessage(), e);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this.q) {
            boolean e = e();
            d();
            long c2 = this.p.c();
            if (c2 > this.h && !e) {
                this.p.b();
                e();
            }
            if (c2 > this.h) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = (this.h * 9) / 10;
                a(j, CacheEventListener.EvictionReason.CACHE_FULL);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                dio.c("DiskStorageCache", "- evictAboveSize: desiredSize=" + j + ", elapsed=" + currentTimeMillis2 + "ms");
            }
        }
    }

    private void a(long j, CacheEventListener.EvictionReason evictionReason) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd7b18b", new Object[]{this, new Long(j), evictionReason});
            return;
        }
        try {
            Collection<a.InterfaceC0334a> a2 = a(this.m.f());
            long c2 = this.p.c();
            long j2 = c2 - j;
            Iterator<a.InterfaceC0334a> it = a2.iterator();
            long j3 = 0;
            int i = 0;
            while (it.hasNext()) {
                a.InterfaceC0334a next = it.next();
                if (j3 > j2) {
                    break;
                }
                long a3 = this.m.a(next);
                Iterator<a.InterfaceC0334a> it2 = it;
                this.f8510a.remove(next.a());
                if (a3 > 0) {
                    i++;
                    j3 += a3;
                    CacheEventListener cacheEventListener = this.i;
                    if (cacheEventListener != null) {
                        cacheEventListener.a(new f().a(next.a()).a(evictionReason).a(a3).b(c2 - j3).c(j));
                    }
                }
                it = it2;
            }
            this.p.b(-j3, -i);
        } catch (IOException e) {
            CacheErrorLogger cacheErrorLogger = this.o;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
            cacheErrorLogger.a(cacheErrorCategory, "DiskStorageCache", "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    private Collection<a.InterfaceC0334a> a(Collection<a.InterfaceC0334a> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("b0ba7a4e", new Object[]{this, collection});
        }
        if (this.n == null) {
            return collection;
        }
        long currentTimeMillis = System.currentTimeMillis() + c;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (a.InterfaceC0334a interfaceC0334a : collection) {
            if (interfaceC0334a.c() > currentTimeMillis) {
                arrayList.add(interfaceC0334a);
            } else {
                arrayList2.add(interfaceC0334a);
            }
        }
        Collections.sort(arrayList2, this.n.a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.l.a(this.m.a() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, this.f - this.p.c())) {
            this.h = this.e;
        } else {
            this.h = this.f;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        synchronized (this.q) {
            try {
                this.m.c();
                this.f8510a.clear();
            } catch (IOException e) {
                CacheErrorLogger cacheErrorLogger = this.o;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
                cacheErrorLogger.a(cacheErrorCategory, "DiskStorageCache", "clearAll: " + e.getMessage(), e);
            }
            this.p.b();
        }
    }

    public boolean c(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366adfb6", new Object[]{this, bVar})).booleanValue();
        }
        synchronized (this.q) {
            List<String> g = g(bVar);
            for (int i = 0; i < g.size(); i++) {
                if (this.f8510a.contains(g.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.e
    public boolean d(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35f479b7", new Object[]{this, bVar})).booleanValue();
        }
        synchronized (this.q) {
            if (c(bVar)) {
                return true;
            }
            try {
                List<String> g = g(bVar);
                for (int i = 0; i < g.size(); i++) {
                    String str = g.get(i);
                    if (this.m.c(str, bVar, bVar)) {
                        this.f8510a.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.e
    public List<String> e(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4f6013", new Object[]{this, bVar});
        }
        synchronized (this.q) {
            List<String> g = g(bVar);
            if (g.size() <= 0) {
                return null;
            }
            return this.m.a(g.get(0));
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.p.a()) {
            long j = this.j;
            if (j != -1 && currentTimeMillis - j <= d) {
                return false;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        f();
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        dio.c("DiskStorageCache", "- maybeUpdateFileCacheSizeAndIndex: now=" + currentTimeMillis + ", elapsed=" + currentTimeMillis3 + "ms, thread=" + VExecutors.currentThread());
        this.j = currentTimeMillis;
        return true;
    }

    private void f() {
        Set<String> hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = c + currentTimeMillis;
        if (this.f8510a.isEmpty()) {
            hashSet = this.f8510a;
        } else {
            hashSet = new HashSet<>();
        }
        try {
            long j2 = -1;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            long j3 = 0;
            int i3 = 0;
            for (a.InterfaceC0334a interfaceC0334a : this.m.f()) {
                int i4 = i3 + 1;
                long d2 = j3 + interfaceC0334a.d();
                if (interfaceC0334a.c() > j) {
                    i++;
                    i2 = (int) (i2 + interfaceC0334a.d());
                    j2 = Math.max(interfaceC0334a.c() - currentTimeMillis, j2);
                    i3 = i4;
                    j3 = d2;
                    z = true;
                } else {
                    hashSet.add(interfaceC0334a.a());
                    i3 = i4;
                    j3 = d2;
                }
            }
            if (z) {
                this.o.a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, "DiskStorageCache", "Future timestamp found in " + i + " files , with a total size of " + i2 + " bytes, and a maximum time delta of " + j2 + "ms", null);
            }
            long j4 = i3;
            if (this.p.d() == j4 && this.p.c() == j3) {
                return;
            }
            if (this.f8510a != hashSet) {
                this.f8510a.clear();
                this.f8510a.addAll(hashSet);
            }
            this.p.a(j3, j4);
        } catch (IOException e) {
            this.o.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, "DiskStorageCache", "calcFileCacheSize: " + e.getMessage(), e);
        }
    }

    private static List<String> g(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a1167d1", new Object[]{bVar});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (bVar instanceof com.taobao.alivfssdk.fresco.cache.common.c) {
                List<com.taobao.alivfssdk.fresco.cache.common.b> a2 = ((com.taobao.alivfssdk.fresco.cache.common.c) bVar).a();
                for (int i = 0; i < a2.size(); i++) {
                    arrayList.add(h(a2.get(i)));
                }
            } else if (bVar instanceof com.taobao.alivfssdk.fresco.cache.common.d) {
                arrayList.add(a(bVar.toString()));
            } else {
                arrayList.add(h(bVar));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String f(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7406c78b", new Object[]{bVar});
        }
        try {
            if (bVar instanceof com.taobao.alivfssdk.fresco.cache.common.c) {
                return h(((com.taobao.alivfssdk.fresco.cache.common.c) bVar).a().get(0));
            }
            if (bVar instanceof com.taobao.alivfssdk.fresco.cache.common.d) {
                return bVar.toString();
            }
            return h(bVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String h(com.taobao.alivfssdk.fresco.cache.common.b bVar) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4865d7c9", new Object[]{bVar}) : din.a(bVar.toString().getBytes("UTF-8"));
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : b.matcher(str).replaceAll("_");
    }

    private static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else if (context == null) {
        } else {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            if (context == null) {
                return;
            }
            File file = new File((context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + "disk_entries_list" + str) + ".xml");
            try {
                if (!file.exists()) {
                    return;
                }
                file.delete();
            } catch (Exception unused) {
                dio.b("DiskStorageCache", "Fail to delete SharedPreference from file system. ");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.m.close();
        }
    }
}

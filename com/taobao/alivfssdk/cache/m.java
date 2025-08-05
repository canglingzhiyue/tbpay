package com.taobao.alivfssdk.cache;

import com.alibaba.security.realidentity.v2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.f;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import tb.dij;
import tb.dik;
import tb.dio;
import tb.kge;

/* loaded from: classes.dex */
public class m implements com.taobao.alivfssdk.fresco.cache.disk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f8498a;
    private final boolean b;
    private final boolean c;
    private final File d;
    private final CacheErrorLogger e;
    private com.taobao.alivfsadapter.e f;

    static {
        kge.a(-931270621);
        kge.a(-1320177195);
    }

    private static boolean a(File file, CacheErrorLogger cacheErrorLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0ca675", new Object[]{file, cacheErrorLogger})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public /* synthetic */ Collection f() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("fabc0fa", new Object[]{this}) : d();
    }

    public m(File file, int i, boolean z, CacheErrorLogger cacheErrorLogger) {
        com.taobao.alivfssdk.fresco.common.internal.c.a(file);
        this.f8498a = file;
        this.c = z;
        this.b = a(file, cacheErrorLogger);
        this.d = new File(this.f8498a, a(i));
        this.e = cacheErrorLogger;
        g();
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : String.format(null, "%s.sqlite.%d", v2.d, Integer.valueOf(i));
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String absolutePath = this.f8498a.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.f8498a.exists()) {
            if (!this.d.exists()) {
                com.taobao.alivfssdk.fresco.common.file.a.b(this.f8498a);
            } else {
                z = false;
            }
        }
        if (!z) {
            return;
        }
        try {
            FileUtils.a(this.d);
        } catch (FileUtils.CreateDirectoryException unused) {
            CacheErrorLogger cacheErrorLogger = this.e;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
            cacheErrorLogger.a(cacheErrorCategory, "SQLiteDefaultDiskStorage", "version directory could not be created: " + this.d, null);
        }
    }

    public f a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("67e8fb5f", new Object[]{this, str, bVar});
        }
        try {
            return f.a(e(), str, bVar);
        } catch (IOException e) {
            dio.b("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return null;
        }
    }

    private void a(File file, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbe2fe9", new Object[]{this, file, str});
            return;
        }
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.e.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, "SQLiteDefaultDiskStorage", str, e);
            throw e;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public a.b a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("6741b5f9", new Object[]{this, str, bVar, obj}) : new b(str, bVar);
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public dij b(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dij) ipChange.ipc$dispatch("fd874b6a", new Object[]{this, str, bVar, obj});
        }
        try {
            f a2 = f.a(e(), str, bVar);
            if (a2 != null && a2.c != null) {
                return new dik(a2.c);
            }
            return null;
        } catch (IOException e) {
            dio.b("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return null;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public boolean c(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d0ee4dc", new Object[]{this, str, bVar, obj})).booleanValue() : a(str, bVar, false);
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        try {
            return f.a(e(), str);
        } catch (IOException e) {
            dio.b("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return null;
        }
    }

    private boolean a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ab8bd9e", new Object[]{this, str, bVar, new Boolean(z)})).booleanValue();
        }
        f a2 = a(str, bVar);
        boolean z2 = a2 != null;
        if (z && z2) {
            try {
                a2.a(e(), System.currentTimeMillis());
            } catch (IOException e) {
                dio.b("SQLiteDefaultDiskStorage", e.getMessage(), e);
            }
        }
        return z2;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public long a(a.InterfaceC0334a interfaceC0334a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c02b0b6", new Object[]{this, interfaceC0334a})).longValue() : a(((a) interfaceC0334a).b());
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public long b(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1a002f", new Object[]{this, str, bVar})).longValue() : a(new f(str, bVar));
    }

    private long a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32c2f35f", new Object[]{this, fVar})).longValue();
        }
        try {
            if (!fVar.e(e())) {
                return -1L;
            }
            return fVar.d;
        } catch (IOException e) {
            dio.b("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return -1L;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public void c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f.d(e());
        }
    }

    public List<a.InterfaceC0334a> d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        f[] c = f.c(e());
        f[] c2 = f.c(e());
        ArrayList arrayList = new ArrayList();
        for (f fVar : c) {
            arrayList.add(new a(fVar.f8492a, fVar));
        }
        for (f fVar2 : c2) {
            arrayList.add(new a(fVar2.f8492a, fVar2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0334a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f8499a;
        private final f b;
        private long c;
        private long d;

        static {
            kge.a(-2008760751);
            kge.a(-1375417149);
        }

        private a(String str, f fVar) {
            com.taobao.alivfssdk.fresco.common.internal.c.a(fVar);
            this.f8499a = (String) com.taobao.alivfssdk.fresco.common.internal.c.a(str);
            this.b = fVar;
            this.c = -1L;
            this.d = -1L;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.InterfaceC0334a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f8499a;
        }

        public f b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6c39c650", new Object[]{this}) : this.b;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.InterfaceC0334a
        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            if (this.d < 0) {
                this.d = this.b.e;
            }
            return this.d;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.InterfaceC0334a
        public long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
            }
            if (this.c < 0) {
                this.c = this.b.d;
            }
            return this.c;
        }
    }

    /* loaded from: classes.dex */
    public class b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final f f8500a;
        private final String c;

        static {
            kge.a(1487779687);
            kge.a(1571263285);
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public b(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
            this.c = str;
            this.f8500a = new f(str, bVar);
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public void a(com.taobao.alivfssdk.fresco.cache.common.g gVar, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6cbe96f", new Object[]{this, gVar, bVar, obj});
                return;
            }
            f fVar = this.f8500a;
            fVar.getClass();
            OutputStream aVar = new f.a();
            try {
                aVar = gVar.a(aVar);
                aVar.flush();
            } finally {
                aVar.close();
            }
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public dij a(com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dij) ipChange.ipc$dispatch("53c2fd95", new Object[]{this, bVar, obj});
            }
            this.f8500a.e = System.currentTimeMillis();
            this.f8500a.b(m.this.e());
            return new dik(this.f8500a.c);
        }
    }

    public com.taobao.alivfsadapter.e e() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alivfsadapter.e) ipChange.ipc$dispatch("9993beec", new Object[]{this});
        }
        if (this.f == null) {
            if (!this.d.exists()) {
                a(this.d, "getDataBase");
            }
            if (this.c) {
                String absolutePath = new File(this.d, "alivfs_encrypt.sqlite").getAbsolutePath();
                try {
                    String replace = b().replace('-', '_');
                    com.taobao.alivfsadapter.d c = com.taobao.alivfsadapter.b.a().c();
                    this.f = c.a(absolutePath, replace + "_Encrypt", 1);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            } else {
                try {
                    this.f = com.taobao.alivfsadapter.b.a().c().a(new File(this.d, "alivfs.sqlite").getAbsolutePath(), 1);
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            }
            f.a(this.f);
        }
        return this.f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f == null) {
        } else {
            this.f = null;
        }
    }
}

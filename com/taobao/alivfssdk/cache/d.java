package com.taobao.alivfssdk.cache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfsadapter.g;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.common.CacheEventListener;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.cache.disk.b;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.dij;
import tb.dio;
import tb.kge;

/* loaded from: classes.dex */
public class d extends com.taobao.alivfssdk.cache.a implements CacheErrorLogger, CacheEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f8484a;
    private final com.taobao.alivfssdk.fresco.cache.disk.e b;
    private final b c;
    private j<com.taobao.alivfssdk.fresco.cache.common.b, byte[]> d;

    static {
        kge.a(1998588105);
        kge.a(1416316071);
        kge.a(1352952625);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheEventListener
    public boolean a(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37573755", new Object[]{this, aVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ b a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("de5b6590", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ j b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("5cbc6a67", new Object[]{dVar}) : dVar.d;
    }

    public d(b bVar, String str, com.taobao.alivfssdk.fresco.cache.disk.a aVar, b.C0335b c0335b, int i) {
        this.c = bVar;
        this.f8484a = str;
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(new com.taobao.android.virtual_thread.face.h() { // from class: com.taobao.alivfssdk.cache.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return "AVFSDiskCache #" + d.a(d.this).d();
            }
        });
        if (newSingleThreadExecutor instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newSingleThreadExecutor;
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        this.b = new com.taobao.alivfssdk.fresco.cache.disk.b(aVar, null, c0335b, this, this, null, AVFSCacheManager.getInstance().getContext(), newSingleThreadExecutor);
        if (i > 0) {
            this.d = new g<com.taobao.alivfssdk.fresco.cache.common.b, byte[]>(i, 0.2f) { // from class: com.taobao.alivfssdk.cache.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.cache.g
                public int a(byte[] bArr) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue() : bArr.length;
                }
            };
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        try {
            Collection<a.InterfaceC0334a> a2 = this.b.a();
            HashSet hashSet = new HashSet(a2.size());
            for (a.InterfaceC0334a interfaceC0334a : a2) {
                hashSet.add(interfaceC0334a.a());
            }
            return hashSet;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : a(str, str2, 0);
    }

    public boolean a(String str, String str2, int i) {
        com.taobao.alivfssdk.fresco.cache.common.b fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba950b", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (i == 268435456) {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.d(str, str2);
        } else {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.f(str, str2);
        }
        return this.b.d(fVar);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("4f41c855", new Object[]{this, str, str2}) : (T) a(str, str2, (Class<Object>) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164 A[Catch: all -> 0x01b7, TryCatch #13 {all -> 0x01b7, blocks: (B:12:0x0040, B:21:0x0055, B:23:0x005f, B:42:0x00b0, B:56:0x00d8, B:57:0x00dc, B:58:0x00e0, B:60:0x00f2, B:66:0x010d, B:67:0x012f, B:69:0x0131, B:70:0x0154, B:75:0x015a, B:77:0x0164, B:78:0x017c, B:83:0x0186, B:85:0x0190, B:86:0x01ab), top: B:106:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190 A[Catch: all -> 0x01b7, TryCatch #13 {all -> 0x01b7, blocks: (B:12:0x0040, B:21:0x0055, B:23:0x005f, B:42:0x00b0, B:56:0x00d8, B:57:0x00dc, B:58:0x00e0, B:60:0x00f2, B:66:0x010d, B:67:0x012f, B:69:0x0131, B:70:0x0154, B:75:0x015a, B:77:0x0164, B:78:0x017c, B:83:0x0186, B:85:0x0190, B:86:0x01ab), top: B:106:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T a(java.lang.String r17, java.lang.String r18, java.lang.Class<T> r19, int r20) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.alivfssdk.cache.d.a(java.lang.String, java.lang.String, java.lang.Class, int):java.lang.Object");
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T a(String str, String str2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2686b011", new Object[]{this, str, str2, cls}) : (T) a(str, str2, (Class<Object>) cls, 0);
    }

    private void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        com.taobao.alivfsadapter.f d = com.taobao.alivfsadapter.b.a().d();
        if (d == null) {
            return;
        }
        d.a(this.c.d(), z);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public List<String> f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f186af0", new Object[]{this, str}) : a(str, 0);
    }

    public List<String> a(String str, int i) {
        com.taobao.alivfssdk.fresco.cache.common.b fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82a24116", new Object[]{this, str, new Integer(i)});
        }
        if (i == 268435456) {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.d(str, null);
        } else {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.f(str, null);
        }
        System.currentTimeMillis();
        try {
            List<String> e = this.b.e(fVar);
            System.currentTimeMillis();
            return e;
        } catch (Exception e2) {
            dio.a("AVFSCache", e2, new Object[0]);
            return null;
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, final Object obj, int i) {
        final com.taobao.alivfssdk.fresco.cache.common.b fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e19a7af", new Object[]{this, str, str2, obj, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (obj == null) {
            return c(str, str2);
        }
        if (i == 268435456) {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.d(str, str2);
        } else {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.f(str, str2);
        }
        try {
            this.b.a(fVar, new com.taobao.alivfssdk.fresco.cache.common.g() { // from class: com.taobao.alivfssdk.cache.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.fresco.cache.common.g
                public OutputStream a(OutputStream outputStream) throws IOException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (OutputStream) ipChange2.ipc$dispatch("b0cdf92e", new Object[]{this, outputStream});
                    }
                    ObjectOutputStream objectOutputStream = d.b(d.this) != null ? new ObjectOutputStream(new BufferedOutputStream(outputStream) { // from class: com.taobao.alivfssdk.cache.d.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;
                        private final ByteArrayOutputStream b = new ByteArrayOutputStream();

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                            int hashCode = str3.hashCode();
                            if (hashCode == -683656483) {
                                super.write(((Number) objArr[0]).intValue());
                                return null;
                            } else if (hashCode == -483678593) {
                                super.close();
                                return null;
                            } else if (hashCode != 462729549) {
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                            } else {
                                super.write((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                                return null;
                            }
                        }

                        @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
                        public synchronized void write(byte[] bArr, int i2, int i3) throws IOException {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i2), new Integer(i3)});
                                return;
                            }
                            this.b.write(bArr, i2, i3);
                            super.write(bArr, i2, i3);
                        }

                        @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
                        public synchronized void write(int i2) throws IOException {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d7403add", new Object[]{this, new Integer(i2)});
                                return;
                            }
                            this.b.write(i2);
                            super.write(i2);
                        }

                        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("e32ba67f", new Object[]{this});
                                return;
                            }
                            d.b(d.this).a(fVar, this.b.toByteArray());
                            super.close();
                        }
                    }) : new ObjectOutputStream(new BufferedOutputStream(outputStream));
                    objectOutputStream.writeObject(obj);
                    return objectOutputStream;
                }
            });
            return true;
        } catch (Exception e) {
            dio.a("AVFSCache", e, new Object[0]);
            return false;
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue() : b(str, str2, 0);
    }

    public boolean b(String str, String str2, int i) {
        com.taobao.alivfssdk.fresco.cache.common.b fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("551fca2a", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (i == 268435456) {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.d(str, str2);
        } else {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.f(str, str2);
        }
        j<com.taobao.alivfssdk.fresco.cache.common.b, byte[]> jVar = this.d;
        if (jVar != null) {
            jVar.b(fVar);
        }
        return this.b.b(fVar);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        j<com.taobao.alivfssdk.fresco.cache.common.b, byte[]> jVar = this.d;
        if (jVar != null) {
            jVar.a();
        }
        this.b.b();
        return true;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public InputStream d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("f7041402", new Object[]{this, str, str2}) : c(str, str2, 0);
    }

    public InputStream c(String str, String str2, int i) {
        com.taobao.alivfssdk.fresco.cache.common.b fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("ae6e5c8", new Object[]{this, str, str2, new Integer(i)});
        }
        if (str == null) {
            return null;
        }
        if (i == 268435456) {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.d(str, str2);
        } else {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.f(str, str2);
        }
        System.currentTimeMillis();
        try {
            dij a2 = this.b.a(fVar);
            System.currentTimeMillis();
            if (a2 != null) {
                dio.c("AVFSCache", "- inputStreamForKey: moduleName=" + this.c.d() + ", key1=" + str + ", key2=" + str2);
                return a2.a();
            }
        } catch (IOException e) {
            dio.a("AVFSCache", e, new Object[0]);
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, InputStream inputStream, int i) {
        com.taobao.alivfssdk.fresco.cache.common.b fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1a0350", new Object[]{this, str, str2, inputStream, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (i == 268435456) {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.d(str, str2);
        } else {
            fVar = new com.taobao.alivfssdk.fresco.cache.common.f(str, str2);
        }
        try {
            System.currentTimeMillis();
            this.b.a(fVar, com.taobao.alivfssdk.fresco.cache.common.h.a(inputStream));
            System.currentTimeMillis();
            return true;
        } catch (Exception e) {
            dio.a("AVFSCache", e, new Object[0]);
            return false;
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public long e(String str, String str2) {
        dij a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb83974", new Object[]{this, str, str2})).longValue();
        }
        if (str != null && (a2 = this.b.a(new com.taobao.alivfssdk.fresco.cache.common.f(str, str2))) != null) {
            return a2.b();
        }
        return -1L;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        j<com.taobao.alivfssdk.fresco.cache.common.b, byte[]> jVar = this.d;
        if (jVar == null) {
            return;
        }
        jVar.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        c();
        com.taobao.alivfssdk.fresco.cache.disk.e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.close();
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheEventListener
    public void b(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e0d152", new Object[]{this, aVar});
            return;
        }
        com.taobao.alivfsadapter.f d = com.taobao.alivfsadapter.b.a().d();
        if (d == null) {
            return;
        }
        d.a(g("write").a(aVar.a()).a());
    }

    public g.a g(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (g.a) ipChange.ipc$dispatch("9c5acc81", new Object[]{this, str});
        }
        String d = this.c.d();
        String str2 = this.f8484a;
        if (this.d == null) {
            z = false;
        }
        return com.taobao.alivfsadapter.g.a(d, str2, z).b(str);
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheEventListener
    public void c(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366a6b53", new Object[]{this, aVar});
            return;
        }
        com.taobao.alivfsadapter.f d = com.taobao.alivfsadapter.b.a().d();
        if (d == null) {
            return;
        }
        d.a(g("read").a(-2).a(aVar.b().getMessage()).a());
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheEventListener
    public void d(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f40554", new Object[]{this, aVar});
            return;
        }
        com.taobao.alivfsadapter.f d = com.taobao.alivfsadapter.b.a().d();
        if (d == null) {
            return;
        }
        d.a(g("write").a(-2).a(aVar.b().getMessage()).a());
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger
    public void a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544b1d21", new Object[]{this, cacheErrorCategory, str, str2, th});
        } else {
            dio.a("AVFSCache", th, new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends ObjectInputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ClassLoader f8490a;

        static {
            kge.a(-76759056);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1072899230) {
                return super.resolveClass((ObjectStreamClass) objArr[0]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(InputStream inputStream, ClassLoader classLoader) throws StreamCorruptedException, IOException {
            super(inputStream);
            this.f8490a = classLoader;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Class) ipChange.ipc$dispatch("3ff3249e", new Object[]{this, objectStreamClass});
            }
            try {
                return super.resolveClass(objectStreamClass);
            } catch (ClassNotFoundException unused) {
                return Class.forName(objectStreamClass.getName(), false, this.f8490a);
            }
        }
    }
}

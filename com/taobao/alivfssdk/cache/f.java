package com.taobao.alivfssdk.cache;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import tb.dio;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f8492a;
    public String b;
    public byte[] c;
    public long d;
    public long e;

    static {
        kge.a(1242118381);
    }

    public f(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        this.f8492a = str;
        if (bVar instanceof com.taobao.alivfssdk.fresco.cache.common.f) {
            com.taobao.alivfssdk.fresco.cache.common.f fVar = (com.taobao.alivfssdk.fresco.cache.common.f) bVar;
            if (!TextUtils.isEmpty(fVar.b)) {
                this.b = fVar.b;
                return;
            }
        }
        String str2 = this.b;
        this.b = str2 == null ? "" : str2;
    }

    public f() {
    }

    public static void a(com.taobao.alivfsadapter.e eVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944a842a", new Object[]{eVar});
            return;
        }
        try {
            eVar.b("CREATE TABLE IF NOT EXISTS AVFS_KV_TABLE(key TEXT, key2 TEXT, value BLOB, size INTEGER, time INTEGER, PRIMARY KEY(key, key2));");
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public void b(com.taobao.alivfsadapter.e eVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1222402b", new Object[]{this, eVar});
        } else if (this.f8492a == null) {
            throw new IllegalArgumentException("key cannot be null");
        } else {
            if (this.c == null) {
                throw new IllegalArgumentException("value cannot be null");
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                eVar.b("REPLACE INTO AVFS_KV_TABLE VALUES(?,?,?,?,?)", a());
                String str = "save: " + (System.currentTimeMillis() - currentTimeMillis) + "ms";
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    public boolean a(com.taobao.alivfsadapter.e eVar, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f50677de", new Object[]{this, eVar, new Long(j)})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean b = eVar.b("UPDATE AVFS_KV_TABLE SET time = ? WHERE key = ? AND key2 = ?", new Object[]{Long.valueOf(j), this.f8492a, this.b});
            if (b) {
                this.e = j;
            }
            String str = "updateReadTime:" + (System.currentTimeMillis() - currentTimeMillis) + " ms ";
            return b;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.alivfssdk.cache.f[] c(com.taobao.alivfsadapter.e r5) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.alivfssdk.cache.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "4622d74"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.taobao.alivfssdk.cache.f[] r5 = (com.taobao.alivfssdk.cache.f[]) r5
            return r5
        L15:
            long r0 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "SELECT * FROM AVFS_KV_TABLE"
            com.taobao.alivfsadapter.c r3 = r5.a(r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r3 == 0) goto L3a
            boolean r5 = r3.b()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r5 == 0) goto L3a
        L2d:
            com.taobao.alivfssdk.cache.f r5 = a(r3)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r2.add(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            boolean r5 = r3.b()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r5 != 0) goto L2d
        L3a:
            if (r3 == 0) goto L3f
            r3.a()
        L3f:
            int r5 = r2.size()
            com.taobao.alivfssdk.cache.f[] r5 = new com.taobao.alivfssdk.cache.f[r5]
            r2.toArray(r5)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getItems: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "ms"
            r0.append(r1)
            r0.toString()
            return r5
        L65:
            r5 = move-exception
            goto L6e
        L67:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L65
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L65
            throw r0     // Catch: java.lang.Throwable -> L65
        L6e:
            if (r3 == 0) goto L73
            r3.a()
        L73:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.alivfssdk.cache.f.c(com.taobao.alivfsadapter.e):com.taobao.alivfssdk.cache.f[]");
    }

    public static f a(com.taobao.alivfsadapter.e eVar, String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) throws IOException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("40652a5d", new Object[]{eVar, str, bVar});
        }
        if (bVar instanceof com.taobao.alivfssdk.fresco.cache.common.f) {
            com.taobao.alivfssdk.fresco.cache.common.f fVar = (com.taobao.alivfssdk.fresco.cache.common.f) bVar;
            if (!TextUtils.isEmpty(fVar.b)) {
                str2 = fVar.b;
                return a(eVar, str, str2);
            }
        }
        str2 = "";
        return a(eVar, str, str2);
    }

    public static f a(com.taobao.alivfsadapter.e eVar, String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("9cedda1b", new Object[]{eVar, str, str2});
        }
        com.taobao.alivfsadapter.c cVar = null;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                com.taobao.alivfsadapter.c a2 = eVar.a("SELECT  * FROM AVFS_KV_TABLE WHERE key = ? AND key2 = ? LIMIT 1", new Object[]{str, str2});
                try {
                    String str3 = "get: " + (System.currentTimeMillis() - currentTimeMillis) + "ms";
                    if (a2 == null || !a2.b()) {
                        dio.a("AVFSSQLiteCacheItem", "No item found to select.");
                        if (a2 != null) {
                            a2.a();
                        }
                        return null;
                    }
                    f a3 = a(a2);
                    if (a2 != null) {
                        a2.a();
                    }
                    return a3;
                } catch (Exception e) {
                    e = e;
                    dio.a("AVFSSQLiteCacheItem", e, "Error encountered on selecting the key=" + str);
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    cVar = a2;
                    if (cVar != null) {
                        cVar.a();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> a(com.taobao.alivfsadapter.e r6, java.lang.String r7) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.alivfssdk.cache.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "9a0ec453"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.util.List r6 = (java.util.List) r6
            return r6
        L18:
            java.lang.System.currentTimeMillis()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r4 = "SELECT key2 FROM AVFS_KV_TABLE WHERE key = ?"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r5[r3] = r7     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            com.taobao.alivfsadapter.c r1 = r6.a(r4, r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r1 == 0) goto L49
            boolean r6 = r1.b()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r6 == 0) goto L49
        L36:
            java.lang.String r6 = r1.b(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r4 != 0) goto L43
            r0.add(r6)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
        L43:
            boolean r6 = r1.b()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r6 != 0) goto L36
        L49:
            if (r1 == 0) goto L4e
            r1.a()
        L4e:
            return r0
        L4f:
            r6 = move-exception
            goto L72
        L51:
            r6 = move-exception
            java.lang.String r0 = "AVFSSQLiteCacheItem"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "Error encountered on extendsKeysForKey the key="
            r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            r4.append(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            r2[r3] = r7     // Catch: java.lang.Throwable -> L4f
            tb.dio.a(r0, r6, r2)     // Catch: java.lang.Throwable -> L4f
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L4f
            throw r7     // Catch: java.lang.Throwable -> L4f
        L72:
            if (r1 == 0) goto L77
            r1.a()
        L77:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.alivfssdk.cache.f.a(com.taobao.alivfsadapter.e, java.lang.String):java.util.List");
    }

    public static boolean d(com.taobao.alivfsadapter.e eVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd1b831", new Object[]{eVar})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean b = eVar.b("DELETE FROM AVFS_KV_TABLE");
            String str = "delete: " + (System.currentTimeMillis() - currentTimeMillis) + "ms";
            return b;
        } catch (Exception e) {
            dio.a("AVFSSQLiteCacheItem", e, "Error encountered on deleteAll the TABLE=AVFS_KV_TABLE");
            throw new IOException(e);
        }
    }

    public boolean e(com.taobao.alivfsadapter.e eVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba97432", new Object[]{this, eVar})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean b = eVar.b("DELETE FROM AVFS_KV_TABLE WHERE key = ? AND key2 = ?", new Object[]{this.f8492a, this.b});
            String str = "delete: " + (System.currentTimeMillis() - currentTimeMillis) + "ms";
            return b;
        } catch (Exception e) {
            dio.a("AVFSSQLiteCacheItem", e, "Error encountered on selecting the key=" + this.f8492a);
            throw new IOException(e);
        }
    }

    private static f a(com.taobao.alivfsadapter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("3f91e1ad", new Object[]{cVar});
        }
        f fVar = new f();
        fVar.f8492a = cVar.b(0);
        fVar.b = cVar.b(1);
        fVar.c = cVar.c(2);
        fVar.d = cVar.a(3);
        fVar.e = cVar.a(4);
        return fVar;
    }

    private Object[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("d4ae18c9", new Object[]{this}) : new Object[]{this.f8492a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e)};
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.d != fVar.d || this.e != fVar.e) {
            return false;
        }
        String str = this.f8492a;
        if (str == null ? fVar.f8492a != null : !str.equals(fVar.f8492a)) {
            return false;
        }
        return Arrays.equals(this.c, fVar.c);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f8492a;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return (((((i * 31) + Arrays.hashCode(this.c)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1610715163);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -578249333) {
                super.flush();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
                return;
            }
            super.flush();
            f.this.c = toByteArray();
            f.this.d = size();
        }
    }
}

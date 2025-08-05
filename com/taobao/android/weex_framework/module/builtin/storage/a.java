package com.taobao.android.weex_framework.module.builtin.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.storage.b;
import com.taobao.android.weex_framework.util.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f16047a;

    /* renamed from: com.taobao.android.weex_framework.module.builtin.storage.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C0619a {

        /* renamed from: a  reason: collision with root package name */
        public String f16055a;

        static {
            kge.a(2101063135);
        }

        public C0619a() {
        }
    }

    static {
        kge.a(-218956064);
        kge.a(-483146371);
    }

    public static /* synthetic */ long a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c31dc91", new Object[]{aVar})).longValue() : aVar.c();
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cece8e59", new Object[]{aVar, str}) : aVar.b(str);
    }

    public static /* synthetic */ boolean a(a aVar, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce051975", new Object[]{aVar, str, str2, new Boolean(z), new Boolean(z2)})).booleanValue() : aVar.a(str, str2, z, z2);
    }

    public static /* synthetic */ List b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2b48ede9", new Object[]{aVar}) : aVar.d();
    }

    public static /* synthetic */ Map b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a1a4af1d", new Object[]{aVar, str}) : aVar.c(str);
    }

    public static /* synthetic */ c c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9ed9de4a", new Object[]{aVar}) : aVar.f16047a;
    }

    public static /* synthetic */ boolean c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b12dacad", new Object[]{aVar, str})).booleanValue() : aVar.d(str);
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            AsyncTask.SERIAL_EXECUTOR.execute(runnable);
        }
    }

    public a(Context context) {
        this.f16047a = new c(context);
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public String a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        final C0619a c0619a = new C0619a();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c0619a.f16055a = a.a(a.this, str);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return c0619a.f16055a;
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void a(final String str, final String str2, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5184b033", new Object[]{this, str, str2, aVar});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, Object> a2 = e.a(a.a(a.this, str, str2, false, true));
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(a2);
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void a(final String str, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba2f469", new Object[]{this, str, aVar});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, Object> a2 = e.a(a.a(a.this, str));
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(a2);
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void b(final String str, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238f61ea", new Object[]{this, str, aVar});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(a.b(a.this, str));
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void c(final String str, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7bcf6b", new Object[]{this, str, aVar});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, Object> b = e.b(a.c(a.this, str));
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(b);
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void a(final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b6fa1f", new Object[]{this, aVar});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, Object> a2 = e.a(a.a(a.this));
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(a2);
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void b(final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337875e0", new Object[]{this, aVar});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, Object> a2 = e.a(a.b(a.this));
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(a2);
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void b(final String str, final String str2, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94eb1f74", new Object[]{this, str, str2, aVar});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, Object> a2 = e.a(a.a(a.this, str, str2, true, true));
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(a2);
                }
            });
        }
    }

    @Override // com.taobao.android.weex_framework.module.builtin.storage.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(new Runnable() { // from class: com.taobao.android.weex_framework.module.builtin.storage.a.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        a.c(a.this).c();
                    } catch (Exception e) {
                        g.f("mus_storage", e.getMessage());
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.text.SimpleDateFormat] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.storage.a.a(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b() {
        /*
            r14 = this;
            java.lang.String r0 = "mus_storage"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.weex_framework.module.builtin.storage.a.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1b
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r14
            java.lang.String r2 = "57a83ed"
            java.lang.Object r0 = r1.ipc$dispatch(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            com.taobao.android.weex_framework.module.builtin.storage.c r1 = r14.f16047a
            android.database.sqlite.SQLiteDatabase r5 = r1.a()
            if (r5 != 0) goto L24
            return r3
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "persistent"
            java.lang.String r13 = "key"
            java.lang.String[] r7 = new java.lang.String[]{r13, r2}
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r6 = "default_wx_storage"
            java.lang.String r12 = "timestamp ASC"
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)
            int r6 = r5.getCount()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            int r6 = r6 / 10
            r7 = 0
        L46:
            boolean r8 = r5.moveToNext()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L73
            if (r8 == 0) goto L6d
            int r8 = r5.getColumnIndex(r13)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L73
            java.lang.String r8 = r5.getString(r8)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L73
            int r9 = r5.getColumnIndex(r2)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L73
            int r9 = r5.getInt(r9)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L73
            if (r9 != r4) goto L60
            r9 = 1
            goto L61
        L60:
            r9 = 0
        L61:
            if (r9 != 0) goto L46
            if (r8 == 0) goto L46
            int r7 = r7 + 1
            r1.add(r8)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L73
            if (r7 == r6) goto L6d
            goto L46
        L6d:
            r5.close()
            goto L90
        L71:
            r2 = move-exception
            goto L77
        L73:
            r0 = move-exception
            goto Lc2
        L75:
            r2 = move-exception
            r7 = 0
        L77:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r6.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = "DefaultWXStorage occurred an exception when execute trimToSize:"
            r6.append(r8)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L73
            r6.append(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L73
            com.taobao.android.weex_framework.util.g.f(r0, r2)     // Catch: java.lang.Throwable -> L73
            goto L6d
        L90:
            if (r7 > 0) goto L93
            return r3
        L93:
            java.util.Iterator r1 = r1.iterator()
        L97:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r14.d(r2)
            goto L97
        La7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "remove "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " items by lru"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.taobao.android.weex_framework.util.g.f(r0, r1)
            return r4
        Lc2:
            r5.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.storage.a.b():boolean");
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        SQLiteDatabase a2 = this.f16047a.a();
        if (a2 == null) {
            return null;
        }
        Cursor query = a2.query("default_wx_storage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToNext()) {
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", c.f16056a.format(new Date()));
            int update = this.f16047a.a().update("default_wx_storage", contentValues, "key= ?", new String[]{str});
            StringBuilder sb = new StringBuilder();
            sb.append("update timestamp ");
            sb.append(update == 1 ? "success" : "failed");
            sb.append(" for operation [getItem(key = ");
            sb.append(str);
            sb.append(")]");
            g.a("mus_storage", sb.toString());
            return query.getString(query.getColumnIndex("value"));
        } catch (Exception e) {
            g.f("mus_storage", "DefaultWXStorage occurred an exception when execute getItem:" + e.getMessage());
            return null;
        } finally {
            query.close();
        }
    }

    private Map<String, Object> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        SQLiteDatabase a2 = this.f16047a.a();
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Cursor query = a2.query("default_wx_storage", new String[]{"key", "value"}, "key like ?", new String[]{str + riy.MOD}, null, null, null);
        while (query.moveToNext()) {
            try {
                hashMap.put(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("value")));
            } catch (Exception e) {
                g.f("mus_storage", "DefaultWXStorage occurred an exception when execute getAllKeys:" + e.getMessage());
                return hashMap;
            } finally {
                query.close();
            }
        }
        return hashMap;
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        SQLiteDatabase a2 = this.f16047a.a();
        if (a2 == null) {
            return false;
        }
        try {
            return a2.delete("default_wx_storage", "key=?", new String[]{str}) == 1;
        } catch (Exception e) {
            g.f("mus_storage", "DefaultWXStorage occurred an exception when execute removeItem:" + e.getMessage());
            return false;
        }
    }

    private long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        SQLiteDatabase a2 = this.f16047a.a();
        if (a2 == null) {
            return 0L;
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                sQLiteStatement = a2.compileStatement("SELECT count(key) FROM default_wx_storage");
                long simpleQueryForLong = sQLiteStatement.simpleQueryForLong();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                return simpleQueryForLong;
            } catch (Exception e) {
                g.f("mus_storage", "DefaultWXStorage occurred an exception when execute getLength:" + e.getMessage());
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                return 0L;
            }
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }

    private List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        SQLiteDatabase a2 = this.f16047a.a();
        if (a2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = a2.query("default_wx_storage", new String[]{"key"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(query.getString(query.getColumnIndex("key")));
            } catch (Exception e) {
                g.f("mus_storage", "DefaultWXStorage occurred an exception when execute getAllKeys:" + e.getMessage());
                return arrayList;
            } finally {
                query.close();
            }
        }
        return arrayList;
    }
}

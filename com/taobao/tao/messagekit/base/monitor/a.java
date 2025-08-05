package com.taobao.tao.messagekit.base.monitor;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.alibaba.ability.impl.file.FileAbility;
import com.alibaba.security.realidentity.v2;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.olw;
import tb.omf;
import tb.omg;
import tb.riy;

/* loaded from: classes8.dex */
public abstract class a implements olw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COL_CONTENT = "content";
    public static final String COL_EXT1 = "ext1";
    public static final String COL_EXT2 = "ext2";
    public static final String COL_ID = "id";
    public static final String COL_KEY = "key";
    public static final String COL_TYPE_ID = "type_id";

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f20757a;
    private Map<Long, b> b = new HashMap();

    static {
        kge.a(960669916);
        kge.a(1712074463);
        f20757a = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e46b02", new Object[]{sQLiteDatabase, new Integer(i)});
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + b(i) + riy.BRACKET_START_STR + "id VARCHAR(128) not null,key INTEGER not null," + COL_TYPE_ID + " INTEGER,content TEXT,ext1 TEXT,ext2 TEXT);");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208412e2", new Object[]{sQLiteDatabase, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i2 >= 4) {
        } else {
            MsgLog.c(c.TAG, Integer.valueOf(i), i2 + "upgradeTable >>" + i3);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + b(i) + ";");
            a(sQLiteDatabase, i);
        }
    }

    private static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        return c.TAG + i + v2.d;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415bf8a1", new Object[]{sQLiteDatabase, new Integer(i)});
            return;
        }
        MsgLog.c(c.TAG, Integer.valueOf(i), "dropTable !!!!!!");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + b(i) + ";");
        com.taobao.tao.messagekit.core.utils.d.a("MKT", "c_mdb", 1.0d);
    }

    private void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75297de9", new Object[]{this, bVar});
        } else if (this.b.size() >= d()) {
            MsgLog.c(c.TAG, Integer.valueOf(a()), "!!! ReportInfoList reach MAX ");
        } else {
            this.b.put(Long.valueOf(bVar.b()), bVar);
        }
    }

    private void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa3a42a", new Object[]{this, bVar});
        } else {
            this.b.remove(Long.valueOf(bVar.b()));
        }
    }

    private static long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2864", new Object[0])).longValue();
        }
        File databasePath = omg.d.getDatabasePath(omf.DAO_NAME);
        if (!databasePath.exists()) {
            return 0L;
        }
        return databasePath.length();
    }

    public long a(String str, String str2, Map<String, Object> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("feaf1d8e", new Object[]{this, str, str2, map, new Integer(i)})).longValue();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(f20757a[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            int size = (map == null || map.size() <= 0) ? 0 : map.size();
            if (size > 0) {
                objArr = new Object[size];
                int i2 = 0;
                for (String str3 : map.keySet()) {
                    sb.append(i2 > 0 ? "," : "");
                    sb.append(str3);
                    objArr[i2] = map.get(str3);
                    i2++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                int i3 = 0;
                while (i3 < size) {
                    sb.append(i3 > 0 ? ",?" : "?");
                    i3++;
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
            }
            sb.append(')');
            MsgLog.b(c.TAG, "sql = " + sb.toString());
            omf.a.a(sb.toString(), objArr);
            return 1L;
        } catch (Exception e) {
            MsgLog.c(c.TAG, Log.getStackTraceString(e));
            return -1L;
        }
    }

    public abstract b a(long j, String str, String str2);

    public List<b> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        Map<Long, b> map = this.b;
        if (map != null && map.size() > 0) {
            int i2 = 0;
            for (b bVar : this.b.values()) {
                if (i >= 0 && i2 >= i) {
                    break;
                } else if (bVar != null) {
                    i2++;
                    arrayList.add(bVar);
                }
            }
            a((List<b>) arrayList, false);
            MsgLog.b(c.TAG, Integer.valueOf(a()), "dump count >> ", Integer.valueOf(i2));
        }
        return arrayList;
    }

    public List<b> a(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc960838", new Object[]{this, cursor});
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex("id"));
            long j = cursor.getLong(cursor.getColumnIndex("key"));
            if (0 == j) {
                break;
            }
            b a2 = a(j, string, cursor.getString(cursor.getColumnIndex("content")));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffaf57a8", new Object[]{this, bVar});
            return;
        }
        try {
            b(bVar);
            HashMap hashMap = new HashMap();
            hashMap.put("id", bVar.d());
            hashMap.put(COL_TYPE_ID, Integer.valueOf(bVar.c()));
            hashMap.put("key", Long.valueOf(bVar.b()));
            hashMap.put("content", bVar.e().toJSONString());
            if (a(c(), g(), hashMap, 4) >= 1) {
                return;
            }
            MsgLog.c(c.TAG, Integer.valueOf(a()), "insert error ", Long.valueOf(bVar.b()));
            com.taobao.tao.messagekit.core.utils.d.a("MKT", ErrorType.IO, 1.0d);
        } catch (Exception e) {
            MsgLog.c(c.TAG, Log.getStackTraceString(e));
        }
    }

    public abstract void a(String str, List<b> list, com.taobao.tao.messagekit.core.model.a aVar);

    public void a(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            b(list.get(i));
        }
    }

    public void a(List<b> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                c(list.get(i));
            }
            if (!z) {
                return;
            }
            b(list);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        h();
        a(omf.a.a().getWritableDatabase(), a());
    }

    public boolean b(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(c());
        sb.append(" WHERE ");
        StringBuilder sb2 = new StringBuilder("key");
        sb2.append(" IN ( ");
        StringBuilder sb3 = new StringBuilder("id");
        sb3.append(" IN ( ");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb2.append(",");
                sb3.append(",");
            }
            sb2.append(list.get(i).b());
            sb3.append("\"");
            sb3.append(list.get(i).d());
            sb3.append("\"");
        }
        sb2.append(" )");
        sb3.append(" )");
        sb.append((CharSequence) sb2);
        sb.append(" AND ");
        sb.append((CharSequence) sb3);
        omf.a.a(sb.toString(), (Object[]) null);
        return true;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : b(a());
    }

    public abstract int d();

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        com.taobao.tao.messagekit.core.utils.MsgLog.b(com.taobao.tao.messagekit.base.monitor.c.TAG, java.lang.Integer.valueOf(a()), "query from db >", java.lang.Integer.valueOf(r8.b.size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            r8 = this;
            java.lang.String r0 = "MonitorManager"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.messagekit.base.monitor.a.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L14
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r8
            java.lang.String r2 = "5b2e1ed"
            r1.ipc$dispatch(r2, r0)
            return
        L14:
            r1 = 2
            r2 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r5.<init>()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r6 = "SELECT * FROM "
            r5.append(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r6 = r8.c()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r5.append(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r6 = " LIMIT 5000"
            r5.append(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.database.Cursor r2 = tb.omf.a.a(r5, r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r2 == 0) goto L4e
            java.util.List r5 = r8.a(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
        L3e:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            com.taobao.tao.messagekit.base.monitor.b r6 = (com.taobao.tao.messagekit.base.monitor.b) r6     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r8.b(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            goto L3e
        L4e:
            if (r2 == 0) goto L6a
            goto L67
        L51:
            r0 = move-exception
            goto L8c
        L53:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L51
            int r7 = r8.a()     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L51
            r6[r3] = r7     // Catch: java.lang.Throwable -> L51
            r6[r4] = r5     // Catch: java.lang.Throwable -> L51
            com.taobao.tao.messagekit.core.utils.MsgLog.c(r0, r6)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L6a
        L67:
            r2.close()
        L6a:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r5 = r8.a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r3] = r5
            java.lang.String r3 = "query from db >"
            r2[r4] = r3
            java.util.Map<java.lang.Long, com.taobao.tao.messagekit.base.monitor.b> r3 = r8.b
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            com.taobao.tao.messagekit.core.utils.MsgLog.b(r0, r2)
            return
        L8c:
            if (r2 == 0) goto L91
            r2.close()
        L91:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.messagekit.base.monitor.a.f():void");
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "content";
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (i() < FileAbility.MAX_DIR_SIZE) {
        } else {
            b(omf.a.a().getWritableDatabase(), a());
        }
    }
}

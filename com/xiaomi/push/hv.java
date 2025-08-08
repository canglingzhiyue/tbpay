package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class hv {

    /* renamed from: a  reason: collision with other field name */
    private static ak f483a = new ak(true);

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f24534a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static long f482a = System.currentTimeMillis();

    /* renamed from: a  reason: collision with other field name */
    private static final Object f485a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static List<a> f487a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a  reason: collision with other field name */
    private static String f486a = "";

    /* renamed from: a  reason: collision with other field name */
    private static com.xiaomi.push.providers.a f484a = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24535a;

        /* renamed from: a  reason: collision with other field name */
        public long f488a;

        /* renamed from: a  reason: collision with other field name */
        public String f489a;
        public int b;

        /* renamed from: b  reason: collision with other field name */
        public long f490b;

        /* renamed from: b  reason: collision with other field name */
        public String f491b;

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.f489a = "";
            this.f488a = 0L;
            this.f24535a = -1;
            this.b = -1;
            this.f491b = "";
            this.f490b = 0L;
            this.f489a = str;
            this.f488a = j;
            this.f24535a = i;
            this.b = i2;
            this.f491b = str2;
            this.f490b = j2;
        }

        public boolean a(a aVar) {
            return StringUtils.equals(aVar.f489a, this.f489a) && StringUtils.equals(aVar.f491b, this.f491b) && aVar.f24535a == this.f24535a && aVar.b == this.b && Math.abs(aVar.f488a - this.f488a) <= 5000;
        }
    }

    public static int a(Context context) {
        if (f24534a == -1) {
            f24534a = b(context);
        }
        return f24534a;
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    private static long a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f482a;
            f482a = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j << 1;
            }
        }
        return (j * (i == 0 ? 13 : 11)) / 10;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static com.xiaomi.push.providers.a m2019a(Context context) {
        com.xiaomi.push.providers.a aVar = f484a;
        if (aVar != null) {
            return aVar;
        }
        com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
        f484a = aVar2;
        return aVar2;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static synchronized String m2020a(Context context) {
        synchronized (hv.class) {
            if (!StringUtils.isEmpty(f486a)) {
                return f486a;
            }
            return "";
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m2022a(Context context) {
        f24534a = b(context);
    }

    private static void a(Context context, String str, long j, boolean z, long j2) {
        int a2;
        boolean isEmpty;
        if (context == null || StringUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (a2 = a(context))) {
            return;
        }
        synchronized (f485a) {
            isEmpty = f487a.isEmpty();
            a(new a(str, j2, a2, z ? 1 : 0, a2 == 0 ? m2020a(context) : "", j));
        }
        if (!isEmpty) {
            return;
        }
        f483a.a(new hw(context), 5000L);
    }

    public static void a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        a(context, str, a(a(context), j, z, j2, z2), z, j2);
    }

    private static void a(a aVar) {
        for (a aVar2 : f487a) {
            if (aVar2.a(aVar)) {
                aVar2.f490b += aVar.f490b;
                return;
            }
        }
        f487a.add(aVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized void m2023a(String str) {
        synchronized (hv.class) {
            if (!j.m2123d() && !StringUtils.isEmpty(str)) {
                f486a = str;
            }
        }
    }

    private static int b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.f855a) {
                SQLiteDatabase writableDatabase = m2019a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                for (a aVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("package_name", aVar.f489a);
                    contentValues.put("message_ts", Long.valueOf(aVar.f488a));
                    contentValues.put("network_type", Integer.valueOf(aVar.f24535a));
                    contentValues.put("bytes", Long.valueOf(aVar.f490b));
                    contentValues.put("rcv", Integer.valueOf(aVar.b));
                    contentValues.put("imsi", aVar.f491b);
                    writableDatabase.insert(Configuration.LOG_TYPE_TRAFFIC, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a(th);
        }
    }
}

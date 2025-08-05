package com.loc;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.android.address.map.IAddressMap;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.io.Closeable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class o {
    private static String A = "";
    private static String B = "";
    private static String C = "";
    private static boolean D = false;
    private static boolean E = false;
    private static String F = "";
    private static boolean G = false;
    private static boolean H = false;
    private static long I = 0;
    private static int J = 0;
    private static String K = null;
    private static String L = "";
    private static boolean M = true;
    private static boolean N = false;
    private static String O = "";
    private static boolean P = false;
    private static int Q = -1;
    private static boolean R = false;
    private static int S = -1;
    private static boolean T = false;
    private static volatile b U = null;

    /* renamed from: a  reason: collision with root package name */
    static String f7835a = "";
    static String b = "";
    static volatile boolean c = true;
    public static boolean d = false;
    static String e = "";
    static boolean f = false;
    public static a g = null;
    static int h = -1;
    static String i = "";
    static String j = "";
    private static String k = null;
    private static boolean l = false;
    private static String m = "";
    private static volatile boolean n = false;
    private static String o = "";
    private static boolean p = false;
    private static boolean q = false;
    private static boolean r = false;
    private static String s = "";
    private static String t = "";
    private static boolean u = false;
    private static boolean v = false;
    private static String w = "";
    private static boolean x = false;
    private static String y = "";
    private static boolean z = false;

    /* loaded from: classes4.dex */
    public interface a {
        bt a(byte[] bArr, Map<String, String> map);

        String a();

        String a(Context context, String str);

        String a(String str, String str2, String str3, String str4);

        Map<String, String> b();
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Context f7838a;
        private static BroadcastReceiver b;
        private static ConnectivityManager c;
        private static NetworkRequest d;
        private static ConnectivityManager.NetworkCallback e;

        public final void a(Context context) {
            if (Build.VERSION.SDK_INT < 24) {
                if (context == null || b != null) {
                    return;
                }
                b = new BroadcastReceiver() { // from class: com.loc.o.b.1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        if (x.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF").equals(intent.getAction())) {
                            o.q();
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(x.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF"));
                context.registerReceiver(b, intentFilter);
            } else if (!o.b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || context == null || c != null) {
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                c = connectivityManager;
                if (connectivityManager == null) {
                    return;
                }
                d = new NetworkRequest.Builder().addCapability(0).addCapability(1).build();
                e = new ConnectivityManager.NetworkCallback() { // from class: com.loc.o.b.2
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
                        super.onAvailable(network);
                        o.q();
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) {
                        super.onLost(network);
                        o.q();
                    }
                };
                c.registerNetworkCallback(d, e);
                f7838a = context;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private static String f7841a;
        private Context b;
        private int c;

        c(Context context, int i) {
            this.b = context;
            this.c = i;
        }

        private String a() {
            try {
                if (!TextUtils.isEmpty(f7841a)) {
                    return f7841a;
                }
                byte[] digest = MessageDigest.getInstance(x.c("IU0hBMQ")).digest(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 64).signatures[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : digest) {
                    stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                }
                String stringBuffer2 = stringBuffer.toString();
                if (!TextUtils.isEmpty(stringBuffer2)) {
                    f7841a = stringBuffer2;
                }
                return stringBuffer2;
            } catch (Throwable unused) {
                return "";
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: Throwable -> 0x0064, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0064, blocks: (B:3:0x0008, B:16:0x004e, B:10:0x0017, B:11:0x003a, B:12:0x0040, B:13:0x0044), top: B:29:0x0008 }] */
        @Override // android.content.ServiceConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
            /*
                r5 = this;
                android.os.Parcel r6 = android.os.Parcel.obtain()
                android.os.Parcel r0 = android.os.Parcel.obtain()
                int r1 = r5.c     // Catch: java.lang.Throwable -> L64
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == r2) goto L44
                r2 = 4
                if (r1 == r2) goto L3a
                r2 = 5
                if (r1 == r2) goto L17
                r1 = 0
                goto L4c
            L17:
                java.lang.String r1 = "KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"
                java.lang.String r1 = com.loc.x.c(r1)     // Catch: java.lang.Throwable -> L64
                r6.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L64
                android.content.Context r1 = r5.b     // Catch: java.lang.Throwable -> L64
                java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L64
                r6.writeString(r1)     // Catch: java.lang.Throwable -> L64
                java.lang.String r1 = r5.a()     // Catch: java.lang.Throwable -> L64
                r6.writeString(r1)     // Catch: java.lang.Throwable -> L64
                java.lang.String r1 = "IT1VJRA"
                java.lang.String r1 = com.loc.x.c(r1)     // Catch: java.lang.Throwable -> L64
                r6.writeString(r1)     // Catch: java.lang.Throwable -> L64
                goto L4b
            L3a:
                java.lang.String r1 = "UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ"
                java.lang.String r1 = com.loc.x.c(r1)     // Catch: java.lang.Throwable -> L64
            L40:
                r6.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L64
                goto L4b
            L44:
                java.lang.String r1 = "UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U"
                java.lang.String r1 = com.loc.x.c(r1)     // Catch: java.lang.Throwable -> L64
                goto L40
            L4b:
                r1 = 1
            L4c:
                if (r1 == 0) goto L5b
                r7.transact(r4, r6, r0, r3)     // Catch: java.lang.Throwable -> L64
                r0.readException()     // Catch: java.lang.Throwable -> L64
                java.lang.String r7 = r0.readString()     // Catch: java.lang.Throwable -> L64
                com.loc.o.b(r7)     // Catch: java.lang.Throwable -> L64
            L5b:
                r0.recycle()
                r6.recycle()
                return
            L62:
                r7 = move-exception
                goto L77
            L64:
                r7 = move-exception
                java.lang.String r1 = "oac"
                int r2 = r5.c     // Catch: java.lang.Throwable -> L62
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L62
                com.loc.as.a(r7, r1, r2)     // Catch: java.lang.Throwable -> L62
                r0.recycle()
                r6.recycle()
                return
            L77:
                r0.recycle()
                r6.recycle()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.o.c.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static String A(Context context) {
        if (!TextUtils.isEmpty(F)) {
            return F;
        }
        try {
            String b2 = bd.b(context, "open_common", "a1", "");
            if (TextUtils.isEmpty(b2)) {
                F = IAddressMap.MAP_TYPE_AMAP + UUID.randomUUID().toString().replace("_", "").toLowerCase();
                SharedPreferences.Editor a2 = bd.a(context, "open_common");
                bd.a(a2, "a1", x.b(F));
                bd.a(a2);
            } else {
                F = x.c(b2);
            }
        } catch (Throwable unused) {
        }
        return F;
    }

    private static String B(Context context) {
        TelephonyManager F2;
        if (P) {
            return O;
        }
        K(context);
        if (b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) && (F2 = F(context)) != null) {
            String simOperatorName = F2.getSimOperatorName();
            O = simOperatorName;
            if (TextUtils.isEmpty(simOperatorName)) {
                O = F2.getNetworkOperatorName();
            }
            P = true;
            return O;
        }
        return O;
    }

    private static int C(Context context) {
        if (R) {
            return Q;
        }
        K(context);
        if (context == null || !b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return Q;
        }
        ConnectivityManager D2 = D(context);
        if (D2 == null) {
            return Q;
        }
        NetworkInfo activeNetworkInfo = D2.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            Q = activeNetworkInfo.getType();
        }
        R = true;
        return Q;
    }

    private static ConnectivityManager D(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int E(Context context) {
        TelephonyManager F2;
        if (T) {
            return S;
        }
        K(context);
        if (b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) && (F2 = F(context)) != null) {
            S = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(F2);
            T = true;
            return S;
        }
        return S;
    }

    private static TelephonyManager F(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static String G(Context context) {
        if (!c) {
            return "";
        }
        String str = null;
        try {
            str = H(context);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            c = false;
            return "";
        }
        try {
            byte[] bytes = x.c("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
            return new String(p.a(x.c("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), p.b(str), bytes), "UTF-8");
        } catch (Throwable unused2) {
            c = false;
            return "";
        }
    }

    private static String H(Context context) {
        String str;
        try {
            str = I(context);
        } catch (Throwable unused) {
            str = "";
        }
        return !TextUtils.isEmpty(str) ? str : context == null ? "" : context.getSharedPreferences(x.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(s.a(x.c("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static java.lang.String I(android.content.Context r8) {
        /*
            java.lang.String r0 = "SIw"
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = ""
            r3 = 19
            if (r1 < r3) goto L17
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ=="
            java.lang.String r1 = com.loc.x.c(r1)
            boolean r1 = b(r8, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = "LYW1hcF9kZXZpY2VfYWRpdQ"
            java.lang.String r1 = com.loc.x.c(r1)
            java.lang.String r1 = com.loc.s.a(r1)
            java.lang.String r8 = J(r8)
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 == 0) goto L2c
            return r2
        L2c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r8 = java.io.File.separator
            r3.append(r8)
            java.lang.String r8 = "KYmFja3Vwcw"
            java.lang.String r8 = com.loc.x.c(r8)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "MLmFkaXU"
            java.lang.String r4 = com.loc.x.c(r4)
            r3.<init>(r8, r4)
            boolean r8 = r3.exists()
            if (r8 == 0) goto Le3
            boolean r8 = r3.canRead()
            if (r8 != 0) goto L5f
            goto Le3
        L5f:
            long r4 = r3.length()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L6d
            r3.delete()
            return r2
        L6d:
            r8 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lde
            java.lang.String r5 = "r"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lde
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Ldf
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Ldf
            r5.<init>()     // Catch: java.lang.Throwable -> Ldf
        L7e:
            int r8 = r4.read(r3)     // Catch: java.lang.Throwable -> Lce
            r6 = -1
            r7 = 0
            if (r8 == r6) goto L8a
            r5.write(r3, r7, r8)     // Catch: java.lang.Throwable -> Lce
            goto L7e
        L8a:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> Lce
            byte[] r3 = r5.toByteArray()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = "UTF-8"
            r8.<init>(r3, r6)     // Catch: java.lang.Throwable -> Lce
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lce
            if (r3 != 0) goto Lc5
            java.lang.String r3 = com.loc.x.c(r0)     // Catch: java.lang.Throwable -> Lce
            boolean r3 = r8.contains(r3)     // Catch: java.lang.Throwable -> Lce
            if (r3 == 0) goto Lc5
            java.lang.String r0 = com.loc.x.c(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String[] r8 = r8.split(r0)     // Catch: java.lang.Throwable -> Lce
            if (r8 == 0) goto Lc5
            int r0 = r8.length     // Catch: java.lang.Throwable -> Lce
            r3 = 2
            if (r0 != r3) goto Lc5
            r0 = r8[r7]     // Catch: java.lang.Throwable -> Lce
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lc5
            r0 = 1
            r8 = r8[r0]     // Catch: java.lang.Throwable -> Lce
            a(r5)
            a(r4)
            return r8
        Lc5:
            a(r5)
        Lc8:
            a(r4)
            goto Le3
        Lcc:
            r8 = move-exception
            goto Ld7
        Lce:
            r8 = r5
            goto Ldf
        Ld0:
            r0 = move-exception
            r5 = r8
            goto Ld6
        Ld3:
            r0 = move-exception
            r4 = r8
            r5 = r4
        Ld6:
            r8 = r0
        Ld7:
            a(r5)
            a(r4)
            throw r8
        Lde:
            r4 = r8
        Ldf:
            a(r8)
            goto Lc8
        Le3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.o.I(android.content.Context):java.lang.String");
    }

    private static String J(Context context) {
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService(WXStorageModule.NAME);
            Class<?> cls = Class.forName(x.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
            Method method = storageManager.getClass().getMethod(x.c("MZ2V0Vm9sdW1lTGlzdA"), new Class[0]);
            Method method2 = cls.getMethod(x.c("FZ2V0UGF0aA"), new Class[0]);
            Method method3 = cls.getMethod(x.c("DaXNSZW1vdmFibGU"), new Class[0]);
            Object invoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(invoke);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = Array.get(invoke, i2);
                String str = (String) method2.invoke(obj, new Object[0]);
                if (!((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                    return str;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static synchronized b K(Context context) {
        synchronized (o.class) {
            if (U == null) {
                if (context == null) {
                    return null;
                }
                b bVar = new b();
                U = bVar;
                bVar.a(context.getApplicationContext());
            }
            return U;
        }
    }

    public static String a() {
        return k;
    }

    public static String a(final Context context) {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (context == null) {
            return "";
        }
        String G2 = G(context);
        b = G2;
        if (!TextUtils.isEmpty(G2)) {
            return b;
        }
        if (c() == null || n) {
            return "";
        }
        n = true;
        cr.a().b(new cs() { // from class: com.loc.o.1
            @Override // com.loc.cs
            public final void a() {
                try {
                    Map<String, String> b2 = o.g.b();
                    String a2 = o.g.a(o.f(context), "", "", o.n());
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    bo.a();
                    String a3 = o.g.a(context, new String(bo.a(o.g.a(a2.getBytes(), b2)).f7708a));
                    if (TextUtils.isEmpty(a3)) {
                        return;
                    }
                    o.b = a3;
                } catch (Throwable unused) {
                }
            }
        });
        return "";
    }

    private static String a(Context context, int i2) {
        try {
            Intent intent = new Intent();
            if (i2 == 2) {
                intent.setAction(x.c("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(x.c("UY29tLmh1YXdlaS5od2lk"));
            } else if (i2 == 4) {
                intent.setClassName(x.c("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), x.c("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
            } else if (i2 != 5) {
                p = true;
                return o;
            } else {
                intent.setClassName(x.c("YY29tLmhleXRhcC5vcGVuaWQ"), x.c("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(x.c("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
            }
            c cVar = new c(context, i2);
            if (context.bindService(intent, cVar, 1)) {
                int i3 = 0;
                while (i3 < 100 && TextUtils.isEmpty(o)) {
                    i3++;
                    Thread.sleep(15L);
                }
                context.unbindService(cVar);
            }
            return o;
        } catch (Throwable th) {
            as.a(th, "oa", String.valueOf(i2));
            p = true;
            return o;
        }
    }

    public static void a(a aVar) {
        if (g == null) {
            g = aVar;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str) {
        k = str;
    }

    public static String b() {
        try {
            return !TextUtils.isEmpty(e) ? e : g == null ? "" : g.a();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        try {
            return B(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static int c(Context context) {
        try {
            return E(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static a c() {
        return g;
    }

    public static int d(Context context) {
        try {
            return C(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            String n2 = n();
            return n2.length() < 5 ? "" : n2.substring(3, 5);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String e() {
        return "";
    }

    public static String e(final Context context) {
        if (p) {
            return "";
        }
        if (TextUtils.isEmpty(o) && !q) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                cr.a().b(new cs() { // from class: com.loc.o.2
                    @Override // com.loc.cs
                    public final void a() {
                        o.z(context);
                        boolean unused = o.q = true;
                    }
                });
                return o;
            }
            q = true;
            return z(context);
        }
        return o;
    }

    public static String f() {
        return "";
    }

    public static String f(Context context) {
        if (r) {
            String str = f7835a;
            return str == null ? "" : str;
        } else if (f7835a != null && !"".equals(f7835a)) {
            return f7835a;
        } else {
            if (b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
                f7835a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            if (!TextUtils.isEmpty(f7835a)) {
                r = true;
                return f7835a;
            }
            try {
                String v2 = v(context);
                f7835a = v2;
                if (!TextUtils.isEmpty(v2)) {
                    r = true;
                    return f7835a;
                }
            } catch (Throwable unused) {
            }
            try {
                f7835a = w(context);
                r = true;
            } catch (Throwable unused2) {
            }
            String str2 = f7835a;
            return str2 == null ? "" : str2;
        }
    }

    public static String g() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(Context context) {
        try {
            TelephonyManager F2 = F(context);
            if (F2 == null) {
                return "";
            }
            String networkOperator = F2.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(0, 3);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String h() {
        return w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(Context context) {
        TelephonyManager F2;
        if (z) {
            return y;
        }
        try {
            K(context);
            F2 = F(context);
        } catch (Throwable unused) {
        }
        if (F2 == null) {
            return y;
        }
        String networkOperator = F2.getNetworkOperator();
        if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
            y = networkOperator.substring(3);
            z = true;
            return y;
        }
        z = true;
        return y;
    }

    public static int i(Context context) {
        try {
            return E(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] i() {
        return new String[]{"", ""};
    }

    public static int j(Context context) {
        try {
            return C(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String j() {
        return i;
    }

    public static NetworkInfo k(Context context) {
        ConnectivityManager D2;
        if (b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (D2 = D(context)) != null) {
            return D2.getActiveNetworkInfo();
        }
        return null;
    }

    public static String k() {
        return B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l(Context context) {
        try {
            NetworkInfo k2 = k(context);
            if (k2 != null) {
                return k2.getExtraInfo();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void l() {
        try {
            ar.a();
        } catch (Throwable unused) {
        }
    }

    public static String m() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String m(Context context) {
        StringBuilder sb;
        if (A == null || "".equals(A)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i3 > i2) {
                sb = new StringBuilder();
                sb.append(i2);
                sb.append("*");
                sb.append(i3);
            } else {
                sb = new StringBuilder();
                sb.append(i3);
                sb.append("*");
                sb.append(i2);
            }
            A = sb.toString();
            return A;
        }
        return A;
    }

    public static String n() {
        return "";
    }

    public static String n(Context context) {
        try {
            if (!b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return L;
            }
            TelephonyManager F2 = F(context);
            return F2 == null ? "" : F2.getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long o() {
        long blockCount;
        long blockCount2;
        long j2 = I;
        if (j2 != 0) {
            return j2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockCount = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
                blockCount2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576;
            } else {
                blockCount = (statFs.getBlockCount() * statFs.getBlockSize()) / 1048576;
                blockCount2 = (statFs2.getBlockCount() * statFs2.getBlockSize()) / 1048576;
            }
            I = blockCount + blockCount2;
        } catch (Throwable unused) {
        }
        return I;
    }

    public static String o(Context context) {
        ConnectivityManager D2;
        NetworkInfo activeNetworkInfo;
        try {
            return (!b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (D2 = D(context)) == null || (activeNetworkInfo = D2.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String p() {
        if (!TextUtils.isEmpty(K)) {
            return K;
        }
        String property = System.getProperty("os.arch");
        K = property;
        return property;
    }

    public static String p(Context context) {
        String str;
        try {
            String k2 = k();
            try {
                if (TextUtils.isEmpty(k2)) {
                    k2 = a(context);
                }
                if (TextUtils.isEmpty(k2)) {
                    k2 = f(context);
                }
                if (TextUtils.isEmpty(k2)) {
                    k2 = e(context);
                }
                if (TextUtils.isEmpty(k2)) {
                    k2 = g();
                }
                return TextUtils.isEmpty(k2) ? A(context) : k2;
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String q(Context context) {
        return k() + "#" + a(context) + "#" + p(context);
    }

    public static void q() {
        Q = -1;
        R = false;
        S = -1;
        T = false;
        O = "";
        P = false;
        y = "";
        z = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static int r(android.content.Context r4) {
        /*
            int r0 = com.loc.o.J
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            r2 = 0
            if (r0 < r1) goto L26
            java.lang.String r0 = "activity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            if (r4 != 0) goto L17
            return r2
        L17:
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r4.getMemoryInfo(r0)
            long r0 = r0.totalMem
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            int r2 = (int) r0
            goto L63
        L26:
            r4 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "\\s+"
            java.lang.String[] r4 = r4.split(r0)     // Catch: java.lang.Throwable -> L55
            r0 = 1
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L55
            int r2 = r4.intValue()     // Catch: java.lang.Throwable -> L55
            r1.close()     // Catch: java.io.IOException -> L63
            goto L63
        L51:
            r4 = move-exception
            r0 = r4
            r4 = r1
            goto L58
        L55:
            r4 = r1
            goto L5e
        L57:
            r0 = move-exception
        L58:
            if (r4 == 0) goto L5d
            r4.close()     // Catch: java.io.IOException -> L5d
        L5d:
            throw r0
        L5e:
            if (r4 == 0) goto L63
            r4.close()     // Catch: java.io.IOException -> L63
        L63:
            int r2 = r2 / 1024
            com.loc.o.J = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.o.r(android.content.Context):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String s(Context context) {
        try {
            return B(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String t(Context context) {
        try {
            if (TextUtils.isEmpty(m)) {
                m = ae.a(context);
            }
        } catch (Throwable unused) {
        }
        return m;
    }

    private static String v(Context context) {
        try {
            String b2 = bd.b(context, "Alvin2", "UTDID2", "");
            return TextUtils.isEmpty(b2) ? bd.b(context, "Alvin2", "UTDID", "") : b2;
        } catch (Throwable unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static java.lang.String w(android.content.Context r8) {
        /*
            r0 = 0
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r8 = com.loc.x.a(r8, r1)     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L96
            java.lang.String r8 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> La3
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L96
            java.io.File r8 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            r1.append(r8)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = "/.UTSystemConfig/Global/Alvin2.xml"
            r1.append(r8)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> La3
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> La3
            r1.<init>(r8)     // Catch: java.lang.Throwable -> La3
            org.xmlpull.v1.XmlPullParser r8 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> La3
            int r2 = r8.getEventType()     // Catch: java.lang.Throwable -> La3
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La3
            r3.<init>(r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "utf-8"
            r8.setInput(r3, r0)     // Catch: java.lang.Throwable -> L94
            r0 = 0
            r1 = 0
        L48:
            r4 = 1
            if (r4 == r2) goto L8f
            if (r2 == 0) goto L8a
            r5 = 2
            if (r2 == r5) goto L63
            r4 = 3
            if (r2 == r4) goto L61
            r4 = 4
            if (r2 == r4) goto L57
            goto L8a
        L57:
            if (r1 == 0) goto L8a
            java.lang.String r8 = r8.getText()     // Catch: java.lang.Throwable -> L94
            r3.close()     // Catch: java.lang.Throwable -> L60
        L60:
            return r8
        L61:
            r1 = 0
            goto L8a
        L63:
            int r2 = r8.getAttributeCount()     // Catch: java.lang.Throwable -> L94
            if (r2 <= 0) goto L8a
            int r2 = r8.getAttributeCount()     // Catch: java.lang.Throwable -> L94
            r5 = r1
            r1 = 0
        L6f:
            if (r1 >= r2) goto L89
            java.lang.String r6 = r8.getAttributeValue(r1)     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = "UTDID2"
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L85
            java.lang.String r7 = "UTDID"
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L86
        L85:
            r5 = 1
        L86:
            int r1 = r1 + 1
            goto L6f
        L89:
            r1 = r5
        L8a:
            int r2 = r8.next()     // Catch: java.lang.Throwable -> L94
            goto L48
        L8f:
            r0 = r3
            goto L96
        L91:
            r8 = move-exception
            r0 = r3
            goto L9d
        L94:
            r0 = r3
            goto La3
        L96:
            if (r0 == 0) goto La6
        L98:
            r0.close()     // Catch: java.lang.Throwable -> La6
            goto La6
        L9c:
            r8 = move-exception
        L9d:
            if (r0 == 0) goto La2
            r0.close()     // Catch: java.lang.Throwable -> La2
        La2:
            throw r8
        La3:
            if (r0 == 0) goto La6
            goto L98
        La6:
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.o.w(android.content.Context):java.lang.String");
    }

    private static String x(Context context) {
        try {
            Class<?> cls = Class.forName(x.c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            Object invoke = cls.getMethod(x.c("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
            if (invoke != null) {
                String str = (String) invoke;
                o = str;
                return str;
            }
        } catch (Throwable th) {
            as.a(th, "oa", "xm");
            p = true;
        }
        return o;
    }

    private static String y(Context context) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(x.c("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    int columnCount = query.getColumnCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= columnCount) {
                            break;
                        } else if (x.c("IdmFsdWU").equals(query.getColumnName(i2))) {
                            o = query.getString(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                query.close();
            }
        } catch (Throwable th) {
            p = true;
            as.a(th, "oa", "vivo");
        }
        return o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String z(Context context) {
        if (x.c("IeGlhb21p").equalsIgnoreCase(Build.MANUFACTURER) || x.c("IeGlhb21p").equalsIgnoreCase(Build.BRAND) || x.c("IUkVETUk=").equalsIgnoreCase(Build.MANUFACTURER) || x.c("IUkVETUk=").equalsIgnoreCase(Build.BRAND)) {
            return x(context);
        }
        if (x.c("Idml2bw").equalsIgnoreCase(Build.MANUFACTURER) || x.c("Idml2bw").equalsIgnoreCase(Build.BRAND)) {
            return y(context);
        }
        if (x.c("IaHVhd2Vp").equalsIgnoreCase(Build.MANUFACTURER) || x.c("IaHVhd2Vp").equalsIgnoreCase(Build.BRAND) || x.c("ISE9OT1I=").equalsIgnoreCase(Build.MANUFACTURER)) {
            return a(context, 2);
        }
        if (x.c("Mc2Ftc3VuZw").equalsIgnoreCase(Build.MANUFACTURER) || x.c("Mc2Ftc3VuZw").equalsIgnoreCase(Build.BRAND)) {
            return a(context, 4);
        }
        if (x.c("IT1BQTw").equalsIgnoreCase(Build.MANUFACTURER) || x.c("IT1BQTw").equalsIgnoreCase(Build.BRAND) || x.c("MT25lUGx1cw").equalsIgnoreCase(Build.MANUFACTURER) || x.c("MT25lUGx1cw").equalsIgnoreCase(Build.BRAND) || x.c("IUkVBTE1F").equalsIgnoreCase(Build.BRAND)) {
            return a(context, 5);
        }
        p = true;
        return o;
    }
}

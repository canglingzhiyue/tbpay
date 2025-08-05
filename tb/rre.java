package tb;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class rre {
    public static final String SYS_IDENTIFIERID = "persist.sys.identifierid";

    /* renamed from: a  reason: collision with root package name */
    private static Context f33328a;
    private final int t;
    private static Object f = new Object();
    private static boolean b = false;
    private static int c = 13;
    private static rrf d = null;
    private static rrf e = null;
    private static rrf i = null;
    private static rrf j = null;
    private static HandlerThread g = null;
    private static Handler h = null;
    private static String k = null;
    private static String l = null;
    private static String m = null;
    private static String p = null;
    private static String q = null;
    private static String r = null;
    private static String s = null;
    private static volatile rre n = null;
    private static volatile rrd o = null;
    private static int u = 0;
    private static int v = 0;
    private static int w = 0;
    private static int x = 0;
    private static int y = 0;
    private static int z = 0;
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;
    private static int D = 0;
    private static int E = 0;
    private static int F = 0;

    private rre() {
        f();
        o = new rrd(f33328a);
        this.t = c(f33328a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i2, int i3, int i4, int i5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i2);
        stringBuffer.append(",");
        stringBuffer.append(i3);
        stringBuffer.append(";");
        stringBuffer.append(i4);
        stringBuffer.append(",");
        stringBuffer.append(i5);
        return stringBuffer.toString();
    }

    private static String a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "0");
            } catch (Exception e2) {
                Log.e("VMS_SDK_Client", "getProperty: invoke is error" + e2.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rre a(Context context) {
        if (!a()) {
            return null;
        }
        return b(context);
    }

    private void a(int i2, String str) {
        synchronized (f) {
            b(i2, str);
            SystemClock.uptimeMillis();
            try {
                f.wait(2000L);
            } catch (InterruptedException unused) {
                Log.e("VMS_SDK_Client", "queryId: lock error");
            }
            SystemClock.uptimeMillis();
        }
    }

    private static synchronized void a(Context context, int i2, String str) {
        synchronized (rre.class) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 && i == null) {
                        i = new rrf(n, 2, str);
                        ContentResolver contentResolver = context.getContentResolver();
                        contentResolver.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/" + context.getPackageName()), false, i);
                    }
                } else if (e == null) {
                    e = new rrf(n, 1, str);
                    ContentResolver contentResolver2 = context.getContentResolver();
                    contentResolver2.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, e);
                }
            } else if (d == null) {
                d = new rrf(n, 0, null);
                context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        if (!b) {
            c();
        }
        return b;
    }

    static rre b(Context context) {
        if (f33328a == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f33328a = context;
        }
        if (n == null) {
            synchronized (rre.class) {
                if (n == null) {
                    rre rreVar = new rre();
                    n = rreVar;
                    rreVar.v();
                }
            }
        }
        return n;
    }

    private static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.vivo.vms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static void c() {
        b = "1".equals(a("persist.sys.identifierid.supported", "0")) || "1".equals(a(SYS_IDENTIFIERID, "0"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i2, String str) {
        if (i2 == 0) {
            if (str == null) {
                v++;
            } else {
                u++;
            }
        } else if (i2 == 1) {
            if (str == null) {
                x++;
            } else {
                w++;
            }
        } else if (i2 == 2) {
            if (str == null) {
                z++;
            } else {
                y++;
            }
        } else {
            switch (i2) {
                case 8:
                    if (str == null) {
                        B++;
                        return;
                    } else {
                        A++;
                        return;
                    }
                case 9:
                    if (str == null) {
                        D++;
                        return;
                    } else {
                        C++;
                        return;
                    }
                case 10:
                    if (str == null) {
                        F++;
                        return;
                    } else {
                        E++;
                        return;
                    }
                default:
                    return;
            }
        }
    }

    private static void f() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        g = handlerThread;
        handlerThread.start();
        h = new Handler(g.getLooper()) { // from class: tb.rre.2
            /* JADX WARN: Removed duplicated region for block: B:49:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void handleMessage(android.os.Message r3) {
                /*
                    r2 = this;
                    int r0 = r3.what
                    r1 = 11
                    if (r0 != r1) goto Lb4
                    android.os.Bundle r0 = r3.getData()
                    java.lang.String r1 = "type"
                    int r0 = r0.getInt(r1)
                    android.os.Bundle r3 = r3.getData()
                    java.lang.String r1 = "appid"
                    java.lang.String r3 = r3.getString(r1)
                    tb.rrd r1 = tb.rre.q()     // Catch: java.lang.Exception -> L88
                    java.lang.String r3 = r1.a(r0, r3)     // Catch: java.lang.Exception -> L88
                    if (r0 == 0) goto L7e
                    r1 = 1
                    if (r0 == r1) goto L6a
                    r1 = 2
                    if (r0 == r1) goto L53
                    r1 = 3
                    if (r0 == r1) goto L48
                    r1 = 4
                    if (r0 == r1) goto L44
                    r1 = 5
                    if (r0 == r1) goto L36
                    goto La3
                L36:
                    if (r3 == 0) goto L3c
                    tb.rre.f(r3)     // Catch: java.lang.Exception -> L88
                    goto La3
                L3c:
                    java.lang.String r3 = "VMS_SDK_Client"
                    java.lang.String r0 = "get guid failed"
                L40:
                    android.util.Log.e(r3, r0)     // Catch: java.lang.Exception -> L88
                    goto La3
                L44:
                    tb.rre.e(r3)     // Catch: java.lang.Exception -> L88
                    goto La3
                L48:
                    if (r3 == 0) goto L4e
                    tb.rre.d(r3)     // Catch: java.lang.Exception -> L88
                    goto La3
                L4e:
                    java.lang.String r3 = "VMS_SDK_Client"
                    java.lang.String r0 = "get udid failed"
                    goto L40
                L53:
                    if (r3 == 0) goto L59
                    tb.rre.c(r3)     // Catch: java.lang.Exception -> L88
                    goto L60
                L59:
                    java.lang.String r3 = "VMS_SDK_Client"
                    java.lang.String r0 = "get aaid failed"
                    android.util.Log.e(r3, r0)     // Catch: java.lang.Exception -> L88
                L60:
                    r3 = 10
                    java.lang.String r0 = tb.rre.t()     // Catch: java.lang.Exception -> L88
                L66:
                    tb.rre.c(r3, r0)     // Catch: java.lang.Exception -> L88
                    goto La3
                L6a:
                    if (r3 == 0) goto L70
                    tb.rre.b(r3)     // Catch: java.lang.Exception -> L88
                    goto L77
                L70:
                    java.lang.String r3 = "VMS_SDK_Client"
                    java.lang.String r0 = "get vaid failed"
                    android.util.Log.e(r3, r0)     // Catch: java.lang.Exception -> L88
                L77:
                    r3 = 9
                    java.lang.String r0 = tb.rre.s()     // Catch: java.lang.Exception -> L88
                    goto L66
                L7e:
                    tb.rre.a(r3)     // Catch: java.lang.Exception -> L88
                    r3 = 8
                    java.lang.String r0 = tb.rre.r()     // Catch: java.lang.Exception -> L88
                    goto L66
                L88:
                    r3 = move-exception
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "readException:"
                    r0.append(r1)
                    java.lang.String r3 = r3.toString()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    java.lang.String r0 = "VMS_SDK_Client"
                    android.util.Log.e(r0, r3)
                La3:
                    java.lang.Object r3 = tb.rre.u()
                    monitor-enter(r3)
                    java.lang.Object r0 = tb.rre.u()     // Catch: java.lang.Throwable -> Lb1
                    r0.notify()     // Catch: java.lang.Throwable -> Lb1
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb1
                    goto Lbb
                Lb1:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb1
                    throw r0
                Lb4:
                    java.lang.String r3 = "VMS_SDK_Client"
                    java.lang.String r0 = "message type valid"
                    android.util.Log.e(r3, r0)
                Lbb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tb.rre.AnonymousClass2.handleMessage(android.os.Message):void");
            }
        };
    }

    private void v() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new Runnable() { // from class: tb.rre.1
            @Override // java.lang.Runnable
            public void run() {
                if (rre.u + rre.v + rre.A + rre.D + rre.w + rre.x + rre.C + rre.D + rre.y + rre.z + rre.E + rre.F > 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("oaid", rre.this.a(rre.u, rre.v, rre.A, rre.B));
                    contentValues.put("vaid", rre.this.a(rre.w, rre.x, rre.C, rre.D));
                    contentValues.put("aaid", rre.this.a(rre.y, rre.z, rre.E, rre.F));
                    rre.o.a(7, "vivo", new ContentValues[]{contentValues});
                    int unused = rre.u = rre.v = rre.w = rre.x = rre.y = rre.z = 0;
                    int unused2 = rre.A = rre.B = rre.C = rre.D = rre.E = rre.F = 0;
                }
            }
        }, 600L, 600L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        String str = k;
        if (str == null) {
            a(0, (String) null);
            if (d == null) {
                a(f33328a, 0, null);
            }
            str = k;
        }
        d(0, str);
        return k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i2, String str) {
        Message obtainMessage = h.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        if (i2 == 1 || i2 == 2 || i2 == 6) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        h.sendMessage(obtainMessage);
    }
}

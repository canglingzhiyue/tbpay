package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.AccsConfig;
import com.taobao.accs.common.Constants;
import org.android.agoo.common.Config;
import tb.kge;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f8315a;
    private static final byte[] b;
    private static int c;

    static {
        kge.a(1953325285);
        b = new byte[0];
        c = -1;
        f8315a = -1;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (c == -1) {
            c = context.getApplicationInfo().targetSdkVersion;
        }
        return c >= 26 && Build.VERSION.SDK_INT >= 26;
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        try {
            f8315a = i;
            synchronized (b) {
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                edit.putInt(Constants.SP_KEY_DEBUG_MODE, i);
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("Utils", "setMode", th, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        if (f8315a != -1) {
            return f8315a;
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            context = 0;
        }
        synchronized (b) {
            try {
                context = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_DEBUG_MODE, 0);
                return context;
            } catch (Throwable th3) {
                th = th3;
                context = 0;
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    ALog.e("Utils", "getMode", th, new Object[0]);
                    return context;
                }
            }
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            synchronized (b) {
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                edit.clear();
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e("Utils", "clearAllSharePreferences", th, new Object[0]);
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        try {
            UtilityImpl.killService(context);
        } catch (Throwable th) {
            ALog.e("Utils", "killService", th, new Object[0]);
        }
    }

    public static boolean e(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        try {
            z = UtilityImpl.isMainProcess(context);
        } catch (Throwable th) {
            ALog.e("Utils", "killservice", th, new Object[0]);
            th.printStackTrace();
            z = true;
        }
        ALog.i("Utils", "isMainProcess", "result", Boolean.valueOf(z));
        return z;
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            Config.setAgooAppKey(context, str);
        } catch (Throwable th) {
            ALog.e("Utils", "setAgooAppkey", th, new Object[0]);
            th.printStackTrace();
        }
    }

    @Deprecated
    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            AccsConfig.build();
        } catch (Throwable th) {
            ALog.e("Utils", "initConfig", th, new Object[0]);
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
            ALog.e("Utils", "setSpValue null", new Object[0]);
        } else {
            try {
                synchronized (b) {
                    SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                    edit.putString(str, str2);
                    edit.apply();
                }
                ALog.i("Utils", "setSpValue", "key", str, "value", str2);
            } catch (Exception e) {
                ALog.e("Utils", "setSpValue fail", e, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        com.taobao.accs.utl.ALog.i("Utils", "getSpValue", "value", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        com.taobao.accs.utl.ALog.e("Utils", "getSpValue use default!", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        com.taobao.accs.utl.ALog.e("Utils", "getSpValue fail", r7, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.accs.utl.o.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r6
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r6 = "a3b17b6d"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L1b:
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.o.b     // Catch: java.lang.Throwable -> L55
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "ACCS_SDK"
            android.content.SharedPreferences r6 = com.taobao.accs.asp.APreferencesManager.getSharedPreferences(r6, r5, r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.getString(r7, r0)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = "Utils"
            java.lang.String r0 = "getSpValue"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "value"
            r1[r4] = r2     // Catch: java.lang.Throwable -> L4d
            r1[r3] = r6     // Catch: java.lang.Throwable -> L4d
            com.taobao.accs.utl.ALog.i(r7, r0, r1)     // Catch: java.lang.Throwable -> L4d
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L61
            java.lang.String r7 = "Utils"
            java.lang.String r0 = "getSpValue use default!"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4d
            com.taobao.accs.utl.ALog.e(r7, r0, r1)     // Catch: java.lang.Throwable -> L4d
            r6 = r8
            goto L61
        L4d:
            r7 = move-exception
            goto L57
        L4f:
            r7 = move-exception
            r0 = r6
            goto L53
        L52:
            r7 = move-exception
        L53:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            throw r7     // Catch: java.lang.Throwable -> L55
        L55:
            r7 = move-exception
            r6 = r0
        L57:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r0 = "Utils"
            java.lang.String r1 = "getSpValue fail"
            com.taobao.accs.utl.ALog.e(r0, r1, r7, r8)
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.o.b(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, "AGOO_BIND", 0).edit();
            edit.clear();
            edit.apply();
        } catch (Exception e) {
            ALog.e("Utils", "clearAgooBindCache", e, new Object[0]);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}

package com.taobao.monitor;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.d;
import com.taobao.monitor.procedure.o;
import com.taobao.monitor.procedure.r;
import com.taobao.monitor.procedure.s;
import com.taobao.orange.OConstant;
import java.lang.reflect.Method;
import java.util.Map;
import tb.jhb;
import tb.msf;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18147a = false;

    public static void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (f18147a) {
        } else {
            f18147a = true;
            ProcedureGlobal.a().a(context);
            b(context, map);
            s.f18233a.a(ProcedureGlobal.PROCEDURE_MANAGER);
            o.f18229a.a(ProcedureGlobal.PROCEDURE_MANAGER);
            r.f18232a.a(ProcedureGlobal.PROCEDURE_FACTORY);
        }
    }

    private static void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
            return;
        }
        d.b = context.getPackageName();
        d.c = a(map.get(OConstant.LAUNCH_ONLINEAPPKEY), "12278902");
        d.d = a(map.get(jhb.KEY_APP_BUILD), "");
        d.e = a(map);
        d.f = a(map.get("appPatch"), "");
        d.g = a(map.get("channel"), "");
        d.h = a(map.get("deviceId"), "");
        d.i = Build.BRAND;
        d.j = Build.MODEL;
        b();
        d.q = b(map);
        d.p = String.valueOf(System.currentTimeMillis());
        d.r = a(map.get("ttid"), "");
        d.t = a(map.get("packageTag"), "");
        d.s = a(map.get("speedFlag"), "normal");
        d.m = a(map.get("userId"), (String) null);
    }

    private static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str});
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!StringUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return str;
    }

    private static String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        Object obj = map.get("appVersion");
        if (obj instanceof String) {
            String str = (String) obj;
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
        }
        Context b = ProcedureGlobal.a().b();
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    private static String b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        Object obj = map.get("process");
        if (obj instanceof String) {
            String str = (String) obj;
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
        }
        return msf.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b() {
        /*
            r0 = 0
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L34
            java.lang.String r4 = "ro.yunos.version"
            r2[r6] = r4     // Catch: java.lang.Exception -> L34
            java.lang.Object r2 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L32
            java.lang.String r4 = "java.vm.name"
            r3[r6] = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r1 = r1.invoke(r0, r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L32
            r0 = r1
            goto L39
        L32:
            r1 = move-exception
            goto L36
        L34:
            r1 = move-exception
            r2 = r0
        L36:
            r1.printStackTrace()
        L39:
            boolean r1 = android.text.StringUtils.isEmpty(r2)
            if (r1 != 0) goto L44
            com.taobao.monitor.procedure.d.l = r2
            com.taobao.monitor.procedure.d.k = r0
            return
        L44:
            boolean r0 = a()
            if (r0 == 0) goto L4e
            java.lang.String r0 = "harmony"
            goto L50
        L4e:
            java.lang.String r0 = "android"
        L50:
            com.taobao.monitor.procedure.d.k = r0
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            com.taobao.monitor.procedure.d.l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.monitor.b.b():void");
    }

    public static boolean a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Method method = cls.getMethod("getOsBrand", new Class[0]);
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null && classLoader.getParent() == null) {
                return "harmony".equals(method.invoke(cls, new Object[0]));
            }
            return false;
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }
}

package com.taobao.homepage.utils;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kst;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_HOME_DX_DATA = "home_dx_data";

    /* renamed from: a  reason: collision with root package name */
    private static volatile Map<String, String> f17285a;
    private static volatile Map<String, String> b;

    static {
        kge.a(1999237054);
        f17285a = new HashMap(8);
        b = new HashMap(8);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : a("homepage_biz_switch", str, str2);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : b("homepage_biz_switch", str, str2);
    }

    public static boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue() : a("homepage_biz_switch", str, i);
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue() : b("homepage_biz_switch", str, i);
    }

    public static boolean a(String str, String str2, String str3) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || (a2 = a(str)) == null) {
            return false;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putString(str2, str3);
        edit.apply();
        return true;
    }

    public static String b(String str, String str2, String str3) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87942679", new Object[]{str, str2, str3}) : (!TextUtils.isEmpty(str2) && (a2 = a(str)) != null) ? a2.getString(str2, str3) : str3;
    }

    public static boolean a(String str, String str2, int i) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba950b", new Object[]{str, str2, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || (a2 = a(str)) == null) {
            return false;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putInt(str2, i);
        edit.apply();
        return true;
    }

    public static int b(String str, String str2, int i) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("551fca19", new Object[]{str, str2, new Integer(i)})).intValue() : (!TextUtils.isEmpty(str2) && (a2 = a(str)) != null) ? a2.getInt(str2, i) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.homepage.utils.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r5)
            r1[r3] = r4
            java.lang.String r3 = "91186ac8"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L20:
            java.lang.String r0 = "_"
            java.lang.String r1 = ""
            if (r5 == 0) goto L43
            java.lang.String r5 = tb.kst.d()
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            goto L44
        L43:
            r5 = r1
        L44:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            java.util.Map<java.lang.String, java.lang.String> r4 = com.taobao.homepage.utils.d.f17285a
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L6c
            java.lang.String r4 = com.taobao.homepage.business.permission.c.a(r3, r1)
            java.util.Map<java.lang.String, java.lang.String> r5 = com.taobao.homepage.utils.d.f17285a
            r5.put(r3, r4)
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.utils.d.a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static boolean a(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b578a6", new Object[]{str, str2, new Boolean(z), str3})).booleanValue();
        }
        String str4 = "";
        if (z) {
            try {
                String d = kst.d();
                if (!TextUtils.isEmpty(d)) {
                    str4 = str4 + d + "_";
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        String str5 = str4 + str + "_" + str2;
        f17285a.put(str5, str3);
        com.taobao.homepage.business.permission.c.b(str5, str3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.homepage.utils.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r5)
            r1[r3] = r4
            java.lang.String r3 = "a1ce3789"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L20:
            java.lang.String r0 = "_"
            java.lang.String r1 = ""
            if (r5 == 0) goto L43
            java.lang.String r5 = tb.kst.d()
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            goto L44
        L43:
            r5 = r1
        L44:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            java.util.Map<java.lang.String, java.lang.String> r4 = com.taobao.homepage.utils.d.b
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L69
            java.util.Map<java.lang.String, java.lang.String> r4 = com.taobao.homepage.utils.d.b
            r4.put(r3, r1)
            r4 = r1
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.utils.d.b(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static boolean b(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cb94405", new Object[]{str, str2, new Boolean(z), str3})).booleanValue();
        }
        String str4 = "";
        if (z) {
            try {
                String d = kst.d();
                if (!TextUtils.isEmpty(d)) {
                    str4 = str4 + d + "_";
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        b.put(str4 + str + "_" + str2, str3);
        return true;
    }

    private static SharedPreferences a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
        }
        Application application = Globals.getApplication();
        if (application != null) {
            return application.getSharedPreferences(str, 0);
        }
        return null;
    }
}

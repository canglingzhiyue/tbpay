package com.alibaba.wireless.security.framework;

import android.content.pm.PackageInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    public PackageInfo c = null;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f4273a = null;

    static {
        kge.a(501567633);
    }

    public a(String str) {
        this.b = str;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            JSONObject a2 = a();
            return a2 != null ? a2.getString(str) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this});
        }
        JSONObject jSONObject = this.f4273a;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = null;
        try {
            String a2 = com.alibaba.wireless.security.framework.utils.a.a(new File(this.b));
            if (a2 != null && a2.length() > 0) {
                jSONObject2 = new JSONObject(a2);
            }
        } catch (Exception unused) {
        }
        this.f4273a = jSONObject2;
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.content.pm.PackageInfo r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "keepaliveprocs"
            java.lang.String r1 = "thirdpartyso"
            java.lang.String r2 = "reversedependencies"
            java.lang.String r3 = "weakdependenciesNotDelay"
            java.lang.String r4 = "weakdependencies"
            java.lang.String r5 = "dependencies"
            java.lang.String r6 = "pluginclass"
            java.lang.String r7 = "pluginname"
            java.lang.String r8 = "hasso"
            com.android.alibaba.ip.runtime.IpChange r9 = com.alibaba.wireless.security.framework.a.$ipChange
            boolean r10 = r9 instanceof com.android.alibaba.ip.runtime.IpChange
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L3a
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r12] = r13
            r0[r11] = r14
            r14 = 2
            r0[r14] = r15
            java.lang.String r14 = "fc9b3b4d"
            java.lang.Object r14 = r9.ipc$dispatch(r14, r0)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            return r14
        L3a:
            if (r14 == 0) goto Ld6
            if (r15 == 0) goto Ld6
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r9 = "version"
            java.lang.String r10 = r14.versionName     // Catch: java.lang.Exception -> Ld5
            r15.put(r9, r10)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r9 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r9 = r9.metaData     // Catch: java.lang.Exception -> Ld5
            boolean r9 = r9.getBoolean(r8, r12)     // Catch: java.lang.Exception -> Ld5
            r15.put(r8, r9)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r8 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r8 = r8.metaData     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = r8.getString(r7)     // Catch: java.lang.Exception -> Ld5
            r15.put(r7, r8)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r7 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r7 = r7.metaData     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = r7.getString(r6)     // Catch: java.lang.Exception -> Ld5
            r15.put(r6, r7)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r6 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r6 = r6.metaData     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.getString(r5)     // Catch: java.lang.Exception -> Ld5
            r15.put(r5, r6)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r5 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r5 = r5.metaData     // Catch: java.lang.Exception -> Ld5
            java.lang.String r5 = r5.getString(r4)     // Catch: java.lang.Exception -> Ld5
            r15.put(r4, r5)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r4 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r4 = r4.metaData     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.getString(r3)     // Catch: java.lang.Exception -> Ld5
            r15.put(r3, r4)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r3 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Exception -> Ld5
            java.lang.String r3 = r3.getString(r2)     // Catch: java.lang.Exception -> Ld5
            r15.put(r2, r3)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r2 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r2 = r2.metaData     // Catch: java.lang.Exception -> Ld5
            boolean r2 = r2.getBoolean(r1)     // Catch: java.lang.Exception -> Ld5
            r15.put(r1, r2)     // Catch: java.lang.Exception -> Ld5
            android.content.pm.ApplicationInfo r14 = r14.applicationInfo     // Catch: java.lang.Exception -> Ld5
            android.os.Bundle r14 = r14.metaData     // Catch: java.lang.Exception -> Ld5
            java.lang.String r14 = r14.getString(r0)     // Catch: java.lang.Exception -> Ld5
            r15.put(r0, r14)     // Catch: java.lang.Exception -> Ld5
            r14 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lc0
            java.lang.String r1 = r13.b     // Catch: java.lang.Exception -> Lc0
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc0
            boolean r14 = r0.exists()     // Catch: java.lang.Exception -> Lc1
            if (r14 != 0) goto Lca
            r0.createNewFile()     // Catch: java.lang.Exception -> Lc1
            goto Lca
        Lc0:
            r0 = r14
        Lc1:
            boolean r14 = r0.exists()
            if (r14 != 0) goto Lca
            r0.createNewFile()     // Catch: java.lang.Exception -> Lca
        Lca:
            java.lang.String r14 = r15.toString()
            boolean r14 = com.alibaba.wireless.security.framework.utils.a.a(r0, r14)
            if (r14 != 0) goto Ld5
            r11 = 0
        Ld5:
            return r11
        Ld6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.a.a(android.content.pm.PackageInfo, java.lang.String):boolean");
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            return new File(this.b).exists();
        } catch (Exception unused) {
            return false;
        }
    }
}

package com.taobao.tao.homepage;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    public static final String HOME_COMPLIANCE_KEY = "TB_SHOPPING_PROCESS";
    public static final String KEY = "EditionPosition";

    static {
        kge.a(-1770558965);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            com.taobao.android.editionswitcher.b.a(context, str, a());
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean a2 = a(com.taobao.runtimepermission.f.a(Globals.getApplication(), "TB_SHOPPING_PROCESS", new String[]{ACCESS_FINE_LOCATION}));
        com.taobao.android.home.component.utils.e.e(KEY, "enablePosition 走合规,是否获取到权限：" + a2);
        return a2;
    }

    public static boolean a(com.taobao.runtimepermission.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1d4ff92", new Object[]{dVar})).booleanValue();
        }
        boolean z = false;
        for (int i = 0; i < dVar.f18987a.length; i++) {
            if (TextUtils.equals(dVar.f18987a[i], ACCESS_FINE_LOCATION)) {
                z = dVar.b[i] == 0;
            }
        }
        com.taobao.android.home.component.utils.e.e(KEY, "isGrantedLocationPermission permissionResult " + z);
        return z;
    }
}

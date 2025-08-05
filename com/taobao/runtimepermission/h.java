package com.taobao.runtimepermission;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.v4.app.ActivityCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.al;
import com.taobao.runtimepermission.config.RPConfig;
import com.taobao.tao.homepage.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.nmn;
import tb.tfr;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f19000a = new HashMap<String, String>() { // from class: com.taobao.runtimepermission.RuntimePermissionIdleInitTask$1
        {
            put("TB_SHOPPING_PROCESS", a.ACCESS_FINE_LOCATION);
            put("TAO_XIAN_DA", a.ACCESS_FINE_LOCATION);
            put("TAO_CAI_CAI", a.ACCESS_FINE_LOCATION);
            put("TMALL_MARKET", a.ACCESS_FINE_LOCATION);
            put("member_address", a.ACCESS_FINE_LOCATION);
            put("TB_MESSAGE_LOCATION", a.ACCESS_FINE_LOCATION);
            put(al.TB_GUANGGUANG, "android.permission.READ_EXTERNAL_STORAGE");
        }
    };

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        nmn.a();
        if (!com.taobao.runtimepermission.config.a.a().b().enableUniformAuth) {
            return;
        }
        b(application);
    }

    private static boolean a(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("75c56f7b", new Object[]{application})).booleanValue() : a(application, "uniform_authorize_last_time_v2", -1L) == -1;
    }

    private static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else if (a(application)) {
            if (!com.taobao.application.common.c.a().a("isFirstLaunch", false)) {
                tfr.b("RuntimePermissionIdle", "uniformAuthorize: App is first installed, no need to auth permissions uniformly.");
                return;
            }
            RPConfig b = com.taobao.runtimepermission.config.a.a().b();
            ArrayList arrayList = new ArrayList();
            for (String str : b.bizPermissionWhiteList) {
                if (ActivityCompat.checkSelfPermission(application, str) == 0) {
                    arrayList.add(str);
                }
            }
            for (String str2 : f19000a.keySet()) {
                String str3 = f19000a.get(str2);
                if (arrayList.contains(str3)) {
                    c.a(application, str2, str3, 0);
                    b(application, str2, System.currentTimeMillis());
                    nmn.a(str2, str3);
                }
            }
            b(application, "uniform_authorize_last_time_v2", System.currentTimeMillis());
            tfr.b("RuntimePermissionIdle", "uniformAuthorize: App is upgrade, authorization of permissions is complete");
        } else {
            tfr.b("RuntimePermissionIdle", "uniformAuthorize: authorization of permissions has already executed, exit.");
        }
    }

    private static long a(Application application, String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10295d57", new Object[]{application, str, new Long(j)})).longValue() : application.getSharedPreferences("runtime_permission_status_sp", 0).getLong(str, j);
    }

    private static void b(Application application, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2f764", new Object[]{application, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = application.getSharedPreferences("runtime_permission_status_sp", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }
}

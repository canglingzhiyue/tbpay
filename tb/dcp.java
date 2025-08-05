package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.amap.api.location.AMapLocationClient;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.PassiveLocationApplication;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dcp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_NAME = "com.taobao.location.privacy";

    /* renamed from: a  reason: collision with root package name */
    private static String f26691a;

    static {
        kge.a(1022945032);
        f26691a = "lbs_launcher";
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        b(application, true);
        new PassiveLocationApplication().onCreate(application);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(SP_NAME, 0).edit();
        edit.putBoolean("is_agreed_gd_privacy", true);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
        TLog.logi(f26691a, "agreed privacy policy");
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : context.getSharedPreferences(SP_NAME, 0).getBoolean("is_agreed_gd_privacy", false);
    }

    public static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{context, new Boolean(z)});
        } else if (context == null || a(context)) {
        } else {
            AMapLocationClient.updatePrivacyShow(context, true, true);
            AMapLocationClient.updatePrivacyAgree(context, true);
            a(context, z);
        }
    }
}

package com.taobao.dai.realtimedebug;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.c;
import com.tmall.android.dai.internal.config.d;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REALTIME_DEBUG = "WVTaobaoDeviceAIWithParam";

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.equals("startRealtimeDebug", str) && !TextUtils.isEmpty(str2)) {
            return a(str2, false);
        }
        return false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(b(), true);
        }
    }

    private static void a(String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        Context b = c.b();
        if (b == null || (sharedPreferences = b.getSharedPreferences(d.DAI_ORANGE_SWITCH, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString("realtime_debug_config", str).apply();
    }

    private static String b() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        Context b = c.b();
        if (b != null && (sharedPreferences = b.getSharedPreferences(d.DAI_ORANGE_SWITCH, 0)) != null) {
            return sharedPreferences.getString("realtime_debug_config", "");
        }
        return null;
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        RealtimeDebugConfig realtimeDebugConfig = null;
        try {
            realtimeDebugConfig = (RealtimeDebugConfig) JSON.parseObject(str, RealtimeDebugConfig.class);
        } catch (Throwable th) {
            com.taobao.mrt.utils.a.a("MRTRealtimeDebugHandle", "", th);
        }
        if (realtimeDebugConfig == null && TextUtils.isEmpty(realtimeDebugConfig.debugId)) {
            return false;
        }
        com.taobao.mrt.utils.a.a(realtimeDebugConfig.debugId);
        com.taobao.mrt.utils.a.a(realtimeDebugConfig.clog);
        if (!z) {
            if (realtimeDebugConfig.permanentTest) {
                a(str);
            } else {
                a("");
            }
        }
        com.taobao.mrt.utils.a.e("MRTRealtimeDebugHandle", "开启实时调试模式。");
        return true;
    }
}

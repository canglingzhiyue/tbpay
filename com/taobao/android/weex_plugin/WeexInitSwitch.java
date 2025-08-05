package com.taobao.android.weex_plugin;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.Map;
import tb.ihq;
import tb.jvf;

/* loaded from: classes6.dex */
public class WeexInitSwitch implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "[Weex]InitSwitch";
    private static boolean sIsRemoteQking = false;
    private static boolean sLoaded = false;

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            updateOrangeAndSP();
        }
    }

    static {
        try {
            sIsRemoteQking = Globals.getApplication().getSharedPreferences("weex_2_preference", 0).getBoolean("UseRemoteQking", false);
            Log.e(LOG_TAG, "libquickjs so ab: local sp: " + sIsRemoteQking);
            OrangeConfig.getInstance().registerListener(new String[]{"qking_so_ab_config"}, new d() { // from class: com.taobao.android.weex_plugin.WeexInitSwitch.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else {
                        WeexInitSwitch.access$000();
                    }
                }
            }, true);
            updateOrangeAndSP();
        } catch (Throwable th) {
            Log.e(LOG_TAG, "libquickjs so ab: init failed, fallback to false", th);
            sIsRemoteQking = false;
        }
    }

    private static synchronized void updateOrangeAndSP() {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40b15664", new Object[0]);
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("qking_so_ab_config", "useRemote", null);
            if (config == null) {
                Log.e(LOG_TAG, "libquickjs so ab: update orange: remote no orange");
                return;
            }
            Log.e(LOG_TAG, "libquickjs so ab: update orange: remote orange: " + config);
            boolean equals = "true".equals(config);
            sIsRemoteQking = equals;
            Globals.getApplication().getSharedPreferences("weex_2_preference", 0).edit().putBoolean("UseRemoteQking", equals).apply();
        }
    }

    public static synchronized boolean isRemoteQking() {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d40fa3e3", new Object[0])).booleanValue();
            }
            Log.e(LOG_TAG, "libquickjs so ab: orange read: remote " + sIsRemoteQking);
            return sIsRemoteQking;
        }
    }

    public static synchronized void loadRemoteQking(Application application) {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf3079c", new Object[]{application});
            } else if (sLoaded) {
            } else {
                sLoaded = true;
                if (isRemoteQking()) {
                    Log.e(LOG_TAG, "libquickjs so ab: orange true, use remote");
                    if (ihq.a().b("quickjs").g()) {
                        Log.e(LOG_TAG, "libquickjs so ab: use remote libquickjs");
                        jvf.g = true;
                        return;
                    }
                    Log.e(LOG_TAG, "libquickjs so ab: use apk libquickjs");
                    jvf.g = false;
                    return;
                }
                Log.e(LOG_TAG, "libquickjs so ab: orange false, use local");
            }
        }
    }
}

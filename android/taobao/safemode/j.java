package android.taobao.safemode;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        OrangeConfig.getInstance().getConfigs("SafeModeOrange");
        OrangeConfig.getInstance().registerListener(new String[]{"SafeModeOrange"}, new a(application), true);
    }

    /* loaded from: classes.dex */
    public static class a implements com.taobao.orange.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Application f1530a;

        public a(Application application) {
            this.f1530a = application;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("SafeModeOrange");
            if (configs == null || configs.size() <= 0) {
                return;
            }
            a(configs);
        }

        private void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            SharedPreferences.Editor edit = this.f1530a.getSharedPreferences("SafeModeOrange", 0).edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    edit.putString(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    Log.e("SafeModeOrange", e.toString());
                }
            }
            edit.apply();
        }
    }
}

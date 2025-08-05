package com.taobao.android.tcrash;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a7397a7b", new Object[0]) : new g();
    }

    private g() {
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"CrashReportSwitcher"}, new a(application), true);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements com.taobao.orange.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Context f15511a;

        public a(Context context) {
            this.f15511a = context;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("CrashReportSwitcher");
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
            SharedPreferences.Editor edit = this.f15511a.getSharedPreferences(FeatureManager.FEATURE_KEY_CRASH, 0).edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), entry.getValue());
            }
            edit.apply();
        }
    }
}

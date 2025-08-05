package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes3.dex */
public class Jb implements com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Kb f3251a;

    public Jb(Kb kb) {
        this.f3251a = kb;
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        Map<String, String> configs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        String str2 = map.get("configVersion");
        char c = 65535;
        if (str.hashCode() == 424245400 && str.equals(Kb.f3254a)) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        Kb kb = this.f3251a;
        if (TextUtils.equals(str2, (String) Kb.$ipChange.a("configVersion", "")) || (configs = OrangeConfig.getInstance().getConfigs(Kb.f3254a)) == null || configs.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : configs.entrySet()) {
            Kb kb2 = this.f3251a;
            Kb.$ipChange.b(entry.getKey(), entry.getValue());
        }
        Kb kb3 = this.f3251a;
        Kb.$ipChange.b("configVersion", str2);
    }
}

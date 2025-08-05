package com.ut.mini.behavior.config;

import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.apr;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class a implements UTClientConfigMgr.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-996867315);
        kge.a(1816215568);
    }

    @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : "ut_event";
    }

    private a() {
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        UTClientConfigMgr.a().a(new a());
    }

    @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
    public void onChange(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
        } else {
            a(str);
        }
    }

    private void a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        apr.b("UTBehaviorConfigListener", "parseConfig value", str);
        long j = 0;
        String str3 = "";
        if (!aqc.e(str)) {
            try {
                Map map = (Map) JSONObject.parseObject(str, Map.class);
                if (map == null || map.size() <= 0) {
                    str2 = str3;
                } else {
                    str2 = str3 + map.get("config_dir");
                }
                if (!aqc.e(str2)) {
                    j = Long.parseLong(str2.substring(str2.lastIndexOf("/") + 1));
                }
                str3 = str2;
            } catch (Exception unused) {
            }
        }
        b.a(str3, j);
    }
}

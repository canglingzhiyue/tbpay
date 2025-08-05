package com.alibaba.analytics.core.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.aob;
import tb.apr;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class o extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(796499456);
    }

    @Override // com.alibaba.analytics.core.config.g
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            OrangeConfig.getInstance().init(aob.a().k());
            aqe.a().a(new Runnable() { // from class: com.alibaba.analytics.core.config.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        o.this.b();
                    }
                }
            });
            OrangeConfig.getInstance().registerListener(b, new com.taobao.orange.g() { // from class: com.alibaba.analytics.core.config.o.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        return;
                    }
                    apr.b((String) null, "aGroupname", str, "aIsCached", Boolean.valueOf(z));
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                    if (configs == null) {
                        return;
                    }
                    o.this.a(str, configs);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

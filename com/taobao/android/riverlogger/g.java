package com.taobao.android.riverlogger;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.common.WXConfig;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1669643824);
    }

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            b(map);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"riverlogger"}, new com.taobao.orange.d() { // from class: com.taobao.android.riverlogger.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else if (!"riverlogger".equals(str)) {
                    } else {
                        g.a(OrangeConfig.getInstance().getConfigs("riverlogger"));
                    }
                }
            }, true);
        } catch (NoClassDefFoundError unused) {
        }
    }

    private static void b(Map<String, String> map) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        String str = map.get(WXConfig.logLevel);
        if (str == null || (parseInt = Integer.parseInt(str)) < RVLLevel.Off.value || parseInt > RVLLevel.Verbose.value) {
            return;
        }
        e.a(RVLLevel.valueOf(parseInt, RVLLevel.Info));
    }
}

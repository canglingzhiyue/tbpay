package com.taobao.family;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CUSTOM_ORANGE_NAME = "TBSocialSDK";
    public static final String KEY_SHOULD_GET_FAMILY_WHEN_COLD_START = "getFamilyWhenColdStart";

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b();
        OrangeConfig.getInstance().registerListener(new String[]{CUSTOM_ORANGE_NAME}, new com.taobao.orange.g() { // from class: com.taobao.family.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else if (!str.equals(g.CUSTOM_ORANGE_NAME) || z) {
                } else {
                    String str2 = "onConfigUpdate:" + str;
                    String str3 = "onConfigUpdate:" + str;
                    g.b();
                }
            }
        });
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(CUSTOM_ORANGE_NAME, KEY_SHOULD_GET_FAMILY_WHEN_COLD_START, "true");
            f.f17132a.b = Boolean.valueOf(config).booleanValue();
        } catch (Exception e) {
            android.taobao.util.k.a("FamilyOrangeConfig", "parse orange error, " + e.toString());
        }
    }
}

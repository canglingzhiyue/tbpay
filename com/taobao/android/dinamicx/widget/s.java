package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.fqk;
import tb.fql;

/* loaded from: classes.dex */
public class s implements fql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.fql
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    @Override // tb.fql
    public void a(String[] strArr, final fqk fqkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2812f18d", new Object[]{this, strArr, fqkVar, new Boolean(z)});
        } else {
            OrangeConfig.getInstance().registerListener(strArr, new com.taobao.orange.d() { // from class: com.taobao.android.dinamicx.widget.s.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else {
                        fqkVar.a(str, map);
                    }
                }
            }, z);
        }
    }
}

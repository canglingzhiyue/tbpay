package com.taobao.taobao.scancode.gateway.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.css;
import tb.kge;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(933209866);
    }

    public static css a(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (css) ipChange.ipc$dispatch("7c6e0c71", new Object[]{str}) : new css() { // from class: com.taobao.taobao.scancode.gateway.util.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.css
            public HashMap<String, String> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (HashMap) ipChange2.ipc$dispatch("be7c57cb", new Object[]{this});
                }
                HashMap<String, String> hashMap = new HashMap<>(3);
                hashMap.put("spm", str);
                return hashMap;
            }
        };
    }
}

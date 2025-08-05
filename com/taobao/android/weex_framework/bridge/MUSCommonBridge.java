package com.taobao.android.weex_framework.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.c;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSCommonBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1177808597);
        kge.a(1028243835);
    }

    public static boolean isDebugApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da19bb52", new Object[0])).booleanValue() : m.c();
    }

    public static void sendRequest(String str, Map<String, String> map, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8351117", new Object[]{str, map, new Long(j)});
            return;
        }
        c.a aVar = new c.a() { // from class: com.taobao.android.weex_framework.bridge.MUSCommonBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(int i, Map<String, List<String>> map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map2});
                }
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(com.taobao.android.weex_framework.common.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2660175d", new Object[]{this, bVar});
                    return;
                }
                HashMap hashMap = new HashMap();
                if (bVar != null && bVar.f != null) {
                    for (String str2 : bVar.f.keySet()) {
                        List<String> list = bVar.f.get(str2);
                        if (list != null) {
                            hashMap.put(str2, list.get(0));
                        }
                    }
                }
                int parseInt = Integer.parseInt(bVar.f15987a);
                if (parseInt == 200) {
                    bVar.d = "";
                }
                MUSCommonNativeBridge.a(bVar.b == null ? new byte[1] : bVar.b, parseInt, bVar.d, hashMap, j);
            }
        };
        if (l.a().l() != null && l.a().l().a(str, map, aVar)) {
            return;
        }
        com.taobao.android.weex_framework.common.a aVar2 = new com.taobao.android.weex_framework.common.a();
        aVar2.c = str;
        aVar2.b.putAll(map);
        aVar2.d = "GET";
        l.a().g().a(aVar2, aVar);
    }
}

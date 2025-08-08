package com.taobao.flowcustoms.afc.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.kge;
import tb.kof;
import tb.kog;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(126508005);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        kog.a().f.onEvent(new kof() { // from class: com.taobao.flowcustoms.afc.utils.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kof
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // tb.kof
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                AfcCustomSdk.i = true;
                if (!AfcCustomSdk.j.compareAndSet(false, true)) {
                    return;
                }
                String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                HashMap hashMap = new HashMap();
                hashMap.put("flowLeave", String.valueOf(System.currentTimeMillis()));
                String e = kog.a().e();
                String g = kog.a().g();
                if (!StringUtils.isEmpty(e)) {
                    if (!StringUtils.isEmpty(g)) {
                        e = e + "_" + g;
                    }
                    hashMap.put("pageName", e);
                }
                String f = kog.a().f();
                if (!StringUtils.isEmpty(f)) {
                    hashMap.put("pageUrl", f);
                }
                b.a(1013, b.AFC_FLOW_LEAVE, globalProperty, "", hashMap);
                g.b(null);
            }
        });
        com.ut.mini.module.trackerlistener.b.getInstance().registerListener(new com.ut.mini.module.trackerlistener.a() { // from class: com.taobao.flowcustoms.afc.utils.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.mini.module.trackerlistener.a
            public String trackerListenerName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1d8246a2", new Object[]{this}) : "AfcSessionUpdateListener";
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void sessionTimeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17d804f2", new Object[]{this});
                } else if (!AfcCustomSdk.i) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("currentPackageName", "com.taobao.taobao");
                    hashMap.put("generateType", "sessionTimeout");
                    String a2 = AfcUtils.a(AfcUtils.FlowType.LAUNCH, "", hashMap);
                    c.b("linkx", "AfcIdUpdate === registerSessionUpdate === session发生变化，更新后的afc_id：" + a2);
                }
            }
        });
    }
}

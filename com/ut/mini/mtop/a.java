package com.ut.mini.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.stat.MtopMonitor;
import tb.apr;
import tb.aqc;
import tb.kge;
import tb.rqd;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24138a;
    private static final int[] b;

    public static /* synthetic */ int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[0]) : b;
    }

    static {
        kge.a(1332894324);
        f24138a = false;
        b = new int[]{2001};
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!rqd.bUTMtopConfig) {
            apr.c("UTMtopConfigExtend", "disable UTMtopConfig");
        } else if (f24138a) {
        } else {
            f24138a = true;
            try {
                MtopMonitor.addResponseHeaderMonitor("mtop-x-ut-config", new c());
                apr.c("UTMtopConfigExtend", "addResponseHeaderMonitor");
                com.ut.mini.module.plugin.d.getInstance().registerPlugin(new com.ut.mini.module.plugin.a() { // from class: com.ut.mini.mtop.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ut.mini.module.plugin.a
                    public String getPluginName() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("fd12a725", new Object[]{this}) : "UTMtopConfig";
                    }

                    @Override // com.ut.mini.module.plugin.a
                    public int[] getAttentionEventIds() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (int[]) ipChange2.ipc$dispatch("873e4cb7", new Object[]{this}) : a.a();
                    }

                    @Override // com.ut.mini.module.plugin.a
                    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
                        }
                        try {
                            String b2 = b.b(str);
                            if (aqc.e(b2)) {
                                return null;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("utparam-cnt", b2);
                            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(b2);
                            return hashMap;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                });
            } catch (Throwable th) {
                apr.a("UTMtopConfigExtend", th, "初始化UTMtopMonitor监听失败");
            }
        }
    }
}

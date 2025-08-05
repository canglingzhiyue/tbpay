package com.network.diagnosis.model;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.statistics.ServerExceptionStat;
import com.network.diagnosis.statistics.SlowServerRTStat;
import java.util.Map;
import tb.czd;
import tb.cze;

/* loaded from: classes.dex */
public class b implements com.network.diagnosis.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f8044a = new b();

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4e7a74ca", new Object[0]) : f8044a;
        }
    }

    public static /* synthetic */ void a(b bVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f4253b", new Object[]{bVar, map});
        } else {
            bVar.b(map);
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4e7a74ca", new Object[0]) : a.a();
    }

    @Override // com.network.diagnosis.c
    public void a(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            czd.b(new Runnable() { // from class: com.network.diagnosis.model.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        b.a(b.this, map);
                    } catch (Throwable unused) {
                        ALog.e("npm.ServerDetector", "checkRequest error", null, new Object[0]);
                    }
                }
            });
        }
    }

    private void b(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            long longValue = ((Long) map.get("serverRT")).longValue();
            int intValue = ((Integer) map.get("code")).intValue();
            String str = (String) map.get("host");
            String str2 = (String) map.get("url");
            String str3 = (String) map.get("protocol");
            String str4 = (String) map.get(com.network.diagnosis.c.IP);
            String str5 = (String) map.get(com.network.diagnosis.c.EAGLE_EYE_ID);
            if (longValue >= cze.b()) {
                SlowServerRTStat slowServerRTStat = new SlowServerRTStat();
                slowServerRTStat.serverRt = longValue;
                slowServerRTStat.code = intValue;
                slowServerRTStat.url = str2;
                slowServerRTStat.eagleEyeId = str5;
                slowServerRTStat.host = str;
                slowServerRTStat.userType = c.b().c();
                obj = "protocol";
                ALog.e("npm.ServerDetector", "slow server rt detect.", null, "url", str2, "serverRT", Long.valueOf(longValue), com.network.diagnosis.c.EAGLE_EYE_ID, str5);
                AppMonitor.getInstance().commitStat(slowServerRTStat);
            } else {
                obj = "protocol";
            }
            if (intValue == 200 || !cze.a(str)) {
                return;
            }
            ServerExceptionStat serverExceptionStat = new ServerExceptionStat();
            serverExceptionStat.host = str;
            serverExceptionStat.url = str2;
            serverExceptionStat.protocol = str3;
            serverExceptionStat.ip = str4;
            serverExceptionStat.code = intValue;
            ALog.e("npm.ServerDetector", "server exception detect.", null, "host", str, com.network.diagnosis.c.IP, str4, obj, str3, "code", Integer.valueOf(intValue));
            AppMonitor.getInstance().commitStat(serverExceptionStat);
        }
    }
}

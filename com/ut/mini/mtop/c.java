package com.ut.mini.mtop;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.stat.IMtopMonitor;
import tb.kge;

/* loaded from: classes.dex */
public class c implements IMtopMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1624830750);
        kge.a(498840314);
    }

    @Override // mtopsdk.mtop.stat.IMtopMonitor
    public void onCommit(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6701704c", new Object[]{this, str, hashMap});
            return;
        }
        try {
            if (!StringUtils.equals(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, str) || hashMap == null) {
                return;
            }
            String str2 = hashMap.get("mtop-x-ut-config");
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            b.a(str2);
        } catch (Throwable unused) {
        }
    }
}

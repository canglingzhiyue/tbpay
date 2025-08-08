package com.alibaba.ut.abtest.track;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.stat.IMtopMonitor;
import tb.kge;

/* loaded from: classes.dex */
public class a implements IMtopMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(201838488);
        kge.a(498840314);
    }

    @Override // mtopsdk.mtop.stat.IMtopMonitor
    public void onCommit(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6701704c", new Object[]{this, str, hashMap});
            return;
        }
        h.a("TrackMtopMonitor", "接收到MTOP响应信息, type=" + str + ", data=" + hashMap);
        try {
            if (!StringUtils.equals(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, str) || hashMap == null) {
                return;
            }
            String str2 = hashMap.get(HttpHeaderConstant.X_AB);
            if (!StringUtils.isEmpty(str2)) {
                UTABTest.activateServer(str2);
                return;
            }
            String str3 = hashMap.get("mtop-x-ali-ab");
            if (StringUtils.isEmpty(str3)) {
                return;
            }
            UTABTest.activateServer(str3);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("TrackMtopMonitor.onCommit", th);
        }
    }
}

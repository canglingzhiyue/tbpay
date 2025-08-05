package com.network.diagnosis.product;

import anet.channel.util.ALog;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.x;
import tb.fmx;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            fmx fmxVar = new fmx();
            fmxVar.a(AmnetMonitorLoggerListener.LogModel.ERR_CODE, -999);
            x.a().a("network_diagnosis", fmxVar);
            return true;
        } catch (Throwable th) {
            ALog.e("FeedbackUtils", "sceneTrigger failed !", null, th, new Object[0]);
            return false;
        }
    }
}

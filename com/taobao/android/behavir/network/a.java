package com.taobao.android.behavir.network;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.intf.Mtop;
import tb.dsj;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(280299122);
    }

    public static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? "UNIT_TRADE" : "UNIT_GUIDE";
    }

    public static void a(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809d8688", new Object[]{remoteBusiness});
            return;
        }
        Mtop mtopInstance = remoteBusiness.getMtopInstance();
        if (mtopInstance != null) {
            String multiAccountUserId = mtopInstance.getMultiAccountUserId("DEFAULT");
            String str = dsj.f26943a;
            if (StringUtils.isEmpty(multiAccountUserId) && !StringUtils.isEmpty(str) && com.taobao.android.behavix.behavixswitch.a.a("enableMTOPUserId", true)) {
                remoteBusiness.mo1325setReqUserId(str);
                TLog.loge("UCP", "UppMTopRequest", "change mtop userid");
            }
        }
        if (!com.taobao.android.behavix.behavixswitch.a.a("enableMtopSession", true)) {
            return;
        }
        remoteBusiness.mo1342showLoginUI(false);
    }
}

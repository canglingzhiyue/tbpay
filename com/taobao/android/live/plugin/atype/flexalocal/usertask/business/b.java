package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.hkk;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1473216932);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(long j, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35edbc3a", new Object[]{this, new Long(j), str, str2, str3});
            return;
        }
        MtopIliadUsertaskTasksDotaskRequest mtopIliadUsertaskTasksDotaskRequest = new MtopIliadUsertaskTasksDotaskRequest();
        mtopIliadUsertaskTasksDotaskRequest.deliveryId = j;
        mtopIliadUsertaskTasksDotaskRequest.liveSource = str;
        mtopIliadUsertaskTasksDotaskRequest.entryLiveSource = str2;
        mtopIliadUsertaskTasksDotaskRequest.userTaskParams = str3;
        if (hkk.M()) {
            mtopIliadUsertaskTasksDotaskRequest.appVersion = "20240923";
        }
        a(0, mtopIliadUsertaskTasksDotaskRequest, MtopIliadUsertaskTasksDotaskResponse.class);
    }
}

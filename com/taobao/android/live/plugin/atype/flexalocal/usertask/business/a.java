package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.hkk;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1162418660);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a154e70", new Object[]{this, new Long(j), str, str2});
            return;
        }
        MtopIliadUsertaskTasksEntryclickRequest mtopIliadUsertaskTasksEntryclickRequest = new MtopIliadUsertaskTasksEntryclickRequest();
        mtopIliadUsertaskTasksEntryclickRequest.setDeliveryId(j);
        mtopIliadUsertaskTasksEntryclickRequest.setLiveSource(str);
        mtopIliadUsertaskTasksEntryclickRequest.setEntryLiveSource(str2);
        if (hkk.M()) {
            mtopIliadUsertaskTasksEntryclickRequest.setAppVersion("20240923");
        }
        a(0, mtopIliadUsertaskTasksEntryclickRequest, MtopIliadUsertaskTasksEntryclickResponse.class);
    }
}

package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.utils.o;
import tb.hkk;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2030018310);
    }

    public c(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        MtopIliadUsertaskTasksEntryRequest mtopIliadUsertaskTasksEntryRequest = new MtopIliadUsertaskTasksEntryRequest();
        if (o.c()) {
            mtopIliadUsertaskTasksEntryRequest.API_NAME = "mtop.iliad.usertask.tasks.liveroom.entry";
        }
        mtopIliadUsertaskTasksEntryRequest.liveSource = str;
        mtopIliadUsertaskTasksEntryRequest.entryLiveSource = str2;
        mtopIliadUsertaskTasksEntryRequest.userTaskParams = str3;
        mtopIliadUsertaskTasksEntryRequest.creatorId = str5;
        mtopIliadUsertaskTasksEntryRequest.liveId = str4;
        if (hkk.M()) {
            mtopIliadUsertaskTasksEntryRequest.appVersion = "20240923";
        }
        a(0, mtopIliadUsertaskTasksEntryRequest, MtopIliadUsertaskTasksEntryResponse.class);
    }
}

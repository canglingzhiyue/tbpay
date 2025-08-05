package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopIliadUsertaskTasksEntryclickResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopIliadUsertaskTasksEntryclickResponseData data;

    static {
        kge.a(-1320434160);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopIliadUsertaskTasksEntryclickResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksEntryclickResponseData) ipChange.ipc$dispatch("6382fb64", new Object[]{this}) : this.data;
    }

    public void setData(MtopIliadUsertaskTasksEntryclickResponseData mtopIliadUsertaskTasksEntryclickResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec3c048", new Object[]{this, mtopIliadUsertaskTasksEntryclickResponseData});
        } else {
            this.data = mtopIliadUsertaskTasksEntryclickResponseData;
        }
    }
}

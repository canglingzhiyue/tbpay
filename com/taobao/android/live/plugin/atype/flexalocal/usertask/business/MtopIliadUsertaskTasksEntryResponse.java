package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopIliadUsertaskTasksEntryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopIliadUsertaskTasksEntryResponseData data;

    static {
        kge.a(1209347034);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopIliadUsertaskTasksEntryResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksEntryResponseData) ipChange.ipc$dispatch("d1759274", new Object[]{this}) : this.data;
    }

    public void setData(MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160d7fca", new Object[]{this, mtopIliadUsertaskTasksEntryResponseData});
        } else {
            this.data = mtopIliadUsertaskTasksEntryResponseData;
        }
    }
}

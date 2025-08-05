package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopIliadUsertaskTasksDotaskResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopIliadUsertaskTasksDotaskResponseData data;

    static {
        kge.a(266031306);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopIliadUsertaskTasksDotaskResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksDotaskResponseData) ipChange.ipc$dispatch("88a46e6a", new Object[]{this}) : this.data;
    }

    public void setData(MtopIliadUsertaskTasksDotaskResponseData mtopIliadUsertaskTasksDotaskResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be66d4e", new Object[]{this, mtopIliadUsertaskTasksDotaskResponseData});
        } else {
            this.data = mtopIliadUsertaskTasksDotaskResponseData;
        }
    }
}

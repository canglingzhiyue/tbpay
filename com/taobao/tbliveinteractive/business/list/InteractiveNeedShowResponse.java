package com.taobao.tbliveinteractive.business.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class InteractiveNeedShowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private InteractiveShowInfo data;

    static {
        kge.a(-640718246);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public InteractiveShowInfo mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InteractiveShowInfo) ipChange.ipc$dispatch("c57c3a8d", new Object[]{this}) : this.data;
    }

    public void setData(InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52c0331", new Object[]{this, interactiveShowInfo});
        } else {
            this.data = interactiveShowInfo;
        }
    }
}

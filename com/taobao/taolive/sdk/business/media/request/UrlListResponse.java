package com.taobao.taolive.sdk.business.media.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class UrlListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UrlListInfo data;

    static {
        kge.a(1277002557);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public UrlListInfo mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UrlListInfo) ipChange.ipc$dispatch("a229e22e", new Object[]{this}) : this.data;
    }

    public void setData(UrlListInfo urlListInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f85f04", new Object[]{this, urlListInfo});
        } else {
            this.data = urlListInfo;
        }
    }
}

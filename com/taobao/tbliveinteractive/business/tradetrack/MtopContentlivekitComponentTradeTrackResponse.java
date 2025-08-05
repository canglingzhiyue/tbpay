package com.taobao.tbliveinteractive.business.tradetrack;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopContentlivekitComponentTradeTrackResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String data;

    static {
        kge.a(-756261223);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public String mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }
}

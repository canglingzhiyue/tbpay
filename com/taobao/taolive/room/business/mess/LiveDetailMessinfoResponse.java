package com.taobao.taolive.room.business.mess;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveDetailMessinfoResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveDetailMessinfoResponseData data;

    static {
        kge.a(-1164063380);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveDetailMessinfoResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailMessinfoResponseData) ipChange.ipc$dispatch("77a1c148", new Object[]{this}) : this.data;
    }

    public void setData(LiveDetailMessinfoResponseData liveDetailMessinfoResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106a39ec", new Object[]{this, liveDetailMessinfoResponseData});
        } else {
            this.data = liveDetailMessinfoResponseData;
        }
    }
}

package com.taobao.tbliveinteractive.business.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class InteractiveNeedShowListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap<String, InteractiveShowInfo> data;

    static {
        kge.a(195972248);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public HashMap<String, InteractiveShowInfo> mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("1d90c64a", new Object[]{this}) : this.data;
    }

    public void setData(HashMap<String, InteractiveShowInfo> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fd2920", new Object[]{this, hashMap});
        } else {
            this.data = hashMap;
        }
    }
}

package com.taobao.android.tab2liveroom.liveroom.preload.business;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class PreloadRecommendResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "data")
    public a data;

    /* loaded from: classes6.dex */
    public class a {
        @JSONField(name = "data")

        /* renamed from: a  reason: collision with root package name */
        public LivePreloadData f15306a;

        static {
            kge.a(-720836991);
        }
    }

    static {
        kge.a(1901263757);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public a mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4c9a5ff4", new Object[]{this}) : this.data;
    }

    public LivePreloadData getPreloadResponseData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LivePreloadData) ipChange.ipc$dispatch("34b4322f", new Object[]{this});
        }
        a aVar = this.data;
        if (aVar != null) {
            return aVar.f15306a;
        }
        return null;
    }

    public void setData(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9864f98", new Object[]{this, aVar});
        } else {
            this.data = aVar;
        }
    }
}

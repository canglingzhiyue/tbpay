package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class GoodListSearchResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GoodListSearchResponseData data;

    /* loaded from: classes4.dex */
    public static class GoodListSearchResponseData implements INetDataObject {
        public boolean hasNext;
        public List<ItemlistV2ResponseData.ItemListv1> itemListv1;
        public int totalNum;

        static {
            kge.a(-894834619);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-2109317491);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public GoodListSearchResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GoodListSearchResponseData) ipChange.ipc$dispatch("7095f733", new Object[]{this}) : this.data;
    }
}

package com.taobao.android.detail.wrapper.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class KAPRemoveClient extends MtopRequestClient<KAPRemoveLikeRequestParams, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1123211810);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.alibaba.detail.interaction.removeLike";
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    public KAPRemoveClient(KAPRemoveLikeRequestParams kAPRemoveLikeRequestParams, String str, MtopRequestListener mtopRequestListener) {
        super(kAPRemoveLikeRequestParams, str, mtopRequestListener);
        emu.a("com.taobao.android.detail.wrapper.request.KAPRemoveClient");
    }
}

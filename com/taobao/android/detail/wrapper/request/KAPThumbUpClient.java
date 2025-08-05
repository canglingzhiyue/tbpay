package com.taobao.android.detail.wrapper.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.wrapper.request.size.model.KAPThumbUpRequestParams;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class KAPThumbUpClient extends MtopRequestClient<KAPThumbUpRequestParams, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1051176983);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.alibaba.detail.interaction.thumbUp";
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    public KAPThumbUpClient(KAPThumbUpRequestParams kAPThumbUpRequestParams, String str, MtopRequestListener mtopRequestListener) {
        super(kAPThumbUpRequestParams, str, mtopRequestListener);
        emu.a("com.taobao.android.detail.wrapper.request.KAPThumbUpClient");
    }
}

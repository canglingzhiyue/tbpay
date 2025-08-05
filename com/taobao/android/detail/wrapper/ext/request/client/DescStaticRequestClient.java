package com.taobao.android.detail.wrapper.ext.request.client;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.desc.DescMtopStaticRequestParams;
import com.taobao.android.trade.boost.annotations.MtopParams;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class DescStaticRequestClient extends MtopRequestClient<DescMtopStaticRequestParams, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getdesc";
    private static final String API_VERSION = "7.0";
    public static final String TAG = "MtopDescLayoutClient";

    static {
        kge.a(-2059013140);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "7.0";
    }

    public DescStaticRequestClient(DescMtopStaticRequestParams descMtopStaticRequestParams, String str, MtopRequestListener<String> mtopRequestListener) {
        super(descMtopStaticRequestParams, str, mtopRequestListener);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.DescStaticRequestClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        String str = null;
        if (mtopResponse.getBytedata() != null) {
            str = new String(mtopResponse.getBytedata());
        }
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (str == null) {
            mtopRequestListener.a(mtopResponse);
        } else {
            mtopRequestListener.b(str);
        }
    }
}

package com.taobao.android.detail.sdk.request.area;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.network.area.AreaInfoModel;
import com.taobao.android.detail.sdk.request.MtopRequestClient;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import com.taobao.android.trade.boost.annotations.MtopParams;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QuerySupportedAreaRequestClient extends MtopRequestClient<a, AreaInfoModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "com.taobao.detail.dynamic.queryarea";
    private static final String API_VERSION = "1.0";

    static {
        kge.a(-495566107);
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    public QuerySupportedAreaRequestClient(a aVar, String str, MtopRequestListener<AreaInfoModel> mtopRequestListener) {
        super(aVar, str, mtopRequestListener);
        tpc.a("com.taobao.android.detail.sdk.request.area.QuerySupportedAreaRequestClient");
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.mRemoteBusiness == null) {
        } else {
            this.mRemoteBusiness.startRequest(QuerySupportedAreaResult.class);
        }
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        QuerySupportedAreaResult querySupportedAreaResult = baseOutDo instanceof QuerySupportedAreaResult ? (QuerySupportedAreaResult) baseOutDo : null;
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        if (querySupportedAreaResult != null) {
            mtopRequestListener.a(querySupportedAreaResult.mo2429getData());
        } else {
            mtopRequestListener.a(null);
        }
    }
}

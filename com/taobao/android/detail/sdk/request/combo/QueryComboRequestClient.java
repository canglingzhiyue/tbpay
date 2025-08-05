package com.taobao.android.detail.sdk.request.combo;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.network.combo.QueryComboData;
import com.taobao.android.detail.sdk.model.network.combo.QueryComboResult;
import com.taobao.android.detail.sdk.request.MtopRequestClient;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QueryComboRequestClient extends MtopRequestClient<a, QueryComboData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "QueryComboRequestClient";
    private final String mApiName;
    private final String mApiVersion;

    static {
        kge.a(695646355);
    }

    public QueryComboRequestClient(String str, String str2, a aVar, String str3, MtopRequestListener<QueryComboData> mtopRequestListener) {
        super(aVar, str3, mtopRequestListener);
        tpc.a("com.taobao.android.detail.sdk.request.combo.QueryComboRequestClient");
        this.mApiVersion = str2;
        this.mApiName = str;
        MtopRequest mtopRequest = new MtopRequest();
        configMtopRequest(mtopRequest);
        this.mRemoteBusiness = RemoteBusiness.build(mtopRequest, str3);
        configRemoteBusiness(this.mRemoteBusiness);
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : this.mApiName;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : TextUtils.isEmpty(this.mApiVersion) ? "1.0" : this.mApiVersion;
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
        } else {
            this.mRemoteBusiness.startRequest(QueryComboResult.class);
        }
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        QueryComboResult queryComboResult = baseOutDo != null ? (QueryComboResult) baseOutDo : null;
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        if (queryComboResult != null) {
            mtopRequestListener.a(queryComboResult.mo2429getData());
        } else {
            mtopRequestListener.a(null);
        }
    }
}

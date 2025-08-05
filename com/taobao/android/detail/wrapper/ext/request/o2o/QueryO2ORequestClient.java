package com.taobao.android.detail.wrapper.ext.request.o2o;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class QueryO2ORequestClient extends AbsMtopRequestClient<a, QueryO2OData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "QueryO2ORequestClient";

    static {
        kge.a(1142292318);
    }

    public static /* synthetic */ Object ipc$super(QueryO2ORequestClient queryO2ORequestClient, String str, Object... objArr) {
        if (str.hashCode() == 1384478442) {
            super.setupMtopRequest((MtopRequest) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.place.wap.poi.get";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : "";
    }

    public QueryO2ORequestClient() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.o2o.QueryO2ORequestClient");
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void setupMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528576ea", new Object[]{this, mtopRequest});
            return;
        }
        super.setupMtopRequest(mtopRequest);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(false);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void setupRemoteBusiness(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35df7aa", new Object[]{this, remoteBusiness});
        } else {
            remoteBusiness.mo1305reqMethod(MethodEnum.GET);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        this.isRequesting = false;
        QueryO2ODataOutDo_ queryO2ODataOutDo_ = baseOutDo != null ? (QueryO2ODataOutDo_) baseOutDo : null;
        com.taobao.android.trade.boost.request.mtop.a aVar = (com.taobao.android.trade.boost.request.mtop.a) this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        try {
            if (queryO2ODataOutDo_ != null) {
                aVar.onSuccess(queryO2ODataOutDo_.mo2429getData());
            } else {
                aVar.onSuccess(null);
            }
        } catch (Throwable th) {
            i.a(TAG, "Call onSuccess exception : ", th);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void sendRequest(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21b8a8e", new Object[]{this, remoteBusiness});
        } else {
            remoteBusiness.startRequest(QueryO2ODataOutDo_.class);
        }
    }
}

package com.taobao.android.detail.sdk.request.client;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.combinegood.CQueryCombineGoodListResult;
import com.taobao.android.detail.sdk.request.combinegood.CQueryCombineGoodListResultOutDo_;
import com.taobao.android.detail.sdk.request.combinegood.CQueryCombineGoodRequestParams;
import com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class CQueryCombineGoodRequestClient extends AbsMtopRequestClient<CQueryCombineGoodRequestParams, CQueryCombineGoodListResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CQueryCombineClient";

    static {
        kge.a(-2049179865);
    }

    public static /* synthetic */ Object ipc$super(CQueryCombineGoodRequestClient cQueryCombineGoodRequestClient, String str, Object... objArr) {
        if (str.hashCode() == 1384478442) {
            super.setupMtopRequest((MtopRequest) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.taobao.detailskip.bundleitem";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : "UNIT_TRADE";
    }

    public CQueryCombineGoodRequestClient() {
        tpc.a("com.taobao.android.detail.sdk.request.client.CQueryCombineGoodRequestClient");
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
        CQueryCombineGoodListResultOutDo_ cQueryCombineGoodListResultOutDo_ = baseOutDo != null ? (CQueryCombineGoodListResultOutDo_) baseOutDo : null;
        a aVar = (a) this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        if (cQueryCombineGoodListResultOutDo_ != null) {
            try {
                CQueryCombineGoodListResult mo2429getData = cQueryCombineGoodListResultOutDo_.mo2429getData();
                if (mo2429getData != null) {
                    mo2429getData.mOriginalMtopData = JSONObject.parseObject(new String(mtopResponse.getBytedata()));
                }
            } catch (Throwable unused) {
            }
        }
        try {
            if (cQueryCombineGoodListResultOutDo_ != null) {
                aVar.onSuccess(cQueryCombineGoodListResultOutDo_.mo2429getData());
            } else {
                aVar.onSuccess(null);
            }
        } catch (Throwable th) {
            Log.e(TAG, "Call onSuccess exception", th);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void sendRequest(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21b8a8e", new Object[]{this, remoteBusiness});
        } else {
            remoteBusiness.startRequest(CQueryCombineGoodListResultOutDo_.class);
        }
    }
}

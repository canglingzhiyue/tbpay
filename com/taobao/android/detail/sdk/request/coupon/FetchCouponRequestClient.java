package com.taobao.android.detail.sdk.request.coupon;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchCouponRequestClient extends AbsMtopRequestClient<FetchCouponRequestParams, FetchCouponResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FetchCouponRequestClient";

    static {
        kge.a(345842819);
    }

    public static /* synthetic */ Object ipc$super(FetchCouponRequestClient fetchCouponRequestClient, String str, Object... objArr) {
        if (str.hashCode() == 1384478442) {
            super.setupMtopRequest((MtopRequest) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.shop.getshopbonus";
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

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void setupMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528576ea", new Object[]{this, mtopRequest});
            return;
        }
        super.setupMtopRequest(mtopRequest);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
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
        FetchCouponResultOutDo_ fetchCouponResultOutDo_ = baseOutDo != null ? (FetchCouponResultOutDo_) baseOutDo : null;
        a aVar = (a) this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        try {
            if (fetchCouponResultOutDo_ != null) {
                aVar.onSuccess(fetchCouponResultOutDo_.mo2429getData());
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
            remoteBusiness.startRequest(FetchCouponResultOutDo_.class);
        }
    }
}

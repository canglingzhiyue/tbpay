package com.taobao.android.trade.boost.daemon;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public class UploadStackTraceClient extends AbsMtopRequestClient<c, MtopResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public boolean allowCollectRuntimeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c03a1e50", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.shop.mc.stacktrace";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void setupRemoteBusiness(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35df7aa", new Object[]{this, remoteBusiness});
        } else {
            remoteBusiness.mo1305reqMethod(MethodEnum.POST);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void sendRequest(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21b8a8e", new Object[]{this, remoteBusiness});
        } else {
            remoteBusiness.startRequest();
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_NULL.toString();
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        com.taobao.android.trade.boost.request.mtop.a aVar = (com.taobao.android.trade.boost.request.mtop.a) this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        aVar.onSuccess(mtopResponse);
    }
}

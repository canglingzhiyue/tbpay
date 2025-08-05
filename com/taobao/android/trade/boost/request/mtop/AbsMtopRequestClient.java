package com.taobao.android.trade.boost.request.mtop;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public abstract class AbsMtopRequestClient<T1, T2> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isRequesting = false;
    public RemoteBusiness mRemoteBusiness;
    public WeakReference<a<T2>> mRequestListenerRef;
    public T1 mRequestParams;
    public String mTTID;

    public abstract String getApiName();

    public abstract String getApiVersion();

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return null;
    }

    public abstract void sendRequest(RemoteBusiness remoteBusiness);

    public abstract void setupRemoteBusiness(RemoteBusiness remoteBusiness);

    public void execute(T1 t1, a<T2> aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc6608f", new Object[]{this, t1, aVar, str});
            return;
        }
        this.mRequestParams = t1;
        this.mRequestListenerRef = new WeakReference<>(aVar);
        this.mTTID = str;
        MtopRequest mtopRequest = new MtopRequest();
        setupMtopRequest(mtopRequest);
        this.mRemoteBusiness = RemoteBusiness.build(mtopRequest, str);
        this.mRemoteBusiness.registeListener((MtopListener) this);
        String unitStrategy = getUnitStrategy();
        if (unitStrategy != null && !unitStrategy.equals(MtopParams.UnitStrategy.UNIT_NULL.toString())) {
            this.mRemoteBusiness.mo1328setUnitStrategy(unitStrategy);
        }
        setupRemoteBusiness(this.mRemoteBusiness);
        this.isRequesting = true;
        sendRequest(this.mRemoteBusiness);
        if (!allowCollectRuntimeInfo()) {
            return;
        }
        com.taobao.android.trade.boost.daemon.a.a(mtopRequest);
    }

    public void execute(T1 t1, a<T2> aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e02499", new Object[]{this, t1, aVar, str, str2});
        } else if (com.taobao.android.trade.boost.daemon.b.a().a(str2)) {
            execute(t1, aVar, str);
        } else {
            aVar.onSystemFailure(new MtopResponse(getApiName(), getApiVersion(), "ANDROID_SYS_API_FLOW_LIMIT_LOCKED", ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED));
        }
    }

    public boolean isRequesting() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48b4c1c8", new Object[]{this})).booleanValue() : this.isRequesting;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
        this.isRequesting = false;
    }

    public void setupMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528576ea", new Object[]{this, mtopRequest});
            return;
        }
        T1 t1 = this.mRequestParams;
        if (t1 instanceof b) {
            mtopRequest.setData(JSON.toJSONString(((b) t1).toMap()));
        } else {
            mtopRequest.setData(JSON.toJSONString(t1));
        }
        mtopRequest.setApiName(getApiName());
        mtopRequest.setVersion(getApiVersion());
    }

    public boolean allowCollectRuntimeInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c03a1e50", new Object[]{this})).booleanValue() : com.taobao.android.trade.boost.daemon.a.a();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.isRequesting = false;
        a<T2> aVar = this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        aVar.onFailure(mtopResponse);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.isRequesting = false;
        a<T2> aVar = this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        aVar.onSystemFailure(mtopResponse);
    }
}

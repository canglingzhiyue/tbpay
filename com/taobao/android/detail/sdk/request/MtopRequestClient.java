package com.taobao.android.detail.sdk.request;

import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.d;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public abstract class MtopRequestClient<E extends d, T> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View mMask;
    public E mParams;
    public RemoteBusiness mRemoteBusiness;
    public WeakReference<MtopRequestListener<T>> mRequestListenerRef;
    public String mTTID;

    static {
        kge.a(-1897505486);
        kge.a(-525336021);
    }

    public abstract String getApiName();

    public abstract String getApiVersion();

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return null;
    }

    public boolean isUseWua() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public MtopRequestClient(E e, String str, MtopRequestListener<T> mtopRequestListener) {
        this.mParams = e;
        this.mTTID = str;
        this.mRequestListenerRef = new WeakReference<>(mtopRequestListener);
        MtopRequest mtopRequest = new MtopRequest();
        configMtopRequest(mtopRequest);
        this.mRemoteBusiness = RemoteBusiness.build(mtopRequest, str);
        configRemoteBusiness(this.mRemoteBusiness);
        tpc.a("com.taobao.android.detail.sdk.request.MtopRequestClient");
    }

    public void setMask(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784c2ebd", new Object[]{this, view});
        } else {
            this.mMask = view;
        }
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.mRemoteBusiness == null) {
        } else {
            View view = this.mMask;
            if (view != null) {
                view.setVisibility(0);
            }
            com.taobao.android.detail.sdk.utils.a.a();
            Log.e("TAO_DETAIL", "++mtop start");
            this.mRemoteBusiness.asyncRequest();
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.mRemoteBusiness == null) {
        } else {
            View view = this.mMask;
            if (view != null) {
                view.setVisibility(8);
            }
            this.mRemoteBusiness.cancelRequest();
        }
    }

    public void configMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17441af", new Object[]{this, mtopRequest});
            return;
        }
        HashMap<String, String> a2 = this.mParams.a();
        if (a2 != null) {
            a2.put("detail_v", "3.1.8");
        }
        mtopRequest.setData(JSONObject.toJSONString(a2));
        mtopRequest.setApiName(getApiName());
        mtopRequest.setVersion(getApiVersion());
    }

    public void configRemoteBusiness(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230986f", new Object[]{this, remoteBusiness});
            return;
        }
        remoteBusiness.registeListener((IRemoteListener) this);
        String unitStrategy = getUnitStrategy();
        if (unitStrategy != null && !unitStrategy.equals(MtopParams.UnitStrategy.UNIT_NULL.toString())) {
            this.mRemoteBusiness.mo1328setUnitStrategy(unitStrategy);
        }
        if (!isUseWua()) {
            return;
        }
        this.mRemoteBusiness.mo1335useWua();
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
        View view = this.mMask;
        if (view != null) {
            view.setVisibility(8);
        }
        MtopRequestListener<T> mtopRequestListener = this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        mtopRequestListener.b(mtopResponse);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        View view = this.mMask;
        if (view != null) {
            view.setVisibility(8);
        }
        MtopRequestListener<T> mtopRequestListener = this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        mtopRequestListener.b(mtopResponse);
    }
}

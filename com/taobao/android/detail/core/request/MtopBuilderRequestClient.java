package com.taobao.android.detail.core.request;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.bgc;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class MtopBuilderRequestClient<E extends MtopRequestParams, T> implements MtopCallback.MtopFinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ApiID apiID;
    private Context mContext;
    public View mMask;
    public E mParams;
    public WeakReference<MtopRequestListener<T>> mRequestListenerRef;
    public String mTTID;
    public MtopBuilder mtopBuilder;

    static {
        kge.a(106651756);
        kge.a(-1507658996);
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

    public abstract void onSuccess(MtopResponse mtopResponse);

    public MtopBuilderRequestClient(Context context, E e, String str, MtopRequestListener<T> mtopRequestListener) {
        this.mParams = e;
        this.mTTID = str;
        this.mContext = context;
        this.mRequestListenerRef = new WeakReference<>(mtopRequestListener);
        MtopRequest mtopRequest = new MtopRequest();
        configMtopRequest(mtopRequest);
        this.mtopBuilder = Mtop.instance(Mtop.Id.INNER, context).build(mtopRequest, str);
        configRemoteBusiness(this.mtopBuilder);
        emu.a("com.taobao.android.detail.core.request.MtopBuilderRequestClient");
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
        } else if (this.mtopBuilder == null) {
        } else {
            View view = this.mMask;
            if (view != null) {
                view.setVisibility(0);
            }
            this.apiID = this.mtopBuilder.asyncRequest();
            n.b("mtopBuilder");
            ecg.b(this.mContext, getApiName(), getApiVersion(), this.mtopBuilder.request.getData(), (Map<String, Object>) null);
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.mtopBuilder == null) {
        } else {
            View view = this.mMask;
            if (view != null) {
                view.setVisibility(8);
            }
            ApiID apiID = this.apiID;
            if (apiID == null) {
                return;
            }
            apiID.cancelApiCall();
        }
    }

    public void configMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17441af", new Object[]{this, mtopRequest});
            return;
        }
        HashMap<String, String> map = this.mParams.toMap();
        if (map != null) {
            map.put(b.f9819a, b.b);
        }
        mtopRequest.setData(JSONObject.toJSONString(map));
        mtopRequest.setApiName(getApiName());
        mtopRequest.setVersion(getApiVersion());
    }

    public void configRemoteBusiness(MtopBuilder mtopBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268aae0d", new Object[]{this, mtopBuilder});
            return;
        }
        mtopBuilder.mo1337addListener(this);
        String unitStrategy = getUnitStrategy();
        if (unitStrategy != null && !unitStrategy.equals(MtopParams.UnitStrategy.UNIT_NULL.toString())) {
            mtopBuilder.mo1328setUnitStrategy(unitStrategy);
        }
        if (!isUseWua()) {
            return;
        }
        mtopBuilder.mo1335useWua();
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
    public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
            return;
        }
        MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
        if (mtopResponse.isApiSuccess()) {
            onSuccess(mtopResponse);
            HashMap hashMap = new HashMap();
            hashMap.put("requestParams", this.mParams);
            ecg.a(this.mContext, mtopResponse, hashMap);
            bgc.b("detail", mtopResponse);
        } else {
            View view = this.mMask;
            if (view != null) {
                view.setVisibility(8);
            }
            MtopRequestListener<T> mtopRequestListener = this.mRequestListenerRef.get();
            if (mtopRequestListener != null) {
                mtopRequestListener.a(mtopResponse);
            } else {
                z = false;
            }
            n.b("finishedFailure", z ? "hasRef" : "refDealloc");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("requestParams", this.mParams);
            ecg.a(this.mContext, mtopResponse, hashMap2);
            bgc.a("detail", mtopResponse);
        }
        com.taobao.android.detail.core.debug.b.a(this.mContext, this.mtopBuilder, mtopResponse, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_OLD_MTOP);
    }
}

package com.taobao.android.detail.core.request;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgc;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class MtopRequestClient<E extends MtopRequestParams, T> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public View mMask;
    public E mParams;
    public RemoteBusiness mRemoteBusiness;
    public WeakReference<MtopRequestListener<T>> mRequestListenerRef;
    public String mTTID;

    static {
        kge.a(-1577218355);
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
        emu.a("com.taobao.android.detail.core.request.MtopRequestClient");
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
            this.mRemoteBusiness.asyncRequest();
            n.b("remoteBusiness");
            if (this.mRemoteBusiness.request == null) {
                return;
            }
            ecg.b(this.mContext, getApiName(), getApiVersion(), this.mRemoteBusiness.request.getData(), (Map<String, Object>) null);
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mContext = context;
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
        HashMap<String, String> map = this.mParams.toMap();
        if (map != null) {
            map.put(b.f9819a, b.b);
        }
        mtopRequest.setData(JSONObject.toJSONString(map));
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

    public void attachOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf449002", new Object[]{this, map});
        } else if (map == null || map.size() <= 0) {
        } else {
            this.mRemoteBusiness.mo1317setOpenTracingContext(map);
        }
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
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
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
        n.b("error", z ? "hasRef" : "refDealloc");
        HashMap hashMap = new HashMap();
        hashMap.put("requestParam", this.mParams);
        ecg.a(this.mContext, mtopResponse, hashMap);
        bgc.a("detail", mtopResponse);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
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
        n.b("systemError", z ? "hasRef" : "refDealloc");
        HashMap hashMap = new HashMap();
        hashMap.put("requestParam", this.mParams);
        ecg.a(this.mContext, mtopResponse, hashMap);
        bgc.a("detail", mtopResponse);
    }
}

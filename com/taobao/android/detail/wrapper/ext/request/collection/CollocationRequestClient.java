package com.taobao.android.detail.wrapper.ext.request.collection;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class CollocationRequestClient extends MtopRequestClient<CollocationRequestParams, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopRequestListener<a> requestListener;

    static {
        kge.a(-1082966431);
    }

    public static /* synthetic */ Object ipc$super(CollocationRequestClient collocationRequestClient, String str, Object... objArr) {
        if (str.hashCode() == -743105213) {
            super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CollocationRequestClient(CollocationRequestParams collocationRequestParams, String str, MtopRequestListener<a> mtopRequestListener) {
        super(collocationRequestParams, str, mtopRequestListener);
        this.requestListener = mtopRequestListener;
        emu.a("com.taobao.android.detail.wrapper.ext.request.collection.CollocationRequestClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(new String(mtopResponse.getBytedata()));
        if (parseObject != null && (jSONObject = parseObject.getJSONObject("data")) != null) {
            a aVar = new a();
            aVar.f11369a = jSONObject;
            this.requestListener.b(aVar);
        }
        this.requestListener.a(new MtopResponse());
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.requestListener.a(new MtopResponse());
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            super.onSystemError(i, mtopResponse, obj);
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : ((CollocationRequestParams) this.mParams).apiName;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : ((CollocationRequestParams) this.mParams).version;
    }
}

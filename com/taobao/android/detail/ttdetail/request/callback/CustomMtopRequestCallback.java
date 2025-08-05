package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.b;
import com.taobao.android.detail.ttdetail.request.params.a;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.soa;

/* loaded from: classes5.dex */
public class CustomMtopRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CustomMtopRequestCallback";
    public soa mListener;
    public MtopInfo mMtopInfo = new MtopInfo();
    public a mQueryParams;

    static {
        kge.a(-1897786300);
        kge.a(-525336021);
    }

    public CustomMtopRequestCallback(a aVar, soa soaVar) {
        this.mQueryParams = aVar;
        this.mListener = soaVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        i.a(TAG, "自定义mtop接口请求回调onSuccess");
        if (this.mListener == null) {
            return;
        }
        this.mMtopInfo.a(mtopResponse);
        if (mtopResponse == null || mtopResponse.getBytedata() == null) {
            callFailureListener();
            monitorCustomCallbackError(true);
            return;
        }
        mtopResponse.setOriginFastJsonObject(JSON.parseObject(new String(mtopResponse.getBytedata())));
        mtopResponse.setSupportStreamJson(true);
        this.mMtopInfo.a(2);
        this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "自定义mtop接口请求回调onError");
        callFailureListener();
        monitorCustomCallbackError(false);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "自定义mtop接口请求回调onSystemError");
        callFailureListener();
        monitorCustomCallbackError(false);
    }

    public void callFailureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197c1aa7", new Object[]{this});
        } else {
            new b().a(this.mQueryParams, this.mListener, (Map<String, String>) new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback.1
                {
                    put("forbidSkuWeexSku", "true");
                }
            }, false);
        }
    }

    public void monitorCustomCallbackError(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b0bd15", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.mQueryParams.h());
        MtopInfo mtopInfo = this.mMtopInfo;
        if (mtopInfo == null || !az.a(mtopInfo.b())) {
            z2 = false;
        }
        hashMap.put(MtopStreamRequestCallback.IS_STREAM, String.valueOf(z2));
        ae.a(hashMap, z ? -300003 : -300004, z ? "自定义请求返回数据为空" : "自定义请求回调失败");
    }
}

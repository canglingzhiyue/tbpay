package com.taobao.android.detail.sdk.utils.ocr.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.MtopRequestClient;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class OCRMtopRequestClient extends MtopRequestClient<b, MtopResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1282931997);
    }

    public OCRMtopRequestClient(b bVar, String str, MtopRequestListener<MtopResponse> mtopRequestListener) {
        super(bVar, str, mtopRequestListener);
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.request.OCRMtopRequestClient");
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        if (this.mParams == 0) {
            return null;
        }
        return ((b) this.mParams).f10356a;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        if (this.mParams == 0) {
            return null;
        }
        return ((b) this.mParams).b;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.mRequestListenerRef == null || this.mRequestListenerRef.get() == null) {
        } else {
            ((MtopRequestListener) this.mRequestListenerRef.get()).a(mtopResponse);
        }
    }
}

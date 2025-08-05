package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.h;
import com.taobao.android.detail.ttdetail.utils.i;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class DescMtopStaticRequestClient extends MtopRequestClient<DescMtopStaticRequestParams, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getdesc";
    private static final String API_VERSION = "7.0";
    public static final String TAG = "MtopDescLayoutClient";
    public h mEngine;

    static {
        kge.a(-932642799);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "7.0";
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : "UNIT_TRADE";
    }

    public DescMtopStaticRequestClient(DescMtopStaticRequestParams descMtopStaticRequestParams, String str, f<com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g> fVar, h hVar) {
        super(descMtopStaticRequestParams, str, fVar);
        this.mEngine = hVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescMtopStaticRequestClient$1] */
    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescMtopStaticRequestClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g doInBackground(MtopResponse[] mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, gVar});
                    } else {
                        a(gVar);
                    }
                }

                public com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g a(MtopResponse... mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) ipChange2.ipc$dispatch("f86b60ea", new Object[]{this, mtopResponseArr});
                    }
                    try {
                        return DescMtopStaticRequestClient.this.mEngine.a(mtopResponseArr[0].getBytedata() != null ? new String(mtopResponseArr[0].getBytedata()) : null);
                    } catch (Throwable th) {
                        i.a("MtopDescLayoutClient", "Desc structure building error", th);
                        return null;
                    }
                }

                public void a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("865d096e", new Object[]{this, gVar});
                        return;
                    }
                    f fVar = (f) DescMtopStaticRequestClient.this.mRequestListenerRef.get();
                    if (fVar == null) {
                        return;
                    }
                    if (gVar == null) {
                        fVar.a(mtopResponse);
                    } else {
                        fVar.b(gVar);
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }
}

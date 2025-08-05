package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescDynamicParams;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class DescDynamicClient extends MtopRequestClient<DescDynamicParams, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g mDescStructure;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.h mEngine;

    static {
        kge.a(-1899087305);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : "UNIT_TRADE";
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g access$000(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) ipChange.ipc$dispatch("fe130b2d", new Object[]{descDynamicClient}) : descDynamicClient.mDescStructure;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g access$002(DescDynamicClient descDynamicClient, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) ipChange.ipc$dispatch("52f339e5", new Object[]{descDynamicClient, gVar});
        }
        descDynamicClient.mDescStructure = gVar;
        return gVar;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.h access$100(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.h) ipChange.ipc$dispatch("3687aa2b", new Object[]{descDynamicClient}) : descDynamicClient.mEngine;
    }

    public static /* synthetic */ String access$200(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ea3daf", new Object[]{descDynamicClient}) : descDynamicClient.TAG;
    }

    public static /* synthetic */ WeakReference access$300(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("d21fd2a0", new Object[]{descDynamicClient}) : descDynamicClient.mRequestListenerRef;
    }

    public DescDynamicClient(DescDynamicParams descDynamicParams, String str, com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.f<com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g> fVar, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.h hVar) {
        super(descDynamicParams, str, fVar);
        this.TAG = "DescDynamicClient";
        this.mEngine = hVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescDynamicClient$1] */
    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescDynamicClient.1
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
                    String str = null;
                    if (mtopResponseArr[0].getBytedata() != null) {
                        str = new String(mtopResponseArr[0].getBytedata());
                    }
                    try {
                        DescDynamicClient.access$002(DescDynamicClient.this, DescDynamicClient.access$100(DescDynamicClient.this).b(str));
                    } catch (Throwable th) {
                        com.taobao.android.detail.ttdetail.utils.i.a(DescDynamicClient.access$200(DescDynamicClient.this), "Desc structure engine rebuild error: ", th);
                    }
                    return DescDynamicClient.access$000(DescDynamicClient.this);
                }

                public void a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("865d096e", new Object[]{this, gVar});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b bVar = (com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b) DescDynamicClient.access$300(DescDynamicClient.this).get();
                    if (bVar == null) {
                        return;
                    }
                    if (gVar == null) {
                        bVar.a(hashCode(), mtopResponse);
                        return;
                    }
                    if (DescDynamicClient.access$000(DescDynamicClient.this).f10863a != null && DescDynamicClient.access$000(DescDynamicClient.this).f10863a.containsKey(mtopResponse.getApi())) {
                        DescDynamicClient.access$000(DescDynamicClient.this).f10863a.remove(mtopResponse.getApi());
                    }
                    bVar.a(hashCode(), (int) gVar);
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b bVar = (com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b) this.mRequestListenerRef.get();
        if (bVar == null) {
            return;
        }
        bVar.a(hashCode(), mtopResponse);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b bVar = (com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b) this.mRequestListenerRef.get();
        if (bVar == null) {
            return;
        }
        bVar.a(hashCode(), mtopResponse);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : ((DescDynamicParams) this.mParams).apiName;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : ((DescDynamicParams) this.mParams).version;
    }
}

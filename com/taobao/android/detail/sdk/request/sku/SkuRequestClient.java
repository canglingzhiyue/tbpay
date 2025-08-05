package com.taobao.android.detail.sdk.request.sku;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.MtopRequestClient;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import com.taobao.android.detail.sdk.structure.f;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SkuRequestClient extends MtopRequestClient<a, com.taobao.android.detail.sdk.model.node.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "mtop.taobao.detail.getDetail";
    public static final String API_VERSION = "6.0";

    static {
        kge.a(-137604881);
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "6.0";
    }

    public static /* synthetic */ WeakReference access$000(SkuRequestClient skuRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("97588625", new Object[]{skuRequestClient}) : skuRequestClient.mRequestListenerRef;
    }

    public SkuRequestClient(a aVar, String str, MtopRequestListener<com.taobao.android.detail.sdk.model.node.a> mtopRequestListener) {
        super(aVar, str, mtopRequestListener);
        tpc.a("com.taobao.android.detail.sdk.request.sku.SkuRequestClient");
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.sdk.request.sku.SkuRequestClient$1] */
    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, com.taobao.android.detail.sdk.model.node.a>() { // from class: com.taobao.android.detail.sdk.request.sku.SkuRequestClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.a] */
                @Override // android.os.AsyncTask
                public /* synthetic */ com.taobao.android.detail.sdk.model.node.a doInBackground(MtopResponse[] mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(com.taobao.android.detail.sdk.model.node.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, aVar});
                    } else {
                        a(aVar);
                    }
                }

                public com.taobao.android.detail.sdk.model.node.a a(MtopResponse... mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (com.taobao.android.detail.sdk.model.node.a) ipChange2.ipc$dispatch("6a291019", new Object[]{this, mtopResponseArr});
                    }
                    String str = null;
                    if (mtopResponseArr[0].getBytedata() != null) {
                        str = new String(mtopResponseArr[0].getBytedata());
                    }
                    return new com.taobao.android.detail.sdk.model.node.a(new f().b(str));
                }

                public void a(com.taobao.android.detail.sdk.model.node.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32bdf9d", new Object[]{this, aVar});
                        return;
                    }
                    MtopRequestListener mtopRequestListener = (MtopRequestListener) SkuRequestClient.access$000(SkuRequestClient.this).get();
                    if (mtopRequestListener == null) {
                        return;
                    }
                    mtopRequestListener.a(aVar);
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }
}

package com.taobao.android.detail.sdk.request.desc;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.MtopRequestClient;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import com.taobao.android.detail.sdk.request.d;
import com.taobao.android.detail.sdk.utils.f;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ewn;
import tb.ewq;
import tb.ewr;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DescMtopStaticRequestClient extends MtopRequestClient<c, ewq> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getdesc";
    private static final String API_VERSION = "7.0";
    public static final String TAG = "MtopDescLayoutClient";
    public ewr mEngine;

    static {
        kge.a(-1171247851);
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "7.0";
    }

    public static /* synthetic */ d access$000(DescMtopStaticRequestClient descMtopStaticRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9a8a0d3e", new Object[]{descMtopStaticRequestClient}) : descMtopStaticRequestClient.mParams;
    }

    public static /* synthetic */ WeakReference access$100(DescMtopStaticRequestClient descMtopStaticRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("ede06f00", new Object[]{descMtopStaticRequestClient}) : descMtopStaticRequestClient.mRequestListenerRef;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    public DescMtopStaticRequestClient(c cVar, String str, MtopRequestListener<ewq> mtopRequestListener, ewr ewrVar) {
        super(cVar, str, mtopRequestListener);
        this.mEngine = ewrVar;
        tpc.a("com.taobao.android.detail.sdk.request.desc.DescMtopStaticRequestClient");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.sdk.request.desc.DescMtopStaticRequestClient$1] */
    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, ewq>() { // from class: com.taobao.android.detail.sdk.request.desc.DescMtopStaticRequestClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [tb.ewq, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ ewq doInBackground(MtopResponse[] mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(ewq ewqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, ewqVar});
                    } else {
                        a(ewqVar);
                    }
                }

                public ewq a(MtopResponse... mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (ewq) ipChange2.ipc$dispatch("1a691875", new Object[]{this, mtopResponseArr});
                    }
                    try {
                        return DescMtopStaticRequestClient.this.mEngine.a(mtopResponseArr[0].getBytedata() != null ? new String(mtopResponseArr[0].getBytedata()) : null);
                    } catch (Throwable th) {
                        f.a("MtopDescLayoutClient", "Desc structure building error", th);
                        ewn.a(((c) DescMtopStaticRequestClient.access$000(DescMtopStaticRequestClient.this)).a().get("itemId"), th);
                        return null;
                    }
                }

                public void a(ewq ewqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7afb079", new Object[]{this, ewqVar});
                        return;
                    }
                    MtopRequestListener mtopRequestListener = (MtopRequestListener) DescMtopStaticRequestClient.access$100(DescMtopStaticRequestClient.this).get();
                    if (mtopRequestListener == null) {
                        return;
                    }
                    if (ewqVar == null) {
                        mtopRequestListener.b(mtopResponse);
                    } else {
                        mtopRequestListener.a(ewqVar);
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }
}

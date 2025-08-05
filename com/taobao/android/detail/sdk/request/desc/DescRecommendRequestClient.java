package com.taobao.android.detail.sdk.request.desc;

import android.os.AsyncTask;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.MtopRequestClient;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ewq;
import tb.ewr;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DescRecommendRequestClient extends MtopRequestClient<c, ewq> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getdynservice";
    private static final String API_VERSION = "1.0";
    private static final String TAG;
    public ewr mEngine;

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    public static /* synthetic */ WeakReference access$100(DescRecommendRequestClient descRecommendRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("668945ca", new Object[]{descRecommendRequestClient}) : descRecommendRequestClient.mRequestListenerRef;
    }

    static {
        kge.a(-1341940435);
        TAG = DescRecommendRequestClient.class.getSimpleName();
    }

    public DescRecommendRequestClient(c cVar, String str, MtopRequestListener<ewq> mtopRequestListener, ewr ewrVar) {
        super(cVar, str, mtopRequestListener);
        this.mEngine = ewrVar;
        tpc.a("com.taobao.android.detail.sdk.request.desc.DescRecommendRequestClient");
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.sdk.request.desc.DescRecommendRequestClient$1] */
    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, ewq>() { // from class: com.taobao.android.detail.sdk.request.desc.DescRecommendRequestClient.1
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
                        return DescRecommendRequestClient.this.mEngine.a(mtopResponseArr[0].getBytedata() != null ? new String(mtopResponseArr[0].getBytedata()) : null);
                    } catch (Throwable th) {
                        Log.e(DescRecommendRequestClient.access$000(), "Desc structure building error", th);
                        return null;
                    }
                }

                public void a(ewq ewqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7afb079", new Object[]{this, ewqVar});
                        return;
                    }
                    MtopRequestListener mtopRequestListener = (MtopRequestListener) DescRecommendRequestClient.access$100(DescRecommendRequestClient.this).get();
                    if (mtopRequestListener == null) {
                        return;
                    }
                    mtopRequestListener.a(ewqVar);
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }
}

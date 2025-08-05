package com.taobao.android.detail.core.request.desc;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgc;
import tb.emu;
import tb.enl;
import tb.enm;
import tb.kge;

/* loaded from: classes4.dex */
public class DescRecommendRequestClient extends MtopRequestClient<DescMtopStaticRequestParams, enl> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getdynservice";
    private static final String API_VERSION = "1.0";
    private static final String TAG = "DescRmdRequestClient";
    public enm mEngine;

    static {
        kge.a(1980392328);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    public static /* synthetic */ WeakReference access$000(DescRecommendRequestClient descRecommendRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("51c1436c", new Object[]{descRecommendRequestClient}) : descRecommendRequestClient.mRequestListenerRef;
    }

    public DescRecommendRequestClient(DescMtopStaticRequestParams descMtopStaticRequestParams, String str, MtopRequestListener<enl> mtopRequestListener, enm enmVar) {
        super(descMtopStaticRequestParams, str, mtopRequestListener);
        this.mEngine = enmVar;
        emu.a("com.taobao.android.detail.core.request.desc.DescRecommendRequestClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.core.request.desc.DescRecommendRequestClient$1] */
    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        new AsyncTask<MtopResponse, Void, enl>() { // from class: com.taobao.android.detail.core.request.desc.DescRecommendRequestClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tb.enl] */
            @Override // android.os.AsyncTask
            public /* synthetic */ enl doInBackground(MtopResponse[] mtopResponseArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(enl enlVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, enlVar});
                } else {
                    a(enlVar);
                }
            }

            public enl a(MtopResponse... mtopResponseArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (enl) ipChange2.ipc$dispatch("1a68f611", new Object[]{this, mtopResponseArr});
                }
                try {
                    return DescRecommendRequestClient.this.mEngine.a(mtopResponseArr[0].getBytedata() != null ? new String(mtopResponseArr[0].getBytedata()) : null);
                } catch (Throwable th) {
                    i.a(DescRecommendRequestClient.TAG, "Desc structure building error", th);
                    return null;
                }
            }

            public void a(enl enlVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e72e9715", new Object[]{this, enlVar});
                    return;
                }
                MtopRequestListener mtopRequestListener = (MtopRequestListener) DescRecommendRequestClient.access$000(DescRecommendRequestClient.this).get();
                if (mtopRequestListener == null) {
                    return;
                }
                mtopRequestListener.b(enlVar);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        bgc.b("detail", mtopResponse);
    }
}

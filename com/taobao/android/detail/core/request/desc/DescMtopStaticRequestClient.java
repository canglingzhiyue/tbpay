package com.taobao.android.detail.core.request.desc;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.MtopRequestParams;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgc;
import tb.ecg;
import tb.emu;
import tb.enl;
import tb.enm;
import tb.kge;

/* loaded from: classes4.dex */
public class DescMtopStaticRequestClient extends MtopRequestClient<DescMtopStaticRequestParams, enl> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getdesc";
    private static final String API_VERSION = "7.0";
    public static final String TAG = "MtopDescLayoutClient";
    public enm mEngine;

    static {
        kge.a(-1258147302);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : API_NAME;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "7.0";
    }

    public static /* synthetic */ Context access$000(DescMtopStaticRequestClient descMtopStaticRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ddb9ffc8", new Object[]{descMtopStaticRequestClient}) : descMtopStaticRequestClient.mContext;
    }

    public static /* synthetic */ MtopRequestParams access$100(DescMtopStaticRequestClient descMtopStaticRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequestParams) ipChange.ipc$dispatch("6c432dae", new Object[]{descMtopStaticRequestClient}) : descMtopStaticRequestClient.mParams;
    }

    public static /* synthetic */ WeakReference access$200(DescMtopStaticRequestClient descMtopStaticRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("f40c085c", new Object[]{descMtopStaticRequestClient}) : descMtopStaticRequestClient.mRequestListenerRef;
    }

    public DescMtopStaticRequestClient(DescMtopStaticRequestParams descMtopStaticRequestParams, String str, MtopRequestListener<enl> mtopRequestListener, enm enmVar) {
        super(descMtopStaticRequestParams, str, mtopRequestListener);
        this.mEngine = enmVar;
        emu.a("com.taobao.android.detail.core.request.desc.DescMtopStaticRequestClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.core.request.desc.DescMtopStaticRequestClient$1] */
    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, enl>() { // from class: com.taobao.android.detail.core.request.desc.DescMtopStaticRequestClient.1
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
                    enl enlVar = null;
                    String str = mtopResponseArr[0].getBytedata() != null ? new String(mtopResponseArr[0].getBytedata()) : null;
                    try {
                        enlVar = DescMtopStaticRequestClient.this.mEngine.a(str);
                    } catch (Throwable th) {
                        i.a("MtopDescLayoutClient", "Desc structure building error", th);
                        ecg.a(DescMtopStaticRequestClient.access$000(DescMtopStaticRequestClient.this), ((DescMtopStaticRequestParams) DescMtopStaticRequestClient.access$100(DescMtopStaticRequestClient.this)).toMap().get("itemId"), str, th);
                    }
                    bgc.b("detail", mtopResponse);
                    return enlVar;
                }

                public void a(enl enlVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e72e9715", new Object[]{this, enlVar});
                        return;
                    }
                    MtopRequestListener mtopRequestListener = (MtopRequestListener) DescMtopStaticRequestClient.access$200(DescMtopStaticRequestClient.this).get();
                    if (mtopRequestListener == null) {
                        return;
                    }
                    if (enlVar == null) {
                        mtopRequestListener.a(mtopResponse);
                    } else {
                        mtopRequestListener.b(enlVar);
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }
}

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
public class DescDynamicClient extends MtopRequestClient<a, ewq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG;
    private ewq mDescStructure;
    private ewr mEngine;

    static {
        kge.a(1267683003);
    }

    public static /* synthetic */ ewq access$000(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ewq) ipChange.ipc$dispatch("6ad8a8fc", new Object[]{descDynamicClient}) : descDynamicClient.mDescStructure;
    }

    public static /* synthetic */ ewq access$002(DescDynamicClient descDynamicClient, ewq ewqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewq) ipChange.ipc$dispatch("237c6709", new Object[]{descDynamicClient, ewqVar});
        }
        descDynamicClient.mDescStructure = ewqVar;
        return ewqVar;
    }

    public static /* synthetic */ ewr access$100(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ewr) ipChange.ipc$dispatch("acefd67a", new Object[]{descDynamicClient}) : descDynamicClient.mEngine;
    }

    public static /* synthetic */ String access$200(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cdd62033", new Object[]{descDynamicClient}) : descDynamicClient.TAG;
    }

    public static /* synthetic */ WeakReference access$300(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("63bb8b5c", new Object[]{descDynamicClient}) : descDynamicClient.mRequestListenerRef;
    }

    public DescDynamicClient(a aVar, String str, MtopRequestListener<ewq> mtopRequestListener, ewr ewrVar) {
        super(aVar, str, mtopRequestListener);
        this.TAG = "DescDynamicClient";
        this.mEngine = ewrVar;
        tpc.a("com.taobao.android.detail.sdk.request.desc.DescDynamicClient");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.sdk.request.desc.DescDynamicClient$1] */
    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, ewq>() { // from class: com.taobao.android.detail.sdk.request.desc.DescDynamicClient.1
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
                    String str = null;
                    if (mtopResponseArr[0].getBytedata() != null) {
                        str = new String(mtopResponseArr[0].getBytedata());
                    }
                    try {
                        DescDynamicClient.access$002(DescDynamicClient.this, DescDynamicClient.access$100(DescDynamicClient.this).b(str));
                    } catch (Throwable th) {
                        Log.e(DescDynamicClient.access$200(DescDynamicClient.this), "Desc structure engine rebuild error: ", th);
                    }
                    return DescDynamicClient.access$000(DescDynamicClient.this);
                }

                public void a(ewq ewqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7afb079", new Object[]{this, ewqVar});
                    } else if (((b) DescDynamicClient.access$300(DescDynamicClient.this).get()) == null) {
                    } else {
                        if (ewqVar == null) {
                            hashCode();
                            return;
                        }
                        if (DescDynamicClient.access$000(DescDynamicClient.this).b != null && DescDynamicClient.access$000(DescDynamicClient.this).b.containsKey(mtopResponse.getApi())) {
                            DescDynamicClient.access$000(DescDynamicClient.this).b.remove(mtopResponse.getApi());
                        }
                        hashCode();
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (((b) this.mRequestListenerRef.get()) == null) {
        } else {
            hashCode();
        }
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (((b) this.mRequestListenerRef.get()) == null) {
        } else {
            hashCode();
        }
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : ((a) this.mParams).f10317a;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : ((a) this.mParams).b;
    }

    @Override // com.taobao.android.detail.sdk.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }
}

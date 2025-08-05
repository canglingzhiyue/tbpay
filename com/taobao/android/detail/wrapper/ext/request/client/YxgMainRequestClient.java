package com.taobao.android.detail.wrapper.ext.request.client;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.emy;
import tb.enh;
import tb.eqc;
import tb.kge;

/* loaded from: classes5.dex */
public class YxgMainRequestClient extends MtopRequestClient<MainRequestParams, enh> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getDetail";
    private static final String API_VERSION = "6.0";
    private static final String TAG = "MainRequestClient";
    private Context mContext;

    static {
        kge.a(-1271835512);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.taobao.detail.getDetail";
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "6.0";
    }

    public static /* synthetic */ Context access$000(YxgMainRequestClient yxgMainRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e7c6381a", new Object[]{yxgMainRequestClient}) : yxgMainRequestClient.mContext;
    }

    public static /* synthetic */ String access$100(YxgMainRequestClient yxgMainRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18c9757f", new Object[]{yxgMainRequestClient}) : yxgMainRequestClient.mTTID;
    }

    public static /* synthetic */ WeakReference access$200(YxgMainRequestClient yxgMainRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("2852102e", new Object[]{yxgMainRequestClient}) : yxgMainRequestClient.mRequestListenerRef;
    }

    public static /* synthetic */ View access$300(YxgMainRequestClient yxgMainRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3bf8b401", new Object[]{yxgMainRequestClient}) : yxgMainRequestClient.mMask;
    }

    public static /* synthetic */ View access$400(YxgMainRequestClient yxgMainRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f4857460", new Object[]{yxgMainRequestClient}) : yxgMainRequestClient.mMask;
    }

    public YxgMainRequestClient(Context context, MainRequestParams mainRequestParams, String str, MtopRequestListener<enh> mtopRequestListener) {
        super(mainRequestParams, str, mtopRequestListener);
        this.mContext = context;
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.YxgMainRequestClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.wrapper.ext.request.client.YxgMainRequestClient$1] */
    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            new AsyncTask<MtopResponse, Void, enh>() { // from class: com.taobao.android.detail.wrapper.ext.request.client.YxgMainRequestClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [tb.enh, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ enh doInBackground(MtopResponse[] mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(enh enhVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, enhVar});
                    } else {
                        a(enhVar);
                    }
                }

                public enh a(MtopResponse... mtopResponseArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (enh) ipChange2.ipc$dispatch("1a68f595", new Object[]{this, mtopResponseArr});
                    }
                    enh enhVar = null;
                    try {
                        eqc.a(YxgMainRequestClient.access$000(YxgMainRequestClient.this), "mProcessData");
                        String retMsg = mtopResponseArr[0].getRetMsg();
                        b.f10050a = YxgMainRequestClient.access$100(YxgMainRequestClient.this);
                        emy emyVar = new emy(YxgMainRequestClient.access$000(YxgMainRequestClient.this));
                        enhVar = emyVar.a(emyVar.a(retMsg));
                        eqc.b(YxgMainRequestClient.access$000(YxgMainRequestClient.this), "mProcessData");
                        eqc.a(YxgMainRequestClient.access$000(YxgMainRequestClient.this), "mThreadSwitch");
                        return enhVar;
                    } catch (Throwable th) {
                        i.a(YxgMainRequestClient.TAG, "main structure building error : ", th);
                        return enhVar;
                    }
                }

                public void a(enh enhVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e72cc599", new Object[]{this, enhVar});
                        return;
                    }
                    MtopRequestListener mtopRequestListener = (MtopRequestListener) YxgMainRequestClient.access$200(YxgMainRequestClient.this).get();
                    if (YxgMainRequestClient.access$300(YxgMainRequestClient.this) != null) {
                        YxgMainRequestClient.access$400(YxgMainRequestClient.this).setVisibility(8);
                    }
                    try {
                        eqc.b(YxgMainRequestClient.access$000(YxgMainRequestClient.this), "mThreadSwitch");
                        if (mtopRequestListener == null) {
                            return;
                        }
                        if (enhVar == null) {
                            mtopRequestListener.a(mtopResponse);
                        } else {
                            mtopRequestListener.b(enhVar);
                        }
                    } catch (Throwable unused) {
                        if (mtopRequestListener == null) {
                            return;
                        }
                        mtopRequestListener.a(mtopResponse);
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        }
    }
}

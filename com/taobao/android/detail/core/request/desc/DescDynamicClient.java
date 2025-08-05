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
public class DescDynamicClient extends MtopRequestClient<DescDynamicParams, enl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG;
    private enl mDescStructure;
    private enm mEngine;

    static {
        kge.a(885908992);
    }

    public static /* synthetic */ enl access$000(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enl) ipChange.ipc$dispatch("354bd919", new Object[]{descDynamicClient}) : descDynamicClient.mDescStructure;
    }

    public static /* synthetic */ enl access$002(DescDynamicClient descDynamicClient, enl enlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enl) ipChange.ipc$dispatch("30d8174e", new Object[]{descDynamicClient, enlVar});
        }
        descDynamicClient.mDescStructure = enlVar;
        return enlVar;
    }

    public static /* synthetic */ enm access$100(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enm) ipChange.ipc$dispatch("361a57b9", new Object[]{descDynamicClient}) : descDynamicClient.mEngine;
    }

    public static /* synthetic */ String access$200(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fed4a2b8", new Object[]{descDynamicClient}) : descDynamicClient.TAG;
    }

    public static /* synthetic */ WeakReference access$300(DescDynamicClient descDynamicClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("14bacbd5", new Object[]{descDynamicClient}) : descDynamicClient.mRequestListenerRef;
    }

    public DescDynamicClient(DescDynamicParams descDynamicParams, String str, MtopRequestListener<enl> mtopRequestListener, enm enmVar) {
        super(descDynamicParams, str, mtopRequestListener);
        this.TAG = "DescDynamicClient";
        this.mEngine = enmVar;
        emu.a("com.taobao.android.detail.core.request.desc.DescDynamicClient");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.detail.core.request.desc.DescDynamicClient$1] */
    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        new AsyncTask<MtopResponse, Void, enl>() { // from class: com.taobao.android.detail.core.request.desc.DescDynamicClient.1
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
                String str = null;
                if (mtopResponseArr[0].getBytedata() != null) {
                    str = new String(mtopResponseArr[0].getBytedata());
                }
                try {
                    DescDynamicClient.access$002(DescDynamicClient.this, DescDynamicClient.access$100(DescDynamicClient.this).b(str));
                } catch (Throwable th) {
                    i.a(DescDynamicClient.access$200(DescDynamicClient.this), "Desc structure engine rebuild error: ", th);
                }
                return DescDynamicClient.access$000(DescDynamicClient.this);
            }

            public void a(enl enlVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e72e9715", new Object[]{this, enlVar});
                    return;
                }
                a aVar = (a) DescDynamicClient.access$300(DescDynamicClient.this).get();
                if (aVar == null) {
                    return;
                }
                if (enlVar == null) {
                    aVar.a(hashCode(), mtopResponse);
                    return;
                }
                if (DescDynamicClient.access$000(DescDynamicClient.this).b != null && DescDynamicClient.access$000(DescDynamicClient.this).b.containsKey(mtopResponse.getApi())) {
                    DescDynamicClient.access$000(DescDynamicClient.this).b.remove(mtopResponse.getApi());
                }
                aVar.a(hashCode(), (int) enlVar);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
        bgc.b("detail", mtopResponse);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a aVar = (a) this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        aVar.a(hashCode(), mtopResponse);
        bgc.b("detail", mtopResponse);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a aVar = (a) this.mRequestListenerRef.get();
        if (aVar == null) {
            return;
        }
        aVar.a(hashCode(), mtopResponse);
        bgc.b("detail", mtopResponse);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : ((DescDynamicParams) this.mParams).apiName;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : ((DescDynamicParams) this.mParams).version;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }
}

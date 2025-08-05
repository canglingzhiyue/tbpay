package com.taobao.android.detail.sdk.request.main;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import anet.channel.GlobalAppRuntimeInfo;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.GlobalNode;
import com.taobao.android.detail.sdk.request.MtopBuilderRequestClient;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import com.taobao.android.detail.sdk.structure.f;
import com.taobao.android.detail.sdk.structure.g;
import com.taobao.android.detail.sdk.utils.j;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ewn;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MainBuilderRequestClient extends MtopBuilderRequestClient<b, g> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getDetail";
    private static final String API_VERSION = "6.0";
    private static final boolean DEBUG = false;
    private static final String TAG = "MainRequestClient";
    private static boolean mIsFirstBoot;
    private Context mContext;
    private b mMainRequestParams;
    public long start;

    @Override // com.taobao.android.detail.sdk.request.MtopBuilderRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.taobao.detail.getDetail";
    }

    @Override // com.taobao.android.detail.sdk.request.MtopBuilderRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "6.0";
    }

    public static /* synthetic */ String access$000(MainBuilderRequestClient mainBuilderRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d13fa24", new Object[]{mainBuilderRequestClient}) : mainBuilderRequestClient.mTTID;
    }

    public static /* synthetic */ Context access$100(MainBuilderRequestClient mainBuilderRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("217a9d53", new Object[]{mainBuilderRequestClient}) : mainBuilderRequestClient.mContext;
    }

    public static /* synthetic */ b access$200(MainBuilderRequestClient mainBuilderRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("28666c7f", new Object[]{mainBuilderRequestClient}) : mainBuilderRequestClient.mMainRequestParams;
    }

    public static /* synthetic */ WeakReference access$300(MainBuilderRequestClient mainBuilderRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("cc47f767", new Object[]{mainBuilderRequestClient}) : mainBuilderRequestClient.mRequestListenerRef;
    }

    public static /* synthetic */ View access$400(MainBuilderRequestClient mainBuilderRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1ee611ba", new Object[]{mainBuilderRequestClient}) : mainBuilderRequestClient.mMask;
    }

    public static /* synthetic */ View access$500(MainBuilderRequestClient mainBuilderRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("eea64559", new Object[]{mainBuilderRequestClient}) : mainBuilderRequestClient.mMask;
    }

    public static /* synthetic */ void access$600(g gVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0f995c", new Object[]{gVar, th});
        } else {
            exceptionTrace(gVar, th);
        }
    }

    static {
        kge.a(1779884398);
        mIsFirstBoot = true;
    }

    public MainBuilderRequestClient(Context context, b bVar, String str, MtopRequestListener<g> mtopRequestListener) {
        super(context, bVar, str, mtopRequestListener);
        this.start = 0L;
        tpc.a("com.taobao.android.detail.sdk.request.main.MainBuilderRequestClient");
        this.mMainRequestParams = bVar;
        this.mContext = context;
        this.start = System.nanoTime();
        if (mIsFirstBoot) {
            this.mtopBuilder.mo1340setBizId(9999);
        } else {
            this.mtopBuilder.mo1340setBizId(9998);
        }
        mIsFirstBoot = false;
        try {
            if (f.q) {
                GlobalAppRuntimeInfo.addBucketInfo("taobao_detail", "网络优化开");
            } else {
                GlobalAppRuntimeInfo.addBucketInfo("taobao_detail", "网络优化关");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.detail.sdk.request.MtopBuilderRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.android.detail.sdk.request.main.MainBuilderRequestClient$1] */
    @Override // com.taobao.android.detail.sdk.request.MtopBuilderRequestClient
    public void onSuccess(final MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e364b0", new Object[]{this, mtopResponse});
            return;
        }
        if (mtopResponse != null && mtopResponse.getMtopStat() != null && mtopResponse.getMtopStat().getNetworkStats() != null) {
            String networkStats = mtopResponse.getMtopStat().getNetworkStats().toString();
            com.taobao.android.detail.sdk.utils.a.a("network_detail", mtopResponse.getMtopStat().toString());
            com.taobao.android.detail.sdk.utils.a.a("mtop_detail", networkStats);
        }
        com.taobao.android.detail.sdk.utils.a.b();
        new AsyncTask<MtopResponse, Void, g>() { // from class: com.taobao.android.detail.sdk.request.main.MainBuilderRequestClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.detail.sdk.structure.g, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ g doInBackground(MtopResponse[] mtopResponseArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, mtopResponseArr}) : a(mtopResponseArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, gVar});
                } else {
                    a(gVar);
                }
            }

            public g a(MtopResponse... mtopResponseArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (g) ipChange2.ipc$dispatch("48d241f8", new Object[]{this, mtopResponseArr});
                }
                g gVar = null;
                try {
                    j.a("mProcessData");
                    String str = mtopResponseArr[0].getBytedata() != null ? new String(mtopResponseArr[0].getBytedata()) : null;
                    GlobalNode.ttid = MainBuilderRequestClient.access$000(MainBuilderRequestClient.this);
                    f fVar = new f();
                    fVar.a(MainBuilderRequestClient.access$100(MainBuilderRequestClient.this));
                    if (MainBuilderRequestClient.access$200(MainBuilderRequestClient.this) != null) {
                        fVar.a(MainBuilderRequestClient.access$200(MainBuilderRequestClient.this).f10322a);
                    }
                    gVar = fVar.a(str);
                    if (gVar != null) {
                        gVar.d = mtopResponse;
                    }
                    j.b("mProcessData");
                    j.a("mThreadSwitch");
                } catch (Throwable th) {
                    Log.e(MainBuilderRequestClient.TAG, "Main structure building error:", th);
                }
                return gVar;
            }

            public void a(g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("381851ee", new Object[]{this, gVar});
                    return;
                }
                MtopRequestListener mtopRequestListener = (MtopRequestListener) MainBuilderRequestClient.access$300(MainBuilderRequestClient.this).get();
                if (MainBuilderRequestClient.access$400(MainBuilderRequestClient.this) != null) {
                    MainBuilderRequestClient.access$500(MainBuilderRequestClient.this).setVisibility(8);
                }
                try {
                    j.b("mThreadSwitch");
                    if (mtopRequestListener == null) {
                        return;
                    }
                    if (gVar == null) {
                        mtopRequestListener.b(mtopResponse);
                    } else {
                        mtopRequestListener.a(gVar);
                    }
                } catch (Throwable th) {
                    com.taobao.android.detail.sdk.utils.f.a(MainBuilderRequestClient.TAG, "Old detail MainRequestListener onPostExecute exception :", th);
                    if (mtopRequestListener != null) {
                        mtopRequestListener.b(mtopResponse);
                    }
                    MainBuilderRequestClient.access$600(gVar, th);
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, mtopResponse);
    }

    private static void exceptionTrace(g gVar, Throwable th) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645db21c", new Object[]{gVar, th});
            return;
        }
        AppMonitor.Counter.commit("Page_Detail", "Detail_Exception_Downgrade", null, 1.0d);
        com.taobao.android.detail.sdk.model.node.a aVar = gVar.e.b;
        boolean z2 = (aVar != null) & (aVar.b() != null);
        if (aVar.a() == null) {
            z = false;
        }
        if (!z2 || !z) {
            return;
        }
        ewn.a(aVar.b(), aVar.a().get("aliBizCode"), th);
    }
}

package mtopsdk.mtop.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.network.domain.b;
import tb.kge;
import tb.ryh;
import tb.ryl;
import tb.ryn;
import tb.ryp;
import tb.tms;

/* loaded from: classes.dex */
public class NetworkCallbackAdapter implements ryp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.NetworkCallbackAdapter";
    public ryh filterManager;
    public MtopCallback.MtopFinishListener finishListener;
    public MtopCallback.MtopHeaderListener headerListener;
    public final a mtopContext;

    static {
        kge.a(-1204940953);
        kge.a(298991861);
    }

    public NetworkCallbackAdapter(a aVar) {
        this.mtopContext = aVar;
        if (aVar != null) {
            if (aVar.f25000a != null) {
                this.filterManager = aVar.f25000a.getMtopConfig().filterManager;
            }
            MtopListener mtopListener = aVar.e;
            if (mtopListener instanceof MtopCallback.MtopHeaderListener) {
                this.headerListener = (MtopCallback.MtopHeaderListener) mtopListener;
            }
            if (!(mtopListener instanceof MtopCallback.MtopFinishListener)) {
                return;
            }
            this.finishListener = (MtopCallback.MtopFinishListener) mtopListener;
        }
    }

    public void onHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce9b7d3", new Object[]{this});
        } else {
            this.mtopContext.g.receivedResponseCodeTime = this.mtopContext.g.currentTimeMillis();
        }
    }

    public void onHeader(b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f28ce9", new Object[]{this, bVar, obj});
            return;
        }
        try {
            if (this.headerListener == null) {
                return;
            }
            MtopHeaderEvent mtopHeaderEvent = new MtopHeaderEvent(bVar.b, bVar.d);
            mtopHeaderEvent.seqNo = this.mtopContext.h;
            this.headerListener.onHeader(mtopHeaderEvent, obj);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, this.mtopContext.h, "onHeader failed.", th);
        }
    }

    public void onFinish(b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c944d2ef", new Object[]{this, bVar, obj});
        } else {
            onFinish(bVar, obj, false);
        }
    }

    public void onFinish(final b bVar, final Object obj, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f563dc5", new Object[]{this, bVar, obj, new Boolean(z)});
            return;
        }
        this.mtopContext.g.netSendEndTime = this.mtopContext.g.currentTimeMillis();
        this.mtopContext.d.reqContext = obj;
        ryl.a(this.mtopContext.d.handler, new Runnable() { // from class: mtopsdk.mtop.network.NetworkCallbackAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                tms.a("mtop_networkCb", NetworkCallbackAdapter.this.mtopContext.h);
                try {
                    if (z) {
                        NetworkCallbackAdapter.this.onHeader(bVar, obj);
                    }
                    NetworkCallbackAdapter.this.mtopContext.g.startCallbackTime = NetworkCallbackAdapter.this.mtopContext.g.currentTimeMillis();
                    FullTraceHelper.recordRspProcessStart(NetworkCallbackAdapter.this.mtopContext.g);
                    NetworkCallbackAdapter.this.mtopContext.g.netStats = bVar.f;
                    NetworkCallbackAdapter.this.mtopContext.n = bVar;
                    MtopResponse mtopResponse = new MtopResponse(NetworkCallbackAdapter.this.mtopContext.b.getApiName(), NetworkCallbackAdapter.this.mtopContext.b.getVersion(), null, null);
                    mtopResponse.setResponseCode(bVar.b);
                    mtopResponse.setHeaderFields(bVar.d);
                    mtopResponse.setMtopStat(NetworkCallbackAdapter.this.mtopContext.g);
                    if (bVar.e != null) {
                        try {
                            mtopResponse.setBytedata(bVar.e.c());
                        } catch (IOException e) {
                            TBSdkLog.e(NetworkCallbackAdapter.TAG, NetworkCallbackAdapter.this.mtopContext.h, "call getBytes of response.body() error.", e);
                        }
                        mtopResponse.setOriginFastJsonObject(bVar.i);
                        mtopResponse.setSupportStreamJson(NetworkCallbackAdapter.this.mtopContext.k.x);
                    }
                    NetworkCallbackAdapter.this.mtopContext.c = mtopResponse;
                    NetworkCallbackAdapter.this.filterManager.b(null, NetworkCallbackAdapter.this.mtopContext);
                } catch (Throwable th) {
                    TBSdkLog.e(NetworkCallbackAdapter.TAG, NetworkCallbackAdapter.this.mtopContext.h, "onFinish failed.", th);
                }
                tms.b();
            }
        }, this.mtopContext.h.hashCode());
    }

    @Override // tb.ryp
    public void onFailure(ryn rynVar, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbccbab", new Object[]{this, rynVar, exc});
            return;
        }
        b a2 = new b.a().a(rynVar.a()).a(-7).a(exc.getMessage()).a();
        onFinish(a2, a2.f25008a.q);
    }

    @Override // tb.ryp
    public void onResponse(ryn rynVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b906f0a", new Object[]{this, rynVar, bVar});
        } else {
            onFinish(bVar, bVar.f25008a.q, true);
        }
    }

    @Override // tb.ryp
    public void onCancel(ryn rynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7900349", new Object[]{this, rynVar});
            return;
        }
        b a2 = new b.a().a(rynVar.a()).a(-8).a();
        onFinish(a2, a2.f25008a.q);
    }
}

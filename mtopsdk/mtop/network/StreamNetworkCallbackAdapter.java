package mtopsdk.mtop.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.network.domain.b;
import tb.kge;
import tb.ryh;
import tb.ryl;
import tb.ryn;
import tb.ryp;

/* loaded from: classes9.dex */
public class StreamNetworkCallbackAdapter implements ryp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.StreamNetworkCallbackAdapter";
    public ryh filterManager;
    public final a mtopContext;
    public MtopCallback.MtopStreamListener streamListener;

    static {
        kge.a(-219717945);
        kge.a(298991861);
    }

    public static /* synthetic */ MtopResponse access$000(StreamNetworkCallbackAdapter streamNetworkCallbackAdapter, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponse) ipChange.ipc$dispatch("db6535fe", new Object[]{streamNetworkCallbackAdapter, bVar}) : streamNetworkCallbackAdapter.buildMtopResponse(bVar);
    }

    public StreamNetworkCallbackAdapter(a aVar) {
        this.mtopContext = aVar;
        if (aVar != null) {
            if (aVar.f25000a != null) {
                this.filterManager = aVar.f25000a.getMtopConfig().filterManager;
            }
            MtopListener mtopListener = aVar.e;
            if (!(mtopListener instanceof MtopCallback.MtopStreamListener)) {
                return;
            }
            this.streamListener = (MtopCallback.MtopStreamListener) mtopListener;
        }
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
            onFinish(bVar, bVar.f25008a.q);
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

    public void onReceiveData(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f62e34f", new Object[]{this, bVar});
        } else {
            ryl.b(this.mtopContext.d.handler, new Runnable() { // from class: mtopsdk.mtop.network.StreamNetworkCallbackAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(StreamNetworkCallbackAdapter.access$000(StreamNetworkCallbackAdapter.this, bVar));
                    mtopFinishEvent.seqNo = StreamNetworkCallbackAdapter.this.mtopContext.h;
                    TBSdkLog.e(StreamNetworkCallbackAdapter.TAG, StreamNetworkCallbackAdapter.this.mtopContext.h, "[onReceiveData----] callback");
                    if (StreamNetworkCallbackAdapter.this.mtopContext.g.streamFirstResponseSize <= 0 && bVar.g != null) {
                        StreamNetworkCallbackAdapter.this.mtopContext.g.streamFirstResponseSize = bVar.g.length;
                    }
                    if (StreamNetworkCallbackAdapter.this.mtopContext.g.streamFirstDataCallbackTime <= 0 && bVar.g != null) {
                        StreamNetworkCallbackAdapter.this.mtopContext.g.streamFirstDataCallbackTime = StreamNetworkCallbackAdapter.this.mtopContext.g.currentTimeMillis();
                        StreamNetworkCallbackAdapter.this.mtopContext.g.bizFirstChunkTime = System.currentTimeMillis();
                    }
                    if (bVar.h != null) {
                        if (StreamNetworkCallbackAdapter.this.mtopContext.g.parseStreamFirstDataDuration <= 0 && bVar.h.d > 0) {
                            StreamNetworkCallbackAdapter.this.mtopContext.g.parseStreamFirstDataDuration = bVar.h.d;
                        }
                        if (StreamNetworkCallbackAdapter.this.mtopContext.g.parseSSEDataDuration <= 0) {
                            StreamNetworkCallbackAdapter.this.mtopContext.g.parseSSEDataDuration = bVar.h.e;
                        }
                        if (StreamNetworkCallbackAdapter.this.mtopContext.g.expansionCount <= 0) {
                            StreamNetworkCallbackAdapter.this.mtopContext.g.expansionCount = bVar.h.f;
                        }
                        if (StreamNetworkCallbackAdapter.this.mtopContext.g.copyDataDuration <= 0) {
                            StreamNetworkCallbackAdapter.this.mtopContext.g.copyDataDuration = bVar.h.g;
                        }
                        if (StreamNetworkCallbackAdapter.this.mtopContext.g.receivedCount <= 0) {
                            StreamNetworkCallbackAdapter.this.mtopContext.g.receivedCount = bVar.h.h;
                        }
                        if (StreamNetworkCallbackAdapter.this.mtopContext.g.findEndDuration <= 0) {
                            StreamNetworkCallbackAdapter.this.mtopContext.g.findEndDuration = bVar.h.i;
                        }
                    }
                    StreamNetworkCallbackAdapter.this.streamListener.onReceiveData(mtopFinishEvent, StreamNetworkCallbackAdapter.this.mtopContext.d.reqContext);
                }
            }, this.mtopContext.h.hashCode());
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

    public void onFinish(final b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c944d2ef", new Object[]{this, bVar, obj});
            return;
        }
        this.mtopContext.g.streamRequest = true;
        this.mtopContext.g.netSendEndTime = this.mtopContext.g.currentTimeMillis();
        this.mtopContext.d.reqContext = obj;
        ryl.b(this.mtopContext.d.handler, new Runnable() { // from class: mtopsdk.mtop.network.StreamNetworkCallbackAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    StreamNetworkCallbackAdapter.this.mtopContext.g.startCallbackTime = StreamNetworkCallbackAdapter.this.mtopContext.g.currentTimeMillis();
                    FullTraceHelper.recordRspProcessStart(StreamNetworkCallbackAdapter.this.mtopContext.g);
                    StreamNetworkCallbackAdapter.this.mtopContext.g.netStats = bVar.f;
                    StreamNetworkCallbackAdapter.this.mtopContext.n = bVar;
                    StreamNetworkCallbackAdapter.this.mtopContext.c = StreamNetworkCallbackAdapter.access$000(StreamNetworkCallbackAdapter.this, bVar);
                    if (bVar.h != null) {
                        StreamNetworkCallbackAdapter.this.mtopContext.g.streamResponse = true;
                        StreamNetworkCallbackAdapter.this.mtopContext.g.responseCount = bVar.h.f33423a;
                        StreamNetworkCallbackAdapter.this.mtopContext.g.responseValidCount = bVar.h.b;
                        StreamNetworkCallbackAdapter.this.mtopContext.g.receivedNetDuration = bVar.h.j;
                    }
                    StreamNetworkCallbackAdapter.this.filterManager.b(null, StreamNetworkCallbackAdapter.this.mtopContext);
                } catch (Throwable th) {
                    TBSdkLog.e(StreamNetworkCallbackAdapter.TAG, StreamNetworkCallbackAdapter.this.mtopContext.h, "onFinish failed.", th);
                }
            }
        }, this.mtopContext.h.hashCode());
    }

    private MtopResponse buildMtopResponse(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("16771ee3", new Object[]{this, bVar});
        }
        MtopResponse mtopResponse = new MtopResponse(this.mtopContext.b.getApiName(), this.mtopContext.b.getVersion(), null, null);
        mtopResponse.setResponseCode(bVar.b);
        mtopResponse.setHeaderFields(bVar.d);
        mtopResponse.setMtopStat(this.mtopContext.g);
        mtopResponse.setStreamModeData(bVar.h);
        mtopResponse.setSupportStreamJson(this.mtopContext.q);
        if (bVar.i != null) {
            mtopResponse.setOriginFastJsonObject(bVar.i);
        }
        if (bVar.g != null) {
            mtopResponse.setBytedata(bVar.g);
        } else if (bVar.e != null) {
            try {
                mtopResponse.setBytedata(bVar.e.c());
            } catch (IOException e) {
                TBSdkLog.e(TAG, this.mtopContext.h, "call getBytes of response.body() error.", e);
            }
        }
        return mtopResponse;
    }
}

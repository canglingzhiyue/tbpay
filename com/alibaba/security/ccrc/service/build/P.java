package com.alibaba.security.ccrc.service.build;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.service.BaseCcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.X;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class P implements B {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    public static final String f3266a = "LifeCallback";
    public final String b;
    public final String c;
    public Handler d;
    public OnDetectRiskListener e;
    public E f;
    public C g;

    public P(String str, String str2) {
        this.b = str2;
        this.c = str;
    }

    private void c(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b243d6d", new Object[]{this, config});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(config.getPid()).setCcrcCode(this.b).setPhase("release").setOperation("end").setStatus(0).build());
        }
    }

    public static /* synthetic */ void lambda$1nXZzFhr_Ud4i7VAaBieRwxsUCk(P p, CcrcService.Config config, SampleData sampleData, boolean z, boolean z2, int i) {
        p.a(config, sampleData, z, z2, i);
    }

    public static /* synthetic */ void lambda$dH0bS0VjY9EBw6m7wIMgQYscfZY(P p, InitState initState, String str, CcrcService.Config config, long j, Map map) {
        p.a(initState, str, config, j, map);
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void a(CcrcService.Config config, CCRCRiskSample cCRCRiskSample, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5ba71a", new Object[]{this, config, cCRCRiskSample, new Boolean(z), str});
        }
    }

    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42123a21", new Object[]{this, c});
        } else {
            this.g = c;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void a(String str, String str2, boolean z, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffa1262", new Object[]{this, str, str2, new Boolean(z), str3, new Long(j)});
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void b(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6e70ac", new Object[]{this, config});
        } else {
            Logging.d(f3266a, "activate start");
        }
    }

    public void a(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421322df", new Object[]{this, e});
        } else {
            this.f = e;
        }
    }

    public void a(OnDetectRiskListener onDetectRiskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80fa8f", new Object[]{this, onDetectRiskListener});
        } else {
            this.e = onDetectRiskListener;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void a(CcrcService.Config config, final InitState initState, final InitResult initResult, Map<String, Object> map, final OnCcrcCallback onCcrcCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca02f14", new Object[]{this, config, initState, initResult, map, onCcrcCallback, new Long(j)});
            return;
        }
        a(initState);
        a(config, initState, System.currentTimeMillis() - j, initResult.getErrorMsg(), map);
        if (onCcrcCallback instanceof InterfaceC1267z) {
            ((InterfaceC1267z) onCcrcCallback).a(initState, initResult);
            return;
        }
        if (this.d == null) {
            this.d = new HandlerC1256va(null);
        }
        this.d.post(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$0JFPfJOjNRk58q-QDoIO2cgunUU
            @Override // java.lang.Runnable
            public final void run() {
                P.a(OnCcrcCallback.this, initState, initResult);
            }
        });
    }

    public static /* synthetic */ void a(OnCcrcCallback onCcrcCallback, InitState initState, InitResult initResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d514a9a", new Object[]{onCcrcCallback, initState, initResult});
        } else if (onCcrcCallback == null) {
        } else {
            try {
                onCcrcCallback.onInit(initState, initResult);
            } catch (Throwable th) {
                Logging.e(f3266a, "onInit callback fail", th);
            }
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void a(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8a3eb", new Object[]{this, config});
        } else if (config == null) {
        } else {
            StringBuilder a2 = Yb.a("deActive ");
            a2.append(config.getPid());
            Logging.d(f3266a, a2.toString());
            c(config);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.C
    public void a(String str, boolean z, CcrcService.Config config, SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc28313b", new Object[]{this, str, new Boolean(z), config, sampleData, baseCcrcDetectResult});
            return;
        }
        try {
            if (str.equals(C1205e.a()) && this.e != null) {
                this.e.onDetectResult((CcrcDetectResult) baseCcrcDetectResult);
            }
            if (this.g != null) {
                this.g.a(str, z, config, sampleData, baseCcrcDetectResult);
            }
            a(z, config, sampleData, true, 1);
        } catch (Throwable unused) {
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.E
    public void a(CcrcService.Config config, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f03d9e", new Object[]{this, config, sampleData});
            return;
        }
        E e = this.f;
        if (e != null) {
            e.a(config, sampleData);
        }
        a(true, config, sampleData, false, 1);
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void a(CcrcService.Config config, SampleData sampleData, CcrcDetectResult ccrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a876c52", new Object[]{this, config, sampleData, ccrcDetectResult});
            return;
        }
        try {
            if (this.e != null) {
                this.e.onDetectResult(ccrcDetectResult);
            }
            a(true, config, sampleData, true, 1);
        } catch (Throwable th) {
            Logging.e(f3266a, "onDetectResult callback fail", th);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.B
    public void a(CcrcService.Config config, SampleData sampleData, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610f3c97", new Object[]{this, config, sampleData, str, new Boolean(z), new Integer(i)});
            return;
        }
        try {
            if (this.e != null) {
                this.e.onDetectResult(W.a(str, sampleData));
            }
            a(false, config, sampleData, z, i);
        } catch (Throwable th) {
            Logging.e(f3266a, "onDetectResult callback fail", th);
        }
    }

    private void a(final CcrcService.Config config, final InitState initState, final long j, final String str, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad45f79", new Object[]{this, config, initState, new Long(j), str, map});
        } else if (StringUtils.equals(X.a.e, str)) {
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$P$dH0bS0VjY9EBw6m7wIMgQYscfZY
                @Override // java.lang.Runnable
                public final void run() {
                    P.lambda$dH0bS0VjY9EBw6m7wIMgQYscfZY(P.this, initState, str, config, j, map);
                }
            });
        }
    }

    public /* synthetic */ void a(InitState initState, String str, CcrcService.Config config, long j, Map map) {
        IpChange ipChange = $ipChange;
        int i = 3;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6850ec33", new Object[]{this, initState, str, config, new Long(j), map});
            return;
        }
        if (!a(initState)) {
            i2 = -1;
        }
        if (i2 != -1 || !StringUtils.equals(str, X.a.f3284a)) {
            i = i2;
        }
        TrackManager.track(TrackLog.newBuilder().setpId(config != null ? config.getPid() : null).setCcrcCode(this.b).setPhase("init").setOperation("end").setStatus(i).addParam("state", Integer.valueOf(initState.getState())).addParam("errorMsg", str).addParam("costTime", Long.valueOf(j)).addParam("prepareID", this.c).addParam("supportLowDevice", Boolean.valueOf(Ib.a(this.b).b())).addAllParam(map).build());
    }

    public boolean a(InitState initState) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d348e529", new Object[]{this, initState})).booleanValue() : initState == InitState.INIT_SUCCESS || initState == InitState.INITED;
    }

    public /* synthetic */ void a(CcrcService.Config config, SampleData sampleData, boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec7de25", new Object[]{this, config, sampleData, new Boolean(z), new Boolean(z2), new Integer(i)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(config != null ? config.getPid() : null).setCcrcCode(this.b).setMetaId(sampleData.metaId).setSampleId(sampleData.sampleId).setPhase("detect").setOperation("end");
        if (!z) {
            i2 = -1;
        }
        TrackManager.track(operation.setStatus(i2).setRiskId(sampleData.riskId).addParam("costTime", Long.valueOf(System.currentTimeMillis() - sampleData.startDetectTs)).addParam("isHit", Boolean.valueOf(z2)).addParam("sampleType", sampleData.sampleType).addParam("endType", Integer.valueOf(i)).addParam("metaType", sampleData.metaType).addExt("supportLowDevice", Boolean.valueOf(Ib.a(this.b).b())).build());
    }

    private void a(final boolean z, final CcrcService.Config config, final SampleData sampleData, final boolean z2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc517d1", new Object[]{this, new Boolean(z), config, sampleData, new Boolean(z2), new Integer(i)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$P$1nXZzFhr_Ud4i7VAaBieRwxsUCk
                @Override // java.lang.Runnable
                public final void run() {
                    P.lambda$1nXZzFhr_Ud4i7VAaBieRwxsUCk(P.this, config, sampleData, z, z2, i);
                }
            });
        }
    }
}

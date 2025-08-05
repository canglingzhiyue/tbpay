package com.alibaba.security.ccrc.service.build;

import android.util.Pair;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.BaseCcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.RiskShowCustomizedResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Oa implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    public static final String f3264a = "OffClientDetectSyncTask";
    public final CcrcService b;
    public volatile RiskShowCustomizedResult e;
    public final Map<String, Object> f;
    public volatile boolean g = true;
    public final CountDownLatch c = new CountDownLatch(1);
    public final HandlerC1256va d = new HandlerC1256va(null);

    public Oa(CcrcService ccrcService, Map<String, Object> map) {
        this.b = ccrcService;
        this.f = map;
        e();
    }

    public static /* synthetic */ void b(Oa oa) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79429b", new Object[]{oa});
        } else {
            oa.d();
        }
    }

    public static /* synthetic */ void c(Oa oa) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc9c", new Object[]{oa});
        } else {
            oa.f();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c.countDown();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b.setRiskCallback(new OnDetectRiskListener() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Oa$kTn7K0XWGEZbwCChzTYV7fGQcJM
            @Override // com.alibaba.security.ccrc.interfaces.OnDetectRiskListener
            public final void onDetectResult(CcrcDetectResult ccrcDetectResult) {
                Oa.lambda$kTn7K0XWGEZbwCChzTYV7fGQcJM(Oa.this, ccrcDetectResult);
            }
        });
        this.b.setRuleNotHitCallback(new E() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Oa$h73YNfSywE4dTh2cDVBPtSNreeM
            @Override // com.alibaba.security.ccrc.service.build.E
            public final void a(CcrcService.Config config, SampleData sampleData) {
                Oa.lambda$h73YNfSywE4dTh2cDVBPtSNreeM(Oa.this, config, sampleData);
            }
        });
        this.b.setActionDetectCallback(new C() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Oa$-jKVvP5s9A8a--DuEjddlqNsYK8
            @Override // com.alibaba.security.ccrc.service.build.C
            public final void a(String str, boolean z, CcrcService.Config config, SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
                Oa.m248lambda$jKVvP5s9A8aDuEjddlqNsYK8(Oa.this, str, z, config, sampleData, baseCcrcDetectResult);
            }
        });
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        StringBuilder a2 = Yb.a("OC_");
        a2.append(UUID.randomUUID().toString());
        new BehaviorRiskSample(a2.toString(), this.f).detect(this.b, true);
    }

    /* renamed from: lambda$-jKVvP5s9A8a--DuEjddlqNsYK8 */
    public static /* synthetic */ void m248lambda$jKVvP5s9A8aDuEjddlqNsYK8(Oa oa, String str, boolean z, CcrcService.Config config, SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
        oa.a(str, z, config, sampleData, baseCcrcDetectResult);
    }

    public static /* synthetic */ void lambda$h73YNfSywE4dTh2cDVBPtSNreeM(Oa oa, CcrcService.Config config, SampleData sampleData) {
        oa.a(config, sampleData);
    }

    public static /* synthetic */ void lambda$kTn7K0XWGEZbwCChzTYV7fGQcJM(Oa oa, CcrcDetectResult ccrcDetectResult) {
        oa.a(ccrcDetectResult);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            a();
        }
    }

    public static /* synthetic */ RiskShowCustomizedResult a(Oa oa, RiskShowCustomizedResult riskShowCustomizedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RiskShowCustomizedResult) ipChange.ipc$dispatch("46d9dc9c", new Object[]{oa, riskShowCustomizedResult});
        }
        oa.e = riskShowCustomizedResult;
        return riskShowCustomizedResult;
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d.post(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$YZiOY5CAFtQA1yMSdlHGheN1DyE
                @Override // java.lang.Runnable
                public final void run() {
                    Oa.a(str);
                }
            });
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !this.g;
    }

    public /* synthetic */ void a(CcrcDetectResult ccrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc38aa1c", new Object[]{this, ccrcDetectResult});
        } else if (c() || ccrcDetectResult.isSuccess()) {
        } else {
            this.e = W.a("CCRC detect error", ccrcDetectResult.getSampleID(), ccrcDetectResult.getDataID(), false, false);
            d();
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        CcrcService ccrcService = this.b;
        if (ccrcService != null) {
            return ccrcService.isSwitchClosed();
        }
        return false;
    }

    public /* synthetic */ void a(CcrcService.Config config, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f03d9e", new Object[]{this, config, sampleData});
        } else if (c()) {
        } else {
            this.e = W.a("CCRC not hit rule", sampleData.sampleId, sampleData.metaId, true, false);
            d();
        }
    }

    public /* synthetic */ void a(String str, boolean z, CcrcService.Config config, SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc28313b", new Object[]{this, str, new Boolean(z), config, sampleData, baseCcrcDetectResult});
        } else if (!str.equals(C1199c.a()) || c()) {
        } else {
            RiskShowCustomizedResult riskShowCustomizedResult = (RiskShowCustomizedResult) baseCcrcDetectResult;
            this.e = riskShowCustomizedResult;
            d();
            if (!z || !baseCcrcDetectResult.isRisk()) {
                return;
            }
            b(riskShowCustomizedResult.getUrl());
        }
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!C1238p.a()) {
        } else {
            try {
                Nav.from(CcrcContextImpl.getContext()).skipAllProcessors().toUri(str);
            } catch (Throwable unused) {
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b()) {
            this.e = W.a("CCRC switch is closed");
            d();
        } else if (this.b.isActivate()) {
            f();
        } else {
            CcrcService.Config.Builder builder = new CcrcService.Config.Builder();
            StringBuilder a2 = Yb.a("PID_OC_");
            a2.append(UUID.randomUUID().toString());
            this.b.activate(builder.setPid(a2.toString()).build(), new Na(this));
        }
    }

    public Pair<RiskShowCustomizedResult, Boolean> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1732eaa6", new Object[]{this, new Long(j)});
        }
        try {
            this.g = this.c.await(j, TimeUnit.MILLISECONDS);
            if (this.e == null) {
                this.e = W.a("CCRC detect timeout");
            }
            return new Pair<>(this.e, Boolean.valueOf(this.g));
        } catch (Throwable th) {
            if (this.e == null) {
                StringBuilder a2 = Yb.a("get exception: ");
                a2.append(th.getMessage());
                this.e = W.a(a2.toString());
            }
            return new Pair<>(this.e, false);
        }
    }
}

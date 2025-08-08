package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.enums.RunState;
import com.alibaba.security.ccrc.interfaces.OnAlgoResultCallback;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.interfaces.Uploader;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.F;
import com.alibaba.security.ccrc.service.build.X;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.config.WuKongEventConfigData;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.alibaba.security.wukong.plugin.BaseWuKongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class M implements A, F.b, InterfaceC1260wb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3259a = "CcrcServiceManager";
    public final Ta b;
    public final C1252u c;
    public final Ga d;
    public final G f;
    public final P g;
    public final F h;
    public final V j;
    public final String k;
    public final String l;
    public final C1262xa m;
    public CcrcService.Config o;
    public Uploader p;
    public final Mb q;
    public volatile RunState n = RunState.INITIAL;
    public final U e = new U();
    public final Y i = new Y();

    public M(String str) {
        this.k = str;
        this.l = c(str);
        this.q = new RiskDataPipeManager(str);
        this.d = new Ga(str);
        this.f = new G(str);
        this.m = new C1262xa(str);
        this.b = new Ta(str, this.l);
        this.b.a(this);
        this.b.a(this.f);
        this.c = new C1252u(this.b);
        this.h = new F(str);
        this.b.a(this.h);
        this.g = new P(this.l, str);
        this.b.a(this.g);
        this.j = new V();
    }

    public static /* synthetic */ void a(M m, RunState runState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5b83d3", new Object[]{m, runState});
        } else {
            m.c(runState);
        }
    }

    private void e(CcrcService.Config config, OnCcrcCallback onCcrcCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1213aac", new Object[]{this, config, onCcrcCallback, new Long(j)});
        } else {
            this.j.a(new K(this, config, onCcrcCallback, j));
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.h.a(this.b.p(), this, this.g);
        }
    }

    private Map<String, Object> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_data", this.b.a());
        hashMap.put("isHitDiskCache", Boolean.valueOf(this.b.l()));
        return hashMap;
    }

    public synchronized void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (l()) {
            Logging.d(f3259a, "wukong sdk has downgrade");
        } else if (a(RunState.ACTIVE_SUCCESS)) {
            Logging.w(f3259a, "sdk not init yet, so do not release");
        } else {
            if (this.b.e() != null) {
                Pb pb = new Pb();
                pb.b = this.o.getPid();
                pb.c = this.b.e().bizId;
                this.q.unregisterPipe(pb);
            }
            this.g.a(this.o);
            this.b.q();
            this.f.b();
            this.d.b();
            this.e.b();
            this.h.a();
            c(RunState.INITIAL);
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.b.c();
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1245rb
    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this}) : this.k;
    }

    public List<Algo> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.b.h();
    }

    public Uploader i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uploader) ipChange.ipc$dispatch("1ed49f6e", new Object[]{this}) : this.p;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : b(RunState.ACTIVE_ING) || b(RunState.ACTIVE_WAITING);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b.b();
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : !this.b.n();
    }

    public synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (l()) {
            Logging.w(f3259a, "wukong sdk has downgrade");
        } else if (CcrcContextImpl.getContext() == null) {
            Logging.e(f3259a, "sdk has not init");
        } else if (a(RunState.INITIAL)) {
            Logging.w(f3259a, "not initial state");
        } else {
            c(RunState.PREPARING);
            a(this.l, false, (InterfaceC1257vb) new I(this));
        }
    }

    public static /* synthetic */ void a(M m, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd435d1", new Object[]{m, context});
        } else {
            m.b(context);
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        a(new C1205e(context));
        a(new C1196b(context));
        a(new C1199c(context));
    }

    private void c(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b243d6d", new Object[]{this, config});
            return;
        }
        WuKongEventConfigData e = this.b.e();
        if (e == null) {
            return;
        }
        Pb pb = new Pb();
        pb.f3268a = this.k;
        pb.b = config.getPid();
        pb.c = e.bizId;
        pb.d = e.crc32Hashs;
        pb.e = e.defaultRiskData;
        this.q.registerPipe(pb);
        this.q.writeData(pb, e.defaultRiskData);
    }

    private void d(CcrcService.Config config, OnCcrcCallback onCcrcCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda828ab", new Object[]{this, config, onCcrcCallback, new Long(j)});
            return;
        }
        try {
            this.o = config;
            this.f.a();
            c(config);
            n();
            this.e.a(this.k, config, this);
            this.d.a(this.k, config, this.g, this.q);
            this.b.a(config, new L(this, config, onCcrcCallback, j));
        } catch (Throwable th) {
            Logging.e(f3259a, "do activate fail", th);
            c(RunState.PREPARE_SUCCESS);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1245rb
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        CcrcService.Config config = this.o;
        return config == null ? this.l : config.getPid();
    }

    public static /* synthetic */ void a(M m, CcrcService.Config config, OnCcrcCallback onCcrcCallback, boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429bd933", new Object[]{m, config, onCcrcCallback, new Boolean(z), str, new Long(j)});
        } else {
            m.a(config, onCcrcCallback, z, str, j);
        }
    }

    private void b(CcrcService.Config config, OnCcrcCallback onCcrcCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b604a9", new Object[]{this, config, onCcrcCallback, new Long(j)});
        } else {
            this.b.a(config, new L(this, config, onCcrcCallback, j));
        }
    }

    public void a(BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3e04be", new Object[]{this, baseWuKongContentRiskPlugin});
        } else {
            this.e.a(baseWuKongContentRiskPlugin);
        }
    }

    private void b(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6e70ac", new Object[]{this, config});
        } else {
            this.e.a(this.k, config, this);
        }
    }

    public void a(Uploader uploader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d780a6", new Object[]{this, uploader});
        } else {
            this.p = uploader;
        }
    }

    public void a(BaseActionPerform baseActionPerform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4f11f6", new Object[]{this, baseActionPerform});
        } else {
            this.d.a(baseActionPerform);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.F.b
    public void b(CcrcService.Config config, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef05f94f", new Object[]{this, config, str, map});
        } else if (map == null) {
        } else {
            a(config.getPid(), str, map);
        }
    }

    public void a(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb14d106", new Object[]{this, str, obj, new Boolean(z)});
        } else {
            this.m.a(str, obj, z);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.F.b
    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.b.b(str);
    }

    private void a(String str, boolean z, InterfaceC1257vb interfaceC1257vb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a29e31a", new Object[]{this, str, new Boolean(z), interfaceC1257vb});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        CcrcContextImpl.getInstance().setAppVersion(C1238p.a(CcrcContextImpl.getContext()));
        CcrcContextImpl.getInstance().setAppName(C1238p.b(CcrcContextImpl.getContext()));
        this.g.a(str, this.k);
        this.b.a(str, this.e, z, new J(this, str, currentTimeMillis, interfaceC1257vb));
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b.a();
    }

    private synchronized boolean b(RunState runState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15cb8b69", new Object[]{this, runState})).booleanValue();
        }
        return this.n == runState;
    }

    private boolean c(CcrcService.Config config, OnCcrcCallback onCcrcCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a2f16ae", new Object[]{this, config, onCcrcCallback, new Long(j)})).booleanValue();
        }
        if (config != null && !StringUtils.isEmpty(config.getPid())) {
            if (CcrcContextImpl.getContext() == null) {
                this.g.a(config, InitState.INIT_FAIL, InitResult.createResult(X.a.c, config.getPid()), o(), onCcrcCallback, j);
                return false;
            } else if (CcrcContextImpl.getInstance().getTtid() != null) {
                return true;
            } else {
                this.g.a(config, InitState.INIT_FAIL, InitResult.createResult(X.a.d, config.getPid()), o(), onCcrcCallback, j);
                return false;
            }
        }
        this.g.a(config, InitState.INIT_FAIL, InitResult.createResult(X.a.d, null), o(), onCcrcCallback, j);
        return false;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b.b(z);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b.g();
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.e.a(this.i.a(context), this.f);
        }
    }

    public synchronized void a(CcrcService.Config config, OnCcrcCallback onCcrcCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff12779c", new Object[]{this, config, onCcrcCallback});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.g.b(config);
        String str = null;
        if (l()) {
            P p = this.g;
            InitState initState = InitState.INIT_FAIL;
            if (config != null) {
                str = config.getPid();
            }
            p.a(config, initState, InitResult.createResult(X.a.e, str), o(), onCcrcCallback, currentTimeMillis);
        } else if (!c(config, onCcrcCallback, currentTimeMillis)) {
        } else {
            if (b(RunState.ACTIVE_SUCCESS)) {
                this.g.a(config, InitState.INITED, InitResult.createResult(null, config.getPid()), o(), onCcrcCallback, currentTimeMillis);
            } else if (j()) {
                this.g.a(config, InitState.INIT_ING, InitResult.createResult(X.a.f, config.getPid()), o(), onCcrcCallback, currentTimeMillis);
            } else if (b(RunState.PREPARE_SUCCESS)) {
                c(RunState.ACTIVE_ING);
                d(config, onCcrcCallback, currentTimeMillis);
            } else if (b(RunState.PREPARING)) {
                c(RunState.ACTIVE_WAITING);
                this.j.a(new K(this, config, onCcrcCallback, currentTimeMillis));
            } else {
                c(RunState.ACTIVE_ING);
                a(config, onCcrcCallback, currentTimeMillis);
            }
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        return ("PREPARE_" + str + "_" + UUID.randomUUID().toString()).toUpperCase();
    }

    private synchronized void c(RunState runState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b45b1a6", new Object[]{this, runState});
        } else {
            this.n = runState;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public U c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (U) ipChange.ipc$dispatch("1b94cad1", new Object[]{this}) : this.e;
    }

    public void a(final CcrcService.Config config, final OnCcrcCallback onCcrcCallback, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33cf2a8", new Object[]{this, config, onCcrcCallback, new Long(j)});
        } else {
            a(config.getPid(), true, new InterfaceC1257vb() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$M$RkjntVBqP_2wKOzdZzV7wgjsnG8
                @Override // com.alibaba.security.ccrc.service.build.InterfaceC1257vb
                public final void a(boolean z, String str, Map map) {
                    M.this.a(config, onCcrcCallback, j, z, str, map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CcrcService.Config config, OnCcrcCallback onCcrcCallback, long j, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f8e4cf", new Object[]{this, config, onCcrcCallback, new Long(j), new Boolean(z), str, map});
        } else {
            a(config, onCcrcCallback, z, str, j);
        }
    }

    private void a(CcrcService.Config config, OnCcrcCallback onCcrcCallback, boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85aac82", new Object[]{this, config, onCcrcCallback, new Boolean(z), str, new Long(j)});
        } else if (!z) {
            c(RunState.INITIAL);
            this.g.a(config, InitState.INIT_FAIL, InitResult.createResult(str, config.getPid()), o(), onCcrcCallback, j);
        } else {
            d(config, onCcrcCallback, j);
        }
    }

    private void a(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8a3eb", new Object[]{this, config});
        } else {
            this.d.a(this.k, config, this.g, this.q);
        }
    }

    private SampleData a(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SampleData) ipChange.ipc$dispatch("5ea75f28", new Object[]{this, cCRCRiskSample}) : SampleData.transform(cCRCRiskSample);
    }

    public void a(CCRCRiskSample cCRCRiskSample, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fecc9b3", new Object[]{this, cCRCRiskSample, new Boolean(z)});
            return;
        }
        this.g.a(this.o, cCRCRiskSample, z, this.n.name());
        if (cCRCRiskSample != null) {
            cCRCRiskSample.getExtras().put("__detectStart", Long.valueOf(System.currentTimeMillis()));
        }
        if (l()) {
            this.g.a(this.o, SampleData.transform(cCRCRiskSample), X.a.e, false, -1);
        } else if (cCRCRiskSample == null) {
            this.g.a(this.o, SampleData.transform(null), X.a.d, false, -1);
        } else if (!cCRCRiskSample.isValid()) {
            this.g.a(this.o, SampleData.transform(cCRCRiskSample), X.a.d, false, -1);
        } else if (a(RunState.ACTIVE_SUCCESS)) {
            this.g.a(this.o, SampleData.transform(cCRCRiskSample), X.a.b, false, -1);
        } else {
            this.c.a(this.e, cCRCRiskSample, this.o, z);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.A, com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b.a(str);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.A
    public void a(CcrcService.Config config, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdf69f0", new Object[]{this, config, str, map});
        } else if (map == null) {
        } else {
            a(config.getPid(), str, map);
        }
    }

    private void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            this.b.a(str, str2, map);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        Logging.d(f3259a, String.format("switch %s %s", str, Boolean.valueOf(z)));
        for (BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin : this.e.a()) {
            baseWuKongContentRiskPlugin.switchAlgo(str, z);
        }
    }

    private synchronized boolean a(RunState runState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0516528", new Object[]{this, runState})).booleanValue();
        }
        return this.n != runState;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : b(RunState.ACTIVE_SUCCESS);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.a(z);
        }
    }

    public void a(OnAlgoResultCallback onAlgoResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef738e60", new Object[]{this, onAlgoResultCallback});
        } else {
            this.f.a(onAlgoResultCallback);
        }
    }

    public void a(OnDetectRiskListener onDetectRiskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80fa8f", new Object[]{this, onDetectRiskListener});
        } else {
            this.g.a(onDetectRiskListener);
        }
    }

    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42123a21", new Object[]{this, c});
        } else {
            this.g.a(c);
        }
    }

    public void a(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421322df", new Object[]{this, e});
        } else {
            this.g.a(e);
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b.a(map);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public void a(Pb pb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe347a", new Object[]{this, pb});
        } else {
            this.q.resetPipeData(pb);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1260wb
    public void a(Pb pb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50f3c4", new Object[]{this, pb, str});
        } else {
            this.q.writeData(pb, str);
        }
    }
}

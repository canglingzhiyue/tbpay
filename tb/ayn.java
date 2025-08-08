package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.parse.a;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.event.adjust")
/* loaded from: classes2.dex */
public final class ayn extends arv implements ash {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjust";

    /* renamed from: a  reason: collision with root package name */
    private List<emt> f25691a;
    private aqs b;
    private AURAGlobalData c;

    static {
        kge.a(1486917635);
        kge.a(-173619745);
    }

    public static /* synthetic */ Object ipc$super(ayn aynVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "adjust";
    }

    public static /* synthetic */ void a(ayn aynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f71fe2", new Object[]{aynVar});
        } else {
            aynVar.g();
        }
    }

    public static /* synthetic */ void a(ayn aynVar, UMFLinkageTrigger uMFLinkageTrigger, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a589f", new Object[]{aynVar, uMFLinkageTrigger, new Boolean(z)});
        } else {
            aynVar.c(uMFLinkageTrigger, z);
        }
    }

    public static /* synthetic */ void a(ayn aynVar, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8903dd2", new Object[]{aynVar, aURAParseIO});
        } else {
            aynVar.a(aURAParseIO);
        }
    }

    public static /* synthetic */ boolean a(ayn aynVar, b bVar, aqx aqxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84e2fb26", new Object[]{aynVar, bVar, aqxVar})).booleanValue() : aynVar.a(bVar, aqxVar);
    }

    public static /* synthetic */ void b(ayn aynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf7a2663", new Object[]{aynVar});
        } else {
            aynVar.f();
        }
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        if (!baz.a("useNewInstancePoolManager", true, true)) {
            avi.a().a(qVar.e(), qVar.b());
        }
        this.f25691a = fVar.b(emt.class);
    }

    @Override // tb.arv, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        avi.a().b(b().e(), b().b());
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (!c(aURAEventIO)) {
            UMFLinkageTrigger a2 = aym.a(aURAEventIO);
            if (b(a2)) {
                return;
            }
            if (this.f25691a != null) {
                List<s> a3 = avi.a().a(b().e());
                for (emt emtVar : this.f25691a) {
                    emtVar.a(a2, a3);
                }
            }
            String str = null;
            try {
                str = aURAEventIO.getEventModel().d().data.container.name;
            } catch (Throwable unused) {
            }
            aURAEventIO.getEventModel();
            boolean a4 = a(aURAEventIO, "isConfirm", false);
            boolean a5 = a(aURAEventIO, "isCancel", false);
            if (!"buy_v2_pop_bottom".equals(str) && !a(aURAEventIO.getEventModel()) && !a4 && !a5) {
                z = false;
            }
            if (z) {
                b(a2, a5);
            } else {
                a(a2, a(aURAEventIO, "sync"));
            }
        }
    }

    private boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb347ab1", new Object[]{this, dVar})).booleanValue();
        }
        AURARenderComponent d = dVar.d();
        if (d == null) {
            return false;
        }
        for (gug gugVar : c().b(gug.class)) {
            if (gugVar.a(d)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dfc3cda", new Object[]{this, aURAEventIO})).booleanValue();
        }
        for (hif hifVar : c().b(hif.class)) {
            if (hifVar.a(aURAEventIO)) {
                return true;
            }
        }
        return false;
    }

    private void a(UMFLinkageTrigger uMFLinkageTrigger, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a339359", new Object[]{this, uMFLinkageTrigger, new Boolean(z)});
            return;
        }
        final s b = b().b();
        b.a("aura.workflow.adjust", uMFLinkageTrigger, new aqq() { // from class: tb.ayn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                } else if (!"AURANextRPCServiceDomain".equals(bVar.f()) || ayn.a(ayn.this, bVar, new aqx<b, Void>() { // from class: tb.ayn.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.aqx
                    public Void a(b bVar2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (Void) ipChange3.ipc$dispatch("b9b68f7d", new Object[]{this, bVar2});
                        }
                        b.a("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
                        return null;
                    }
                })) {
                } else {
                    b.a("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
                }
            }

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                } else if (!z) {
                } else {
                    ayn.b(ayn.this);
                }
            }
        });
    }

    private void f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        AURAGlobalData aURAGlobalData = this.c;
        if (aURAGlobalData == null || (jSONObject = (JSONObject) aURAGlobalData.get("aura_data_protocol_json", JSONObject.class)) == null) {
            return;
        }
        a(new AURAParseIO(Arrays.asList(new a(jSONObject))));
    }

    private void b(final UMFLinkageTrigger uMFLinkageTrigger, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a18fb8", new Object[]{this, uMFLinkageTrigger, new Boolean(z)});
            return;
        }
        AURAParseIO a2 = a(z);
        if (a2 != null) {
            b().b().a("aura.workflow.parse", a2, new aqq() { // from class: tb.ayn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqq, tb.aqs
                public void a(b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    } else if (bVar.d() != 0) {
                    } else {
                        ayn.a(ayn.this);
                    }
                }

                @Override // tb.aqq
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    } else {
                        ayn.a(ayn.this, uMFLinkageTrigger, z);
                    }
                }
            });
        } else {
            c(uMFLinkageTrigger, z);
        }
    }

    private AURAParseIO a(boolean z) {
        AURAGlobalData aURAGlobalData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAParseIO) ipChange.ipc$dispatch("b701a5a", new Object[]{this, new Boolean(z)});
        }
        if (!z || (aURAGlobalData = this.c) == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) aURAGlobalData.get("floatRawProtocol", JSONObject.class);
        String str = (String) this.c.get("floatRootKey", String.class);
        if (jSONObject == null || StringUtils.isEmpty(str)) {
            return null;
        }
        AURAParseIO aURAParseIO = new AURAParseIO(Arrays.asList(new a(jSONObject)));
        aURAParseIO.setRootKey(str);
        return aURAParseIO;
    }

    private void c(UMFLinkageTrigger uMFLinkageTrigger, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530f8c17", new Object[]{this, uMFLinkageTrigger, new Boolean(z)});
        } else if (!z && !a(uMFLinkageTrigger)) {
            g();
        } else {
            s b = b().b();
            b.a("aura.workflow.adjustConfirm", uMFLinkageTrigger, new AnonymousClass3(b, z));
        }
    }

    /* renamed from: tb.ayn$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends aqq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f25695a;
        public final /* synthetic */ boolean b;

        public AnonymousClass3(s sVar, boolean z) {
            this.f25695a = sVar;
            this.b = z;
        }

        @Override // tb.aqq, tb.aqs
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
                return;
            }
            if ("AURANextRPCServiceDomain".equals(bVar.f())) {
                if (ayn.a(ayn.this, bVar, new aqx<b, Void>() { // from class: tb.ayn.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.aqx
                    public Void a(b bVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Void) ipChange2.ipc$dispatch("b9b68f7d", new Object[]{this, bVar2});
                        }
                        AnonymousClass3.this.b(bVar2);
                        return null;
                    }
                })) {
                    return;
                }
                this.f25695a.a("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
            }
            if (bVar.d() != 0 || !this.b) {
                return;
            }
            ayn.a(ayn.this);
        }

        public void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa3ecd81", new Object[]{this, bVar});
                return;
            }
            if ("AURANextRPCServiceDomain".equals(bVar.f())) {
                this.f25695a.a("aura.workflow.adjustRules", new UMFRuleIO("rollback"), null);
            }
            if (bVar.d() != 0 || !this.b) {
                return;
            }
            ayn.a(ayn.this);
        }

        @Override // tb.aqq
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                return;
            }
            Serializable b = cVar.b();
            if (b instanceof AURAParseIO) {
                ayn.a(ayn.this, (AURAParseIO) b);
            }
            ayn.a(ayn.this);
        }
    }

    private boolean a(b bVar, aqx<b, Void> aqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f7afcac", new Object[]{this, bVar, aqxVar})).booleanValue();
        }
        List<emt> list = this.f25691a;
        if (list != null) {
            for (emt emtVar : list) {
                if (emtVar.a(bVar, aqxVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115c7adf", new Object[]{this, uMFLinkageTrigger})).booleanValue();
        }
        for (ayp aypVar : c().b(ayp.class)) {
            if (!aypVar.a(uMFLinkageTrigger)) {
                return false;
            }
        }
        return true;
    }

    private boolean a(AURAEventIO aURAEventIO, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89bddefa", new Object[]{this, aURAEventIO, str, new Boolean(z)})).booleanValue();
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        return c != null ? c.getBooleanValue(str) : z;
    }

    private boolean a(AURAEventIO aURAEventIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dbbc7a2", new Object[]{this, aURAEventIO, str})).booleanValue();
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            return false;
        }
        return str.equalsIgnoreCase(c.getString("option"));
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.b = aqsVar;
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.c = aURAGlobalData;
    }

    private void a(AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb929d8", new Object[]{this, aURAParseIO});
            return;
        }
        List<s> a2 = avi.a().a(b().e());
        if (a2 == null) {
            return;
        }
        for (s sVar : a2) {
            sVar.a("aura.workflow.update", aURAParseIO, null);
        }
    }

    private boolean b(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed1df6a0", new Object[]{this, uMFLinkageTrigger})).booleanValue();
        }
        List<s> a2 = avi.a().a(b().e());
        if (a2 == null || a2.isEmpty()) {
            this.b.a(new b(1, "AURALinkagePluginDomain", "-4001_ADJUST_PARAM_CHECK", "mInstancePool is empty"));
            return true;
        } else if (uMFLinkageTrigger != null) {
            return false;
        } else {
            this.b.a(new b(1, "AURALinkagePluginDomain", "-4001_ADJUST_PARAM_CHECK", "linkageTrigger is empty"));
            return true;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            com.alibaba.android.aura.service.event.c.a(b().b(), azo.EVENT_TYPE, new d());
        }
    }

    @Override // tb.ash
    public boolean a(AURAParseIO aURAParseIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a88da6", new Object[]{this, aURAParseIO, str})).booleanValue();
        }
        a(aURAParseIO);
        return true;
    }
}

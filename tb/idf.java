package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.c;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

@AURAExtensionImpl(code = "tbbuy.impl.aspect.bx.tracker")
/* loaded from: classes6.dex */
public final class idf implements aro, arp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f28921a;
    private Map<String, String> b = new HashMap();
    private aqs c;
    private Boolean d;

    static {
        kge.a(-32615457);
        kge.a(-1795775593);
        kge.a(389606329);
    }

    @Override // tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(idf idfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c09e4d7", new Object[]{idfVar, str});
        } else {
            idfVar.a(str);
        }
    }

    public static /* synthetic */ void a(idf idfVar, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fef684", new Object[]{idfVar, str, str2, map});
        } else {
            idfVar.a(str, str2, map);
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f28921a = qVar;
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = (Boolean) this.f28921a.a("enableAsyncUT", Boolean.class, false);
        }
        Boolean bool = this.d;
        return bool != null && bool.booleanValue();
    }

    @Override // tb.aro
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        c e = bVar.e();
        if ((!com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_MAIN_FLOW.equals(e.d()) && !"aura.workflow.request".equals(e.d())) || !"AURANextRPCServiceDomain".equals(bVar.f()) || !"-2000_REQUEST_EXCEPTION".equals(bVar.a())) {
            return;
        }
        com.alibaba.android.aura.datamodel.nextrpc.a aVar = (com.alibaba.android.aura.datamodel.nextrpc.a) bbc.a(bVar.c(), "NextRPCRemoteResponse", com.alibaba.android.aura.datamodel.nextrpc.a.class, null);
        if (aVar == null) {
            this.c.a(new b(1, idc.ERROR_DOMAIN, "emptyRemoteResponse", "RemoteResponse为空"));
            return;
        }
        MtopResponse g = aVar.g();
        if (g == null) {
            this.c.a(new b(1, idc.ERROR_DOMAIN, "emptyMtopResponse", "MtopResponse为空"));
        } else {
            b(g.isApiLockedResult() ? "2" : "1");
        }
    }

    @Override // tb.arp
    public void afterFlowExecute(com.alibaba.android.aura.datamodel.c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
        } else if ((com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_MAIN_FLOW.equals(aVar.d()) || "aura.workflow.request".equals(aVar.d())) && !z) {
            b("0");
        } else if (!"aura.workflow.submit".equals(aVar.d())) {
        } else {
            this.b.put("status", z ? "createOrderFail" : "createOrderSuccess");
            a(this.b);
        }
    }

    @Override // tb.arp
    public void afterServiceExecute(com.alibaba.android.aura.datamodel.c cVar, a aVar, boolean z) {
        com.alibaba.android.aura.datamodel.parse.a aVar2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
        } else if (!"aura.workflow.submit".equals(aVar.d()) || !asd.NEXT_RPC_SERVICE_CODE.equals(aVar.c())) {
        } else {
            Serializable b = cVar.b();
            if (!(b instanceof AURAParseIO)) {
                return;
            }
            List<com.alibaba.android.aura.datamodel.parse.a> data = ((AURAParseIO) b).getData();
            if (data.size() != 1 || (aVar2 = data.get(0)) == null || (string = aVar2.a().getString(CoreConstants.IN_PARAM_BIZ_ORDER_ID)) == null) {
                return;
            }
            this.b.put(CoreConstants.IN_PARAM_BIZ_ORDER_ID, string);
            this.b.put("bizOrderIdForBBA", string.replace(",", "."));
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.c = aqsVar;
        }
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (a()) {
            bbh.a(new Runnable() { // from class: tb.idf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        idf.a(idf.this, str);
                    } catch (Throwable th) {
                        ard a2 = arc.a();
                        a2.b("asyncEnterOrderBXTracker exception :" + th.toString());
                    }
                }
            });
        } else {
            a(str);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        q qVar = this.f28921a;
        if (qVar == null) {
            return;
        }
        Context e = qVar.e();
        Intent b = fke.b(e);
        if (b == null) {
            tdh.b("EMPTY_INTENT_FORM_(enterOrderBXTracker)", "intent is empty");
            return;
        }
        Map<String, String> a2 = com.taobao.android.purchase.core.utils.f.a(e, b);
        if (a2 == null) {
            a2 = new HashMap<>();
        }
        a2.put("status", str);
        a("Page_ConfirmOrder", com.taobao.android.purchase.core.utils.f.ENTER_ORDER, a2);
    }

    private void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (a()) {
            bbh.a(new Runnable() { // from class: tb.idf.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        idf.a(idf.this, "Page_ConfirmOrder", com.taobao.android.purchase.core.utils.f.CREATE_ORDER, map);
                    } catch (Throwable th) {
                        ard a2 = arc.a();
                        a2.b("asyncEnterOrderBXTracker exception :" + th.toString());
                    }
                }
            });
        } else {
            a("Page_ConfirmOrder", com.taobao.android.purchase.core.utils.f.CREATE_ORDER, map);
        }
    }

    private void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, str2, null, null, map).build());
        }
    }
}

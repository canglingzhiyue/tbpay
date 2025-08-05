package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.utils.g;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.bga;

@AURAExtensionImpl(code = "tbbuy.impl.aspect.monitor.buy2.0")
/* loaded from: classes6.dex */
public final class idi extends idd implements arp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEGRADE_REASON = "buy2DowngradeNewContainer";

    /* renamed from: a  reason: collision with root package name */
    private q f28929a;
    private Boolean b;

    static {
        kge.a(-1577349081);
        kge.a(-1795775593);
    }

    public static /* synthetic */ Object ipc$super(idi idiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arp
    public void afterServiceExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
        }
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

    public static /* synthetic */ void a(idi idiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed73b16a", new Object[]{idiVar});
        } else {
            idiVar.d();
        }
    }

    public static /* synthetic */ void a(idi idiVar, Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d1c627", new Object[]{idiVar, context, map});
        } else {
            idiVar.a(context, map);
        }
    }

    @Override // tb.idc, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f28929a = qVar;
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            this.b = (Boolean) this.f28929a.a("enableAsyncUT", Boolean.class, false);
        }
        Boolean bool = this.b;
        return bool != null && bool.booleanValue();
    }

    @Override // tb.idd
    public void a(boolean z, JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f89dbe2", new Object[]{this, new Boolean(z), jSONObject, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_DEGRADE_REASON, str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f28929a.e(), hashMap);
    }

    @Override // tb.arp
    public void afterFlowExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
        } else if ((!com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_MAIN_FLOW.equals(aVar.d()) && !"aura.workflow.request".equals(aVar.d())) || z) {
        } else {
            final HashMap hashMap = new HashMap();
            hashMap.put("purchaseV2NewContainer", "true");
            final Context e = this.f28929a.e();
            Object c = fke.c(e);
            if (c instanceof com.taobao.android.purchase.aura.c) {
                Map<String, String> a2 = ((com.taobao.android.purchase.aura.c) c).a();
                if (!bau.a(a2)) {
                    hashMap.putAll(a2);
                }
            } else {
                tdh.b("EMPTY_CONTAINER_FORM_(TBBuyMonitorExtension)", "container is empty");
                if (baw.a()) {
                    throw new IllegalStateException("必须实现接口类：ITBBuyPageContainer");
                }
            }
            if (e()) {
                bbh.a(new Runnable() { // from class: tb.idi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            idi.a(idi.this, e, hashMap);
                            g.a(e, 2, hashMap);
                            idi.a(idi.this);
                        } catch (Throwable th) {
                            ard a3 = arc.a();
                            a3.b("asyncEnterOrderBXTracker exception :" + th.toString());
                        }
                    }
                });
                return;
            }
            a(e, hashMap);
            g.a(e, 2, hashMap);
            d();
        }
    }

    private void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        Intent b = fke.b(context);
        if (b == null) {
            tdh.b("EMPTY_INTENT_FORM_(addPageTypeTracker)", "intent is empty");
            return;
        }
        map.put("purchase_from", String.valueOf(b.getIntExtra("purchase_from", 3)));
        Map<? extends String, ? extends String> map2 = (Map) this.f28929a.a("page_info", Map.class);
        if (map2 == null) {
            return;
        }
        map.putAll(map2);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            bga.c.a("purchase", "buy2", "E_NEW_BUY_2.0_NEW_CONTAINER", "default", true);
        }
    }
}

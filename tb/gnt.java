package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.datamodel.nextrpc.d;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;

@AURAExtensionImpl(code = "alibuy.impl.render.performance.jsTracker")
/* loaded from: classes4.dex */
public final class gnt implements ath {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean g;

    /* renamed from: a  reason: collision with root package name */
    private q f28395a;
    private AURAFlowData b;
    private volatile boolean c;
    private AURAGlobalData d;
    private String e;
    private JSONObject f;

    @Override // tb.ath
    public void a(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        }
    }

    @Override // tb.ath
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ath
    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // tb.ath
    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.atf
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a859cf93", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.atf
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(gnt gntVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e398890f", new Object[]{gntVar, str, new Long(j)});
        } else {
            gntVar.a(str, j);
        }
    }

    static {
        kge.a(2093817632);
        kge.a(-450410939);
        g = true;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f28395a = qVar;
        }
    }

    private JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        if (this.f == null) {
            this.f = (JSONObject) this.d.get("submitExposureItemArgs", JSONObject.class);
        }
        return this.f;
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        JSONObject g2 = g();
        if (g2 != null) {
            this.e = g2.getString("itemCount");
        }
        if (this.e == null) {
            this.e = (String) this.f28395a.a("itemCount", String.class);
        }
        return this.e;
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.b = aURAFlowData;
        this.d = aURAGlobalData;
    }

    @Override // tb.ath
    public void a(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b016bcab", new Object[]{this, view, state});
        } else {
            a(this.b.getFlowCode());
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.c || !e()) {
            return;
        }
        this.c = true;
        bbh.a().postDelayed(new Runnable() { // from class: tb.gnt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    gnt.a(gnt.this, str, currentTimeMillis);
                } catch (Throwable th) {
                    ifz.a("uploadPerformance_Exception", th.getMessage());
                }
            }
        }, 500L);
    }

    private Map<String, Long> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null) {
            return hashMap;
        }
        Map<String, Long> map = (Map) aURAGlobalData.get("globalDataPerformanceStage", Map.class);
        return map == null ? new HashMap() : map;
    }

    private long b() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData != null && (l = (Long) aURAGlobalData.get("globalDataPerformanceRenderStartStage", Long.class)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    private long c() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData != null && (l = (Long) aURAGlobalData.get("globalDataPerformanceFlowStartStage", Long.class)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    private a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ec11d2b1", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData != null) {
            return (a) aURAGlobalData.get("aura_data_response", a.class);
        }
        return null;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        int a2 = bbi.a(f(), 0);
        return a2 == 1 || a2 == 5 || a2 == 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r23, long r24) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gnt.a(java.lang.String, long):void");
    }

    private void a(a aVar, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf04af7", new Object[]{this, aVar, map});
        } else if (aVar == null) {
        } else {
            d i = aVar.i();
            if (i != null && i.g() != 0) {
                map.put("mtop解析耗时", Long.valueOf(i.g() - i.f()));
            }
            if (i != null && i.i() != 0) {
                map.put("mtop切换线程耗时", Long.valueOf(i.i() - i.h()));
            }
            if (i == null || i.j() == 0) {
                return;
            }
            map.put("预请求节约时间", Long.valueOf(i.j()));
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            shc h = rVar.h();
            shc av_ = rVar.a(shc.MODULE, shc.SCENE_TAP).a(h).av_();
            av_.a(h);
            av_.l("TBBuyActivity");
            av_.c_(Long.valueOf(j));
            av_.c();
        } catch (Throwable unused) {
        }
    }

    private String a(a aVar) {
        JSONObject f;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dfa4f92", new Object[]{this, aVar});
        }
        if (aVar != null && (f = aVar.f()) != null && (jSONObject = f.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) != null) {
            return jSONObject2.getString("page");
        }
        return null;
    }

    private MtopStatistics b(a aVar) {
        MtopResponse g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopStatistics) ipChange.ipc$dispatch("11205008", new Object[]{this, aVar});
        }
        if (aVar != null && (g2 = aVar.g()) != null) {
            return g2.getMtopStat();
        }
        return null;
    }

    private Map<String, Long> a(MtopStatistics mtopStatistics) {
        NetworkStats networkStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3222cfe", new Object[]{this, mtopStatistics});
        }
        HashMap hashMap = new HashMap();
        if (mtopStatistics == null || (networkStats = mtopStatistics.getNetworkStats()) == null) {
            return hashMap;
        }
        hashMap.put("serverRT", Long.valueOf(networkStats.serverRT));
        hashMap.put("networkTotalTime", Long.valueOf(mtopStatistics.totalTime));
        hashMap.put("networkTime", Long.valueOf(mtopStatistics.totalTime - networkStats.serverRT));
        return hashMap;
    }
}

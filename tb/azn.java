package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceFlowModel;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.alibaba.android.ultron.event.b;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;

@AURAExtensionImpl(code = "aura.impl.performance.monitor.ut")
/* loaded from: classes2.dex */
public final class azn implements azl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, AURAPerformanceFlowModel> f25715a;
    private Map<String, AURAPerformanceFlowModel> b;
    private Map<String, Map<String, AURAPerformanceStageModel>> c;
    private q d;
    private f e;
    private AURAFlowData f;

    static {
        kge.a(1840410041);
        kge.a(-822884994);
    }

    public static /* synthetic */ void a(azn aznVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306e6e6d", new Object[]{aznVar, str});
        } else {
            aznVar.e(str);
        }
    }

    public static /* synthetic */ void b(azn aznVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455736ae", new Object[]{aznVar, str});
        } else {
            aznVar.d(str);
        }
    }

    public static /* synthetic */ void c(azn aznVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3ffeef", new Object[]{aznVar, str});
        } else {
            aznVar.b(str);
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.d = qVar;
        this.e = fVar;
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.f = aURAFlowData;
        c(aURAFlowData);
        a(aURAFlowData);
        b(aURAFlowData);
    }

    @Override // tb.azl
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = this.f25715a;
        if (map == null || map.containsKey(str)) {
            return;
        }
        arc.a().a("开始流程埋点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", str).a("flowName", str2).b());
        AURAPerformanceFlowModel aURAPerformanceFlowModel = new AURAPerformanceFlowModel(b(), c(), null, null, str);
        aURAPerformanceFlowModel.setStartMills(System.currentTimeMillis());
        this.f25715a.put(str, aURAPerformanceFlowModel);
        a(aURAPerformanceFlowModel);
    }

    private void a(AURAPerformanceFlowModel aURAPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e9c81e", new Object[]{this, aURAPerformanceFlowModel});
        } else if (this.c == null) {
        } else {
            String flowCode = aURAPerformanceFlowModel.getFlowCode();
            if (this.c.containsKey(flowCode)) {
                return;
            }
            this.c.put(flowCode, new ConcurrentHashMap());
        }
    }

    private void a(AURAPerformanceFlowModel aURAPerformanceFlowModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944fee76", new Object[]{this, aURAPerformanceFlowModel, new Boolean(z)});
            return;
        }
        String flowCode = aURAPerformanceFlowModel.getFlowCode();
        arc.a().a("结束流程埋点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(flowCode).a(b.KEY_IS_ERROR, z).b());
        if (z) {
            e(flowCode);
            d(flowCode);
        } else if (!a(aURAPerformanceFlowModel, 0L)) {
        } else {
            a(flowCode, 0L);
        }
    }

    private void a(AURAPerformanceStageModel aURAPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d0e86c", new Object[]{this, aURAPerformanceStageModel});
            return;
        }
        String d = d();
        String stageCode = aURAPerformanceStageModel.getStageCode();
        arc.a().a("开始阶段埋点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(d).a("stageCode", aURAPerformanceStageModel.getStageCode()).b());
        if (g(d) == null) {
            return;
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map == null) {
            arc.a().b("请确保上报了流程的开始点，否则无法记录、上报子阶段的性能耗时", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", d).a("stageCode", stageCode).b());
            return;
        }
        Map<String, AURAPerformanceStageModel> map2 = map.get(d);
        if (map2 == null) {
            arc.a().b("请确保上报了流程的开始点，否则无法记录、上报子阶段的性能耗时", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", d).a("stageCode", stageCode).b());
        } else if (map2.containsKey(stageCode)) {
        } else {
            map2.put(stageCode, aURAPerformanceStageModel);
        }
    }

    private void a(AURAPerformanceStageModel aURAPerformanceStageModel, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334e9bdc", new Object[]{this, aURAPerformanceStageModel, new Boolean(z), new Long(j)});
            return;
        }
        arc.a().a("结束阶段埋点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("stageCode", aURAPerformanceStageModel.getStageCode()).a(b.KEY_IS_ERROR, z).b());
        if (z) {
            b(aURAPerformanceStageModel);
            return;
        }
        String d = d();
        AURAPerformanceFlowModel g = g(d);
        if (g == null || !a(g, j)) {
            return;
        }
        a(d, j);
    }

    private void b(AURAPerformanceStageModel aURAPerformanceStageModel) {
        Map<String, AURAPerformanceStageModel> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5da8cb", new Object[]{this, aURAPerformanceStageModel});
            return;
        }
        aURAPerformanceStageModel.removeFromParentStage();
        if (this.c == null || (a2 = a()) == null) {
            return;
        }
        a2.remove(aURAPerformanceStageModel.getStageCode());
    }

    @Override // tb.azl
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        AURAPerformanceFlowModel g = g(d());
        if (g == null || g.getChildStage(str) != null) {
            return;
        }
        AURAPerformanceStageModel aURAPerformanceStageModel = new AURAPerformanceStageModel(str);
        aURAPerformanceStageModel.setStartMills(System.currentTimeMillis());
        g.addChildStage(aURAPerformanceStageModel);
        a(aURAPerformanceStageModel);
    }

    @Override // tb.azl
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.f25715a == null || this.c == null) {
        } else {
            if (TextUtils.isEmpty(str3)) {
                a(str, str2);
                return;
            }
            Map<String, AURAPerformanceStageModel> a2 = a();
            if (a2 == null) {
                arc.a().b("没有流程节点，无法设置开始点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("stageCode", str).a("parentCode", str3).b());
            } else if (a2.get(str) != null) {
                arc.a().b("开始阶段埋点#该阶段已经在父阶段中了，无法添加阶段", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("stageCode", str).a("stageName", str2).a("parentCode", str3).b());
            } else {
                AURAPerformanceStageModel aURAPerformanceStageModel = a2.get(str3);
                if (aURAPerformanceStageModel == null) {
                    arc.a().b("开始阶段埋点#父阶段不存在，无法添加阶段", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("stageCode", str).a("stageName", str2).a("parentCode", str3).b());
                    return;
                }
                AURAPerformanceStageModel aURAPerformanceStageModel2 = new AURAPerformanceStageModel(str);
                aURAPerformanceStageModel2.setStartMills(System.currentTimeMillis());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel2);
                a(aURAPerformanceStageModel2);
            }
        }
    }

    @Override // tb.azl
    public void a(String str, String str2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e27bbad", new Object[]{this, str, str2, new Boolean(z), map});
        } else if (this.c == null) {
        } else {
            if (TextUtils.isEmpty(str2)) {
                a(str, z, map);
                return;
            }
            String d = d();
            Map<String, AURAPerformanceStageModel> map2 = this.c.get(d);
            if (map2 == null) {
                arc.a().a("没有流程节点，无法设置结束点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", d).a("stageCode", str).a("parentCode", str2).b());
                return;
            }
            AURAPerformanceStageModel aURAPerformanceStageModel = map2.get(str);
            if (aURAPerformanceStageModel == null) {
                arc.a().b("阶段没有起始点，无法设置结束点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("stageCode", str).a("parentCode", str2).b());
                return;
            }
            String str3 = map.get(com.taobao.android.dinamicx_v4.animation.util.b.DELAY_MILLIS);
            if (aURAPerformanceStageModel.isRecordFinished() && str3 == null) {
                arc.a().b("阶段已经结束，无法重复结束点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("stageCode", str).a("parentCode", str2).b());
                return;
            }
            aURAPerformanceStageModel.setEndMills(System.currentTimeMillis());
            aURAPerformanceStageModel.setArgs(map);
            arc.a().a("结束阶段埋点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("stageCode", str).a("parentCode", str2).b());
            a(aURAPerformanceStageModel, z, a(str3));
        }
    }

    private long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // tb.azl
    public void a(AURAPerformanceStageModel aURAPerformanceStageModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29d4a5e", new Object[]{this, aURAPerformanceStageModel, str, new Boolean(z)});
        } else if (this.c == null) {
        } else {
            if (str == null) {
                a(aURAPerformanceStageModel, z);
                return;
            }
            Map<String, AURAPerformanceStageModel> a2 = a();
            if (bau.a(a2) || a2.get(aURAPerformanceStageModel.getStageCode()) != null) {
                return;
            }
            AURAPerformanceStageModel aURAPerformanceStageModel2 = a2.get(str);
            if (aURAPerformanceStageModel2 != null) {
                aURAPerformanceStageModel2.addChildStage(aURAPerformanceStageModel);
            }
            a(aURAPerformanceStageModel);
            a(aURAPerformanceStageModel, z, 0L);
        }
    }

    private void a(AURAPerformanceStageModel aURAPerformanceStageModel, boolean z) {
        AURAPerformanceFlowModel aURAPerformanceFlowModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964cd7e8", new Object[]{this, aURAPerformanceStageModel, new Boolean(z)});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = this.f25715a;
        if (map == null || (aURAPerformanceFlowModel = map.get(d())) == null) {
            return;
        }
        aURAPerformanceFlowModel.addChildStage(aURAPerformanceStageModel);
        a(aURAPerformanceStageModel);
        a(aURAPerformanceStageModel, z, 0L);
    }

    private Map<String, AURAPerformanceStageModel> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map != null) {
            return map.get(d());
        }
        return null;
    }

    @Override // tb.azl
    public void a(String str, boolean z, Map<String, String> map) {
        AURAPerformanceStageModel childStage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881e4e63", new Object[]{this, str, new Boolean(z), map});
            return;
        }
        AURAPerformanceFlowModel g = g(d());
        if (g == null || (childStage = g.getChildStage(str)) == null) {
            return;
        }
        childStage.setEndMills(System.currentTimeMillis());
        childStage.setArgs(map);
        a(childStage, z, 0L);
    }

    @Override // tb.azl
    public void b(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511f45a4", new Object[]{this, str, new Boolean(z), map});
            return;
        }
        AURAPerformanceFlowModel g = g(str);
        if (g == null) {
            arc.a().b("流程结束#没有流程起始点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", str).b());
        } else if (g.isRecordFinished()) {
        } else {
            g.setEndMills(System.currentTimeMillis());
            g.addCommonArgs(map);
            a(g, z);
        }
    }

    @Override // tb.azl
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        AURAPerformanceFlowModel g = g(d());
        if (g == null) {
            return;
        }
        g.addCommonArgs(map);
    }

    private void a(final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            bbh.a().postDelayed(new Runnable() { // from class: tb.azn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    azn.a(azn.this, str);
                    azn.b(azn.this, str);
                    ard a2 = arc.a();
                    arc.a a3 = arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", str);
                    a2.b("上报性能埋点#真实上报", a3.a(com.taobao.android.dinamicx_v4.animation.util.b.DELAY_MILLIS, j + "").b());
                    azn.c(azn.this, str);
                }
            }, j);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            AURAPerformanceFlowModel f = f(str);
            if (f == null) {
                arc.a().b("上报性能埋点#没有需要上报的流程性能数据", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", str).b());
            } else if (!f.isRecordFinished()) {
                arc.a().b("上报性能埋点#流程没有开始或者结束时间点", arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("flowCode", str).b());
            } else {
                HashMap hashMap = new HashMap();
                String jSONString = JSON.toJSONString(f);
                hashMap.put(jpp.UMBRELLA_ARGS_PARAM_KEY, jSONString);
                if (baw.a()) {
                    Log.e("PERFORMANCE", "cost：  " + jSONString);
                }
                arc.a().a(jSONString, arc.a.a().a("AURA/performance").a("flowCode", str).b());
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("EndToEnd_Performance_Detection", 19997, b(), "", "", hashMap).build());
            }
        } catch (Exception e) {
            a(e);
        }
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map == null) {
            return true;
        }
        Map<String, AURAPerformanceStageModel> map2 = map.get(str);
        if (map2 == null) {
            arc.a().b("isAllStageRecordFinished#流程节点不存在", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(str).b());
            return true;
        }
        for (AURAPerformanceStageModel aURAPerformanceStageModel : map2.values()) {
            if (!aURAPerformanceStageModel.isRecordFinished()) {
                arc.a().a("isAllStageRecordFinished#阶段尚未完成", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(str).a("stageCode", aURAPerformanceStageModel.getStageCode()).b());
                return false;
            }
        }
        return true;
    }

    private boolean a(AURAPerformanceFlowModel aURAPerformanceFlowModel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("944fb26a", new Object[]{this, aURAPerformanceFlowModel, new Long(j)})).booleanValue();
        }
        String flowCode = aURAPerformanceFlowModel.getFlowCode();
        if (!aURAPerformanceFlowModel.isRecordFinished()) {
            arc.a().a("producePendingModel#流程尚未结束，不追加性能上报数据", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(aURAPerformanceFlowModel.getFlowCode()).b());
            return false;
        } else if (!c(flowCode)) {
            arc.a().a("producePendingModel#流程下还有阶段尚未完成上报，不追加性能上报数据", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(aURAPerformanceFlowModel.getFlowCode()).b());
            return false;
        } else if (this.b == null) {
            arc.a().b("producePendingModel#没有调用ensurePendingForUploadModelMap，不追加性能上报数据", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(aURAPerformanceFlowModel.getFlowCode()).b());
            return false;
        } else {
            aURAPerformanceFlowModel.setStartMills(b(aURAPerformanceFlowModel));
            aURAPerformanceFlowModel.setEndMills(System.currentTimeMillis());
            this.b.put(flowCode, aURAPerformanceFlowModel);
            if (j == 0) {
                e(flowCode);
                d(flowCode);
            }
            return true;
        }
    }

    private long b(AURAPerformanceFlowModel aURAPerformanceFlowModel) {
        Map<String, AURAPerformanceStageModel> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7a3ffd3", new Object[]{this, aURAPerformanceFlowModel})).longValue();
        }
        long startMills = aURAPerformanceFlowModel.getStartMills();
        Map<String, Map<String, AURAPerformanceStageModel>> map2 = this.c;
        if (map2 == null || (map = map2.get(aURAPerformanceFlowModel.getFlowCode())) == null) {
            return startMills;
        }
        for (AURAPerformanceStageModel aURAPerformanceStageModel : map.values()) {
            long startMills2 = aURAPerformanceStageModel.getStartMills();
            if (startMills2 < startMills) {
                startMills = startMills2;
            }
        }
        return startMills;
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = this.f25715a;
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    private AURAPerformanceFlowModel f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPerformanceFlowModel) ipChange.ipc$dispatch("818c37f5", new Object[]{this, str});
        }
        Map<String, AURAPerformanceFlowModel> map = this.b;
        if (map == null) {
            arc.a().b("producePendingModel#没有调用ensurePendingForUploadModelMap，不消费性能上报数据", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(str).b());
            return null;
        }
        return map.remove(str);
    }

    private void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            return;
        }
        ard a2 = arc.a();
        a2.b("上报性能埋点异常:" + exc.getMessage(), arc.a.a().b("AURAUmbrellaPerformanceMonitor").a("AURA/Performance").c(d()).b());
    }

    private void a(AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c849d3", new Object[]{this, aURAFlowData});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = (Map) aURAFlowData.get("AURAUmbrellaPerformanceMonitorPendingForUploadModeMap", Map.class);
        if (map != null) {
            this.b = map;
            return;
        }
        this.b = new ConcurrentHashMap();
        aURAFlowData.update("AURAUmbrellaPerformanceMonitorPendingForUploadModeMap", this.b);
    }

    private void b(AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b4b332", new Object[]{this, aURAFlowData});
            return;
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = (Map) aURAFlowData.get("AURAUmbrellaPerformanceMonitorFlowAllStageMap", Map.class);
        if (map != null) {
            this.c = map;
            return;
        }
        this.c = new ConcurrentHashMap();
        aURAFlowData.update("AURAUmbrellaPerformanceMonitorFlowAllStageMap", this.c);
    }

    private void c(AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a11c91", new Object[]{this, aURAFlowData});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = (Map) aURAFlowData.get("AURAUmbrellaPerformanceMonitorFlowModeMap", Map.class);
        if (map != null) {
            this.f25715a = map;
            return;
        }
        this.f25715a = new ConcurrentHashMap();
        aURAFlowData.update("AURAUmbrellaPerformanceMonitorFlowModeMap", this.f25715a);
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        q qVar = this.d;
        return qVar == null ? "" : qVar.d();
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        q qVar = this.d;
        return qVar == null ? "" : qVar.c();
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        AURAFlowData aURAFlowData = this.f;
        return aURAFlowData == null ? "" : aURAFlowData.getFlowCode();
    }

    private AURAPerformanceFlowModel g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPerformanceFlowModel) ipChange.ipc$dispatch("f7a25a54", new Object[]{this, str});
        }
        Map<String, AURAPerformanceFlowModel> map = this.f25715a;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            b(d());
            if (this.f25715a != null) {
                this.f25715a.clear();
            }
            if (this.c == null) {
                return;
            }
            this.c.clear();
        } catch (Exception unused) {
            arc.a().b("销毁Handler异常", arc.a.a().b("AURAUmbrellaPerformanceMonitor").c(d()).b());
        }
    }
}

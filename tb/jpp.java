package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.android.ultron.performence.model.e;
import com.taobao.android.ultron.performence.model.f;
import com.taobao.android.ultron.performence.model.g;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.rid;

/* loaded from: classes6.dex */
public final class jpp extends jpn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMBRELLA_ARGS_PARAM_KEY = "auraPerformance";

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f29677a = jqh.a(1, 1, 3, TimeUnit.SECONDS, jpo.TAG);
    private final ConcurrentHashMap<String, UltronPerformanceFlowModel> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, UltronPerformanceFlowModel> c = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Map<String, UltronPerformanceStageModel>> d = new ConcurrentHashMap<>();
    private String e;
    private String f;
    private String g;
    @Deprecated
    private f h;
    private rid i;

    static {
        kge.a(-53775975);
    }

    public static /* synthetic */ Object ipc$super(jpp jppVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(jpp jppVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3397ecf8", new Object[]{jppVar, str});
        } else {
            jppVar.h(str);
        }
    }

    @Override // tb.jpn
    public void a(Context context, rid ridVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f28fea3", new Object[]{this, context, ridVar});
            return;
        }
        this.i = ridVar;
        this.e = ridVar.b();
        this.f = ridVar.c();
    }

    @Override // tb.jpm
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !this.b.isEmpty();
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.b.containsKey(str);
    }

    @Override // tb.jpm
    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23c7e201", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        UltronPerformanceFlowModel c = c(str);
        if (c == null) {
            return true;
        }
        return !jqi.a(this.e, "skipDuplicatePerformanceStart", true) && System.currentTimeMillis() - c.getStartMills() > ((long) jqi.a(this.e, "skipPerformanceStartIntervalMills", 500));
    }

    @Override // tb.jpm
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, System.currentTimeMillis());
        }
    }

    @Override // tb.jpm
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (!l(str)) {
        } else {
            jpr.a(this.e);
            d();
            UltronPerformanceFlowModel ultronPerformanceFlowModel = new UltronPerformanceFlowModel(this.e, this.f, str);
            this.g = str;
            ultronPerformanceFlowModel.setStartMills(j);
            a(ultronPerformanceFlowModel);
            d(ultronPerformanceFlowModel);
            if (this.i.d() != null) {
                a(this.i.d());
            }
            f fVar = this.h;
            if (fVar == null) {
                return;
            }
            a(fVar);
        }
    }

    private void a(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a4dc67", new Object[]{this, ultronPerformanceFlowModel});
        } else {
            this.b.put(ultronPerformanceFlowModel.mFlowCode, ultronPerformanceFlowModel);
        }
    }

    private UltronPerformanceFlowModel c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronPerformanceFlowModel) ipChange.ipc$dispatch("5767f2a1", new Object[]{this, str}) : this.b.get(str);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.b.remove(str);
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.d.remove(str);
        }
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        Map<String, UltronPerformanceStageModel> map = this.d.get(str);
        if (map == null) {
            return true;
        }
        for (UltronPerformanceStageModel ultronPerformanceStageModel : map.values()) {
            if (!ultronPerformanceStageModel.isRecordFinished()) {
                return false;
            }
        }
        return true;
    }

    private void a(UltronPerformanceFlowModel ultronPerformanceFlowModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff7634d", new Object[]{this, ultronPerformanceFlowModel, new Boolean(z)});
            return;
        }
        String str = ultronPerformanceFlowModel.mFlowCode;
        if (z) {
            k(str);
        } else if (!b(ultronPerformanceFlowModel)) {
        } else {
            i(str);
        }
    }

    @Override // tb.jpm
    public void a(String str, boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b248f13", new Object[]{this, str, new Boolean(z), new Boolean(z2), map});
        } else if (str == null) {
            d();
        } else {
            UltronPerformanceFlowModel c = c(str);
            if (c == null || c.isRecordFinished()) {
                return;
            }
            c.setForceFinish(z2);
            c.setEndMills(System.currentTimeMillis());
            c.addCommonArgs(map);
            a(c, z);
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String str = this.g;
        return str == null ? "" : str;
    }

    private Map<String, UltronPerformanceStageModel> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : j(b());
    }

    private Map<String, UltronPerformanceStageModel> j(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("70248e70", new Object[]{this, str}) : this.d.get(str);
    }

    private void a(UltronPerformanceStageModel ultronPerformanceStageModel) {
        Map<String, UltronPerformanceStageModel> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f785d43", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        String b = b();
        String stageCode = ultronPerformanceStageModel.getStageCode();
        if (c(b) == null || (map = this.d.get(b)) == null || map.containsKey(stageCode)) {
            return;
        }
        map.put(stageCode, ultronPerformanceStageModel);
    }

    private void b(String str, long j, String str2, boolean z) {
        Map<String, UltronPerformanceStageModel> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f425af9", new Object[]{this, str, new Long(j), str2, new Boolean(z)});
            return;
        }
        String b = b();
        UltronPerformanceFlowModel c2 = c(b);
        if (c2 == null || !b(b) || (c = c()) == null || c.get(str) != null) {
            return;
        }
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel(str);
        ultronPerformanceStageModel.setStartMills(j);
        ultronPerformanceStageModel.setFreeStage(z);
        if (str2 != null) {
            UltronPerformanceStageModel ultronPerformanceStageModel2 = c.get(str2);
            if (ultronPerformanceStageModel2 == null) {
                return;
            }
            ultronPerformanceStageModel2.addChildStage(ultronPerformanceStageModel);
        } else {
            c2.addChildStage(ultronPerformanceStageModel);
        }
        a(ultronPerformanceStageModel);
    }

    public void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
        } else {
            b(str, j, str2, false);
        }
    }

    @Override // tb.jpm
    public void a(String str, long j, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a00ec38", new Object[]{this, str, new Long(j), str2, new Boolean(z)});
        } else {
            b(str, j, str2, z);
        }
    }

    private void b(UltronPerformanceStageModel ultronPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2879aee2", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        ultronPerformanceStageModel.removeFromParentStage();
        Map<String, UltronPerformanceStageModel> c = c();
        if (c == null) {
            return;
        }
        c.remove(ultronPerformanceStageModel.getStageCode());
    }

    private void a(UltronPerformanceStageModel ultronPerformanceStageModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df93fdf1", new Object[]{this, ultronPerformanceStageModel, new Boolean(z)});
        } else if (z) {
            b(ultronPerformanceStageModel);
        } else {
            String b = b();
            UltronPerformanceFlowModel c = c(b);
            if (c == null || !b(c)) {
                return;
            }
            i(b);
        }
    }

    private void b(String str, long j, boolean z, Map<String, String> map) {
        Map<String, UltronPerformanceStageModel> map2;
        UltronPerformanceStageModel ultronPerformanceStageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979c63e2", new Object[]{this, str, new Long(j), new Boolean(z), map});
            return;
        }
        String b = b();
        if (c(b) == null || (map2 = this.d.get(b)) == null || (ultronPerformanceStageModel = map2.get(str)) == null || ultronPerformanceStageModel.isRecordFinished()) {
            return;
        }
        ultronPerformanceStageModel.setArgs(map);
        ultronPerformanceStageModel.setEndMills(j);
        a(ultronPerformanceStageModel, z);
    }

    @Override // tb.jpm
    public void a(String str, long j, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407e7303", new Object[]{this, str, new Long(j), new Boolean(z), map});
        } else {
            b(str, j, z, map);
        }
    }

    @Override // tb.jpm
    public void a(UltronPerformanceStageModel ultronPerformanceStageModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da46027", new Object[]{this, ultronPerformanceStageModel, str, new Boolean(z)});
            return;
        }
        String stageCode = ultronPerformanceStageModel.getStageCode();
        long startMills = ultronPerformanceStageModel.getStartMills();
        long endMills = ultronPerformanceStageModel.getEndMills();
        Map<String, String> args = ultronPerformanceStageModel.getArgs();
        a(stageCode, startMills, str);
        Map<String, UltronPerformanceStageModel> c = c();
        if (c == null || c.get(stageCode) == null) {
            return;
        }
        c(ultronPerformanceStageModel);
        a(stageCode, endMills, z, args);
    }

    private void c(UltronPerformanceStageModel ultronPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417b0081", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        List<UltronPerformanceStageModel> childStages = ultronPerformanceStageModel.getChildStages();
        if (childStages == null || childStages.isEmpty()) {
            return;
        }
        for (UltronPerformanceStageModel ultronPerformanceStageModel2 : childStages) {
            a(ultronPerformanceStageModel2, ultronPerformanceStageModel.getStageCode(), false);
            c(ultronPerformanceStageModel2);
        }
    }

    @Override // tb.jpm
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        UltronPerformanceFlowModel c = c(b());
        if (c == null) {
            return;
        }
        c.addCommonArgs(map);
    }

    @Override // tb.jpm
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        UltronPerformanceFlowModel c = c(b());
        if (c == null) {
            return;
        }
        c.addCommonArgs(str, str2);
    }

    @Override // tb.jpm
    @Deprecated
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce5d664", new Object[]{this, fVar});
            return;
        }
        this.h = fVar;
        UltronPerformanceFlowModel c = c(b());
        if (c == null || c.isRecordFinished()) {
            return;
        }
        c.ensureGetJSTrackerModel().a(fVar);
    }

    @Override // tb.jpm
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        UltronPerformanceFlowModel c = c(b());
        if (c == null || c.isRecordFinished()) {
            return;
        }
        c.addDimension(str2, str3);
        c.ensureGetJSTrackerModel().a(str, str2, str3);
    }

    @Override // tb.jpm
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        UltronPerformanceFlowModel c = c(b());
        if (c == null || c.isRecordFinished()) {
            return;
        }
        c.ensureGetJSTrackerModel().a(new e(str, str2, str3));
    }

    private boolean b(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5735aec", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
        }
        String str = ultronPerformanceFlowModel.mFlowCode;
        if (!ultronPerformanceFlowModel.isRecordFinished()) {
            return false;
        }
        boolean isForceFinish = ultronPerformanceFlowModel.isForceFinish();
        if (!isForceFinish && !f(str)) {
            return false;
        }
        if (!isForceFinish) {
            ultronPerformanceFlowModel.setEndMills(c(ultronPerformanceFlowModel));
        }
        this.c.put(str, ultronPerformanceFlowModel);
        k(str);
        return true;
    }

    private long c(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d641d95d", new Object[]{this, ultronPerformanceFlowModel})).longValue();
        }
        Map<String, UltronPerformanceStageModel> j = j(ultronPerformanceFlowModel.mFlowCode);
        long endMills = ultronPerformanceFlowModel.getEndMills();
        if (j != null && !j.isEmpty()) {
            for (UltronPerformanceStageModel ultronPerformanceStageModel : j.values()) {
                if (!ultronPerformanceStageModel.isFreeStage()) {
                    long endMills2 = ultronPerformanceStageModel.getEndMills();
                    if (endMills2 > endMills) {
                        endMills = endMills2;
                    }
                }
            }
        }
        return endMills;
    }

    private UltronPerformanceFlowModel g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronPerformanceFlowModel) ipChange.ipc$dispatch("9668c11d", new Object[]{this, str});
        }
        try {
            return this.c.remove(str);
        } catch (Exception e) {
            jqg.a("Ultron", "consumePendingModelException", e.getMessage());
            return null;
        }
    }

    private void h(String str) {
        UltronPerformanceFlowModel g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else if (!ipb.a() || (g = g(str)) == null) {
        } else {
            try {
                if (!g.isRecordFinished()) {
                    return;
                }
                if (ifp.a()) {
                    krq.b(g);
                }
                rid.a a2 = this.i.a();
                if (a2 != null && a2.a(g)) {
                    return;
                }
                e(g);
                if (!jqi.a(g.mBizCode, "uploadUltronPerformanceToUT", true)) {
                    return;
                }
                if (a2 != null && a2.b(g)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(UMBRELLA_ARGS_PARAM_KEY, JSON.toJSONString(g));
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("EndToEnd_Performance_Detection", 19997, this.e, "", "", hashMap).build());
            } catch (Exception e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("flowCode", this.g);
                jqg.a(g.mBizCode, "UltronPerformanceException", e.getMessage(), hashMap2);
            }
        }
    }

    private void e(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ded66b", new Object[]{this, ultronPerformanceFlowModel});
            return;
        }
        g jSTrackerModel = ultronPerformanceFlowModel.getJSTrackerModel();
        if (jSTrackerModel == null) {
            return;
        }
        String a2 = jSTrackerModel.a();
        String b = jSTrackerModel.b();
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(b)) {
            return;
        }
        String str = ultronPerformanceFlowModel.mBizCode;
        if (StringUtils.isEmpty(a2)) {
            a2 = "27659-tracker";
        }
        if (StringUtils.isEmpty(b)) {
            b = "http://taobao.com/jstracker/android/ultron.html";
        }
        fgf fgfVar = new fgf(str, a2, b);
        List<UltronPerformanceStageModel> childStages = ultronPerformanceFlowModel.getChildStages();
        if (childStages == null) {
            return;
        }
        String d = jSTrackerModel.d();
        if (StringUtils.isEmpty(d)) {
            d = ultronPerformanceFlowModel.mFlowCode;
        }
        fgfVar.a(d);
        for (UltronPerformanceStageModel ultronPerformanceStageModel : childStages) {
            fgfVar.a(ultronPerformanceStageModel.getStageCode(), ultronPerformanceStageModel.getDurationMills());
            a(ultronPerformanceStageModel, fgfVar);
        }
        fgfVar.a("totalStage", ultronPerformanceFlowModel.mDurationMills);
        List<g.a> e = jSTrackerModel.e();
        if (e != null && !e.isEmpty()) {
            for (g.a aVar : e) {
                if (aVar != null) {
                    fgfVar.a(aVar.a(), aVar.b());
                }
            }
        }
        fgfVar.b(jSTrackerModel.c());
        rid.a a3 = this.i.a();
        if (a3 != null && a3.a(ultronPerformanceFlowModel, fgfVar)) {
            return;
        }
        fgfVar.d(JSON.toJSONString(ultronPerformanceFlowModel.mCommonArgs));
        jpr.a(fgfVar);
        jpr.b(this.e);
        jqg.b(this.e, "性能埋点上报到JSTracker");
    }

    private void a(UltronPerformanceStageModel ultronPerformanceStageModel, fgf fgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b624f6ce", new Object[]{this, ultronPerformanceStageModel, fgfVar});
            return;
        }
        List<UltronPerformanceStageModel> childStages = ultronPerformanceStageModel.getChildStages();
        if (childStages == null || childStages.isEmpty()) {
            return;
        }
        for (UltronPerformanceStageModel ultronPerformanceStageModel2 : childStages) {
            fgfVar.a(ultronPerformanceStageModel2.getStageCode(), ultronPerformanceStageModel2.getDurationMills());
            a(ultronPerformanceStageModel2, fgfVar);
        }
    }

    private void i(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        jqg.b(jpo.TAG, "流程结束，准备上报性能埋点");
        this.f29677a.execute(new Runnable() { // from class: tb.jpp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    jpp.a(jpp.this, str);
                }
            }
        });
    }

    private void d(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71057ea", new Object[]{this, ultronPerformanceFlowModel});
            return;
        }
        String str = ultronPerformanceFlowModel.mFlowCode;
        if (this.d.containsKey(str)) {
            return;
        }
        this.d.put(str, new ConcurrentHashMap());
    }

    private void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
            return;
        }
        e(str);
        d(str);
    }

    @Override // tb.jpm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.clear();
        this.d.clear();
    }

    @Override // tb.jpm
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            d();
        } catch (Exception e) {
            jpr.a(jpu.a(jpo.TAG).c("onPerformanceDestroyException").b(e.getMessage()));
        }
    }
}

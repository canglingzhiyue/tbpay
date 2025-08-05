package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.performance.model.PerformanceFlowModel;
import com.taobao.android.sku.performance.model.PerformanceStageModel;
import com.taobao.android.sku.performance.model.a;
import com.taobao.android.sku.utils.e;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public class iyf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static iyf c;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentLinkedQueue<PerformanceStageModel> f29407a = new ConcurrentLinkedQueue<>();
    private PerformanceFlowModel b;

    static {
        kge.a(240695933);
        kge.a(-641529636);
    }

    public static synchronized iyf a() {
        synchronized (iyf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (iyf) ipChange.ipc$dispatch("f0632a8", new Object[0]);
            }
            if (c == null) {
                c = new iyf();
            }
            return c;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        e();
        this.b.setBizName(str);
        this.b.setFlowCode(str2);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.b != null) {
        } else {
            this.b = new PerformanceFlowModel();
            this.b.setStartMills(System.currentTimeMillis());
        }
    }

    public PerformanceFlowModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceFlowModel) ipChange.ipc$dispatch("dbd6a965", new Object[]{this});
        }
        e();
        return this.b;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (a(str) != null) {
            return;
        }
        PerformanceStageModel b = b(str);
        b.setStartMills(currentTimeMillis);
        a(b, str2);
        a((a) b, false);
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        PerformanceStageModel a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.setEndMills(currentTimeMillis);
        a(a2, map);
        a((a) a2, true);
    }

    private void a(PerformanceStageModel performanceStageModel, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f418df", new Object[]{this, performanceStageModel, map});
        } else if (map == null) {
        } else {
            Map<String, String> args = performanceStageModel.getArgs();
            if (args == null) {
                args = new HashMap<>();
                performanceStageModel.setArgs(args);
            }
            args.putAll(map);
        }
    }

    public void a(String str, String str2, long j, long j2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2848d09", new Object[]{this, str, str2, new Long(j), new Long(j2), map});
            return;
        }
        PerformanceStageModel a2 = a(str);
        if (a2 == null) {
            a2 = b(str);
        }
        a2.setStartMills(j);
        a2.setEndMills(j2);
        a(a2, map);
        a(a2, str2);
        a((a) a2, false);
    }

    public PerformanceStageModel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceStageModel) ipChange.ipc$dispatch("c066d5a2", new Object[]{this, str});
        }
        Iterator<PerformanceStageModel> it = this.f29407a.iterator();
        while (it.hasNext()) {
            PerformanceStageModel next = it.next();
            if (next != null && next.getStageCode() != null && next.getStageCode().equals(str)) {
                return next;
            }
        }
        return null;
    }

    private PerformanceStageModel b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceStageModel) ipChange.ipc$dispatch("6081841", new Object[]{this, str});
        }
        PerformanceStageModel performanceStageModel = new PerformanceStageModel(str);
        this.f29407a.add(performanceStageModel);
        return performanceStageModel;
    }

    private void a(PerformanceStageModel performanceStageModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c6b630", new Object[]{this, performanceStageModel, str});
        } else if (str != null) {
            PerformanceStageModel a2 = a(str);
            if (a2 == null) {
                a2 = b(str);
                e();
                this.b.addChildStage(a2);
                a((a) a2, false);
            }
            a2.addChildStage(performanceStageModel);
        } else {
            e();
            this.b.addChildStage(performanceStageModel);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = null;
        this.f29407a.clear();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        e();
        f();
        long a2 = a(this.b.mChildStages);
        long b = b(this.b.mChildStages);
        this.b.setStartMills(a2);
        this.b.setEndMills(b);
        a((a) this.b, true);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Iterator<PerformanceStageModel> it = this.f29407a.iterator();
        while (it.hasNext()) {
            PerformanceStageModel next = it.next();
            if (next != null && !next.isRecordFinished()) {
                List<PerformanceStageModel> childStages = next.getChildStages();
                if (childStages != null) {
                    long b = b(childStages);
                    next.setStartMills(a(childStages));
                    next.setEndMills(b);
                } else {
                    UnifyLog.d("PerformanceRecord", "stage " + next.getStageCode() + " 没有正常结束");
                    a((a) next, false);
                }
            }
        }
    }

    private long a(List<PerformanceStageModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294d", new Object[]{this, list})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (list != null) {
            for (PerformanceStageModel performanceStageModel : list) {
                long startMills = performanceStageModel.getStartMills();
                if (currentTimeMillis > startMills) {
                    currentTimeMillis = startMills;
                }
            }
        }
        return currentTimeMillis;
    }

    private long b(List<PerformanceStageModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39e1ece", new Object[]{this, list})).longValue();
        }
        long j = 0;
        if (list != null) {
            for (PerformanceStageModel performanceStageModel : list) {
                long endMills = performanceStageModel.getEndMills();
                if (endMills > j) {
                    j = endMills;
                }
            }
        }
        return j;
    }

    private void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92067594", new Object[]{this, aVar, new Boolean(z)});
        } else if (!e.a()) {
        } else {
            if (aVar instanceof PerformanceStageModel) {
                PerformanceStageModel performanceStageModel = (PerformanceStageModel) aVar;
                StringBuilder sb = new StringBuilder();
                sb.append(performanceStageModel.getStageCode());
                sb.append(z ? " 结束：" : " 开始：");
                if (performanceStageModel.getStartMills() > 0) {
                    sb.append(" startTime：");
                    sb.append(performanceStageModel.getStartMills());
                }
                if (performanceStageModel.getEndMills() > 0) {
                    sb.append(" endTime：");
                    sb.append(performanceStageModel.getEndMills());
                }
                if (performanceStageModel.getDurationMills() > 0) {
                    sb.append(" cost：");
                    sb.append(performanceStageModel.getDurationMills());
                }
                if (performanceStageModel.getArgs() != null) {
                    sb.append(" ext：");
                    sb.append(JSONObject.toJSONString(performanceStageModel.getArgs()));
                }
                Log.e("PerformanceRecord", sb.toString());
            } else if (!(aVar instanceof PerformanceFlowModel)) {
            } else {
                Log.e("PerformanceRecord", JSONObject.toJSONString(aVar));
            }
        }
    }
}

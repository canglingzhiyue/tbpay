package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tschedule.strategy.h;
import com.taobao.android.tschedule.strategy.i;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class jma implements jlz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-919408038);
        kge.a(-702717998);
    }

    private Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this});
        }
        h hVar = h.a.instance;
        String b = hVar.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!StringUtils.isEmpty(b)) {
            linkedHashSet.add(b);
        }
        List<String> c = jmh.c();
        if (c != null && !c.isEmpty()) {
            if (!hVar.a()) {
                ArrayList arrayList = new ArrayList(c);
                List<RenderScheduleTask> a2 = i.a();
                if (!a2.isEmpty()) {
                    for (RenderScheduleTask renderScheduleTask : a2) {
                        arrayList.remove(renderScheduleTask.taskKey);
                    }
                    linkedHashSet.addAll(arrayList);
                }
            } else if (jmh.a()) {
                ArrayList arrayList2 = new ArrayList(c);
                List<RenderScheduleTask> a3 = i.a();
                if (!a3.isEmpty()) {
                    for (RenderScheduleTask renderScheduleTask2 : a3) {
                        if (!arrayList2.contains(renderScheduleTask2.taskKey) || !renderScheduleTask2.isValid()) {
                            arrayList2.remove(renderScheduleTask2.taskKey);
                        }
                    }
                    linkedHashSet.addAll(arrayList2);
                }
            } else {
                linkedHashSet.addAll(c);
            }
        }
        return linkedHashSet;
    }

    @Override // tb.jlz
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Set<String> b = b();
        if (b.isEmpty()) {
            jkq.a("TS.PredictWhitelist", "闲时白名单为空");
            return;
        }
        if (b.size() > 20) {
            jkq.a("TS.PredictWhitelist", "闲时白名单数量大于2，超出阈值");
        }
        Iterator<String> it = b.iterator();
        for (int i = 0; i < 20; i++) {
            if (it.hasNext()) {
                String next = it.next();
                jkq.a("TS.PredictWhitelist", "闲时任务执行开始。key = " + next);
                boolean preload = TSchedule.preload("idle", next, new Object[0]);
                jkq.a("TS.PredictWhitelist", "闲时任务执行结束。key = " + next + ";是否有对应task=" + preload);
                if (preload) {
                    jmc.a("downgrade", next, "1", "TSchedule", "predict_result", null);
                } else {
                    jmc.a("downgrade", next, "1", "TSchedule", "predict_result", null, "TS_PREDICT_EMPTY", "");
                }
            }
        }
    }
}

package com.taobao.android.tschedule.strategy;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.jlj;
import tb.jmh;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(873243352);
    }

    public static List<RenderScheduleTask> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<ScheduleTask>> entry : com.taobao.android.tschedule.c.a().entrySet()) {
            List<ScheduleTask> value = entry.getValue();
            if (value.size() == 1) {
                ScheduleTask scheduleTask = value.get(0);
                if (scheduleTask instanceof RenderScheduleTask) {
                    arrayList.add((RenderScheduleTask) scheduleTask);
                }
            }
        }
        return arrayList;
    }

    private static String a(RenderScheduleTask renderScheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("672bf60e", new Object[]{renderScheduleTask});
        }
        jlj b = jlj.b(jlj.PREFIX, new Object[0]);
        com.taobao.android.tschedule.parser.a aVar = new com.taobao.android.tschedule.parser.a(new ExprParserParams(null, null, null, ((RenderTaskContext) renderScheduleTask.taskContext).params.timeContent), com.taobao.android.tschedule.e.h());
        if (b == null) {
            return null;
        }
        return b.b(aVar).content;
    }

    private static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]);
        }
        List<String> c = jmh.c();
        return c == null ? Collections.emptyList() : c;
    }

    public static List<Pair<String, RenderScheduleTask>> a(List<RenderScheduleTask> list, String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d8d1c104", new Object[]{list, str});
        }
        ArrayList arrayList = new ArrayList();
        for (RenderScheduleTask renderScheduleTask : list) {
            if (b().contains(renderScheduleTask.taskKey) && (a2 = a(renderScheduleTask)) != null && j.a(a2, str)) {
                arrayList.add(Pair.create(a2, renderScheduleTask));
            }
        }
        return arrayList;
    }
}

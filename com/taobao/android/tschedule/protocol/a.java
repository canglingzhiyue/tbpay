package com.taobao.android.tschedule.protocol;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.c;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.h;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jkq;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_PROTOCOL_BIZ_CODE = "protocolBizCode";
    public static final String KET_PROTOCOL_CLASS = "protocolClass";
    public static final String KET_TARGET_PROCESS = "targetProcess";
    public static final String KET_TARGET_TASK = "targetTasks";
    public static final String KET_TARGET_TASK_CONFIG = "targetTasksConfigs";
    public static final String KET_TASK_URL = "taskUrl";
    public static final String TYPE_CHANGE_TRIVER_PROTOCOL = "changeTriverProtocol";
    public static final String TYPE_CHANGE_WEBVIEW_PROTOCOL = "changeWebViewProtocol";
    public static final String TYPE_DAI_COMPLETE = "com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE";
    public static final String TYPE_SCHEDULE_TASK = "scheduleTask";
    public static final String TYPE_SCHEDULE_TASK_WITH_CONFIGS = "scheduleTaskWithConfigs";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15666a;

    public static /* synthetic */ void a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else {
            c(str, list);
        }
    }

    public static /* synthetic */ void b(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{str, list});
        } else {
            d(str, list);
        }
    }

    static {
        kge.a(-310285223);
        f15666a = false;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!jmi.a(e.b()) || StringUtils.isEmpty(str2)) {
        } else {
            Intent intent = new Intent(TYPE_CHANGE_WEBVIEW_PROTOCOL);
            intent.putExtra(KET_PROTOCOL_BIZ_CODE, str);
            intent.putExtra(KET_PROTOCOL_CLASS, str2);
            e.b().sendBroadcast(intent);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (!jmi.a(e.b()) || StringUtils.isEmpty(str2)) {
        } else {
            Intent intent = new Intent(TYPE_CHANGE_TRIVER_PROTOCOL);
            intent.putExtra(KET_PROTOCOL_BIZ_CODE, str);
            intent.putExtra(KET_PROTOCOL_CLASS, str2);
            e.b().sendBroadcast(intent);
        }
    }

    public static void a(String str, String str2, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84591ae", new Object[]{str, str2, arrayList});
        } else if (!jmi.a(e.b()) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            Intent intent = new Intent(TYPE_SCHEDULE_TASK);
            intent.putExtra(KET_TASK_URL, str);
            intent.putExtra(KET_TARGET_PROCESS, str2);
            intent.putStringArrayListExtra(KET_TARGET_TASK, arrayList);
            e.b().sendBroadcast(intent);
            jkq.a("TS.MultiProcessor", "post task to targetProcess=" + str2 + ", url=" + str);
        }
    }

    public static void b(String str, String str2, ArrayList<ScheduleTask> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c84014d", new Object[]{str, str2, arrayList});
        } else if (!jmi.a(e.b()) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || arrayList == null || arrayList.isEmpty()) {
        } else {
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator<ScheduleTask> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().originConfig.toJSONString());
            }
            Intent intent = new Intent(TYPE_SCHEDULE_TASK_WITH_CONFIGS);
            intent.putExtra(KET_TASK_URL, str);
            intent.putExtra(KET_TARGET_PROCESS, str2);
            intent.putStringArrayListExtra(KET_TARGET_TASK_CONFIG, arrayList2);
            e.b().sendBroadcast(intent);
            jkq.a("TS.MultiProcessor", "post task to targetProcess=" + str2 + ", url=" + str);
        }
    }

    private static void c(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ac23a5", new Object[]{str, list});
            return;
        }
        List<ScheduleTask> a2 = c.a(str);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (ScheduleTask scheduleTask : a2) {
            if (scheduleTask != null) {
                try {
                    if (scheduleTask.taskContext != 0) {
                        String str2 = scheduleTask.taskContext instanceof RenderTaskContext ? ((RenderTaskContext) scheduleTask.taskContext).params.url : str;
                        if (scheduleTask.taskContext.multiProcess && list.contains(scheduleTask.taskContext.type)) {
                            scheduleTask.execute(str2, new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    jkq.a("TS.MultiProcessor", "excute task error", th);
                }
            }
        }
    }

    private static void d(String str, List<String> list) {
        ScheduleTask a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cad1ae6", new Object[]{str, list});
        } else if (list != null && !list.isEmpty()) {
            ArrayList<ScheduleTask> arrayList = new ArrayList();
            for (String str2 : list) {
                try {
                    if (!StringUtils.isEmpty(str2) && (a2 = h.a(str, JSON.parseObject(str2))) != null) {
                        arrayList.add(a2);
                    }
                } catch (Throwable unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (ScheduleTask scheduleTask : arrayList) {
                if (scheduleTask != null) {
                    try {
                        if (scheduleTask.taskContext != 0) {
                            String str3 = scheduleTask.taskContext instanceof RenderTaskContext ? ((RenderTaskContext) scheduleTask.taskContext).params.url : str;
                            if (scheduleTask.taskContext.multiProcess) {
                                scheduleTask.execute(str3, new Object[0]);
                            }
                        }
                    } catch (Throwable th) {
                        jkq.a("TS.MultiProcessor", "excute task error", th);
                    }
                }
            }
        }
    }
}

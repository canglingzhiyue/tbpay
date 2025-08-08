package com.taobao.android.tschedule;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.tschedule.d;
import com.taobao.android.tschedule.task.HttpScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tscheduleprotocol.MultiProcessScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.jkq;
import tb.jmc;
import tb.jmf;
import tb.jmg;
import tb.jmh;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class f implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {
        public static final f instance;

        static {
            kge.a(-489783561);
            instance = new f();
        }
    }

    static {
        kge.a(2001706532);
        kge.a(-565723104);
    }

    private f() {
        d.a(this);
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1b94e84e", new Object[0]) : a.instance;
    }

    @Override // com.taobao.android.tschedule.d.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            i.b().b(new Runnable() { // from class: com.taobao.android.tschedule.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    jkq.a("TS.TMgr", "version change, clearAllRenderCache. thread = " + Thread.currentThread());
                    com.taobao.android.tschedule.protocol.b.a().b();
                    jkq.a("TS.TMgr", "version change, startPredictNextPage. thread = " + Thread.currentThread());
                    e.j().b();
                }
            });
        }
    }

    public void a(final String str, final TScheduleHttpCallback tScheduleHttpCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ab8660", new Object[]{this, str, tScheduleHttpCallback});
            return;
        }
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (!b(str)) {
                jkq.a("TS.TMgr", "fetch http Data, not preload url, url=" + str + ", costTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
                tScheduleHttpCallback.onError();
                return;
            }
            HttpScheduleTask.fetchData(str, new ScheduleCacheCallBack() { // from class: com.taobao.android.tschedule.TScheduleMgr$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack
                public void onFinish(ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType, Object obj, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("daae7f44", new Object[]{this, scheduleCacheCallBackType, obj, objArr});
                        return;
                    }
                    jkq.a("TS.TMgr", "fetch http Data, type=" + scheduleCacheCallBackType + ", url=" + str + ", costTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
                    if (tScheduleHttpCallback == null) {
                        return;
                    }
                    if (scheduleCacheCallBackType == ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS) {
                        tScheduleHttpCallback.onSuccess(obj);
                    } else {
                        tScheduleHttpCallback.onError();
                    }
                }
            });
        } catch (Throwable th) {
            jkq.a("TS.TMgr", "callback http error", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r18, java.lang.String r19, java.lang.Object... r20) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.f.a(java.lang.String, java.lang.String, java.lang.Object[]):boolean");
    }

    public boolean a(String str, String str2, List<JSONObject> list, Object... objArr) {
        String str3;
        List<String> list2;
        String str4 = str;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1eb6fa8", new Object[]{this, str4, str2, list, objArr})).booleanValue();
        }
        if (!jmh.a(jmg.SWITCH_KEY_ENABLE_CONFIG_TRIGGER, false)) {
            jkq.a("TS.TMgr", "preloadWithConfigs failed, switch shutdown!");
            return false;
        } else if (list == null || list.isEmpty()) {
            return false;
        } else {
            List<String> b = jmh.b();
            jmf.a("getTasks");
            ScheduleProtocolCallback scheduleProtocolCallback = (objArr == null || objArr.length == 0) ? null : objArr[0];
            ArrayList<ScheduleTask> arrayList = new ArrayList();
            for (JSONObject jSONObject : list) {
                ScheduleTask a2 = h.a(str2, jSONObject, scheduleProtocolCallback);
                if (a2 != null) {
                    if (b == null || !b.contains(a2.taskKey)) {
                        list2 = b;
                        jkq.a("TS.TMgr", "taskKey:" + a2.taskKey + " is not in whiteList");
                    } else {
                        Context b2 = e.b();
                        list2 = b;
                        if (!ABGlobal.a(b2, "tb_global", "tschedule", "tsche_" + a2.taskKey)) {
                            jkq.a("TS.TMgr", "taskKey:" + a2.taskKey + " ab switch is not opened");
                        } else {
                            a2.originConfig = jSONObject;
                            arrayList.add(a2);
                        }
                    }
                    b = list2;
                    i = 1;
                }
            }
            String[] strArr = new String[i];
            strArr[0] = "taskSize=" + arrayList.size();
            jmf.a("getTasks", strArr);
            if (arrayList.isEmpty()) {
                return false;
            }
            HashMap hashMap = new HashMap();
            for (ScheduleTask scheduleTask : arrayList) {
                if (scheduleTask != null) {
                    try {
                        if (scheduleTask.taskContext != 0) {
                            if (!StringUtils.equals(str4, scheduleTask.taskContext.trigger)) {
                                jkq.a("TS.TMgr", "miss match trigger, taskTrigger=" + scheduleTask.taskContext.trigger + ", currentTrigger=" + str4);
                            } else {
                                if (scheduleTask.taskContext instanceof RenderTaskContext) {
                                    RenderTaskContext renderTaskContext = (RenderTaskContext) scheduleTask.taskContext;
                                    str3 = jmi.a(renderTaskContext.params.url, renderTaskContext.params.timeContent).content;
                                    jkq.a("TS.TMgr", "解析renderUrl。解析前：" + ((RenderTaskContext) scheduleTask.taskContext).params.url + ";解析后：" + str3);
                                    if (StringUtils.isEmpty(str3)) {
                                        String str5 = ((RenderTaskContext) scheduleTask.taskContext).params.url;
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("pageUrls", g.b());
                                        hashMap2.put("urlExpr", str5);
                                        String str6 = scheduleTask.taskContext.version;
                                        jmc.a("downgrade", str5, str6, "TSchedule", scheduleTask.taskContext.type + "_execute", hashMap2, "TS_RENDER_EMPTY_URL", "");
                                        str4 = null;
                                        return false;
                                    }
                                } else {
                                    str3 = str2;
                                }
                                if (StringUtils.isEmpty(str3)) {
                                    return false;
                                }
                                jkq.a("TS.TMgr", "start execute, targetUrl=" + str3 + ", currentTrigger=" + str4);
                                if (scheduleTask.taskContext.multiProcess) {
                                    String a3 = a(scheduleTask, str3);
                                    if (!StringUtils.isEmpty(a3)) {
                                        if (StringUtils.equals(jmi.a(), a3)) {
                                            scheduleTask.execute(str3, objArr);
                                        } else {
                                            ArrayList arrayList2 = (ArrayList) hashMap.get(a3);
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                                hashMap.put(a3, arrayList2);
                                            }
                                            arrayList2.add(scheduleTask);
                                        }
                                    }
                                } else {
                                    scheduleTask.execute(str3, objArr);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        jkq.a("TS.TMgr", "excute task error", th);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return true;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                com.taobao.android.tschedule.protocol.a.b(str2, (String) entry.getKey(), (ArrayList) entry.getValue());
            }
            return true;
        }
    }

    private String a(ScheduleTask scheduleTask, String str) {
        MultiProcessScheduleProtocol b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64b010ce", new Object[]{this, scheduleTask, str});
        }
        String str2 = scheduleTask.taskContext.targetProcess;
        return (!StringUtils.isEmpty(str2) || (b = com.taobao.android.tschedule.protocol.b.a().b(scheduleTask.taskContext.bizCode)) == null) ? str2 : b.getTargetProcessNameByUrl(e.b(), str);
    }

    private List<ScheduleTask> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return c.a(str);
        }
        return null;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        List<ScheduleTask> a2 = a(str);
        return a2 != null && !a2.isEmpty();
    }
}

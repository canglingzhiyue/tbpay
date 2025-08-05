package com.taobao.android.tschedule.task;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.tschedule.c;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.g;
import com.taobao.android.tschedule.i;
import com.taobao.android.tschedule.protocol.b;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import mtopsdk.mtop.global.SDKUtils;
import tb.jkq;
import tb.jlj;
import tb.jmc;
import tb.jmg;
import tb.jmh;
import tb.jmi;
import tb.kge;
import tb.tbt;

/* loaded from: classes6.dex */
public class RenderScheduleTask extends ScheduleTask<RenderTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.render";
    private String[] subParams;

    static {
        kge.a(-2060583195);
    }

    public static /* synthetic */ Object ipc$super(RenderScheduleTask renderScheduleTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean access$000(RenderScheduleTask renderScheduleTask, RenderScheduleProtocol renderScheduleProtocol, ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55e1dd64", new Object[]{renderScheduleTask, renderScheduleProtocol, scheduleProtocolCallbackType, str, str2})).booleanValue() : renderScheduleTask.clearRenderCache(renderScheduleProtocol, scheduleProtocolCallbackType, str, str2);
    }

    public static /* synthetic */ String access$100(RenderScheduleTask renderScheduleTask, ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f12e04e", new Object[]{renderScheduleTask, scheduleProtocolCallbackType}) : renderScheduleTask.getUCode(scheduleProtocolCallbackType);
    }

    public RenderScheduleTask(String str, RenderTaskContext renderTaskContext) {
        super(str, renderTaskContext);
    }

    public RenderScheduleTask(String str, RenderTaskContext renderTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, renderTaskContext, scheduleProtocolCallback);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public void realExecute(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f156e9", new Object[]{this, str, objArr});
            return;
        }
        if (c.f15655a) {
            try {
                long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
                TimeContent a2 = jmi.a(((RenderTaskContext) this.taskContext).params.url, ((RenderTaskContext) this.taskContext).params.timeContent);
                if (correctionTimeMillis < jlj.sDateFormat.parse(a2.validTime).getTime() + (new Random().nextInt(Math.max(a2.delayTimeMax, 3) * 60) * 1000)) {
                    jkq.a(TAG, "renderTask currentTime < validTime");
                    return;
                }
            } catch (Exception e) {
                jkq.a(TAG, "execute RenderTask error, type=" + ((RenderTaskContext) this.taskContext).type, e);
                return;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String a3 = jmi.a(str);
        try {
            String e2 = g.e(this.taskKey);
            if (TextUtils.equals(e2, str)) {
                jkq.a(TAG, "execute RenderTask discard, cache exist");
                return;
            }
            String executeRender = executeRender(str, e2, a3);
            StringBuilder sb = new StringBuilder();
            sb.append("execute RenderTask finish, result=");
            sb.append(executeRender == null ? "success" : executeRender);
            jkq.a(TAG, sb.toString());
            HashMap hashMap = new HashMap();
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            hashMap.put("targetUrl", str);
            if (executeRender == null) {
                String str2 = ((RenderTaskContext) this.taskContext).version;
                jmc.a("downgrade", a3, str2, "TSchedule", ((RenderTaskContext) this.taskContext).type + "_execute", hashMap);
                return;
            }
            String str3 = ((RenderTaskContext) this.taskContext).version;
            jmc.a("downgrade", a3, str3, "TSchedule", ((RenderTaskContext) this.taskContext).type + "_execute", hashMap, executeRender, "");
        } catch (Throwable th) {
            jkq.a(TAG, "execute RenderTask error, type=" + ((RenderTaskContext) this.taskContext).type, th);
            String str4 = ((RenderTaskContext) this.taskContext).version;
            jmc.a("downgrade", a3, str4, "TSchedule", ((RenderTaskContext) this.taskContext).type + "_execute", null, "TS_RENDER_EXCEPTION", th.getMessage());
        }
    }

    private boolean clearRenderCache(RenderScheduleProtocol renderScheduleProtocol, ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("527f461f", new Object[]{this, renderScheduleProtocol, scheduleProtocolCallbackType, str, str2})).booleanValue();
        }
        if (scheduleProtocolCallbackType == ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_OUT_OF_SERVICE || scheduleProtocolCallbackType == ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_SRC_NOT_EQUAL) {
            return false;
        }
        renderScheduleProtocol.removePreloadedInstance(str);
        g.c(str2);
        return true;
    }

    private String executeRender(final String str, String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b89a25d0", new Object[]{this, str, str2, str3});
        }
        final RenderScheduleProtocol a2 = b.a().a(((RenderTaskContext) this.taskContext).bizCode);
        if (a2 == null) {
            return "TS_NO_PROTOCOL";
        }
        final String str4 = ((RenderTaskContext) this.taskContext).bizCode;
        if (!TextUtils.isEmpty(str2)) {
            a2.removePreloadedInstance(str2);
            g.c(this.taskKey);
            jkq.a(TAG, "TS_RENDER_URL_CHANGE, remove old webview");
        } else if (TextUtils.isEmpty(str)) {
            a2.clearPreloadedInstances();
            g.c(this.taskKey);
            jkq.a(TAG, "empty url, clearPreloadedInstances");
            return "TS_EMPTY_URL_SCHEDULED";
        }
        ScheduleProtocolCallback scheduleProtocolCallback = new ScheduleProtocolCallback() { // from class: com.taobao.android.tschedule.task.RenderScheduleTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public Map<String, String> extraParams = null;

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                    return;
                }
                jkq.a(RenderScheduleTask.TAG, "preload finish, result=" + scheduleProtocolCallbackType.name());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("task_version", ((RenderTaskContext) RenderScheduleTask.this.taskContext).version);
                hashMap2.put("prefetchUrl", str);
                hashMap2.put("bizCode", str4);
                hashMap2.put("configPath", str3);
                if (hashMap != null) {
                    if (hashMap.containsKey("url")) {
                        hashMap2.put("realUrl", hashMap.get("url"));
                    }
                    hashMap2.putAll(hashMap);
                }
                Map<String, String> map = this.extraParams;
                if (map != null) {
                    hashMap2.putAll(map);
                    this.extraParams.clear();
                    this.extraParams = null;
                }
                RenderScheduleTask renderScheduleTask = RenderScheduleTask.this;
                RenderScheduleTask.access$000(renderScheduleTask, a2, scheduleProtocolCallbackType, str, renderScheduleTask.taskKey);
                if (AnonymousClass2.f15681a[scheduleProtocolCallbackType.ordinal()] == 1) {
                    jmc.a("downgrade", str3, ((RenderTaskContext) RenderScheduleTask.this.taskContext).version, "TSchedule", ((RenderTaskContext) RenderScheduleTask.this.taskContext).type, hashMap2);
                } else {
                    jmc.a("downgrade", str3, ((RenderTaskContext) RenderScheduleTask.this.taskContext).version, "TSchedule", ((RenderTaskContext) RenderScheduleTask.this.taskContext).type, hashMap2, RenderScheduleTask.access$100(RenderScheduleTask.this, scheduleProtocolCallbackType), null);
                }
            }

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                }
                if (scheduleProtocolCallbackType != ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_NOT_READY) {
                    return false;
                }
                return ((RenderTaskContext) RenderScheduleTask.this.taskContext).params.ignoreStatusCheck;
            }

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public boolean resolveParameter(String str5, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1ba0efdb", new Object[]{this, str5, map})).booleanValue();
                }
                if (map != null && this.extraParams == null) {
                    this.extraParams = new HashMap(map.size());
                    this.extraParams.putAll(map);
                }
                return jmi.a(str5, map, ((RenderTaskContext) RenderScheduleTask.this.taskContext).params.spmVerifyValue);
            }
        };
        HashMap hashMap = new HashMap(3);
        String a3 = jmh.a("injectJs", "");
        if (!TextUtils.isEmpty(a3)) {
            hashMap.put("injectJs", a3);
        }
        if (((RenderTaskContext) this.taskContext).params.timeout > 0) {
            hashMap.put("timeout", String.valueOf(((RenderTaskContext) this.taskContext).params.timeout * 1000));
        } else {
            hashMap.put("timeout", String.valueOf(1800000));
        }
        String str5 = ((RenderTaskContext) this.taskContext).type;
        char c = 65535;
        int hashCode = str5.hashCode();
        if (hashCode != -1866720743) {
            if (hashCode == 2010544511 && str5.equals("preCreate")) {
                c = 0;
            }
        } else if (str5.equals(tbt.PRE_RENDER)) {
            c = 1;
        }
        if (c == 0) {
            if (!a2.preCreateInstanceWithUrl(e.b(), str, scheduleProtocolCallback, hashMap)) {
                return "TS_PRE_CREATE_RENDER_ERROR";
            }
            g.b(this.taskKey, str);
            jkq.a(TAG, "预创建方法preCreateInstanceWithUrl已调用，并且返回true");
            return null;
        } else if (c != 1) {
            return "TS_ERROR_TASK_TYPE";
        } else {
            if (!a2.preloadWithUrl(e.b(), str, scheduleProtocolCallback, hashMap)) {
                return "TS_PRE_RENDER_RENDER_ERROR";
            }
            g.b(this.taskKey, str);
            jkq.a(TAG, "预渲染方法preloadWithUrl已调用，并且返回true");
            return null;
        }
    }

    private String getUCode(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a24e63d", new Object[]{this, scheduleProtocolCallbackType});
        }
        switch (scheduleProtocolCallbackType) {
            case TYPE_HIT:
                return "TS_RENDER_HIT";
            case TYPE_MISS:
                return "TS_RENDER_MISS";
            case TYPE_CLEAR:
                return "TS_RENDER_CLEAR";
            case TYPE_EXPIRE:
                return "TS_RENDER_EXPIRE";
            case TYPE_FULL:
                return "TS_RENDER_FULL";
            case TYPE_OUT_OF_SERVICE:
                return "TS_RENDER_OUT_OF_SERVICE";
            case TYPE_NOT_READY:
                return "TYPE_NOT_READY";
            case TYPE_SRC_NOT_EQUAL:
                return "TYPE_SRC_NOT_EQUAL";
            default:
                return "TS_RENDER_OTHER";
        }
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : jmh.a(jmg.SWITCH_KEY_ENABLE_TASK_RENDER, false) && isValidContext((RenderTaskContext) this.taskContext) && isTaskEnabled((RenderTaskContext) this.taskContext) && isValidEdition((RenderTaskContext) this.taskContext);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue() : isValid();
    }

    private boolean isTaskEnabled(RenderTaskContext renderTaskContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e188f554", new Object[]{this, renderTaskContext})).booleanValue() : jmh.a(String.format("render_task_switch_%s", this.taskKey), false);
    }

    private boolean isValidEdition(RenderTaskContext renderTaskContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b274e", new Object[]{this, renderTaskContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(renderTaskContext.params.editions)) {
            return Arrays.asList(renderTaskContext.params.editions.split(",")).contains(com.taobao.android.editionswitcher.b.b(e.b()).editionCode);
        }
        return true;
    }

    private boolean isValidContext(RenderTaskContext renderTaskContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89525f3f", new Object[]{this, renderTaskContext})).booleanValue() : (renderTaskContext == null || renderTaskContext.params == null || TextUtils.isEmpty(renderTaskContext.params.url)) ? false : true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this}) : ScheduleTask.THREAD_TYPE.MAIN;
    }

    private static void asyncLog(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa034ad", new Object[]{runnable});
        } else {
            i.b().a(runnable);
        }
    }
}

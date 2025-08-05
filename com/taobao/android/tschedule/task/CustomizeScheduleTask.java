package com.taobao.android.tschedule.task;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.CustomTaskContext;
import com.taobao.android.tscheduleprotocol.CustomScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.jmc;
import tb.jmg;
import tb.jmh;
import tb.kge;

/* loaded from: classes6.dex */
public class CustomizeScheduleTask extends ScheduleTask<CustomTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.CustomizeTask";

    /* renamed from: com.taobao.android.tschedule.task.CustomizeScheduleTask$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15676a = new int[ScheduleProtocolCallback.ScheduleProtocolCallbackType.values().length];

        static {
            try {
                f15676a[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_HIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15676a[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15676a[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_EXPIRE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15676a[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15676a[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_CLEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15676a[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_OUT_OF_SERVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        kge.a(737825356);
    }

    public static /* synthetic */ Object ipc$super(CustomizeScheduleTask customizeScheduleTask, String str, Object... objArr) {
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

    public static /* synthetic */ String access$000(CustomizeScheduleTask customizeScheduleTask, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4041fbf8", new Object[]{customizeScheduleTask, str}) : customizeScheduleTask.getUCode(str);
    }

    public CustomizeScheduleTask(String str, CustomTaskContext customTaskContext) {
        super(str, customTaskContext);
        init();
    }

    public CustomizeScheduleTask(String str, CustomTaskContext customTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, customTaskContext, scheduleProtocolCallback);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.taskContext == 0 || ((CustomTaskContext) this.taskContext).params == null || ((CustomTaskContext) this.taskContext).params.customParams == null) {
        } else {
            prepareTaskParams(((CustomTaskContext) this.taskContext).params.customParams);
        }
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public void realExecute(String str, Object... objArr) {
        JSONObject jSONObject;
        final String str2 = ((CustomTaskContext) this.taskContext).params.classpath;
        final long uptimeMillis = SystemClock.uptimeMillis();
        try {
            Class<?> cls = Class.forName(str2);
            if (cls == null) {
                return;
            }
            Object newInstance = cls.newInstance();
            ScheduleProtocolCallback scheduleProtocolCallback = new ScheduleProtocolCallback() { // from class: com.taobao.android.tschedule.task.CustomizeScheduleTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveParameter(String str3, Map<String, String> map) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("1ba0efdb", new Object[]{this, str3, map})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("hit_type", scheduleProtocolCallbackType.name());
                    hashMap2.put("taskType", ((CustomTaskContext) CustomizeScheduleTask.this.taskContext).type);
                    String valueOf = String.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                    hashMap2.put(HiAnalyticsConstant.BI_KEY_COST_TIME, valueOf);
                    String str3 = (hashMap == null || hashMap.isEmpty()) ? null : hashMap.get(ScheduleProtocolCallback.MERGE_TIME);
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            long longValue = Long.valueOf(str3).longValue();
                            if (longValue >= uptimeMillis) {
                                valueOf = String.valueOf(longValue - uptimeMillis);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    hashMap2.put("save_time", valueOf);
                    String str4 = "";
                    hashMap2.put("params", hashMap == null ? str4 : hashMap.toString());
                    switch (AnonymousClass2.f15676a[scheduleProtocolCallbackType.ordinal()]) {
                        case 1:
                            jmc.a("downgrade", str2, ((CustomTaskContext) CustomizeScheduleTask.this.taskContext).version, "TSchedule", ((CustomTaskContext) CustomizeScheduleTask.this.taskContext).type, hashMap2);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            String str5 = str2;
                            String str6 = ((CustomTaskContext) CustomizeScheduleTask.this.taskContext).version;
                            String str7 = ((CustomTaskContext) CustomizeScheduleTask.this.taskContext).type;
                            String access$000 = CustomizeScheduleTask.access$000(CustomizeScheduleTask.this, scheduleProtocolCallbackType.name());
                            if (hashMap != null) {
                                str4 = hashMap.toString();
                            }
                            jmc.a("downgrade", str5, str6, "TSchedule", str7, hashMap2, access$000, str4);
                            break;
                    }
                    if (CustomizeScheduleTask.this.taskCallback == null) {
                        return;
                    }
                    CustomizeScheduleTask.this.taskCallback.onPreload(scheduleProtocolCallbackType, hashMap);
                }
            };
            CustomTaskContext.CustomParams customParams = ((CustomTaskContext) this.taskContext).params;
            Intent intent = null;
            if (customParams.customParams == null || customParams.customParams.isEmpty()) {
                jSONObject = null;
            } else {
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    intent = (Intent) objArr[0];
                }
                jSONObject = parseTaskParams(str, customParams.customParams, customParams.blackList, intent);
            }
            if (newInstance instanceof CustomScheduleProtocol) {
                ((CustomScheduleProtocol) newInstance).preload(e.b(), str, scheduleProtocolCallback, jSONObject, new Object[0]);
                return;
            }
            Method method = cls.getMethod("preload", Context.class, String.class, ScheduleProtocolCallback.class, JSONObject.class, Object[].class);
            if (method == null) {
                return;
            }
            method.invoke(newInstance, e.b(), str, scheduleProtocolCallback, jSONObject);
        } catch (Throwable th) {
            jmc.a("downgrade", str2, ((CustomTaskContext) this.taskContext).version, "TSchedule", ((CustomTaskContext) this.taskContext).type, null, "TS_CUSTOMIZE_EXCEPTION", th.getMessage());
        }
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue() : (this.taskContext == 0 || ((CustomTaskContext) this.taskContext).params == null || !jmh.a(jmg.SWITCH_KEY_ENABLE_TASK_CUSTOM, false) || ((CustomTaskContext) this.taskContext).params.classpath == null || ((CustomTaskContext) this.taskContext).params.classpath == "") ? false : true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this}) : ScheduleTask.THREAD_TYPE.getType(((CustomTaskContext) this.taskContext).params.workThread);
    }

    private String getUCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3a54a63", new Object[]{this, str});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -959856524:
                if (str.equals("TYPE_FULL")) {
                    c = 4;
                    break;
                }
                break;
            case -959659295:
                if (str.equals("TYPE_MISS")) {
                    c = 1;
                    break;
                }
                break;
            case 107585774:
                if (str.equals("TYPE_HIT")) {
                    c = 0;
                    break;
                }
                break;
            case 306173160:
                if (str.equals(MtopPrefetch.IPrefetchCallback.PrefetchCallbackType.TYPE_CLEAR)) {
                    c = 2;
                    break;
                }
                break;
            case 970109380:
                if (str.equals("TYPE_EXPIRE")) {
                    c = 3;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? "TS_CUSTOMIZE_OTHER" : "TS_CUSTOMIZE_FULL" : "TS_CUSTOMIZE_EXPIRE" : "TS_CUSTOMIZE_CLEAR" : "TS_CUSTOMIZE_MISS" : "TS_CUSTOMIZE_HIT";
    }
}

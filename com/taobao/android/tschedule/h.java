package com.taobao.android.tschedule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.CustomizeScheduleTask;
import com.taobao.android.tschedule.task.HttpScheduleTask;
import com.taobao.android.tschedule.task.MtopScheduleTask;
import com.taobao.android.tschedule.task.PhenixScheduleTask;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.CustomTaskContext;
import com.taobao.android.tschedule.taskcontext.HttpTaskContext;
import com.taobao.android.tschedule.taskcontext.MtopTaskContext;
import com.taobao.android.tschedule.taskcontext.PhenixTaskContext;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import tb.kge;
import tb.tbt;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1216311249);
    }

    public static ScheduleTask a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduleTask) ipChange.ipc$dispatch("8710ae38", new Object[]{str, jSONObject}) : a(str, jSONObject, null);
    }

    public static ScheduleTask a(String str, JSONObject jSONObject, ScheduleProtocolCallback scheduleProtocolCallback) {
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask) ipChange.ipc$dispatch("9beecd66", new Object[]{str, jSONObject, scheduleProtocolCallback});
        }
        try {
            String string = jSONObject.getString("type");
            switch (string.hashCode()) {
                case -2098191020:
                    if (string.equals("dx2Render")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1866720743:
                    if (string.equals(tbt.PRE_RENDER)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1210687339:
                    if (string.equals("dx3Render")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -989338224:
                    if (string.equals("phenix")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -361093191:
                    if (string.equals("dx3Template")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3213448:
                    if (string.equals("http")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3362248:
                    if (string.equals("mtop")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1446361272:
                    if (string.equals("dx2Template")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1611566147:
                    if (string.equals("customize")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2010544511:
                    if (string.equals("preCreate")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    MtopTaskContext mtopTaskContext = (MtopTaskContext) JSON.toJavaObject(jSONObject, MtopTaskContext.class);
                    if (mtopTaskContext == null) {
                        return null;
                    }
                    return new MtopScheduleTask(str, mtopTaskContext, scheduleProtocolCallback);
                case 1:
                case 2:
                case 3:
                case 4:
                    return null;
                case 5:
                    PhenixTaskContext phenixTaskContext = (PhenixTaskContext) JSON.toJavaObject(jSONObject, PhenixTaskContext.class);
                    if (phenixTaskContext == null) {
                        return null;
                    }
                    return new PhenixScheduleTask(str, phenixTaskContext, scheduleProtocolCallback);
                case 6:
                case 7:
                    RenderTaskContext renderTaskContext = (RenderTaskContext) JSON.toJavaObject(jSONObject, RenderTaskContext.class);
                    if (renderTaskContext == null) {
                        return null;
                    }
                    g.a(str, renderTaskContext.params.url, renderTaskContext.params.timeContent);
                    return new RenderScheduleTask(str, renderTaskContext, scheduleProtocolCallback);
                case '\b':
                    CustomTaskContext customTaskContext = (CustomTaskContext) JSON.toJavaObject(jSONObject, CustomTaskContext.class);
                    if (customTaskContext == null) {
                        return null;
                    }
                    return new CustomizeScheduleTask(str, customTaskContext, scheduleProtocolCallback);
                case '\t':
                    HttpTaskContext httpTaskContext = (HttpTaskContext) JSON.toJavaObject(jSONObject, HttpTaskContext.class);
                    if (httpTaskContext == null) {
                        return null;
                    }
                    return new HttpScheduleTask(str, httpTaskContext, scheduleProtocolCallback);
                default:
                    return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.alibaba.analytics.core.selfmonitor.exception;

import android.content.Context;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.event.g;
import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.appmonitor.pool.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import tb.aob;
import tb.apg;
import tb.aqc;
import tb.bta;
import tb.btm;
import tb.kge;

/* loaded from: classes2.dex */
public class ExceptionEventBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public enum ExceptionType {
        UT,
        AP,
        COMMON
    }

    static {
        kge.a(398586121);
    }

    public static void a(ExceptionType exceptionType, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9640c2c", new Object[]{exceptionType, th});
        } else if (th == null) {
        } else {
            try {
                g gVar = (g) a.a().a(g.class, new Object[0]);
                gVar.b = EventType.ALARM.getEventId();
                HashMap hashMap = new HashMap();
                hashMap.put("meta", bta.a());
                ReuseJSONArray reuseJSONArray = (ReuseJSONArray) a.a().a(ReuseJSONArray.class, new Object[0]);
                reuseJSONArray.add(b(exceptionType, th));
                hashMap.put("data", reuseJSONArray);
                gVar.f.put(EventType.ALARM.getAggregateEventArgsKey(), JSON.toJSONString(hashMap));
                gVar.c = "APPMONITOR";
                gVar.d = a(exceptionType);
                btm.a(gVar);
                a.a().a((a) reuseJSONArray);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private static String a(ExceptionType exceptionType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3270c057", new Object[]{exceptionType}) : ExceptionType.UT == exceptionType ? "ut-exception" : ExceptionType.COMMON == exceptionType ? "ut-common-exception" : "sdk-exception";
    }

    private static JSONObject b(ExceptionType exceptionType, Throwable th) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d99bf52b", new Object[]{exceptionType, th});
        }
        JSONObject jSONObject = (JSONObject) a.a().a(ReuseJSONObject.class, new Object[0]);
        Context k = aob.a().k();
        if (k != null) {
            jSONObject.put("pname", (Object) apg.f(k));
        }
        jSONObject.put("page", (Object) "APPMONITOR");
        jSONObject.put("monitorPoint", (Object) a(exceptionType));
        jSONObject.put(IWXUserTrackAdapter.MONITOR_ARG, (Object) th.getClass().getSimpleName());
        jSONObject.put("successCount", (Object) 0);
        jSONObject.put("failCount", (Object) 1);
        ArrayList arrayList = new ArrayList();
        String a2 = a(th);
        if (a2 != null) {
            JSONObject jSONObject2 = (JSONObject) a.a().a(ReuseJSONObject.class, new Object[0]);
            jSONObject2.put("errorCode", (Object) a2);
            jSONObject2.put("errorCount", (Object) 1);
            arrayList.add(jSONObject2);
        }
        jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_errors, (Object) arrayList);
        return jSONObject;
    }

    private static String a(Throwable th) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
            }
        }
        String sb2 = sb.toString();
        return aqc.d(sb2) ? th.toString() : sb2;
    }
}

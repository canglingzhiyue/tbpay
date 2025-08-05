package com.taobao.android.tschedule.trigger.nav;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tschedule.g;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.themis.kernel.utils.i;
import java.util.HashMap;
import java.util.List;
import tb.jkq;
import tb.jmc;
import tb.jmf;
import tb.jmg;
import tb.jmh;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1078554734);
    }

    public final boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            return true;
        }
        String uri = data.toString();
        if (TextUtils.isEmpty(uri) || b(uri) || !jmh.a(jmg.SWITCH_KEY_ENABLE_NAV, false)) {
            return true;
        }
        String stringExtra = intent.getStringExtra("referrer");
        boolean booleanExtra = intent.getBooleanExtra("from_browser", false);
        jkq.a("TS.navHook", "navBefore.url = " + uri + "; referrerUrl = " + stringExtra + "; fromBrowser = " + booleanExtra);
        if (booleanExtra || TextUtils.equals(jmi.a(uri), jmi.a(stringExtra))) {
            jkq.a("TS.navHook", "navBefore。browser url, discard");
            return true;
        }
        jkq.a("TS.navHook", "start nav before trigger, url=" + uri);
        jmf.a("TScheduleNavHookerTrigger.hook");
        TSchedule.preload("navBefore", uri, intent);
        if (g.g(uri)) {
            jmc.a("pageRender", jmi.a(uri), "", "TSchedule", "NavBefore", null);
        }
        jmf.a("TScheduleNavHookerTrigger.hook", new String[0]);
        return true;
    }

    public final boolean b(Intent intent) {
        Uri data;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (!jmh.a(jmg.SWITCH_KEY_ENABLE_NAV, false) || (data = intent.getData()) == null) {
            return true;
        }
        String uri = data.toString();
        if (TextUtils.isEmpty(uri) || b(uri)) {
            return true;
        }
        String stringExtra = intent.getStringExtra("referrer");
        boolean booleanExtra = intent.getBooleanExtra("from_browser", false);
        jkq.a("TS.navHook", "navAfter.url = " + uri + "; refreUrl = " + stringExtra + "; fromBrowser = " + booleanExtra);
        String a2 = jmi.a(uri);
        if (booleanExtra && TextUtils.equals(a2, jmi.a(stringExtra))) {
            jkq.a("TS.navHook", "navAfter。browser url, discard");
            return true;
        }
        jkq.a("TS.navHook", "start nav after trigger, url=" + uri);
        jmf.a("TScheduleNavPreProcessorTrigger.hook");
        TSchedule.preload("navAfter", uri, intent);
        if (g.g(uri)) {
            jmc.a("pageRender", a2, "", "TSchedule", "NavAfter", null);
            boolean f = g.f(uri);
            String d = g.d();
            HashMap hashMap = new HashMap();
            hashMap.put("renderUrls", d);
            hashMap.put("realUrl", uri);
            if (f) {
                if (!jmh.c(com.taobao.android.tschedule.e.b())) {
                    a(uri);
                    str = "TS_RENDER_SWITCH_CLOSE";
                    f = false;
                } else {
                    str = null;
                }
            } else {
                str = (d == null || !d.contains(a2)) ? "TS_RENDER_NO_PREDICT" : "TS_RENDER_QUERY_MISS";
            }
            if (f) {
                jmc.a("pageRender", a2, "", "TSchedule", "preRender_nav", hashMap);
            } else {
                jmc.a("pageRender", a2, "", "TSchedule", "preRender_nav", hashMap, str, "");
            }
        }
        jmf.a("TScheduleNavPreProcessorTrigger.hook", new String[0]);
        return true;
    }

    private void a(String str) {
        List<ScheduleTask> a2;
        RenderScheduleProtocol a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String d = g.d(str);
        if (d == null || (a2 = com.taobao.android.tschedule.c.a(d)) == null || a2.isEmpty()) {
            return;
        }
        for (ScheduleTask scheduleTask : a2) {
            if ((scheduleTask instanceof RenderScheduleTask) && scheduleTask.taskContext != 0 && (a3 = com.taobao.android.tschedule.protocol.b.a().a(scheduleTask.taskContext.bizCode)) != null) {
                a3.removePreloadedInstance(str);
                Log.e("TS.navHook", "remove rennder cache because hit switch close, url=" + str);
            }
        }
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : str == null || str.contains("ariver_appid=") || str.contains("uniapp_id=") || str.contains(i.SOURCE_URL);
    }
}

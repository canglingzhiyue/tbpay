package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import tb.kge;

/* loaded from: classes5.dex */
public class AppMonitorModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(571908457);
        kge.a(-818961104);
    }

    public static void commitSuccess(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f31f20c", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("module");
            if (string == null) {
                string = jSONObject.getString("pageName");
            }
            String string2 = jSONObject.getString("monitorPoint");
            String string3 = jSONObject.getString(IWXUserTrackAdapter.MONITOR_ARG);
            if (string3 == null) {
                AppMonitor.Alarm.commitSuccess(string, string2);
            } else {
                AppMonitor.Alarm.commitSuccess(string, string2, string3);
            }
        }
    }

    public static void commitFail(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f7f03", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("module");
            if (string == null) {
                string = jSONObject.getString("pageName");
            }
            String string2 = jSONObject.getString("monitorPoint");
            String string3 = jSONObject.getString("errorCode");
            String string4 = jSONObject.getString("errorMsg");
            String string5 = jSONObject.getString(IWXUserTrackAdapter.MONITOR_ARG);
            if (string5 == null) {
                AppMonitor.Alarm.commitFail(string, string2, string3, string4);
            } else {
                AppMonitor.Alarm.commitFail(string, string2, string5, string3, string4);
            }
        }
    }
}

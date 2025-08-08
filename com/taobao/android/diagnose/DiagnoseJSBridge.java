package com.taobao.android.diagnose;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.x;
import org.json.JSONObject;
import tb.fmx;
import tb.kge;

/* loaded from: classes.dex */
public class DiagnoseJSBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_TRIGGER_SCENE = "sceneTrigger";

    static {
        kge.a(-211593522);
    }

    public static /* synthetic */ Object ipc$super(DiagnoseJSBridge diagnoseJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            q.a("DiagnoseJSBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) DiagnoseJSBridge.class);
        } catch (Throwable th) {
            v.a("DiagnoseJSBridge", "init", th);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!ACTION_TRIGGER_SCENE.equals(str)) {
            return false;
        }
        handleSceneTrigger(str2, wVCallBackContext);
        return true;
    }

    private void handleSceneTrigger(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bd7822", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("bizName", "");
            if (StringUtils.isEmpty(optString)) {
                wVCallBackContext.error();
                return;
            }
            fmx fmxVar = null;
            if (jSONObject.optBoolean("hasArgs", false)) {
                fmxVar = new fmx();
                if (jSONObject.has("sArg1")) {
                    fmxVar.a("sArg1", jSONObject.getString("sArg1"));
                }
                if (jSONObject.has("sArg2")) {
                    fmxVar.a("sArg2", jSONObject.getString("sArg2"));
                }
                if (jSONObject.has("bArg1")) {
                    fmxVar.a("bArg1", Boolean.valueOf(jSONObject.getBoolean("bArg1")));
                }
                if (jSONObject.has("bArg2")) {
                    fmxVar.a("bArg2", Boolean.valueOf(jSONObject.getBoolean("bArg2")));
                }
                if (jSONObject.has("iArg1")) {
                    fmxVar.a("iArg1", Integer.valueOf(jSONObject.getInt("iArg1")));
                }
                if (jSONObject.has("iArg2")) {
                    fmxVar.a("iArg2", Integer.valueOf(jSONObject.getInt("iArg2")));
                }
            }
            x.a().a(optString, fmxVar);
            wVCallBackContext.success();
        } catch (Exception e) {
            v.a("DiagnoseJSBridge", "handleSceneTrigger", e);
            wVCallBackContext.error();
        }
    }
}

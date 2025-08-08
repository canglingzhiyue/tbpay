package com.taobao.monitor.adapter.test;

import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.procedure.g;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mms;
import tb.mmw;
import tb.mpi;
import tb.mpm;
import tb.mpn;

/* loaded from: classes7.dex */
public class H5ProcedureGetterBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_PROCEDURE_GETTER = "procedureGetter";
    private static final String ACTION_PROCEDURE_GETTER_DEBUG = "findAllProcedure";
    private static final String ACTION_REALTIME_UPLOAD = "realTimeDisplay";
    public static final String API_SERVER_NAME = "H5ProcedureGetterBridge";
    public static final String SP_KEY_REALTIME_TRACE_ID = "realtime_display_trace_id";
    public static final String SP_KEY_REALTIME_TRACE_VALID_TIME = "realtime_trace_valid_time";

    public static /* synthetic */ Object ipc$super(H5ProcedureGetterBridge h5ProcedureGetterBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        mpi.c(API_SERVER_NAME, "params", str2);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1345401673) {
            if (hashCode != -679498306) {
                if (hashCode == -44766581 && str.equals(ACTION_PROCEDURE_GETTER_DEBUG)) {
                    c = 1;
                }
            } else if (str.equals(ACTION_PROCEDURE_GETTER)) {
                c = 0;
            }
        } else if (str.equals(ACTION_REALTIME_UPLOAD)) {
            c = 2;
        }
        if (c == 0) {
            return getProcedure(str2, wVCallBackContext, false);
        }
        if (c == 1) {
            return getProcedure(str2, wVCallBackContext, true);
        }
        if (c == 2) {
            return startRealtimeUpload(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean getProcedure(String str, WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2dfa10d", new Object[]{this, str, wVCallBackContext, new Boolean(z)})).booleanValue();
        }
        try {
            mpi.c(API_SERVER_NAME, ACTION_PROCEDURE_GETTER);
            String string = new JSONObject(str).getString("h5Url");
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.getWebview().getUrl();
            }
            g d = ProcedureGlobal.PROCEDURE_MANAGER.d();
            String str2 = "";
            if (d.c()) {
                str2 = mpn.b(ProcedureGlobal.PROCEDURE_MANAGER.b(d));
            }
            r rVar = new r();
            rVar.a("startup", str2);
            if (z) {
                rVar.a("pages", new JSONArray((Collection) ProcedureGlobal.PROCEDURE_MANAGER.b(string)));
            } else {
                String c = ProcedureGlobal.PROCEDURE_MANAGER.c(string);
                rVar.a("content", c);
                mpi.c(API_SERVER_NAME, "content", c);
            }
            wVCallBackContext.success(rVar);
            mpi.c(API_SERVER_NAME, "startup", str2);
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
        }
        return true;
    }

    private boolean startRealtimeUpload(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67f01a20", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean boolValueFromJson = getBoolValueFromJson(jSONObject, "need_launch_sample", true);
            boolean boolValueFromJson2 = getBoolValueFromJson(jSONObject, "need_page_sample", true);
            boolean boolValueFromJson3 = getBoolValueFromJson(jSONObject, "need_performance_monitor_sample", true);
            boolean boolValueFromJson4 = getBoolValueFromJson(jSONObject, "effect_permanently", false);
            String string = jSONObject.getString(ApLinkTokenUtils.KEY_TRACE_ID);
            long j = jSONObject.has("trace_valid_time") ? jSONObject.getLong("trace_valid_time") : -1L;
            d.m = d.m || !boolValueFromJson;
            d.d = d.d || !boolValueFromJson2;
            d.o = d.o || !boolValueFromJson2;
            d.O = d.O || !boolValueFromJson3;
            SharedPreferences sharedPreferences = com.taobao.monitor.impl.common.e.a().b().getSharedPreferences("apm", 0);
            if (boolValueFromJson4) {
                mms.h = false;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(SP_KEY_REALTIME_TRACE_ID, string);
                if (j > 0) {
                    edit.putLong(SP_KEY_REALTIME_TRACE_VALID_TIME, j);
                }
                edit.putBoolean(com.taobao.monitor.adapter.init.a.LAUNCHER_PROCESSOR_SAMPLE, d.m);
                edit.putBoolean(com.taobao.monitor.adapter.init.a.PAGE_LOAD_SAMPLE, d.d);
                edit.putBoolean(com.taobao.monitor.adapter.init.a.FRAGMENT_PAGE_LOAD_SAMPLE, d.o);
                edit.putBoolean(com.taobao.monitor.adapter.init.a.MAIN_THREAD_MONITOR_SAMPLE, d.O);
                edit.apply();
            }
            mms.n = string;
            mms.o = "scan";
            mpm.a().a(mmw.class);
            mpm.a().a(new mmw());
            r rVar = new r();
            rVar.a("result", "APM实时上传已打开，请退出操作，有数据后页面将进行展示");
            wVCallBackContext.success(rVar);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error("参数解析异常：" + e.getMessage());
            return false;
        }
    }

    private boolean getBoolValueFromJson(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8bf59a", new Object[]{this, jSONObject, str, new Boolean(z)})).booleanValue();
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return z;
        }
    }
}

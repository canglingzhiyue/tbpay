package com.taobao.analysis.fulltrace;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dit;

/* loaded from: classes.dex */
public class NWFullTracePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "falco.NWFullTracePlugin";
    private static final String WV_COMMIT_MODULE_TRACE = "commitModuleTrace";
    private static final String WV_PLUGIN_NAME = "NWFullTracePlugin";

    /* loaded from: classes4.dex */
    public interface FullTraceJSParam {
        public static final String MODULE = "module";
        public static final String STAGES = "stages";
        public static final String TAG = "tag";
        public static final String TRACE_ID = "traceId";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface Definition {
        }
    }

    public static /* synthetic */ Object ipc$super(NWFullTracePlugin nWFullTracePlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(NWFullTracePlugin nWFullTracePlugin, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb878a", new Object[]{nWFullTracePlugin, str, wVCallBackContext});
        } else {
            nWFullTracePlugin.commitModuleTrace(str, wVCallBackContext);
        }
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            q.a(WV_PLUGIN_NAME, (Class<? extends e>) NWFullTracePlugin.class);
        } catch (Throwable unused) {
            ALog.e(TAG, "[register]error", null, new Object[0]);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (WV_COMMIT_MODULE_TRACE.equals(str)) {
            dit.b(new Runnable() { // from class: com.taobao.analysis.fulltrace.NWFullTracePlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NWFullTracePlugin.access$000(NWFullTracePlugin.this, str2, wVCallBackContext);
                    }
                }
            });
        }
        return false;
    }

    private void commitModuleTrace(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a2c550", new Object[]{this, str, wVCallBackContext});
        } else if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("params null.");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("traceId");
                String string2 = jSONObject.getString("module");
                String optString = jSONObject.optString("tag");
                JSONObject jSONObject2 = jSONObject.getJSONObject(FullTraceJSParam.STAGES);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject2.getJSONArray(next);
                    hashMap.put(next, new Pair(Long.valueOf(jSONArray.getLong(0)), Long.valueOf(jSONArray.getLong(1))));
                }
                FullTraceAnalysis.getInstance().commitModuleTrace(string, string2, optString, hashMap);
                wVCallBackContext.success();
            } catch (JSONException e) {
                ALog.e(TAG, "[commitModuleTrace]json error", null, e, new Object[0]);
                wVCallBackContext.error("JSON parse error.");
            } catch (Exception e2) {
                ALog.e(TAG, "[commitModuleTrace]error", null, e2, new Object[0]);
                wVCallBackContext.error("commitModuleTrace error.");
            }
        }
    }
}

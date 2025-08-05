package com.taobao.tlog.adapter;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.weex.common.WXConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JSLogBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GETLOGLEVEL = "getLogLevel";
    private static final String LOGD = "logd";
    private static final String LOGE = "loge";
    private static final String LOGI = "logi";
    private static final String LOGV = "logv";
    private static final String LOGW = "logw";
    private static final String TRACE_D = "traced";
    private static final String TRACE_I = "tracei";
    private static final String tlogBridgeName = "tlogBridge";

    /* renamed from: com.taobao.tlog.adapter.JSLogBridge$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22960a = new int[LogLevel.values().length];

        static {
            try {
                f22960a[LogLevel.I.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22960a[LogLevel.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f22961a;
        public String b;

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(JSLogBridge jSLogBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            q.a(tlogBridgeName, (Class<? extends android.taobao.windvane.jsbridge.e>) JSLogBridge.class, true);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && wVCallBackContext != null) {
            if (GETLOGLEVEL.equals(str)) {
                r rVar = new r();
                rVar.a(WXConfig.logLevel, AdapterForTLog.getLogLevel());
                wVCallBackContext.success(rVar);
            } else if (LOGV.equals(str)) {
                logv(str2, wVCallBackContext);
            } else if (LOGD.equals(str)) {
                logd(str2, wVCallBackContext);
            } else if (LOGI.equals(str)) {
                logi(str2, wVCallBackContext);
            } else if (LOGW.equals(str)) {
                logw(str2, wVCallBackContext);
            } else if (LOGE.equals(str)) {
                loge(str2, wVCallBackContext);
            } else if (TRACE_I.equals(str)) {
                traceLog(LogLevel.I, str2, wVCallBackContext);
            } else if (TRACE_D.equals(str)) {
                traceLog(LogLevel.D, str2, wVCallBackContext);
            }
            return true;
        }
        return false;
    }

    public void logv(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89726a80", new Object[]{this, str, wVCallBackContext});
            return;
        }
        a log = getLog(str);
        if (log != null) {
            AdapterForTLog.logv(log.f22961a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logd(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73368ee", new Object[]{this, str, wVCallBackContext});
            return;
        }
        a log = getLog(str);
        if (log != null) {
            AdapterForTLog.logd(log.f22961a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logi(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99a3eb3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        a log = getLog(str);
        if (log != null) {
            AdapterForTLog.logi(log.f22961a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logw(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd209541", new Object[]{this, str, wVCallBackContext});
            return;
        }
        a log = getLog(str);
        if (log != null) {
            AdapterForTLog.logw(log.f22961a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void loge(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae193af", new Object[]{this, str, wVCallBackContext});
            return;
        }
        a log = getLog(str);
        if (log != null) {
            AdapterForTLog.loge(log.f22961a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    private void traceLog(LogLevel logLevel, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfb6b7", new Object[]{this, logLevel, str, wVCallBackContext});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                wVCallBackContext.error("the content is null!");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("cntID", "");
            String optString2 = jSONObject.optString("refID", "");
            String optString3 = jSONObject.optString("module", "");
            String optString4 = jSONObject.optString("tag", "");
            long optLong = jSONObject.optLong(StEvent.EVENT_TIME, System.currentTimeMillis());
            String optString5 = jSONObject.optString("eventName", "");
            String optString6 = jSONObject.optString("eventCode", "");
            String optString7 = jSONObject.optString("codeMsg", "");
            int optInt = jSONObject.optInt("eventType", 0);
            String optString8 = jSONObject.optString("bizCode", "");
            String optString9 = jSONObject.optString("ext", "");
            if (TextUtils.isEmpty(optString5)) {
                wVCallBackContext.error("the eventName is null!");
                return;
            }
            if (AnonymousClass1.f22960a[logLevel.ordinal()] == 1) {
                com.taobao.tlog.adapter.a.a(optString, optString2, optString3, optString4, optLong, optString5, optString6, optString7, optInt, optString8, optString9);
            } else {
                com.taobao.tlog.adapter.a.b(optString, optString2, optString3, optString4, optLong, optString5, optString6, optString7, optInt, optString8, optString9);
            }
            wVCallBackContext.success();
        } catch (JSONException e) {
            e.printStackTrace();
            wVCallBackContext.error("the json is invalid!");
        }
    }

    private a getLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("df6c379b", new Object[]{this, str});
        }
        try {
            a aVar = new a();
            JSONObject jSONObject = new JSONObject(str);
            aVar.f22961a = jSONObject.optString("tag", "jsTag");
            aVar.b = jSONObject.optString("content", "");
            return aVar;
        } catch (JSONException unused) {
            return null;
        }
    }
}

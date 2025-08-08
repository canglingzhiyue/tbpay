package com.taobao.monitor.adapter.test;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import java.util.Map;

/* loaded from: classes7.dex */
public class AliAPMBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADD_SUBTASK = "addSubTask";
    private static final String ACTION_BEGIN_SUBTASK = "beginSubtask";
    private static final String ACTION_END_SUBTASK = "endSubtask";
    public static final String API_SERVER_NAME = "AliAPMBridge";

    public static /* synthetic */ Object ipc$super(AliAPMBridge aliAPMBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_BEGIN_SUBTASK.equals(str)) {
            return beginSubtask(str2, wVCallBackContext);
        }
        if (ACTION_END_SUBTASK.equals(str)) {
            return endSubtask(str2, wVCallBackContext);
        }
        if (!ACTION_ADD_SUBTASK.equals(str)) {
            return false;
        }
        return addSubTask(str2, wVCallBackContext);
    }

    private boolean beginSubtask(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd0fb2e", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            long longValue = parseObject.getLong("beginTimestamp").longValue();
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("'taskName' Parameter missing");
                return false;
            } else if (longValue <= 0) {
                wVCallBackContext.error("'beginTimestamp' Parameter invalid");
                return false;
            } else {
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof View) {
                    s.f18233a.b((View) webview).c(string, h.a(longValue));
                    return true;
                }
                wVCallBackContext.error("IWVWebView invalid");
                return false;
            }
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
            return false;
        }
    }

    private boolean endSubtask(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b84ca53c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            long longValue = parseObject.getLong("endTimestamp").longValue();
            JSONObject jSONObject = parseObject.getJSONObject("extra");
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("'taskName' Parameter missing");
                return false;
            } else if (longValue <= 0) {
                wVCallBackContext.error("'endTimestamp' Parameter invalid");
                return false;
            } else {
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof View) {
                    s.f18233a.b((View) webview).a(string, h.a(longValue), jSONObject == null ? null : (Map) JSONObject.toJavaObject(jSONObject, Map.class));
                    return true;
                }
                wVCallBackContext.error("IWVWebView invalid");
                return false;
            }
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
            return false;
        }
    }

    private boolean addSubTask(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4e7656", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            long longValue = parseObject.getLong("beginTimestamp").longValue();
            long longValue2 = parseObject.getLong("endTimestamp").longValue();
            JSONObject jSONObject = parseObject.getJSONObject("extra");
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("'taskName' Parameter missing");
                return false;
            } else if (longValue <= 0) {
                wVCallBackContext.error("'beginTimestamp' Parameter invalid");
                return false;
            } else if (longValue2 <= 0) {
                wVCallBackContext.error("'endTimestamp' Parameter invalid");
                return false;
            } else {
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof View) {
                    Map<String, Object> map = jSONObject == null ? null : (Map) JSONObject.toJavaObject(jSONObject, Map.class);
                    g b = s.f18233a.b((View) webview);
                    b.c(string, h.a(longValue));
                    b.a(string, h.a(longValue2), map);
                    return true;
                }
                wVCallBackContext.error("IWVWebView invalid");
                return false;
            }
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
            return false;
        }
    }
}

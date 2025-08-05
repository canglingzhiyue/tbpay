package com.taobao.agoo.notification;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ecg;
import tb.kge;

/* loaded from: classes4.dex */
public class AgooWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ENABLE_NOTIFICATION = "enableNotification";
    private static final String ACTION_NOTIFICATION_ENABLED = "isNotificationEnabled";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_SCENE = "scene";
    private static final String KEY_TYPE = "type";
    private static final String TAG = "AgooWVPlugin";
    public static final String WV_NAME = "WVAgoo";

    static {
        kge.a(369245926);
    }

    public static /* synthetic */ Object ipc$super(AgooWVPlugin agooWVPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        ALog.e(TAG, "initialize", "context", context, ecg.UMB_FEATURE_WEB_VIEW, iWVWebView);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ALog.e(TAG, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "action", str, "params", str2);
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            ALog.e(TAG, "execute json err", e, "action", str, "params", str2);
        }
        if (ACTION_ENABLE_NOTIFICATION.equals(str)) {
            String optString = jSONObject == null ? "" : jSONObject.optString("scene");
            if (jSONObject != null) {
                i = jSONObject.optInt("type");
            }
            a.a(this.mContext, optString, i);
            return true;
        } else if (!ACTION_NOTIFICATION_ENABLED.equals(str)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                r rVar = r.RET_SUCCESS;
                rVar.a(KEY_ENABLED, Boolean.valueOf(a.a(this.mContext)));
                wVCallBackContext.success();
                ALog.e(TAG, "isNotificationEnabled result: " + rVar.d(), new Object[0]);
            }
            return true;
        }
    }
}

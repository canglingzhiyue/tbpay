package com.taobao.login4android.weex;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.auth.a;
import com.taobao.android.auth.b;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class WVIntentModule extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GET_INTENT = "getIntent";
    public static final String ACTION_ON_AUTH_RESULT = "onAuthResult";
    public static final String ACTION_ON_BACK = "onBack";
    public static final String REFER = "referrer";

    static {
        kge.a(998791223);
    }

    public static /* synthetic */ Object ipc$super(WVIntentModule wVIntentModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                UserTrackAdapter.sendUT(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ACTION_GET_INTENT.equals(str)) {
            getIntent(str2, wVCallBackContext);
            return true;
        } else if (ACTION_ON_AUTH_RESULT.equals(str)) {
            onAuthResult(str2, wVCallBackContext);
            return true;
        } else if (!"onBack".equals(str)) {
            return false;
        } else {
            onBack(wVCallBackContext);
            return true;
        }
    }

    private synchronized void getIntent(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9479a660", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context context = wVCallBackContext.getWebview().getContext();
        r rVar = new r();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(a.h)) {
                try {
                    JSONObject jSONObject = new JSONObject(a.h);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("imei", "");
                    if (!TextUtils.isEmpty(WVUserModule.url)) {
                        jSONObject2.put("url", URLEncoder.encode(WVUserModule.url));
                    }
                    WVUserModule.url = "";
                    if (!TextUtils.isEmpty(WVUserModule.authCodeCallerUrl)) {
                        jSONObject2.put("url", URLEncoder.encode(WVUserModule.authCodeCallerUrl));
                    }
                    WVUserModule.authCodeCallerUrl = "";
                    jSONObject.put("deviceID", jSONObject2.toString());
                    rVar.a(jSONObject);
                    wVCallBackContext.success(rVar);
                    return;
                } catch (Throwable unused) {
                }
            }
            if (activity.getIntent() != null && !TextUtils.isEmpty(activity.getIntent().getStringExtra("referrer"))) {
                rVar.a(bundleToJSON(Uri.parse(activity.getIntent().getStringExtra("referrer")).getQuery()));
                wVCallBackContext.success(rVar);
                return;
            }
        }
        wVCallBackContext.error(rVar);
    }

    public static JSONObject bundleToJSON(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c3313c4", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() > 0) {
            for (String str2 : str.split("&")) {
                int indexOf = str2.indexOf("=");
                if (indexOf > 0 && indexOf < str2.length() - 1) {
                    try {
                        jSONObject.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    private synchronized void onAuthResult(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71258172", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context context = wVCallBackContext.getWebview().getContext();
        if ((context instanceof Activity) && !TextUtils.isEmpty(str)) {
            b.a(str, (Activity) context);
        }
    }

    private synchronized void onBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9089baa", new Object[]{this, wVCallBackContext});
            return;
        }
        Context context = wVCallBackContext.getWebview().getContext();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}

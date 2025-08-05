package com.taobao.themis.mix.h5_render;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class TMSTinyH5EventBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMSTinyH5EventBridge";

    static {
        kge.a(814643404);
    }

    public static /* synthetic */ Object ipc$super(TMSTinyH5EventBridge tMSTinyH5EventBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            jSONObject = JSONObject.parseObject(str2);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        if (TextUtils.equals("registerEvent", str)) {
            return registerEvent(jSONObject, wVCallBackContext);
        }
        if (TextUtils.equals("callbackEvent", str)) {
            return callbackEvent(jSONObject, wVCallBackContext);
        }
        wVCallBackContext.error();
        return false;
    }

    private boolean registerEvent(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33d7ea33", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        String string = jSONObject.getString("event");
        f tMSTinyH5EventBridge = getInstance(wVCallBackContext.getWebview().getContext());
        if (!TextUtils.isEmpty(string) && tMSTinyH5EventBridge != null) {
            tMSTinyH5EventBridge.b(string);
            wVCallBackContext.success();
            return true;
        }
        TMSLogger.d(TAG, "registerEvent + " + string + " failed, because instance is null or event is empty");
        wVCallBackContext.error();
        return false;
    }

    private boolean callbackEvent(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6968c455", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        String string = jSONObject.getString("eventId");
        f tMSTinyH5EventBridge = getInstance(wVCallBackContext.getWebview().getContext());
        if (!TextUtils.isEmpty(string) && tMSTinyH5EventBridge != null) {
            ITMSPage c = tMSTinyH5EventBridge.b().c();
            if (c != null) {
                c.a(string, jSONObject);
            }
            wVCallBackContext.success();
            return true;
        }
        wVCallBackContext.error();
        return false;
    }

    private f getInstance(Context context) {
        g gVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a15702e5", new Object[]{this, context});
        }
        if (context instanceof MutableContextWrapper) {
            TMSLogger.b(TAG, "context is MutableContextWrapper");
            try {
                gVar = (g) ((MutableContextWrapper) context).getBaseContext();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (context instanceof g) {
            TMSLogger.b(TAG, "context is TMSInstanceBinder");
            gVar = (g) context;
        } else {
            TMSLogger.d(TAG, "context is not MutableContextWrapper or TMSInstanceBinder");
            gVar = null;
        }
        if (gVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("context is null: ");
            if (context != null) {
                z = false;
            }
            sb.append(z);
            TMSLogger.d(TAG, sb.toString());
            return null;
        }
        return gVar.b();
    }
}

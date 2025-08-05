package com.taobao.android.tb3dspaceprocessor;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class T3DNattiveJS extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "XRNattiveJS";

    public static /* synthetic */ Object ipc$super(T3DNattiveJS t3DNattiveJS, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("isT3DInstalled".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isInstalled", "" + c.a());
            } catch (JSONException e) {
                String str3 = "execute: e " + e;
            }
            wVCallBackContext.success(jSONObject.toString());
            return true;
        }
        wVCallBackContext.error("not find this method.");
        return false;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}

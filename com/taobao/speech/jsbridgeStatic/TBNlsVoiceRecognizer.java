package com.taobao.speech.jsbridgeStatic;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.f;
import com.taobao.speech.util.b;
import com.taobao.speech.util.d;
import com.taobao.speech.util.f;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes8.dex */
public class TBNlsVoiceRecognizer extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUDIO_PERMISSION = "android.permission.RECORD_AUDIO";
    private static String TAG = "TBNlsVoiceRecognizer";
    private b nlsWVClient = new d();

    public static /* synthetic */ Object ipc$super(TBNlsVoiceRecognizer tBNlsVoiceRecognizer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(TBNlsVoiceRecognizer tBNlsVoiceRecognizer, WVCallBackContext wVCallBackContext, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0b4afb", new Object[]{tBNlsVoiceRecognizer, wVCallBackContext, new Boolean(z), str});
        } else {
            tBNlsVoiceRecognizer.sendResult(wVCallBackContext, z, str);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        f.a(wVCallBackContext, "TBNlsVoiceRecognizerUsage");
        if (!com.taobao.speech.util.e.a(this.mContext, "android.permission.RECORD_AUDIO")) {
            jsCheckAudioPermission("", null);
        }
        this.nlsWVClient.a(this.mContext);
        try {
            if ("startVoiceRecognition".equals(str)) {
                this.nlsWVClient.a(wVCallBackContext);
                if (this.nlsWVClient.a(str2)) {
                    wVCallBackContext.success();
                } else {
                    wVCallBackContext.error();
                }
                return true;
            } else if ("stopVoiceRecognition".equals(str)) {
                this.nlsWVClient.a();
                return true;
            } else if ("cancelVoiceRecognition".equals(str)) {
                this.nlsWVClient.b();
                return true;
            } else if (!"getVoicePermission".equals(str)) {
                return false;
            } else {
                jsCheckAudioPermission(((JSONObject) new JSONTokener(str2).nextValue()).optString("tip", ""), wVCallBackContext);
                return true;
            }
        } catch (Throwable unused) {
            wVCallBackContext.error();
            return true;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.nlsWVClient.c();
        }
    }

    private void jsCheckAudioPermission(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc053ad4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        f.a b = com.taobao.runtimepermission.f.a(this.mContext, new String[]{"android.permission.RECORD_AUDIO"}).a(new Runnable() { // from class: com.taobao.speech.jsbridgeStatic.TBNlsVoiceRecognizer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                TBNlsVoiceRecognizer.access$000(TBNlsVoiceRecognizer.this, wVCallBackContext2, true, "Permission Success");
            }
        }).b(new Runnable() { // from class: com.taobao.speech.jsbridgeStatic.TBNlsVoiceRecognizer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                TBNlsVoiceRecognizer.access$000(TBNlsVoiceRecognizer.this, wVCallBackContext2, false, "Permission Fail");
            }
        });
        if (!TextUtils.isEmpty(str)) {
            b.a(str);
        }
        b.a();
    }

    private void sendResult(WVCallBackContext wVCallBackContext, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14007f5", new Object[]{this, wVCallBackContext, new Boolean(z), str});
        } else if (wVCallBackContext == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                if (z) {
                    jSONObject.put("status", "1");
                } else {
                    jSONObject.put("status", "-2");
                }
                jSONObject.put("message", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            wVCallBackContext.fireEvent("TBNlsVoiceRecognizer.Event.onVoicePermission", JSON.toJSONString(jSONObject));
        }
    }
}

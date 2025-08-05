package com.taobao.speech.util;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECOGNIZRESULT = "TBNlsVoiceRecognizer.Event.onRecognizingResult";
    public static final String RECORD_AUDIO_TAG = "TBNlsVoiceRecognizer";

    /* renamed from: a  reason: collision with root package name */
    public boolean f19705a = false;
    public WVCallBackContext b;
    public Context c;

    @Override // com.taobao.speech.util.b
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    @Override // com.taobao.speech.util.b
    public void a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
        } else {
            this.b = wVCallBackContext;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        WVCallBackContext wVCallBackContext = this.b;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.fireEvent(str, str2);
        this.b.fireEvent(str.replace("TBNlsVoiceRecognizer.", "TBSearchVoice."), str2);
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        if (i == 0) {
            i = 1;
        }
        String str2 = "状态：" + i;
        String str3 = "语音识别结果：" + str;
        HashMap hashMap = new HashMap();
        hashMap.put("status", String.valueOf(i));
        hashMap.put("result", str != null ? str : "");
        if (!TextUtils.isEmpty(str)) {
            try {
                hashMap.put("asr", JSON.parseObject(str).getString("result"));
            } catch (Throwable unused) {
            }
        }
        a(RECOGNIZRESULT, JSON.toJSONString(hashMap));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!this.f19705a) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("success", false);
                jSONObject.put("errorCode", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            a(RECOGNIZRESULT, jSONObject.toString());
            String str = "onRecognizingResult: error" + i;
        }
    }
}

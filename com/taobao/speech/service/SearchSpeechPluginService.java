package com.taobao.speech.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.speech.jsbridgeStatic.TBNlsVoiceRecognizer;
import com.taobao.tao.TaobaoApplication;

/* loaded from: classes8.dex */
public class SearchSpeechPluginService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    public SearchSpeechPluginService() {
        f.a("com.taobao.speech", "com.taobao.speech.service.SearchSpeechPluginService");
        ApplicationInvoker.getInstance("com.taobao.speech").invoke("com.taobao.speech.SpeechApplication", TaobaoApplication.sApplication);
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !"TBSearchVoice".equals(str)) {
            return null;
        }
        return TBNlsVoiceRecognizer.class;
    }
}

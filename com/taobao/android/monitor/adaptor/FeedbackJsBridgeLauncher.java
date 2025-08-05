package com.taobao.android.monitor.adaptor;

import android.app.Application;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class FeedbackJsBridgeLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            q.a(FeedbackJsBridge.CLASS_FEEDBACK, (Class<? extends e>) FeedbackJsBridge.class, false);
        }
    }
}

package com.taobao.alivfssdk.monitor.init;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class InitAVFSMonitorService implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(application, "com.taobao.alivfssdk.monitor.AVFSMonitorService"));
        application.getApplicationContext().startService(intent);
    }
}

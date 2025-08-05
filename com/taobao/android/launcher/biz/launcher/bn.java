package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class bn extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public bn(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else {
            com.taobao.desktop.channel.desktoplinktask.trigger.a.a(application, hashMap);
        }
    }
}

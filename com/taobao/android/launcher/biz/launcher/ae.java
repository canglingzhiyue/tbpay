package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.igu;

/* loaded from: classes.dex */
public class ae extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ae(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else {
            igu.a(application, hashMap);
        }
    }
}

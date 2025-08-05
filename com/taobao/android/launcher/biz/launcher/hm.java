package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class hm extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public hm(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        try {
            com.taobao.tao.log.f.a().c();
        } catch (Exception e) {
            Log.e("TLog.InitTaoLog", "tlog set uploader and msg sender failure", e);
        }
        try {
            com.taobao.tlog.adapter.b.a(application);
        } catch (Exception e2) {
            Log.e("TLog.InitTaoLog", "tlog config switch failure", e2);
        }
    }
}

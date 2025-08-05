package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import tb.gtm;

/* loaded from: classes.dex */
public class a extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public a(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("launch_config", "all_spark_mode", "1");
        if ("1".equals(config)) {
            com.android.tools.ir.runtime.c.a("com.taobao.allspark", null);
        } else if (!"2".equals(config)) {
        } else {
            application.sendBroadcast(gtm.a(application, "TAOBAO_DELAY_START_ALLSPARK"));
        }
    }
}

package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.message.DiagnoseAccsMessenger;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import java.util.HashMap;

/* loaded from: classes.dex */
public class br extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public br(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        final com.taobao.android.diagnose.e eVar = new com.taobao.android.diagnose.e();
        eVar.l = Login.getNick();
        eVar.j = (String) com.taobao.android.launcher.common.c.a("userId", "");
        eVar.g = (String) com.taobao.android.launcher.common.c.a("process", "com.taobao.taobao");
        eVar.k = (String) com.taobao.android.launcher.common.c.a("deviceId", "");
        eVar.f = (String) com.taobao.android.launcher.common.c.a("appVersion", "");
        eVar.i = ((Integer) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue();
        eVar.h = ((Boolean) com.taobao.android.launcher.common.c.a("isDebuggable", false)).booleanValue();
        eVar.e = ((Long) com.taobao.android.launcher.common.c.a("launchStartTime", Long.valueOf(System.currentTimeMillis()))).longValue();
        try {
            com.taobao.android.diagnose.c.a().a(application).a(new DiagnoseAccsMessenger()).a(eVar);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        new Thread(new Runnable() { // from class: com.taobao.android.launcher.biz.launcher.br.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.android.tbuprofen.adapter.a aVar = new com.taobao.android.tbuprofen.adapter.a();
                aVar.f15455a = eVar.f;
                aVar.d = eVar.i;
                aVar.c = eVar.h;
                aVar.b = eVar.g;
                br.this.a(application, aVar);
            }
        }, "tbp-init").start();
    }

    public void a(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1337167", new Object[]{this, context, aVar});
            return;
        }
        try {
            com.taobao.android.tbuprofen.adapter.d.a().a(context, aVar);
        } catch (Exception unused) {
        }
    }
}

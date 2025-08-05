package com.taobao.desktop.channel.desktoplinktask.trigger;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import tb.kge;
import tb.kgz;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2046801020);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            if (!new File(application.getFilesDir().getAbsolutePath() + File.separator + "desktop" + File.separator + "configs").exists()) {
                kgz.a("DesktopTaskTriggerInit.noLocalConfigFile.cancel", new Object[0]);
                return;
            }
            kgz.a("DesktopTaskTriggerInit.start", new Object[0]);
            Object obj = hashMap.get("isDebuggable");
            if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                z = false;
            }
            kgz.a(z);
            d a2 = d.a();
            a2.a(application);
            a2.a(2, (String) null);
            kgz.a("DesktopTaskTriggerInit.done", new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

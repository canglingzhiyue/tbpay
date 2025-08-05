package com.taobao.codetrack;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.jacoco.b;
import java.io.Serializable;
import java.util.HashMap;
import tb.kfu;
import tb.kfv;
import tb.kga;
import tb.kgc;

/* loaded from: classes7.dex */
public class CodeTrackLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Log.e(kga.MODULE_NAME, "CodeTrack Launched." + LauncherRuntime.e);
        String a2 = kgc.a(application);
        kfv kfvVar = new kfv();
        kfvVar.a(a2);
        kfvVar.a(false);
        kfvVar.b(checkBetaVersion());
        kfu.a().a(application.getApplicationContext(), kfvVar);
        b.a(application.getApplicationContext(), a2);
    }

    private boolean checkBetaVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f92f132b", new Object[]{this})).booleanValue();
        }
        try {
            if (LauncherRuntime.e != null) {
                if (LauncherRuntime.e.split("\\.").length >= 4) {
                    return true;
                }
            }
        } catch (Throwable th) {
            Log.e(kga.MODULE_NAME, "", th);
        }
        return false;
    }
}

package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class m extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1633537319);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        if (str.hashCode() == -193894180) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        super.a(application, hashMap);
        if (LauncherRuntime.a()) {
            return;
        }
        LauncherRuntime.c();
    }
}

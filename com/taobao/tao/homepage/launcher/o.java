package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.sdy;
import tb.seb;

/* loaded from: classes8.dex */
public class o extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-706649174);
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        seb.a();
        sdy.a();
    }
}

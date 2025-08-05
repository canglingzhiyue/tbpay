package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;
import com.taobao.phenix.compat.PhenixApngDelayInitializer;
import com.taobao.phenix.compat.PhenixInitializer;
import java.util.HashMap;
import tb.guc;

/* loaded from: classes5.dex */
public class jb extends com.taobao.android.launcher.biz.task.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public jb(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        if (guc.a(application, "Home_Page_SecondRefreshOpt") || guc.a(application, "minKernelDXMerged")) {
            LSDB.tryLoadNativeLibrary();
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(2);
        hashMap2.put("isNextLaunch", true);
        hashMap2.put("ngLaunch", true);
        new PhenixInitializer().init(application, hashMap2);
        PhenixInitializer.initHeif(application);
        PhenixInitializer.initTBScheduler(application);
        PhenixApngDelayInitializer.init(application, hashMap);
        PhenixInitializer.initBuild(application);
    }
}

package com.android.tools.ir.runtime;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, ApplicationInvoker.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358543cd", new Object[]{str, aVar});
        } else if ("com.taobao.taolive".equals(str)) {
            TaoLiveLaunchInitializer.init();
        } else if (StringUtils.isEmpty(str) || com.android.tools.bundleInfo.b.a().d(str) == null) {
        } else {
            String str2 = com.android.tools.bundleInfo.b.a().d(str).p;
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            ApplicationInvoker.getInstance(str).invoke(str2, Globals.getApplication(), aVar);
        }
    }
}

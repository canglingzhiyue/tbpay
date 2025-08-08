package com.taobao.android.launcher.biz.task;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(com.taobao.android.job.core.task.e<String, Void> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8abeed95", new Object[]{eVar})).booleanValue() : LauncherRuntime.b(eVar);
    }

    public static boolean a(String str, final i iVar) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf98bf8e", new Object[]{str, iVar})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && iVar != null) {
            return LauncherRuntime.a(new e(str) { // from class: com.taobao.android.launcher.biz.task.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.launcher.biz.task.i
                public void a(Application application, HashMap<String, Object> hashMap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
                    } else {
                        iVar.a(application, hashMap);
                    }
                }
            });
        }
        throw new IllegalArgumentException("name should not be empty, task should not be null");
    }
}

package com.taobao.android.detail.industry.tool;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.f;
import com.taobao.speech.util.e;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-761967865);
    }

    public static void a(Context context, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7872e5c", new Object[]{context, runnable, runnable2});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        f.a(context, new String[]{e.CAMERA}).a("").a(runnable).b(runnable2).a();
    }
}

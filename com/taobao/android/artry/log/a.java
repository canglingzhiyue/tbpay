package com.taobao.android.artry.log;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1509299526);
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee268404", new Object[]{str, th, str2, objArr});
            return;
        }
        try {
            Log.e(str, " throwable is : " + th);
        } catch (Throwable unused) {
        }
    }
}

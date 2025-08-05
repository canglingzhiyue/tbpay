package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            jbe.a(application);
        }
    }
}

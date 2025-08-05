package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class mxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1874261123);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        a(application, "SCP_newSetting");
        a(application, "SCP_account201501");
    }

    public static void a(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be04981", new Object[]{application, str});
            return;
        }
        try {
            mxg.a(application);
            mxg.a(str);
        } catch (Exception e) {
            TLog.logd("cache util", "delete cache error:" + e.getMessage());
        }
    }
}

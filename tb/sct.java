package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.f;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class sct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1679243578);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else {
            f.a.b(f.MODULE_NAME, "__themeName__", f.g());
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f.a.a(f.MODULE_NAME, "__themeName__", null);
    }
}

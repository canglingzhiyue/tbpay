package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.i;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class rkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2097621334);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        kif.a(" InitTBWidget-reqWidgetDataBackground");
        i.a(application).c(hashMap);
    }
}

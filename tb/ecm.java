package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ecm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-461317375);
        emu.a("com.taobao.android.detail.core.detail.utils.DescAppMonitor");
    }

    public static void a(Context context, egy egyVar, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af29e7f0", new Object[]{context, egyVar, str, hashMap});
            return;
        }
        ehn c = ehk.a().c();
        if (c == null) {
            return;
        }
        c.a(context, egyVar, str, hashMap);
    }

    public static void a(Context context, egy egyVar, String str, HashMap<String, String> hashMap, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3be504", new Object[]{context, egyVar, str, hashMap, str2, str3});
            return;
        }
        ehn c = ehk.a().c();
        if (c == null) {
            return;
        }
        c.a(context, egyVar, str, hashMap, str2, str3);
    }
}

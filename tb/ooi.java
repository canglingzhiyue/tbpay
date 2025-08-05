package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.realtimerecommend.j;
import com.tmall.android.dai.f;

/* loaded from: classes.dex */
public class ooi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1424436935);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return !j.b(str) ? osi.a() : f.a("gul_edge_user_state.alinn", "version");
        } catch (Exception unused) {
            return "";
        }
    }
}

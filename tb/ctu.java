package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ctu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-358979075);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String str2 = "NewDetail_" + str;
        gvt.a(str2);
        fjt.a(fjt.TAG_SECTION, "[beginSection] : " + str2);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            gvt.a();
        }
    }
}

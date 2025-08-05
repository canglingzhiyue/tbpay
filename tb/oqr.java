package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class oqr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-412429419);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "lastResultVersion_" + str;
    }
}

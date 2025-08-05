package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rlo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFALT_SKIN = "skin_default";
    public static final String PREF_CUSTOM_SKIN_PATH = "skin_custom_path";

    static {
        kge.a(2007322665);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : rmo.b(context, PREF_CUSTOM_SKIN_PATH, DEFALT_SKIN);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            rmo.a(context, PREF_CUSTOM_SKIN_PATH, str);
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : DEFALT_SKIN.equals(a(context));
    }
}

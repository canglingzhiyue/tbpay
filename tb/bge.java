package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FALSE = "false";
    public static final String TRUE = "true";

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : TextUtils.isEmpty(str) ? z : "true".equalsIgnoreCase(str);
    }
}

package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-52970243);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue() : (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) ? i : Integer.parseInt(str);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : a(str, 0);
    }
}

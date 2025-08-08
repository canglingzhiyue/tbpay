package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dyx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27124a;
    public static String b;
    public static String[] c;

    static {
        kge.a(-880714344);
        f27124a = "Coupon";
        b = "H5Fragment";
        c = new String[]{f27124a, b};
        emu.a("com.taobao.android.detail.core.detail.fragment.common.FloatType");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = c;
            if (i >= strArr.length) {
                return false;
            }
            if (str.equals(strArr[i])) {
                return true;
            }
            i++;
        }
    }
}

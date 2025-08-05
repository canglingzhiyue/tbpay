package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1111596705);
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }
}

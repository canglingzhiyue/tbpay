package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471011205);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}

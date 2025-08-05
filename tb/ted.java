package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ted implements teg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(138961114);
        kge.a(1491219530);
    }

    @Override // tb.teg
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : khz.a(str);
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iqm implements jeo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.jeo
    public boolean a(Thread thread, Throwable th) {
        String message;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85272e00", new Object[]{this, thread, th})).booleanValue() : (th instanceof NoClassDefFoundError) && (message = th.getMessage()) != null && message.contains("xposed/XC_MethodHook");
    }
}

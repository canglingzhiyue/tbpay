package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class mwm implements oxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1622940180);
        kge.a(639957676);
    }

    @Override // tb.oxu
    public boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue() : guc.a(context, str);
    }
}

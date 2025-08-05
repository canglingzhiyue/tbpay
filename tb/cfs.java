package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cfs implements cfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.cfq
    public AuthStatus a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthStatus) ipChange.ipc$dispatch("6b915b6c", new Object[]{this, context, str}) : AuthStatus.GRANTED;
    }
}

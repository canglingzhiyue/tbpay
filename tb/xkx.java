package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class xkx implements xky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1237068875);
        kge.a(-385768733);
    }

    @Override // tb.xky
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            new tjw().a(context, str, false);
        }
    }
}

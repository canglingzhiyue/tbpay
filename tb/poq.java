package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class poq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-602488355);
    }

    public static final boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        q.c(activity, "activity");
        if (!(activity instanceof pop)) {
            activity = null;
        }
        pop popVar = (pop) activity;
        return popVar != null && popVar.dR_();
    }
}

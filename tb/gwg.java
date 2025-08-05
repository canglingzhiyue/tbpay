package tb;

import android.app.Activity;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-148616332);
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            activity.getWindow().setStatusBarColor(i);
        }
    }
}

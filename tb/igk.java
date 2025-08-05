package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class igk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1200942547);
    }

    public static <T> T a(Activity activity, int i, Class<? extends T> cls) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f16e23de", new Object[]{activity, new Integer(i), cls});
        }
        if (activity != null && (findViewById = activity.findViewById(i)) != null && cls != null && cls.isAssignableFrom(findViewById.getClass())) {
            return cls.cast(findViewById);
        }
        return null;
    }
}

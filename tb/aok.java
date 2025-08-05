package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes.dex */
public class aok {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f25475a;

    static {
        kge.a(-995969824);
        f25475a = ".UTSystemConfig" + File.separator + "Global";
    }

    public static aol a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aol) ipChange.ipc$dispatch("34c10be8", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return new aol(context, f25475a, "Alvin3", false, true);
    }

    public static aol b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aol) ipChange.ipc$dispatch("4868df69", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return new aol(context, f25475a, "UTCommon", false, true);
    }
}

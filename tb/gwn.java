package tb;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gwn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1776368860);
    }

    public static Context a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a75aa358", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context instanceof MutableContextWrapper ? ((MutableContextWrapper) context).getBaseContext() : context;
    }
}

package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ixj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    static {
        kge.a(-1756674403);
        TAG = ixj.class.getSimpleName();
    }

    public static void a(View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25511b", new Object[]{view, new Integer(i), new Boolean(z)});
            return;
        }
        View a2 = a(view, i);
        if (a2 == null) {
            return;
        }
        if (z) {
            a2.setVisibility(0);
        } else {
            a2.setVisibility(8);
        }
    }

    public static View a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("26df70db", new Object[]{view, new Integer(i)});
        }
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }
}

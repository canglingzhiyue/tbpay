package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class luv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1015141621);
    }

    public static void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{view, new Integer(i)});
        } else if (view == null) {
        } else {
            view.setVisibility(i);
        }
    }
}

package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class stw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1585949691);
    }

    public static boolean a(View view, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2851dc1a", new Object[]{view, new Float(f), new Float(f2), new Float(f3)})).booleanValue() : view != null && f >= ((float) view.getLeft()) - f3 && f2 >= ((float) view.getTop()) - f3 && f < ((float) view.getRight()) + f3 && f2 < ((float) view.getBottom()) + f3;
    }
}

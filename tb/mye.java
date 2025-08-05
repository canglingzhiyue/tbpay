package tb;

import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mye {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(myb mybVar, mya myaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6341ab01", new Object[]{mybVar, myaVar})).booleanValue();
        }
        if ((mybVar instanceof View) && (myaVar instanceof View)) {
            View view = (View) myaVar;
            if (view.getVisibility() == 0) {
                View view2 = (View) mybVar;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == view2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

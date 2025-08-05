package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class emm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1428779000);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailViewUtil");
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeView(view);
        }
    }
}

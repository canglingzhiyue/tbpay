package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* loaded from: classes4.dex */
public class emc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1497948658);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailDXRootViewFinder");
    }

    public static DXRootView a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fd04df2d", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            DXRootView a2 = a(viewGroup.getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}

package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class erw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-78943662);
    }

    public static void a(DXRuntimeContext dXRuntimeContext, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774e7a59", new Object[]{dXRuntimeContext, view});
        } else if (view == null || view.getParent() == null) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
            if (dXRuntimeContext == null || dXRuntimeContext.C() == null || !dXRuntimeContext.C().l()) {
                return;
            }
            dXRuntimeContext.C().b().v();
        }
    }

    public static void a(View view, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0e595b", new Object[]{view, dXRuntimeContext});
        } else if (view != null) {
            if (dXRuntimeContext != null && dXRuntimeContext.C() != null && dXRuntimeContext.C().l()) {
                dXRuntimeContext.C().b().v();
                if (!(view instanceof ViewGroup)) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
                viewGroup.removeAllViews();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2);
                }
            } else if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
            }
        }
    }
}

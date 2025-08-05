package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class fvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2092167553);
    }

    public abstract void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, DXRuntimeContext dXRuntimeContext);

    public void a(DXRuntimeContext dXRuntimeContext, WeakReference<View> weakReference) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145c765", new Object[]{this, dXRuntimeContext, weakReference});
        } else if (weakReference == null || (view = weakReference.get()) == null || view.getParent() == null) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
            if (dXRuntimeContext == null || dXRuntimeContext.C() == null || !dXRuntimeContext.C().l()) {
                return;
            }
            dXRuntimeContext.C().b().v();
        }
    }

    public void a(WeakReference<View> weakReference, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af98027", new Object[]{this, weakReference, dXRuntimeContext});
        } else if (weakReference != null) {
            if (dXRuntimeContext != null && dXRuntimeContext.C() != null && dXRuntimeContext.C().l()) {
                dXRuntimeContext.C().b().v();
                View view = weakReference.get();
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
                return;
            }
            View view2 = weakReference.get();
            if (!(view2 instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view2).removeAllViews();
        }
    }
}

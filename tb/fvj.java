package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class fvj extends fvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(403733471);
    }

    @Override // tb.fvi
    public void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76d13b9", new Object[]{this, dXWidgetNode, dXWidgetNode2, dXRuntimeContext});
            return;
        }
        if (dXWidgetNode2 != null) {
            dXWidgetNode2.onDiff(dXWidgetNode);
        }
        boolean V = fqi.V();
        if (dXWidgetNode == dXWidgetNode2 || dXWidgetNode2 == null) {
            return;
        }
        if (dXWidgetNode == null) {
            if (!V) {
                dXRuntimeContext = dXWidgetNode2.getDXRuntimeContext();
            }
            a(dXRuntimeContext, dXWidgetNode2.getWRView());
            return;
        }
        int childrenCount = dXWidgetNode2.getChildrenCount();
        int childrenCount2 = dXWidgetNode.getChildrenCount();
        if (childrenCount == 0 && childrenCount2 == 0) {
            return;
        }
        if (childrenCount == 0 && childrenCount2 > 0) {
            return;
        }
        if (childrenCount > 0 && childrenCount2 == 0) {
            WeakReference<View> wRView = dXWidgetNode2.getWRView();
            if (!V) {
                dXRuntimeContext = dXWidgetNode2.getDXRuntimeContext();
            }
            a(wRView, dXRuntimeContext);
            return;
        }
        HashMap hashMap = new HashMap(childrenCount2);
        for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
            hashMap.put(Integer.valueOf(dXWidgetNode.getChildAt(i).getAutoId()), Integer.valueOf(i));
        }
        ArrayList arrayList = new ArrayList(childrenCount2);
        for (int i2 = 0; i2 < childrenCount2; i2++) {
            arrayList.add(-1);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < dXWidgetNode2.getChildrenCount(); i4++) {
            DXWidgetNode childAt = dXWidgetNode2.getChildAt(i4);
            int autoId = childAt.getAutoId();
            if (!hashMap.containsKey(Integer.valueOf(autoId))) {
                a(V ? dXRuntimeContext : childAt.getDXRuntimeContext(), childAt.getWRView());
            } else {
                arrayList.set(((Integer) hashMap.get(Integer.valueOf(autoId))).intValue(), Integer.valueOf(i3));
            }
            i3++;
        }
        for (int i5 = 0; i5 < childrenCount2; i5++) {
            int intValue = ((Integer) arrayList.get(i5)).intValue();
            DXWidgetNode childAt2 = dXWidgetNode.getChildAt(i5);
            if (intValue != -1) {
                DXWidgetNode childAt3 = dXWidgetNode2.getChildAt(intValue);
                if (childAt2 != null && childAt3.getClass() != childAt2.getClass()) {
                    a(V ? dXRuntimeContext : childAt3.getDXRuntimeContext(), childAt3.getWRView());
                } else {
                    childAt2.setWRView(childAt3.getWRView());
                    if (childAt2.getWRView() != null && childAt2.getWRView().get() != null) {
                        gbh.a(childAt2.getWRView().get(), (bi) childAt2);
                    }
                    if (childAt2.getChildrenCount() > 0 || childAt3.getChildrenCount() > 0) {
                        a(childAt2, childAt3, dXRuntimeContext);
                    } else {
                        childAt3.onDiff(childAt2);
                    }
                }
            }
        }
    }
}

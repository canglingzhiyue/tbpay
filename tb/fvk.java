package tb;

import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class fvk extends fvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(841290929);
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
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
            DXWidgetNode sourceWidget = dXWidgetNode.getChildAt(i).getSourceWidget();
            if (sourceWidget != null) {
                int autoId = sourceWidget.getAutoId();
                List list = (List) sparseArray.get(autoId);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i));
                    sparseArray.put(autoId, arrayList);
                } else {
                    list.add(Integer.valueOf(i));
                }
            } else if (fqi.Y()) {
                int sourceAutoId = dXWidgetNode.getChildAt(i).getSourceAutoId();
                List list2 = (List) sparseArray.get(sourceAutoId);
                if (list2 == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(i));
                    sparseArray.put(sourceAutoId, arrayList2);
                } else {
                    list2.add(Integer.valueOf(i));
                }
            }
        }
        int[] iArr = new int[childrenCount2];
        for (int i2 = 0; i2 < childrenCount2; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < dXWidgetNode2.getChildrenCount(); i3++) {
            DXWidgetNode childAt = dXWidgetNode2.getChildAt(i3);
            if (childAt.getSourceWidget() != null && sparseArray.size() != 0) {
                List list3 = (List) sparseArray.get(childAt.getSourceWidget().getAutoId());
                if (list3 == null || list3.isEmpty()) {
                    a(V ? dXRuntimeContext : childAt.getDXRuntimeContext(), childAt.getWRView());
                } else {
                    iArr[((Integer) list3.get(0)).intValue()] = i3;
                    list3.remove(0);
                }
            } else if (fqi.Y() && childAt.getSourceAutoId() >= 0 && sparseArray.size() != 0) {
                List list4 = (List) sparseArray.get(childAt.getSourceAutoId());
                if (list4 == null || list4.isEmpty()) {
                    a(V ? dXRuntimeContext : childAt.getDXRuntimeContext(), childAt.getWRView());
                } else {
                    iArr[((Integer) list4.get(0)).intValue()] = i3;
                    list4.remove(0);
                }
            } else {
                a(V ? dXRuntimeContext : childAt.getDXRuntimeContext(), childAt.getWRView());
            }
        }
        for (int i4 = 0; i4 < childrenCount2; i4++) {
            int i5 = iArr[i4];
            DXWidgetNode childAt2 = dXWidgetNode.getChildAt(i4);
            if (i5 != -1) {
                DXWidgetNode childAt3 = dXWidgetNode2.getChildAt(i5);
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

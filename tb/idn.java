package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.m;

/* loaded from: classes5.dex */
public class idn extends ifd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(649945122);
    }

    @Override // tb.ifd, com.taobao.android.dinamicx.widget.bq
    public void a(DXWidgetNode dXWidgetNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c7e67", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2)});
        } else if (dXWidgetNode instanceof m) {
            if (dXWidgetNode.getNativeView() != null) {
                dXWidgetNode.getNativeView().forceLayout();
                dXWidgetNode.getNativeView().measure(i, i2);
                return;
            }
            dXWidgetNode.measureWithButter(i, i2);
        } else {
            dXWidgetNode.measureWithButter(i, i2);
            dXWidgetNode.getNativeView().measure(View.MeasureSpec.makeMeasureSpec(dXWidgetNode.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(dXWidgetNode.getMeasuredHeight(), 1073741824));
        }
    }

    @Override // tb.ifd, com.taobao.android.dinamicx.widget.bq
    public void a(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed04e107", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (dXWidgetNode.getNativeView() != null) {
            dXWidgetNode.getNativeView().layout(i, i2, i3, i4);
        } else {
            dXWidgetNode.layoutWithButter(i, i2, i3, i4);
        }
    }
}

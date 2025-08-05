package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bq;

/* loaded from: classes5.dex */
public class ifd implements bq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1900483310);
        kge.a(964686142);
    }

    @Override // com.taobao.android.dinamicx.widget.bq
    public void a(DXWidgetNode dXWidgetNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c7e67", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2)});
        } else {
            dXWidgetNode.measureWithButter(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.bq
    public void a(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed04e107", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.layoutWithButter(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.bq
    public void a(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64337ed", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else {
            dXWidgetNode.beginParserWithButter(z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.bq
    public void b(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef978d2e", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else {
            dXWidgetNode.endParserWithButter(z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.bq
    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else {
            dXWidgetNode.beforeBindChildDataWithButter();
        }
    }
}

package com.taobao.weex.ui.flat.widget;

import android.graphics.Canvas;
import android.graphics.Point;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.flat.FlatGUIContext;
import com.taobao.weex.ui.view.border.BorderDrawable;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class WidgetGroup extends BaseWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<Widget> mChildren;

    static {
        kge.a(848061766);
    }

    public static /* synthetic */ Object ipc$super(WidgetGroup widgetGroup, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2080005066) {
            super.setLayout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), (Point) objArr[6]);
            return null;
        } else if (hashCode == -1609984421) {
            super.setContentBox(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode != -781235804) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.setBackgroundAndBorder((BorderDrawable) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.weex.ui.flat.widget.BaseWidget, com.taobao.weex.ui.flat.widget.Widget
    public /* bridge */ /* synthetic */ void setBackgroundAndBorder(BorderDrawable borderDrawable) {
        super.setBackgroundAndBorder(borderDrawable);
    }

    @Override // com.taobao.weex.ui.flat.widget.BaseWidget, com.taobao.weex.ui.flat.widget.Widget
    public /* bridge */ /* synthetic */ void setContentBox(int i, int i2, int i3, int i4) {
        super.setContentBox(i, i2, i3, i4);
    }

    @Override // com.taobao.weex.ui.flat.widget.BaseWidget, com.taobao.weex.ui.flat.widget.Widget
    public /* bridge */ /* synthetic */ void setLayout(int i, int i2, int i3, int i4, int i5, int i6, Point point) {
        super.setLayout(i, i2, i3, i4, i5, i6, point);
    }

    public WidgetGroup(FlatGUIContext flatGUIContext) {
        super(flatGUIContext);
        this.mChildren = new LinkedList();
    }

    public void replaceAll(List<Widget> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4ddd45", new Object[]{this, list});
            return;
        }
        this.mChildren = list;
        invalidate();
    }

    public List<Widget> getChildren() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this}) : this.mChildren;
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        for (Widget widget : this.mChildren) {
            widget.draw(canvas);
        }
    }
}

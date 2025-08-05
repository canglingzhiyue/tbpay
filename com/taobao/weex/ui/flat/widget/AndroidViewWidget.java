package com.taobao.weex.ui.flat.widget;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.ui.flat.FlatGUIContext;
import com.taobao.weex.ui.view.border.BorderDrawable;
import tb.kge;

/* loaded from: classes9.dex */
public class AndroidViewWidget extends BaseWidget implements Destroyable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mView;

    static {
        kge.a(-888191101);
        kge.a(-1927357621);
    }

    public static /* synthetic */ Object ipc$super(AndroidViewWidget androidViewWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2080005066) {
            super.setLayout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), (Point) objArr[6]);
            return null;
        } else if (hashCode == -781235804) {
            super.setBackgroundAndBorder((BorderDrawable) objArr[0]);
            return null;
        } else if (hashCode != 1621401666) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.invalidate();
            return null;
        }
    }

    @Override // com.taobao.weex.ui.flat.widget.BaseWidget, com.taobao.weex.ui.flat.widget.Widget
    public /* bridge */ /* synthetic */ void setBackgroundAndBorder(BorderDrawable borderDrawable) {
        super.setBackgroundAndBorder(borderDrawable);
    }

    @Override // com.taobao.weex.ui.flat.widget.BaseWidget, com.taobao.weex.ui.flat.widget.Widget
    public /* bridge */ /* synthetic */ void setLayout(int i, int i2, int i3, int i4, int i5, int i6, Point point) {
        super.setLayout(i, i2, i3, i4, i5, i6, point);
    }

    public AndroidViewWidget(FlatGUIContext flatGUIContext) {
        super(flatGUIContext);
    }

    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.mView = view;
        }
    }

    @Override // com.taobao.weex.ui.flat.widget.BaseWidget, com.taobao.weex.ui.flat.widget.Widget
    public void setContentBox(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a009965b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        view.setPadding(i, i2, i3, i4);
        invalidate();
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        view.draw(canvas);
    }

    @Override // com.taobao.weex.ui.flat.widget.BaseWidget
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        super.invalidate();
        View view = this.mView;
        if (view == null) {
            return;
        }
        view.invalidate();
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mView;
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mView == null) {
        } else {
            this.mView = null;
        }
    }
}

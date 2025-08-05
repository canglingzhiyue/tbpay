package com.taobao.android.dinamicx.widget.viewpager.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXTabItem extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View selectView;
    private boolean selected;
    private View tabView;
    private View unSelectView;

    static {
        kge.a(1226499213);
    }

    public DXTabItem(Context context) {
        this(context, null);
    }

    public DXTabItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXTabItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    }

    public View getSelectView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("57fb3380", new Object[]{this}) : this.selectView;
    }

    public void setSelectView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccc29c8", new Object[]{this, view});
        } else if (this.selectView == view) {
        } else {
            this.selectView = view;
            addView(view);
        }
    }

    public View getUnSelectView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("91699cb9", new Object[]{this}) : this.unSelectView;
    }

    public void setUnSelectView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae139aaf", new Object[]{this, view});
        } else if (this.unSelectView == view) {
        } else {
            this.unSelectView = view;
            addView(view);
        }
    }

    @Override // android.view.View
    public boolean isSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue() : this.selected;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            return;
        }
        this.selected = z;
        if (z) {
            View view = this.selectView;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            View view2 = this.unSelectView;
            if (view2 == null) {
                return;
            }
            view2.setAlpha(0.0f);
            return;
        }
        View view3 = this.selectView;
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        View view4 = this.unSelectView;
        if (view4 == null) {
            return;
        }
        view4.setAlpha(1.0f);
    }
}

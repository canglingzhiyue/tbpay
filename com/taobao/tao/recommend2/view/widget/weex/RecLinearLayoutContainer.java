package com.taobao.tao.recommend2.view.widget.weex;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.view.listview.WXRecyclerView;
import com.taobao.weex.ui.view.refresh.wrapper.BounceRecyclerView;
import tb.kge;

/* loaded from: classes8.dex */
public class RecLinearLayoutContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2127738218);
    }

    public static /* synthetic */ Object ipc$super(RecLinearLayoutContainer recLinearLayoutContainer, String str, Object... objArr) {
        if (str.hashCode() == 1907907562) {
            super.measureChildWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RecLinearLayoutContainer(Context context) {
        super(context);
        init(context);
    }

    public RecLinearLayoutContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public RecLinearLayoutContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            setOrientation(1);
        }
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b85bea", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (view instanceof BounceRecyclerView) {
            if (((WXRecyclerView) ((BounceRecyclerView) view).getInnerView()).getTranslationY() == 0.0f) {
                if (i3 == 0) {
                    int i5 = view.getLayoutParams().height;
                    int i6 = ((ViewGroup) view.getParent().getParent()).getLayoutParams().height;
                    i3 = i5 > 0 ? Math.min(i5, i6) : i6;
                }
                view.getLayoutParams().height = -2;
                i3 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
        } else if ((view instanceof FrameLayout) && (view.getLayoutParams() instanceof LinearLayout.LayoutParams) && ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin < 0) {
            ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = 0;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }
}

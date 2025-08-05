package com.taobao.search.sf.uikit;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class SearchInsetFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-932429257);
    }

    public static /* synthetic */ Object ipc$super(SearchInsetFrameLayout searchInsetFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SearchInsetFrameLayout(Context context) {
        this(context, null);
    }

    public SearchInsetFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SearchInsetFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPaddingTop();
    }

    public void setPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44b9f0d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() + SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int dimension;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height > 0) {
                dimension = layoutParams.height;
            } else {
                dimension = (int) getContext().getResources().getDimension(R.dimen.uik_immersive_action_bar_height);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                dimension += SystemBarDecorator.getStatusBarHeight(getContext());
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(dimension, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }
}

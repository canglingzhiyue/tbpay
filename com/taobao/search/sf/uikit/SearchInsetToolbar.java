package com.taobao.search.sf.uikit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class SearchInsetToolbar extends Toolbar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mRequirePaddingTop;

    static {
        kge.a(-914464069);
    }

    public static /* synthetic */ Object ipc$super(SearchInsetToolbar searchInsetToolbar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 765565787:
                super.setBackground((Drawable) objArr[0]);
                return null;
            case 1812230441:
                super.setBackgroundColor(((Number) objArr[0]).intValue());
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public SearchInsetToolbar(Context context) {
        this(context, null);
    }

    public SearchInsetToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SearchInsetToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRequirePaddingTop = true;
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

    private boolean isDarkMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue() : (getContext() instanceof f) && ((f) getContext()).g();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else if (isDarkMode()) {
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da19b5b", new Object[]{this, drawable});
        } else if (drawable != null && isDarkMode()) {
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
        } else if (drawable != null && isDarkMode()) {
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
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

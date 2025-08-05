package com.taobao.tbliveinteractive.container.h5;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class ScrollGuideBehavior extends CoordinatorLayout.Behavior<LinearLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(385565415);
    }

    public static /* synthetic */ Object ipc$super(ScrollGuideBehavior scrollGuideBehavior, String str, Object... objArr) {
        if (str.hashCode() == -1609929457) {
            return new Boolean(super.onDependentViewChanged((CoordinatorLayout) objArr[0], (CoordinatorLayout) objArr[1], (View) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ScrollGuideBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e193d9cd", new Object[]{this, coordinatorLayout, linearLayout, view})).booleanValue() : view.getId() == R.id.design_bottom_sheet;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ba1111a", new Object[]{this, coordinatorLayout, linearLayout, view})).booleanValue();
        }
        float y = view.getY();
        if (BottomSheetBehavior.b((FrameLayout) view).d() == 3) {
            a2 = com.taobao.taolive.sdk.utils.b.a(coordinatorLayout.getContext(), 22.0f);
        } else {
            a2 = com.taobao.taolive.sdk.utils.b.a(coordinatorLayout.getContext(), 7.0f);
        }
        linearLayout.setTranslationY((y - com.taobao.taolive.sdk.utils.b.a(coordinatorLayout.getContext(), 2.0f)) - a2);
        return super.onDependentViewChanged(coordinatorLayout, (CoordinatorLayout) linearLayout, view);
    }
}

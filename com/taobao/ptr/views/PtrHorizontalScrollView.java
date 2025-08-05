package com.taobao.ptr.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.h;
import tb.kge;

/* loaded from: classes7.dex */
public class PtrHorizontalScrollView extends HorizontalScrollView implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1722238353);
        kge.a(-1419130634);
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    public PtrHorizontalScrollView(Context context) {
        super(context);
    }

    public PtrHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PtrHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue() : getScrollX() == 0;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue() : getChildCount() > 0 && (childAt = getChildAt(0)) != null && getScrollX() >= childAt.getWidth() - getWidth();
    }
}

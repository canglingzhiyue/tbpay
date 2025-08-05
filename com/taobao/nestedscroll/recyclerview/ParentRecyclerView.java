package com.taobao.nestedscroll.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mya;
import tb.mye;

/* loaded from: classes7.dex */
public class ParentRecyclerView extends AbstractRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private mya mNestedScrollChild;

    public static /* synthetic */ Object ipc$super(ParentRecyclerView parentRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == 1276176143) {
            return new Boolean(super.isAccepted(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ParentRecyclerView(Context context) {
        super(context);
    }

    public ParentRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ParentRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // tb.myc
    public boolean onReachedEdge(int i, int i2) {
        float f;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2de49fb", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.mInterceptTouch = true;
        int scrollState = getScrollState();
        if (scrollState == 0 || scrollState == 1) {
            if (mye.a(this, this.mNestedScrollChild) && this.mNestedScrollChild.acceptNestedScroll(i)) {
                this.mInterceptTouch = false;
                this.mNestedScrollChild.dispatchNestedScroll(i);
                return true;
            }
        } else if (scrollState == 2) {
            if (!mye.a(this, this.mNestedScrollChild) || !this.mNestedScrollChild.acceptNestedFling(this.mVelocityY)) {
                z = false;
            } else {
                this.mInterceptTouch = false;
                float invokeCurrentVelocity = invokeCurrentVelocity();
                if (Math.abs(invokeCurrentVelocity) <= 2.0E-5f) {
                    invokeCurrentVelocity = this.mVelocityY;
                    f = 0.5f;
                } else {
                    f = 0.46f;
                }
                this.mNestedScrollChild.dispatchNestedFling((int) (invokeCurrentVelocity * f));
            }
            this.mVelocityY = 0;
            return z;
        }
        return false;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public void setNestedScrollChild(mya myaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dc7738", new Object[]{this, myaVar});
        } else {
            this.mNestedScrollChild = myaVar;
        }
    }

    public final mya getNestedScrollChild() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mya) ipChange.ipc$dispatch("3d7d1d28", new Object[]{this}) : this.mNestedScrollChild;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public boolean isAccepted(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10e70f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 0) {
            return super.isAccepted(i);
        }
        return true;
    }
}

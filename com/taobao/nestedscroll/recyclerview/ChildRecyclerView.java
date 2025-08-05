package com.taobao.nestedscroll.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.myb;
import tb.mye;

/* loaded from: classes7.dex */
public class ChildRecyclerView extends AbstractRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private myb mNestedScrollParent;

    public static /* synthetic */ Object ipc$super(ChildRecyclerView childRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == 1276176143) {
            return new Boolean(super.isAccepted(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ChildRecyclerView(Context context) {
        super(context);
    }

    public ChildRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChildRecyclerView(Context context, AttributeSet attributeSet, int i) {
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
            if (mye.a(this.mNestedScrollParent, this) && this.mNestedScrollParent.acceptNestedScroll(i)) {
                this.mInterceptTouch = false;
                this.mNestedScrollParent.dispatchNestedScroll(i);
                return true;
            }
        } else if (scrollState == 2) {
            if (!mye.a(this.mNestedScrollParent, this) || !this.mNestedScrollParent.acceptNestedFling(this.mVelocityY)) {
                z = false;
            } else {
                this.mInterceptTouch = false;
                float invokeCurrentVelocity = invokeCurrentVelocity();
                if (Math.abs(invokeCurrentVelocity) <= 2.0E-5f) {
                    invokeCurrentVelocity = this.mVelocityY;
                    f = 0.5f;
                } else {
                    f = 0.65f;
                }
                this.mNestedScrollParent.dispatchNestedFling((int) (invokeCurrentVelocity * f));
            }
            this.mVelocityY = 0;
            return z;
        }
        return false;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public void setNestedScrollParent(myb mybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6ee071", new Object[]{this, mybVar});
        } else {
            this.mNestedScrollParent = mybVar;
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.mya
    public void onScrolledByNestedParent(myb mybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fcc204", new Object[]{this, mybVar});
        } else {
            Log.e("Child", "onScrolledByNestedParent");
        }
    }

    public final myb getNestedScrollParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myb) ipChange.ipc$dispatch("db7289c5", new Object[]{this}) : this.mNestedScrollParent;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView
    public boolean isAccepted(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10e70f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i <= 0) {
            return super.isAccepted(i);
        }
        return true;
    }
}

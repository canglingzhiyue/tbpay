package com.lsjwzh.widget.recyclerviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class RecyclerViewPager extends RecyclerView {
    public static final boolean DEBUG = false;
    View mCurView;
    int mFirstTopWhenDragging;
    int mFisrtLeftWhenDragging;
    private float mFlingFactor;
    int mMaxLeftWhenDragging;
    int mMaxTopWhenDragging;
    int mMinLeftWhenDragging;
    int mMinTopWhenDragging;
    boolean mNeedAdjust;
    private List<a> mOnPageChangedListeners;
    private int mPositionBeforeScroll;
    private boolean mSinglePageFling;
    private int mSmoothScrollTargetPosition;
    private float mTouchSpan;
    private float mTriggerOffset;
    private c<?> mViewPagerAdapter;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, int i2);
    }

    public RecyclerViewPager(Context context) {
        this(context, null);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTriggerOffset = 0.25f;
        this.mFlingFactor = 0.15f;
        this.mSmoothScrollTargetPosition = -1;
        this.mPositionBeforeScroll = -1;
        this.mMaxLeftWhenDragging = Integer.MIN_VALUE;
        this.mMinLeftWhenDragging = Integer.MAX_VALUE;
        this.mMaxTopWhenDragging = Integer.MIN_VALUE;
        this.mMinTopWhenDragging = Integer.MAX_VALUE;
        initAttrs(context, attributeSet, i);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerViewPager, i, 0);
        this.mFlingFactor = obtainStyledAttributes.getFloat(R.styleable.RecyclerViewPager_flingFactor, 0.15f);
        this.mTriggerOffset = obtainStyledAttributes.getFloat(R.styleable.RecyclerViewPager_triggerOffset, 0.25f);
        this.mSinglePageFling = obtainStyledAttributes.getBoolean(R.styleable.RecyclerViewPager_singlePageFling, this.mSinglePageFling);
        obtainStyledAttributes.recycle();
    }

    private int safeTargetPosition(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    public void addOnPageChangedListener(a aVar) {
        if (this.mOnPageChangedListeners == null) {
            this.mOnPageChangedListeners = new ArrayList();
        }
        this.mOnPageChangedListeners.add(aVar);
    }

    protected void adjustPositionX(int i) {
        View a2;
        if (getChildCount() > 0) {
            int b = d.b(this);
            int width = (int) ((i * this.mFlingFactor) / ((getWidth() - getPaddingLeft()) - getPaddingRight()));
            if (this.mSinglePageFling) {
                width = Math.max(-1, Math.min(1, width));
            }
            int min = Math.min(Math.max(width + b, 0), getAdapter().getItemCount() - 1);
            if (min == b && (a2 = d.a(this)) != null) {
                float f = this.mTouchSpan;
                float f2 = this.mTriggerOffset;
                if (f > a2.getWidth() * f2 * f2 && min != 0) {
                    min--;
                } else if (this.mTouchSpan < a2.getWidth() * (-this.mTriggerOffset) && min != getAdapter().getItemCount() - 1) {
                    min++;
                }
            }
            smoothScrollToPosition(safeTargetPosition(min, getAdapter().getItemCount()));
        }
    }

    protected void adjustPositionY(int i) {
        View c;
        if (getChildCount() > 0) {
            int d = d.d(this);
            int min = Math.min(Math.max(((int) ((i * this.mFlingFactor) / ((getHeight() - getPaddingTop()) - getPaddingBottom()))) + d, 0), getAdapter().getItemCount() - 1);
            if (min == d && (c = d.c(this)) != null) {
                if (this.mTouchSpan > c.getHeight() * this.mTriggerOffset && min != 0) {
                    min--;
                } else if (this.mTouchSpan < c.getHeight() * (-this.mTriggerOffset) && min != getAdapter().getItemCount() - 1) {
                    min++;
                }
            }
            smoothScrollToPosition(safeTargetPosition(min, getAdapter().getItemCount()));
        }
    }

    public void clearOnPageChangedListeners() {
        List<a> list = this.mOnPageChangedListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        float f = this.mFlingFactor;
        boolean fling = super.fling((int) (i * f), (int) (i2 * f));
        if (fling) {
            if (getLayoutManager().canScrollHorizontally()) {
                adjustPositionX(i);
            } else {
                adjustPositionY(i2);
            }
        }
        return fling;
    }

    @Override // android.support.v7.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        c<?> cVar = this.mViewPagerAdapter;
        if (cVar != null) {
            return cVar.f7860a;
        }
        return null;
    }

    public int getCurrentPosition() {
        return getLayoutManager().canScrollHorizontally() ? d.b(this) : d.d(this);
    }

    public float getFlingFactor() {
        return this.mFlingFactor;
    }

    public float getTriggerOffset() {
        return this.mTriggerOffset;
    }

    public c getWrapperAdapter() {
        return this.mViewPagerAdapter;
    }

    public boolean isSinglePageFling() {
        return this.mSinglePageFling;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            Field declaredField = parcelable.getClass().getDeclaredField("mLayoutState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(parcelable);
            Field declaredField2 = obj.getClass().getDeclaredField("mAnchorOffset");
            Field declaredField3 = obj.getClass().getDeclaredField("mAnchorPosition");
            declaredField3.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.set(obj, declaredField2.getInt(obj) > 0 ? Integer.valueOf(declaredField3.getInt(obj) - 1) : Integer.valueOf(declaredField3.getInt(obj) + 1));
            declaredField2.setInt(obj, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (r4.mCurView.getLeft() <= r4.mMinLeftWhenDragging) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
        if (r4.mCurView.getTop() <= r4.mMinTopWhenDragging) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
        r5 = r5 + 1;
     */
    @Override // android.support.v7.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrollStateChanged(int r5) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager.onScrollStateChanged(int):void");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        if (motionEvent.getAction() == 2 && (view = this.mCurView) != null) {
            this.mMaxLeftWhenDragging = Math.max(view.getLeft(), this.mMaxLeftWhenDragging);
            this.mMaxTopWhenDragging = Math.max(this.mCurView.getTop(), this.mMaxTopWhenDragging);
            this.mMinLeftWhenDragging = Math.min(this.mCurView.getLeft(), this.mMinLeftWhenDragging);
            this.mMinTopWhenDragging = Math.min(this.mCurView.getTop(), this.mMinTopWhenDragging);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnPageChangedListener(a aVar) {
        List<a> list = this.mOnPageChangedListeners;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.mViewPagerAdapter = adapter instanceof c ? (c) adapter : new c<>(this, adapter);
        super.setAdapter(this.mViewPagerAdapter);
    }

    public void setFlingFactor(float f) {
        this.mFlingFactor = f;
    }

    public void setSinglePageFling(boolean z) {
        this.mSinglePageFling = z;
    }

    public void setTriggerOffset(float f) {
        this.mTriggerOffset = f;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        this.mSmoothScrollTargetPosition = i;
        super.smoothScrollToPosition(i);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        this.mViewPagerAdapter = adapter instanceof c ? (c) adapter : new c<>(this, adapter);
        super.swapAdapter(this.mViewPagerAdapter, z);
    }
}

package com.taobao.search.infoflow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import java.lang.reflect.Field;
import tb.kge;
import tb.mya;
import tb.myb;
import tb.myc;
import tb.mye;

/* loaded from: classes7.dex */
public class SearchChildRecyclerView extends PartnerRecyclerView implements mya, myb, myc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float EPSILON = 2.0E-5f;
    public int mDisabledDirection;
    public boolean mEatInterceptTouch;
    public boolean mEatTouchEvent;
    public boolean mInterceptTouch;
    public float mLastMotionX;
    public float mLastMotionY;
    private myb mNestedScrollParent;
    public int mVelocityY;

    static {
        kge.a(-686771815);
        kge.a(-2024128909);
        kge.a(1724015155);
        kge.a(1563288148);
    }

    public static /* synthetic */ Object ipc$super(SearchChildRecyclerView searchChildRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public int getNestedScrollChildHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43fe77e3", new Object[]{this})).intValue();
        }
        return 0;
    }

    public void setNestedScrollChild(mya myaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dc7738", new Object[]{this, myaVar});
        }
    }

    public SearchChildRecyclerView(Context context) {
        super(context);
        this.mInterceptTouch = true;
        this.mEatInterceptTouch = true;
        this.mEatTouchEvent = true;
    }

    public SearchChildRecyclerView(Context context, boolean z) {
        super(context, z);
        this.mInterceptTouch = true;
        this.mEatInterceptTouch = true;
        this.mEatTouchEvent = true;
    }

    public SearchChildRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInterceptTouch = true;
        this.mEatInterceptTouch = true;
        this.mEatTouchEvent = true;
    }

    public SearchChildRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInterceptTouch = true;
        this.mEatInterceptTouch = true;
        this.mEatTouchEvent = true;
    }

    private Field getFieldRecursively(String str) {
        Field declaredField;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("9037d6a9", new Object[]{this, str});
        }
        Class<?> cls = getClass();
        while (true) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return null;
            }
            try {
                declaredField = cls.getDeclaredField(str);
            } catch (Throwable unused) {
            }
            if (declaredField != null) {
                return declaredField;
            }
        }
    }

    public float invokeCurrentVelocity() {
        try {
            Field fieldRecursively = getFieldRecursively("mViewFlinger");
            if (fieldRecursively == null) {
                return 0.0f;
            }
            fieldRecursively.setAccessible(true);
            Object obj = fieldRecursively.get(this);
            Field declaredField = obj.getClass().getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Field declaredField2 = obj2.getClass().getDeclaredField("mScrollerY");
            declaredField2.setAccessible(true);
            Object obj3 = declaredField2.get(obj2);
            Field declaredField3 = obj3.getClass().getDeclaredField("mCurrVelocity");
            declaredField3.setAccessible(true);
            return ((Float) declaredField3.get(obj3)).floatValue();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        resetScroll();
    }

    public void resetScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407c1f83", new Object[]{this});
            return;
        }
        this.mInterceptTouch = true;
        this.mDisabledDirection = 0;
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView, android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        this.mVelocityY = i2;
        return fling;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView, com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.infoflow.SearchChildRecyclerView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            r1[r4] = r6
            java.lang.String r6 = "e7b587fe"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            int r0 = r6.getAction()
            if (r0 == 0) goto L65
            if (r0 == r4) goto L62
            if (r0 == r2) goto L2a
            r1 = 3
            if (r0 == r1) goto L62
            goto L76
        L2a:
            float r0 = r5.mLastMotionY
            float r1 = r6.getRawY()
            float r0 = r0 - r1
            float r1 = r5.mLastMotionX
            float r2 = r6.getRawX()
            float r1 = r1 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r6.getRawY()
            r5.mLastMotionY = r2
            float r2 = r6.getRawX()
            r5.mLastMotionX = r2
            r2 = 933741996(0x37a7c5ac, float:2.0E-5)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L76
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L76
            boolean r0 = r5.mInterceptTouch
            if (r0 != 0) goto L76
            int r0 = r5.mDisabledDirection
            if (r0 == 0) goto L76
            r5.mEatInterceptTouch = r3
            goto L76
        L62:
            r5.mEatInterceptTouch = r4
            goto L76
        L65:
            r5.resetScroll()
            r5.mEatInterceptTouch = r4
            float r0 = r6.getRawY()
            r5.mLastMotionY = r0
            float r0 = r6.getRawX()
            r5.mLastMotionX = r0
        L76:
            boolean r0 = r5.mEatInterceptTouch
            if (r0 != 0) goto L7b
            return r3
        L7b:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.infoflow.SearchChildRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView, com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.infoflow.SearchChildRecyclerView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r7
            r1[r4] = r8
            java.lang.String r8 = "a9b14c3a"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            int r0 = r8.getAction()
            if (r0 == 0) goto L88
            if (r0 == r4) goto L85
            if (r0 == r2) goto L2a
            r1 = 3
            if (r0 == r1) goto L85
            goto L96
        L2a:
            float r0 = r7.mLastMotionY
            float r1 = r8.getRawY()
            float r0 = r0 - r1
            float r1 = r7.mLastMotionX
            float r2 = r8.getRawX()
            float r1 = r1 - r2
            float r2 = java.lang.Math.abs(r0)
            float r5 = r8.getRawY()
            r7.mLastMotionY = r5
            float r5 = r8.getRawX()
            r7.mLastMotionX = r5
            r5 = 933741996(0x37a7c5ac, float:2.0E-5)
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L96
            float r1 = java.lang.Math.abs(r1)
            float r2 = r2 - r1
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 <= 0) goto L96
            boolean r1 = r7.mInterceptTouch
            if (r1 != 0) goto L79
            int r1 = r7.mDisabledDirection
            if (r1 == 0) goto L79
            boolean r2 = r7.mEatTouchEvent
            if (r2 == 0) goto L6d
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L6d
            r7.mEatTouchEvent = r3
        L6d:
            boolean r1 = r7.mEatTouchEvent
            if (r1 != 0) goto L96
            int r0 = java.lang.Math.round(r0)
            r7.onReachedEdge(r0, r3)
            goto L96
        L79:
            boolean r1 = r7.mEatTouchEvent
            if (r1 != 0) goto L96
            int r0 = java.lang.Math.round(r0)
            r7.dispatchNestedScroll(r0)
            goto L96
        L85:
            r7.mEatTouchEvent = r4
            goto L96
        L88:
            r7.mEatTouchEvent = r4
            float r0 = r8.getRawY()
            r7.mLastMotionY = r0
            float r0 = r8.getRawX()
            r7.mLastMotionX = r0
        L96:
            boolean r0 = r7.mEatTouchEvent
            if (r0 != 0) goto L9b
            return r4
        L9b:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.infoflow.SearchChildRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        myb nestedScrollParent = getNestedScrollParent();
        if (nestedScrollParent instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) nestedScrollParent;
            if (childPartlyAppearInParent(recyclerView)) {
                recyclerView.requestDisallowInterceptTouchEvent(false);
            } else {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private boolean childPartlyAppearInParent(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b41d11b9", new Object[]{this, recyclerView})).booleanValue();
        }
        int top = recyclerView.getTop();
        int bottom = recyclerView.getBottom();
        int top2 = getTop();
        getBottom();
        for (ViewParent parent = getParent(); (parent instanceof View) && parent != recyclerView; parent = parent.getParent()) {
            View view = (View) parent;
            top2 += view.getTop();
            view.getBottom();
        }
        return top2 > top && top2 < bottom;
    }

    public int getDisabledDirection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a05865a7", new Object[]{this})).intValue() : this.mDisabledDirection;
    }

    @Override // tb.mya, tb.myb
    public boolean acceptNestedScroll(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b04ce314", new Object[]{this, new Integer(i)})).booleanValue() : isAccepted(i);
    }

    @Override // tb.mya, tb.myb
    public boolean acceptNestedFling(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68770903", new Object[]{this, new Integer(i)})).booleanValue() : isAccepted(i);
    }

    @Override // tb.mya, tb.myb
    public boolean dispatchNestedScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ce1e5e2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!isAttachedToWindow()) {
            return false;
        }
        this.mInterceptTouch = true;
        scrollBy(0, i);
        return acceptNestedScroll(i);
    }

    @Override // tb.mya, tb.myb
    public boolean dispatchNestedFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daef7475", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!isAttachedToWindow()) {
            return false;
        }
        this.mInterceptTouch = true;
        fling(0, i);
        return acceptNestedFling(i);
    }

    @Override // tb.myc
    public void onDisabledDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562bc598", new Object[]{this, new Integer(i)});
        } else {
            this.mDisabledDirection = i;
        }
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

    public void setNestedScrollParent(myb mybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6ee071", new Object[]{this, mybVar});
        } else {
            this.mNestedScrollParent = mybVar;
        }
    }

    @Override // tb.mya
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

    public boolean isAccepted(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10e70f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 0) {
            return true;
        }
        return isAttachedToWindow() && ((i2 = this.mDisabledDirection) == 0 || i2 * i < 0);
    }
}

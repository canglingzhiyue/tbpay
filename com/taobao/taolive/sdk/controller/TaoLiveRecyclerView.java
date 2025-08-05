package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.d;
import com.taobao.taolive.sdk.utils.i;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoLiveRecyclerView extends RecyclerView implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_FLING = 1000;
    private static final String TAG = "TaoLiveRecyclerView";
    private e globalContext;
    public com.taobao.taolive.sdk.utils.d mClickUtil;
    public int mMaxFling;
    public i mMoveUtil;
    public List<Class<?>> mNestedChilds;
    private boolean mParentIsScroll;
    public SnapHelper mSnapHelper;
    private final PointF mTouchDownPointF;

    static {
        kge.a(1080961096);
        kge.a(-2000658237);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveRecyclerView taoLiveRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 640003410:
                super.requestChildFocus((View) objArr[0], (View) objArr[1]);
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2114251219:
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        }
    }

    public TaoLiveRecyclerView(Context context) {
        super(context);
        this.mParentIsScroll = false;
        this.mMaxFling = 1000;
        this.mTouchDownPointF = new PointF();
    }

    public TaoLiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mParentIsScroll = false;
        this.mMaxFling = 1000;
        this.mTouchDownPointF = new PointF();
    }

    public TaoLiveRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mParentIsScroll = false;
        this.mMaxFling = 1000;
        this.mTouchDownPointF = new PointF();
    }

    public void setSnapHelper(SnapHelper snapHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7b5f7b", new Object[]{this, snapHelper});
        } else {
            this.mSnapHelper = snapHelper;
        }
    }

    public void setOnMoveListener(i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1406b1d", new Object[]{this, aVar});
        } else {
            this.mMoveUtil = new i(aVar);
        }
    }

    public void setOnClearClickListener(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e26fd2c", new Object[]{this, aVar});
        } else {
            this.mClickUtil = new com.taobao.taolive.sdk.utils.d(getContext(), aVar);
        }
    }

    public void setOnClearClickListener(d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e27718b", new Object[]{this, bVar});
        } else {
            this.mClickUtil = new com.taobao.taolive.sdk.utils.d(getContext(), bVar);
        }
    }

    public void setNestedScrollChilds(List<Class<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a90595", new Object[]{this, list});
        } else {
            this.mNestedChilds = list;
        }
    }

    public void setMaxFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51ea2c2", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxFling = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            ac.a("KLifecycle_click_down");
            ac.a();
            e eVar = this.globalContext;
            if (eVar != null) {
                eVar.E().put("kLiveRoomEnterClickTs", String.valueOf(System.currentTimeMillis()));
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r1 != 3) goto L15;
     */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r6
            r1[r3] = r7
            java.lang.String r7 = "e7b587fe"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            int r0 = com.taobao.taobao.R.id.tag_kill_up_down
            java.lang.Object r0 = r6.getTag(r0)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            int r1 = r7.getAction()
            if (r1 == 0) goto L6d
            if (r1 == r3) goto L65
            if (r1 == r2) goto L35
            r0 = 3
            if (r1 == r0) goto L65
            goto L86
        L35:
            float r1 = r7.getX()
            android.graphics.PointF r2 = r6.mTouchDownPointF
            float r2 = r2.x
            float r1 = r1 - r2
            int r1 = (int) r1
            float r2 = r7.getY()
            android.graphics.PointF r5 = r6.mTouchDownPointF
            float r5 = r5.y
            float r2 = r2 - r5
            int r2 = (int) r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = java.lang.Math.abs(r2)
            if (r1 <= r2) goto L5b
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r4)
            return r4
        L5b:
            if (r0 == 0) goto L86
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L86
        L65:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L86
        L6d:
            android.graphics.PointF r1 = r6.mTouchDownPointF
            float r2 = r7.getX()
            r1.x = r2
            android.graphics.PointF r1 = r6.mTouchDownPointF
            float r2 = r7.getY()
            r1.y = r2
            if (r0 == 0) goto L86
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L86:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            r1[r4] = r6
            java.lang.String r6 = "a9b14c3a"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            int r0 = r6.getAction()
            if (r0 == 0) goto L59
            if (r0 == r4) goto L3a
            if (r0 == r3) goto L2a
            r1 = 3
            if (r0 == r1) goto L3a
            goto L77
        L2a:
            com.taobao.taolive.sdk.utils.i r0 = r5.mMoveUtil
            if (r0 == 0) goto L77
            float r1 = r6.getX()
            float r3 = r6.getY()
            r0.b(r1, r3)
            goto L77
        L3a:
            com.taobao.taolive.sdk.utils.i r0 = r5.mMoveUtil
            if (r0 == 0) goto L49
            float r1 = r6.getX()
            float r3 = r6.getY()
            r0.c(r1, r3)
        L49:
            com.taobao.taolive.sdk.utils.d r0 = r5.mClickUtil
            if (r0 == 0) goto L77
            float r1 = r6.getX()
            float r3 = r6.getY()
            r0.b(r1, r3)
            goto L77
        L59:
            com.taobao.taolive.sdk.utils.i r0 = r5.mMoveUtil
            if (r0 == 0) goto L68
            float r1 = r6.getX()
            float r3 = r6.getY()
            r0.a(r1, r3)
        L68:
            com.taobao.taolive.sdk.utils.d r0 = r5.mClickUtil
            if (r0 == 0) goto L77
            float r1 = r6.getX()
            float r3 = r6.getY()
            r0.a(r1, r3)
        L77:
            boolean r6 = super.onTouchEvent(r6)     // Catch: java.lang.Exception -> L7c
            return r6
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.controller.TaoLiveRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.mMaxFling;
        if (i3 > 0 && i2 > i3) {
            return super.fling(i, i3);
        }
        int i4 = this.mMaxFling;
        if (i4 > 0 && i2 < (-i4)) {
            return super.fling(i, -i4);
        }
        return super.fling(i, i2);
    }

    private boolean hasSnapTarget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f42ba640", new Object[]{this})).booleanValue() : getScrollState() == 2 || getLayoutManager().isSmoothScrolling();
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (hasSnapTarget()) {
            return false;
        }
        List<Class<?>> list = this.mNestedChilds;
        if (list != null) {
            for (Class<?> cls : list) {
                if (cls.isInstance(view2)) {
                    return true;
                }
            }
        }
        return view2 instanceof d;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        SnapHelper snapHelper;
        View findSnapView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.mParentIsScroll = false;
        if (hasSnapTarget() || (snapHelper = this.mSnapHelper) == null || (findSnapView = snapHelper.findSnapView(getLayoutManager())) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = snapHelper.calculateDistanceToFinalSnap(getLayoutManager(), findSnapView);
        int i2 = calculateDistanceToFinalSnap[0];
        int i3 = calculateDistanceToFinalSnap[1];
        if (Math.abs(i3) <= 0) {
            return;
        }
        smoothScrollBy(i2, i3);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (hasSnapTarget() || i5 != 0 || Math.abs(i4) <= 0) {
        } else {
            String str = "onNestedScroll, 消费NestedScrollingChild 处理不了的dyUnconsumed " + i4;
            scrollBy(i3, i4);
            this.mParentIsScroll = true;
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (!this.mParentIsScroll) {
        } else {
            scrollBy(i, i2);
            iArr[1] = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        if (!hasSnapTarget() && this.mParentIsScroll) {
            fling((int) f, (int) f2);
            this.mParentIsScroll = false;
            return true;
        }
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        } else if (getScrollState() == 2 || getLayoutManager().isSmoothScrolling()) {
        } else {
            super.requestChildFocus(view, view2);
        }
    }

    public void setGlobalContext(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55d7d35", new Object[]{this, eVar});
        } else {
            this.globalContext = eVar;
        }
    }
}

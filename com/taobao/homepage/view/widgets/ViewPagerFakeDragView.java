package com.taobao.homepage.view.widgets;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class ViewPagerFakeDragView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ViewPagerFakeDragView";
    private static boolean lastIsTouchFakeDragView;
    private boolean enableFakeDrag;
    private float lastDownX;
    private float lastTouchX;
    private boolean shouldDispatch;
    private ViewConfiguration viewConfiguration;
    private a viewGetter;

    /* loaded from: classes7.dex */
    public interface a {
        ViewPager a();

        ArrayList<View> b();
    }

    public static /* synthetic */ Object ipc$super(ViewPagerFakeDragView viewPagerFakeDragView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(1994547184);
        lastIsTouchFakeDragView = false;
    }

    public ViewPagerFakeDragView(Context context) {
        this(context, null);
    }

    public ViewPagerFakeDragView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerFakeDragView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastDownX = 0.0f;
        this.lastTouchX = 0.0f;
        this.shouldDispatch = true;
        setEnabled(false);
        setFocusable(false);
        setClickable(false);
        this.viewConfiguration = ViewConfiguration.get(context);
        this.enableFakeDrag = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r1 != 3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.homepage.view.widgets.ViewPagerFakeDragView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r7
            r1[r4] = r8
            java.lang.String r8 = "7bb68bd5"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            com.taobao.homepage.view.widgets.ViewPagerFakeDragView$a r0 = r7.viewGetter
            if (r0 == 0) goto Lef
            android.support.v4.view.ViewPager r0 = r0.a()
            if (r0 == 0) goto Lef
            boolean r0 = r7.enableFakeDrag
            if (r0 != 0) goto L2c
            goto Lef
        L2c:
            setLastIsTouchFakeDragView(r4)
            com.taobao.homepage.view.widgets.ViewPagerFakeDragView$a r0 = r7.viewGetter
            android.support.v4.view.ViewPager r0 = r0.a()
            int r1 = r8.getAction()
            java.lang.String r5 = "ViewPagerFakeDragView"
            if (r1 == 0) goto L67
            if (r1 == r4) goto L46
            if (r1 == r3) goto L7a
            r2 = 3
            if (r1 == r2) goto L46
            goto Lbc
        L46:
            java.lang.String r1 = "dispatchTouchEvent up"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.taobao.android.home.component.utils.e.c(r5, r1)
            boolean r1 = r0.isFakeDragging()
            if (r1 == 0) goto L61
            java.lang.String r1 = "endFakeDrag"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.taobao.android.home.component.utils.e.c(r5, r1)
            r0.endFakeDrag()
        L61:
            r0 = 0
            r7.lastTouchX = r0
            r7.lastDownX = r0
            goto Lbc
        L67:
            java.lang.String r1 = "dispatchTouchEvent down"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.taobao.android.home.component.utils.e.c(r5, r1)
            r7.shouldDispatch = r4
            float r1 = r8.getX()
            r7.lastTouchX = r1
            r7.lastDownX = r1
        L7a:
            float r1 = r8.getX()
            float r3 = r7.lastDownX
            float r3 = r3 - r1
            float r3 = java.lang.Math.abs(r3)
            int r3 = (int) r3
            android.view.ViewConfiguration r6 = r7.viewConfiguration
            int r6 = r6.getScaledTouchSlop()
            if (r3 <= r6) goto L9d
            boolean r3 = r7.shouldDispatch
            if (r3 == 0) goto L9d
            java.lang.String r3 = "dispatchTouchEvent shouldDispatch make false"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            com.taobao.android.home.component.utils.e.c(r5, r3)
            r7.shouldDispatch = r2
        L9d:
            boolean r2 = r7.shouldDispatch
            if (r2 != 0) goto Lba
            boolean r2 = r0.isFakeDragging()
            if (r2 != 0) goto Lb3
            java.lang.String r2 = "beginFakeDrag"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.taobao.android.home.component.utils.e.c(r5, r2)
            r0.beginFakeDrag()
        Lb3:
            float r2 = r7.lastTouchX
            float r2 = r1 - r2
            r0.fakeDragBy(r2)
        Lba:
            r7.lastTouchX = r1
        Lbc:
            boolean r0 = r7.shouldDispatch
            if (r0 == 0) goto Lea
            java.lang.String r0 = "dispatch event to views"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.taobao.android.home.component.utils.e.c(r5, r0)
            com.taobao.homepage.view.widgets.ViewPagerFakeDragView$a r0 = r7.viewGetter
            java.util.ArrayList r0 = r0.b()
            if (r0 == 0) goto Lea
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lea
            int r1 = r0.size()
            int r1 = r1 - r4
        Ldc:
            if (r1 <= 0) goto Lea
            java.lang.Object r2 = r0.get(r1)
            android.view.View r2 = (android.view.View) r2
            r2.dispatchTouchEvent(r8)
            int r1 = r1 + (-1)
            goto Ldc
        Lea:
            boolean r8 = super.dispatchTouchEvent(r8)
            return r8
        Lef:
            boolean r8 = super.onInterceptTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.view.widgets.ViewPagerFakeDragView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }

    public boolean isEnableFakeDrag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b4aee21", new Object[]{this})).booleanValue() : this.enableFakeDrag;
    }

    public void setEnableFakeDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51645e1f", new Object[]{this, new Boolean(z)});
        } else {
            this.enableFakeDrag = z;
        }
    }

    public a getViewGetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("de49590b", new Object[]{this}) : this.viewGetter;
    }

    public void setViewGetter(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f429747b", new Object[]{this, aVar});
        } else {
            this.viewGetter = aVar;
        }
    }

    public static void setLastIsTouchFakeDragView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221fbe02", new Object[]{new Boolean(z)});
        } else {
            lastIsTouchFakeDragView = z;
        }
    }

    public static boolean isLastIsTouchFakeDragView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7039494e", new Object[0])).booleanValue() : lastIsTouchFakeDragView;
    }
}

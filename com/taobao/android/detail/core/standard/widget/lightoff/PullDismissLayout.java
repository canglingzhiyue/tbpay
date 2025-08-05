package com.taobao.android.detail.core.standard.widget.lightoff;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import tb.kge;

/* loaded from: classes4.dex */
public class PullDismissLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean animateAlpha;
    private boolean animateScale;
    private ViewDragHelper dragHelper;
    private float horizonTouchSlop;
    private boolean isAllowPull;
    private a listener;
    private float minFlingVelocity;
    public View targetView;
    private float verticalTouchSlop;

    /* loaded from: classes4.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(307848358);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public void a(float f, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            }
        }

        public void a(float f, View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("249dcb5a", new Object[]{this, new Float(f), view, new Integer(i), new Integer(i2)});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        kge.a(311712023);
    }

    public static /* synthetic */ Object ipc$super(PullDismissLayout pullDismissLayout, String str, Object... objArr) {
        if (str.hashCode() == -894236565) {
            super.computeScroll();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ a access$100(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b33428ef", new Object[]{pullDismissLayout}) : pullDismissLayout.listener;
    }

    public static /* synthetic */ boolean access$200(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6faef075", new Object[]{pullDismissLayout})).booleanValue() : pullDismissLayout.animateAlpha;
    }

    public static /* synthetic */ boolean access$300(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e605a94", new Object[]{pullDismissLayout})).booleanValue() : pullDismissLayout.animateScale;
    }

    public static /* synthetic */ float access$400(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd11c49f", new Object[]{pullDismissLayout})).floatValue() : pullDismissLayout.minFlingVelocity;
    }

    public static /* synthetic */ ViewDragHelper access$500(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewDragHelper) ipChange.ipc$dispatch("211ca736", new Object[]{pullDismissLayout}) : pullDismissLayout.dragHelper;
    }

    public PullDismissLayout(Context context) {
        super(context);
        init(context);
    }

    public PullDismissLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public PullDismissLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public PullDismissLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.minFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.dragHelper = ViewDragHelper.create(this, new b());
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        ViewDragHelper viewDragHelper = this.dragHelper;
        if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != 3) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[RETURN] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            r1[r4] = r7
            java.lang.String r7 = "e7b587fe"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            int r0 = android.support.v4.view.MotionEventCompat.getActionMasked(r7)
            if (r0 == 0) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r2) goto L46
            r1 = 3
            if (r0 == r1) goto L2a
            goto L7a
        L2a:
            r0 = 0
            r6.verticalTouchSlop = r0
            r6.horizonTouchSlop = r0
            goto L7a
        L30:
            float r0 = r7.getY()
            r6.verticalTouchSlop = r0
            float r0 = r7.getX()
            r6.horizonTouchSlop = r0
            com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout$a r0 = r6.listener
            if (r0 == 0) goto L46
            boolean r0 = r0.c()
            r6.isAllowPull = r0
        L46:
            float r0 = r7.getY()
            float r1 = r6.verticalTouchSlop
            float r0 = r0 - r1
            float r1 = r7.getX()
            float r5 = r6.horizonTouchSlop
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            android.support.v4.widget.ViewDragHelper r5 = r6.dragHelper
            int r5 = r5.getTouchSlop()
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L7a
            float r0 = java.lang.Math.abs(r0)
            android.support.v4.widget.ViewDragHelper r1 = r6.dragHelper
            int r1 = r1.getTouchSlop()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7a
            int r0 = android.support.v4.view.MotionEventCompat.getPointerCount(r7)
            if (r0 != r4) goto L7a
            r0 = 1
            goto L7b
        L7a:
            r0 = 0
        L7b:
            android.view.View r1 = r6.getTargetView()
            boolean r5 = r6.isAllowPull
            if (r5 == 0) goto Lb5
            if (r1 == 0) goto Lb5
            android.support.v4.widget.ViewDragHelper r5 = r6.dragHelper
            boolean r5 = r5.shouldInterceptTouchEvent(r7)
            if (r5 != 0) goto Lb5
            if (r0 == 0) goto Lb5
            android.support.v4.widget.ViewDragHelper r0 = r6.dragHelper
            int r0 = r0.getViewDragState()
            if (r0 != 0) goto Lb5
            android.support.v4.widget.ViewDragHelper r0 = r6.dragHelper
            boolean r0 = r0.checkTouchSlop(r2)
            if (r0 == 0) goto Lb5
            com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout$a r0 = r6.listener
            if (r0 == 0) goto Lb5
            android.support.v4.widget.ViewDragHelper r0 = r6.dragHelper
            int r7 = r7.getPointerId(r3)
            r0.captureChildView(r1, r7)
            android.support.v4.widget.ViewDragHelper r7 = r6.dragHelper
            int r7 = r7.getViewDragState()
            if (r7 != r4) goto Lb5
            return r4
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setTargetView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50b813", new Object[]{this, view});
        } else {
            this.targetView = view;
        }
    }

    public View getTargetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4d62fd5", new Object[]{this});
        }
        if (this.targetView == null) {
            this.targetView = getChildAt(0);
        }
        return this.targetView;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
        } catch (Exception e) {
            String a2 = i.a("PullDismissLayout", BTags.XLightOff);
            com.taobao.android.detail.core.utils.i.a(a2, "draging excepiton:" + e);
        }
        if ((this.listener != null && !this.isAllowPull) || MotionEventCompat.getPointerCount(motionEvent) > 1) {
            return false;
        }
        this.dragHelper.processTouchEvent(motionEvent);
        return this.dragHelper.getCapturedView() != null;
    }

    public void setMinFlingVelocity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3042810", new Object[]{this, new Float(f)});
        } else {
            this.minFlingVelocity = f;
        }
    }

    public void setAnimateScale(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335031a2", new Object[]{this, new Boolean(z)});
        } else {
            this.animateScale = z;
        }
    }

    public void setAnimateAlpha(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7853760e", new Object[]{this, new Boolean(z)});
        } else {
            this.animateAlpha = z;
        }
    }

    public void setListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d522f010", new Object[]{this, aVar});
        } else {
            this.listener = aVar;
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends ViewDragHelper.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private PullDismissLayout f9895a;
        private int b;
        private int c;
        private int d;
        private int e;
        private float f;
        private View g;
        private boolean h;
        private boolean i;

        static {
            kge.a(-940994325);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1788946750) {
                return new Integer(super.getOrderedChildIndex(((Number) objArr[0]).intValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
        }

        private b(PullDismissLayout pullDismissLayout) {
            this.i = false;
            this.f9895a = pullDismissLayout;
            this.f = 0.0f;
            this.h = false;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue() : this.g == null;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
                return;
            }
            this.g = view;
            this.b = view.getTop();
            this.c = view.getLeft();
            this.f = 0.0f;
            this.d = 0;
            this.e = 0;
            this.h = false;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            PullDismissLayout pullDismissLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            int height = this.f9895a.getHeight();
            this.e = i2 - this.b;
            this.d = i - this.c;
            if (height > 0) {
                this.f = Math.abs(this.e) / height;
            }
            if (!this.i && (pullDismissLayout = this.f9895a) != null && PullDismissLayout.access$100(pullDismissLayout) != null && PullDismissLayout.access$100(this.f9895a).c()) {
                this.i = true;
                PullDismissLayout.access$100(this.f9895a).a();
            }
            if (PullDismissLayout.access$200(this.f9895a) && PullDismissLayout.access$300(this.f9895a)) {
                view.setAlpha(1.0f - this.f);
                view.setScaleX(1.0f - this.f);
                view.setScaleY(1.0f - this.f);
                this.f9895a.invalidate();
            } else if (PullDismissLayout.access$200(this.f9895a) && !PullDismissLayout.access$300(this.f9895a)) {
                view.setAlpha(1.0f - this.f);
                this.f9895a.invalidate();
            } else if (!PullDismissLayout.access$200(this.f9895a) && PullDismissLayout.access$300(this.f9895a)) {
                view.setScaleX(1.0f - this.f);
                view.setScaleY(1.0f - this.f);
                this.f9895a.invalidate();
            } else {
                this.f9895a.invalidate();
            }
            if (PullDismissLayout.access$100(this.f9895a) == null) {
                return;
            }
            PullDismissLayout.access$100(this.f9895a).a(this.f, this.d, this.e);
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            } else if (this.g == null || i != 0 || PullDismissLayout.access$100(this.f9895a) == null) {
            } else {
                if (this.h) {
                    PullDismissLayout.access$100(this.f9895a).a(this.f, this.g, this.d, this.e);
                    return;
                }
                PullDismissLayout.access$100(this.f9895a).b();
                this.g = null;
                this.i = false;
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            if (this.f < 0.5f && (Math.abs(f2) <= PullDismissLayout.access$400(this.f9895a) || this.f <= 0.15f)) {
                z = false;
            }
            this.h = z;
            int height = this.h ? this.f9895a.getHeight() : this.b;
            if (this.h) {
                onViewDragStateChanged(0);
                return;
            }
            PullDismissLayout.access$500(this.f9895a).settleCapturedViewAt(0, height);
            this.f9895a.invalidate();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int getOrderedChildIndex(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("955ed6c2", new Object[]{this, new Integer(i)})).intValue() : (this.f9895a.getTargetView() == null || !this.f9895a.getTargetView().equals(this.f9895a.getChildAt(i))) ? super.getOrderedChildIndex(i) : i;
        }
    }
}

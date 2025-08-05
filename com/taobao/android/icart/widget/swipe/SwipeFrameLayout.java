package com.taobao.android.icart.widget.swipe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import tb.kge;

/* loaded from: classes5.dex */
public class SwipeFrameLayout extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SCROLL_THETA_THRESHOLD = 15;
    private boolean interceptUpEvent;
    private boolean isMoveRight;
    private boolean isShowSwipe;
    private boolean isStartPanMove;
    private boolean isSwipeShow;
    private final Runnable mCloseSwipeRunnable;
    private final RecyclerView.OnItemTouchListener mItemTouchListener;
    private float mLastMoveX;
    private View.OnLongClickListener mLongClick;
    private b mLongClickHelper;
    private ObjectAnimator mObjectAnimator;
    private float mRawDownX;
    private float mRawDownY;
    private final int mScaleTouchSlop;
    private c mSwipeListener;
    private VelocityTracker mVelocityTracker;
    private int maxSwipeWidth;

    static {
        kge.a(1150977444);
    }

    public static /* synthetic */ Object ipc$super(SwipeFrameLayout swipeFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$000(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e57b2406", new Object[]{swipeFrameLayout})).booleanValue() : swipeFrameLayout.isSwipeDisable();
    }

    public static /* synthetic */ c access$100(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("21fabdd8", new Object[]{swipeFrameLayout}) : swipeFrameLayout.mSwipeListener;
    }

    public static /* synthetic */ boolean access$200(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc9a2c88", new Object[]{swipeFrameLayout})).booleanValue() : swipeFrameLayout.isShowSwipe;
    }

    public static /* synthetic */ boolean access$202(SwipeFrameLayout swipeFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef28f612", new Object[]{swipeFrameLayout, new Boolean(z)})).booleanValue();
        }
        swipeFrameLayout.isShowSwipe = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(SwipeFrameLayout swipeFrameLayout, Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f04554d", new Object[]{swipeFrameLayout, rect, motionEvent})).booleanValue() : swipeFrameLayout.isOutsideSwipeRect(rect, motionEvent);
    }

    public static /* synthetic */ boolean access$400(SwipeFrameLayout swipeFrameLayout, Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d107f2c", new Object[]{swipeFrameLayout, rect, motionEvent})).booleanValue() : swipeFrameLayout.isInsideItemRect(rect, motionEvent);
    }

    public static /* synthetic */ void access$500(SwipeFrameLayout swipeFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ced759", new Object[]{swipeFrameLayout, new Float(f)});
        } else {
            swipeFrameLayout.onPanMoveWithAnimation(f);
        }
    }

    public static /* synthetic */ View.OnLongClickListener access$600(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("2e6cff8d", new Object[]{swipeFrameLayout}) : swipeFrameLayout.mLongClick;
    }

    public SwipeFrameLayout(Context context) {
        super(context);
        this.mItemTouchListener = new RecyclerView.OnItemTouchListener() { // from class: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f12903a = false;
            public boolean b = false;
            public float c = 0.0f;

            @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
            public void onRequestDisallowInterceptTouchEvent(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c1dcb2bb", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("62dd1ae4", new Object[]{this, recyclerView, motionEvent});
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
                if (com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$300(r6, com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r6).a(), r7) != false) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
            @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView r6, android.view.MotionEvent r7) {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L1f
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r4] = r5
                    r1[r3] = r6
                    r1[r2] = r7
                    java.lang.String r6 = "e16b42ac"
                    java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    return r6
                L1f:
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    boolean r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$000(r6)
                    if (r6 != 0) goto Ld4
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    com.taobao.android.icart.widget.swipe.c r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r6)
                    if (r6 != 0) goto L31
                    goto Ld4
                L31:
                    int r6 = r7.getAction()
                    if (r6 != 0) goto L87
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    boolean r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$200(r6)
                    if (r6 == 0) goto L51
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    com.taobao.android.icart.widget.swipe.c r0 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r6)
                    android.graphics.Rect r0 = r0.a()
                    boolean r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$300(r6, r0, r7)
                    if (r6 == 0) goto L51
                    r6 = 1
                    goto L52
                L51:
                    r6 = 0
                L52:
                    r5.f12903a = r6
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    boolean r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$200(r6)
                    if (r6 == 0) goto L7d
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    com.taobao.android.icart.widget.swipe.c r0 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r6)
                    android.graphics.Rect r0 = r0.a()
                    boolean r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$400(r6, r0, r7)
                    if (r6 == 0) goto L7d
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    com.taobao.android.icart.widget.swipe.c r0 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r6)
                    android.graphics.Rect r0 = r0.a()
                    boolean r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$300(r6, r0, r7)
                    if (r6 == 0) goto L7d
                    goto L7e
                L7d:
                    r3 = 0
                L7e:
                    r5.b = r3
                    float r6 = r7.getY()
                    r5.c = r6
                    goto Lbf
                L87:
                    int r6 = r7.getAction()
                    if (r6 != r2) goto Lbf
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    com.taobao.android.icart.widget.swipe.c r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r6)
                    boolean r6 = r6.c()
                    if (r6 != 0) goto Lbd
                    boolean r6 = r5.b
                    if (r6 == 0) goto Lbc
                    float r6 = r5.c
                    float r7 = r7.getRawY()
                    float r6 = r6 - r7
                    float r6 = java.lang.Math.abs(r6)
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    android.content.Context r7 = r7.getContext()
                    android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
                    int r7 = r7.getScaledTouchSlop()
                    float r7 = (float) r7
                    int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                    if (r6 <= 0) goto Lbc
                    goto Lbd
                Lbc:
                    r3 = 0
                Lbd:
                    r5.f12903a = r3
                Lbf:
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    boolean r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$200(r6)
                    if (r6 == 0) goto Ld1
                    boolean r6 = r5.f12903a
                    if (r6 == 0) goto Ld1
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout r6 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                    r7 = 0
                    com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$500(r6, r7)
                Ld1:
                    boolean r6 = r5.f12903a
                    return r6
                Ld4:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.AnonymousClass1.onInterceptTouchEvent(android.support.v7.widget.RecyclerView, android.view.MotionEvent):boolean");
            }
        };
        this.mCloseSwipeRunnable = new Runnable() { // from class: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SwipeFrameLayout.access$500(SwipeFrameLayout.this, 0.0f);
                }
            }
        };
        this.mScaleTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mLongClickHelper = new b(this);
    }

    public void setSwipeShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc26d138", new Object[]{this, new Boolean(z)});
        } else {
            this.isSwipeShow = z;
        }
    }

    public void setOnLongClick(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ae8983", new Object[]{this, onLongClickListener});
        } else {
            this.mLongClick = onLongClickListener;
        }
    }

    public void setMaxSwipeWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb1da2e", new Object[]{this, new Integer(i)});
        } else {
            this.maxSwipeWidth = i;
        }
    }

    public int getMaxSwipeWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7da97af4", new Object[]{this})).intValue() : this.maxSwipeWidth;
    }

    public void setSwipeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8fd232", new Object[]{this, cVar});
        } else {
            this.mSwipeListener = cVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        addOnItemTouchListener();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isShowSwipe = false;
        ObjectAnimator objectAnimator = this.mObjectAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            setTranslationX(0.0f);
        }
        removeOnItemTouchListener();
        removeCallbacks(this.mCloseSwipeRunnable);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isSwipeDisable()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 2) || !this.interceptUpEvent) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r0 != 3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    private void resetLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78f95e4", new Object[]{this});
        } else {
            this.mLongClickHelper.a(new View.OnLongClickListener() { // from class: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    if (SwipeFrameLayout.access$600(SwipeFrameLayout.this) != null) {
                        SwipeFrameLayout.access$600(SwipeFrameLayout.this).onLongClick(view);
                    }
                    return true;
                }
            });
        }
    }

    private void removeLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca158cf", new Object[]{this});
        } else {
            this.mLongClickHelper.a((View.OnLongClickListener) null);
        }
    }

    private void onPanMove(float f) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97d4e4a", new Object[]{this, new Float(f)});
            return;
        }
        if (!this.isStartPanMove) {
            c cVar = this.mSwipeListener;
            if (cVar != null) {
                cVar.b();
            }
            this.isStartPanMove = true;
        }
        if (f > 0.0f) {
            f = 0.0f;
        }
        int i = this.maxSwipeWidth;
        if (f < (-i)) {
            f = -i;
        }
        if (f == (-this.maxSwipeWidth)) {
            z = true;
        }
        this.isShowSwipe = z;
        if (this.isShowSwipe) {
            onPanMoveWithAnimation(f);
        } else {
            setTranslationX(f);
        }
    }

    private void onPanMoveWithAnimation(final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8f4f0a", new Object[]{this, new Float(f)});
            return;
        }
        if (f > 0.0f) {
            f = 0.0f;
        }
        int i = this.maxSwipeWidth;
        if (f < (-i)) {
            f = -i;
        }
        ObjectAnimator objectAnimator = this.mObjectAnimator;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        this.mObjectAnimator = ObjectAnimator.ofFloat(this, "translationX", getTranslationX(), f);
        this.mObjectAnimator.setInterpolator(new LinearInterpolator());
        this.mObjectAnimator.setDuration(300L);
        this.mObjectAnimator.start();
        final int maxSwipeWidth = getMaxSwipeWidth();
        this.mObjectAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    return;
                }
                SwipeFrameLayout swipeFrameLayout = SwipeFrameLayout.this;
                if (f != (-maxSwipeWidth)) {
                    z = false;
                }
                SwipeFrameLayout.access$202(swipeFrameLayout, z);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                SwipeFrameLayout swipeFrameLayout = SwipeFrameLayout.this;
                if (f != (-maxSwipeWidth)) {
                    z = false;
                }
                SwipeFrameLayout.access$202(swipeFrameLayout, z);
                if (SwipeFrameLayout.access$100(SwipeFrameLayout.this) == null) {
                    return;
                }
                SwipeFrameLayout.access$100(SwipeFrameLayout.this).a(SwipeFrameLayout.access$200(SwipeFrameLayout.this));
                if (f != 0.0f) {
                    return;
                }
                SwipeFrameLayout.access$100(SwipeFrameLayout.this);
            }
        });
    }

    private float handleVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d09d11c", new Object[]{this})).floatValue();
        }
        float xVelocity = this.mVelocityTracker.getXVelocity();
        try {
            this.mVelocityTracker.recycle();
        } catch (Exception unused) {
        }
        this.mVelocityTracker = null;
        return xVelocity;
    }

    private RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c7371823", new Object[]{this});
        }
        View view = this;
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
        }
        return null;
    }

    private boolean isSwipeDisable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7dd03123", new Object[]{this})).booleanValue() : !this.isSwipeShow || this.maxSwipeWidth == 0;
    }

    private void addOnItemTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222736c7", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.addOnItemTouchListener(this.mItemTouchListener);
    }

    private void removeOnItemTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53008784", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.removeOnItemTouchListener(this.mItemTouchListener);
    }

    private boolean isOutsideSwipeRect(Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a94c48", new Object[]{this, rect, motionEvent})).booleanValue() : rect != null && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getRawY());
    }

    private boolean isInsideItemRect(Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c4726e", new Object[]{this, rect, motionEvent})).booleanValue() : rect != null && rect.contains(rect.left, (int) motionEvent.getRawY());
    }
}

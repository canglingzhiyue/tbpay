package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.util.DensityUtil;
import tb.kge;
import tb.oha;

/* loaded from: classes5.dex */
public class SlidingLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SHADOW_WIDTH = 16;
    private Activity mActivity;
    private com.taobao.android.layoutmanager.container.a mBackInterceptListener;
    private boolean mDisableScroll;
    private Drawable mLeftShadow;
    private oha.a mNavigationBarColorChangeListener;
    private a mPullRightHelper;
    private Scroller mScroller;
    private int mShadowWidth;
    private com.taobao.tao.flexbox.layoutmanager.container.f pageInterface;
    private View statusBarBackground;

    static {
        kge.a(-1105555957);
    }

    public static /* synthetic */ Object ipc$super(SlidingLayout slidingLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1c0ebb", new Object[]{slidingLayout});
        } else {
            slidingLayout.scrollBack();
        }
    }

    public static /* synthetic */ oha.a access$100(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oha.a) ipChange.ipc$dispatch("e59660c5", new Object[]{slidingLayout}) : slidingLayout.mNavigationBarColorChangeListener;
    }

    public static /* synthetic */ boolean access$200(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79afec1", new Object[]{slidingLayout})).booleanValue() : slidingLayout.shouldInterceptBack();
    }

    public static /* synthetic */ com.taobao.android.layoutmanager.container.a access$300(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.layoutmanager.container.a) ipChange.ipc$dispatch("d26ccc73", new Object[]{slidingLayout}) : slidingLayout.mBackInterceptListener;
    }

    public static /* synthetic */ void access$400(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a319eebf", new Object[]{slidingLayout});
        } else {
            slidingLayout.scrollClose();
        }
    }

    public static /* synthetic */ void access$500(SlidingLayout slidingLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a53d900", new Object[]{slidingLayout, new Float(f)});
        } else {
            slidingLayout.updateStatusBarTranslateX(f);
        }
    }

    public static void disableScroll(Activity activity, boolean z) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48851466", new Object[]{activity, new Boolean(z)});
        } else if (activity == null || (viewGroup = (ViewGroup) activity.getWindow().getDecorView()) == null) {
        } else {
            View childAt = viewGroup.getChildAt(0);
            if (!(childAt instanceof SlidingLayout)) {
                return;
            }
            ((SlidingLayout) childAt).disableScroll(z);
        }
    }

    public SlidingLayout(Context context) {
        this(context, null);
    }

    public SlidingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mPullRightHelper = new a(this) { // from class: com.taobao.android.layoutmanager.container.SlidingLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.layoutmanager.container.SlidingLayout.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                SlidingLayout.access$000(SlidingLayout.this);
                if (SlidingLayout.access$100(SlidingLayout.this) == null) {
                    return;
                }
                SlidingLayout.access$100(SlidingLayout.this).onBack(oha.b);
            }

            @Override // com.taobao.android.layoutmanager.container.SlidingLayout.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (SlidingLayout.access$200(SlidingLayout.this)) {
                    SlidingLayout.access$300(SlidingLayout.this).b();
                } else {
                    SlidingLayout.access$400(SlidingLayout.this);
                    if (SlidingLayout.access$100(SlidingLayout.this) == null) {
                        return;
                    }
                    SlidingLayout.access$100(SlidingLayout.this).onFinish(oha.b, 0.0f);
                }
            }

            @Override // com.taobao.android.layoutmanager.container.SlidingLayout.a
            public void a(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                } else if (SlidingLayout.access$200(SlidingLayout.this)) {
                } else {
                    SlidingLayout.this.scrollTo((int) (-f), 0);
                    SlidingLayout.access$500(SlidingLayout.this, f);
                    if (SlidingLayout.access$100(SlidingLayout.this) == null) {
                        return;
                    }
                    SlidingLayout.access$100(SlidingLayout.this).onMove(oha.b);
                }
            }
        };
        this.mScroller = new Scroller(context);
        this.mLeftShadow = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 1342177280});
        this.mShadowWidth = ((int) getResources().getDisplayMetrics().density) * 16;
    }

    private boolean shouldInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6a4761", new Object[]{this})).booleanValue();
        }
        com.taobao.android.layoutmanager.container.a aVar = this.mBackInterceptListener;
        return aVar != null && aVar.a();
    }

    public void bindActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0574c05", new Object[]{this, activity});
            return;
        }
        this.mActivity = activity;
        ViewGroup viewGroup = (ViewGroup) this.mActivity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        addView(childAt);
        viewGroup.addView(this);
    }

    public void bindNavigationBarColorChangeListener(oha.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12858437", new Object[]{this, aVar});
        } else {
            this.mNavigationBarColorChangeListener = aVar;
        }
    }

    public void bindPage(com.taobao.tao.flexbox.layoutmanager.container.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7eab53", new Object[]{this, fVar});
        } else {
            this.pageInterface = fVar;
        }
    }

    public void disableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a473478", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableScroll = z;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mDisableScroll) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.mPullRightHelper.a(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mDisableScroll) {
            super.onTouchEvent(motionEvent);
        }
        return this.mPullRightHelper.b(motionEvent);
    }

    private void scrollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9febdb", new Object[]{this});
            return;
        }
        this.mScroller.startScroll(getScrollX(), 0, -getScrollX(), 0, 300);
        invalidate();
    }

    private void scrollClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cca3632", new Object[]{this});
            return;
        }
        this.mScroller.startScroll(getScrollX(), 0, (-getScrollX()) - getWidth(), 0, 250);
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mScroller.computeScrollOffset()) {
            scrollTo(this.mScroller.getCurrX(), 0);
            updateStatusBarTranslateX(-this.mScroller.getCurrX());
            postInvalidate();
        } else if ((-getScrollX()) < getWidth() || getWidth() <= 0) {
        } else {
            Activity activity = this.mActivity;
            if (activity != null) {
                activity.finish();
                this.mActivity.overridePendingTransition(0, 0);
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.container.f fVar = this.pageInterface;
            if (fVar == null) {
                return;
            }
            fVar.finish(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        drawShadow(canvas);
    }

    private void drawShadow(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a2d9ba", new Object[]{this, canvas});
            return;
        }
        this.mLeftShadow.setBounds(0, 0, this.mShadowWidth, getHeight());
        this.mLeftShadow.setAlpha((int) ((1.0f - ((-getScrollX()) / getWidth())) * 255.0f));
        canvas.save();
        canvas.translate(-this.mShadowWidth, 0.0f);
        this.mLeftShadow.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mPullRightHelper.c();
    }

    private void updateStatusBarTranslateX(float f) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83306277", new Object[]{this, new Float(f)});
            return;
        }
        if (this.statusBarBackground == null && (activity = this.mActivity) != null && (activity instanceof CommonContainerActivity)) {
            this.statusBarBackground = activity.getWindow().getDecorView().findViewById(16908335);
        }
        View view = this.statusBarBackground;
        if (view == null) {
            return;
        }
        view.setTranslationX(f);
    }

    public void setShadowViewBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d05e2e", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(i);
        }
    }

    public void setBackInterceptListener(com.taobao.android.layoutmanager.container.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517e4b0f", new Object[]{this, aVar});
        } else {
            this.mBackInterceptListener = aVar;
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f13179a;
        private float b;
        private float c;
        private float d;
        private float e;
        private boolean f;
        private boolean g;
        private int i;
        private int j;
        private float k;
        private View n;
        private int h = -1;
        private int l = -4;
        private int m = 4;
        private VelocityTracker o = VelocityTracker.obtain();
        private boolean p = com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.c.a();

        static {
            kge.a(394954924);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public a(View view) {
            this.n = view;
            this.i = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.j = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity();
            this.k = DensityUtil.dip2px(view.getContext(), 60.0f);
        }

        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (a(this.n, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                View view = this.n;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).requestDisallowInterceptTouchEvent(false);
                }
                this.h = motionEvent.getPointerId(0);
                this.f = false;
                this.g = false;
                if (motionEvent.findPointerIndex(this.h) < 0) {
                    return false;
                }
                this.d = motionEvent.getRawX();
                this.e = motionEvent.getRawY();
                this.f13179a = motionEvent.getX();
                this.b = motionEvent.getY();
            } else {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                c(motionEvent);
                            }
                        }
                    } else if (a(this.n, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.g) {
                        return false;
                    } else {
                        if (this.f) {
                            return true;
                        }
                        int i = this.h;
                        if (i == -1) {
                            Log.e("PullLeftHelper", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        float f = x - this.f13179a;
                        if (f != 0.0f && a(this.n, false, (int) f, (int) x, (int) y)) {
                            this.f13179a = x;
                            this.g = true;
                            return false;
                        }
                        a(rawX, rawY);
                    }
                }
                this.f = false;
                this.g = false;
                this.h = -1;
            }
            return this.f;
        }

        public boolean b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.h = motionEvent.getPointerId(0);
                this.f = false;
                d();
            } else {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (actionIndex < 0) {
                                    Log.e("PullLeftHelper", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    return false;
                                }
                                this.h = motionEvent.getPointerId(actionIndex);
                            } else if (actionMasked == 6) {
                                c(motionEvent);
                            }
                        }
                    } else if (motionEvent.findPointerIndex(this.h) < 0) {
                        Log.e("PullLeftHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else {
                        float rawX = motionEvent.getRawX();
                        a(rawX, motionEvent.getRawY());
                        if (this.f) {
                            float f = rawX - this.c;
                            if (f > 0.0f) {
                                a(f);
                            } else {
                                a(0.0f);
                            }
                        }
                    }
                }
                if (motionEvent.findPointerIndex(this.h) < 0) {
                    Log.e("PullLeftHelper", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f) {
                    float rawX2 = motionEvent.getRawX() - this.c;
                    this.f = false;
                    this.o.computeCurrentVelocity(1);
                    c(rawX2, this.o.getXVelocity());
                }
                this.h = -1;
                return false;
            }
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return true;
        }

        private void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            } else if (this.f) {
            } else {
                float f3 = f - this.d;
                if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.e)) {
                    z = true;
                }
                if (f3 <= this.i || !z || !b(f, f2)) {
                    return;
                }
                this.c = this.d + this.i;
                this.f = true;
            }
        }

        private boolean b(float f, float f2) {
            ab e;
            aa A;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("90f625ad", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            View view = this.n;
            return view == null || !(view.getContext() instanceof CommonContainerActivity) || (e = ((CommonContainerActivity) this.n.getContext()).e()) == null || (A = e.A()) == null || ad.a(A, (int) f, (int) f2, true) == null;
        }

        private void c(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890944ff", new Object[]{this, motionEvent});
                return;
            }
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) != this.h) {
                return;
            }
            if (actionIndex != 0) {
                i = 0;
            }
            this.h = motionEvent.getPointerId(i);
        }

        private boolean a(View view, boolean z, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("436a9bd", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                int childCount = viewGroup.getChildCount() - 1;
                while (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt == null || (i5 = i2 + scrollX) < childAt.getLeft() || i5 >= childAt.getRight() * childAt.getScaleX() || (i6 = i3 + scrollY) < childAt.getTop() || i6 >= childAt.getBottom()) {
                        i4 = childCount;
                    } else {
                        i4 = childCount;
                        if (a(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                    childCount = i4 - 1;
                }
            } else if (view instanceof SeekBar) {
                return true;
            }
            return z && view.canScrollHorizontally(-i);
        }

        private boolean a(View view, int i, int i2) {
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c25114e", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if ((view instanceof com.taobao.tao.flexbox.layoutmanager.view.b) && ((com.taobao.tao.flexbox.layoutmanager.view.b) view).canPullIntercept(com.taobao.tao.flexbox.layoutmanager.view.b.PULL_HORIZONTAL_DRAG)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt != null) {
                        if (this.p) {
                            int i4 = i + scrollX;
                            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && (i3 = i2 + scrollY) >= childAt.getTop() && i3 < childAt.getBottom() && a(childAt, i4 - childAt.getLeft(), i3 - childAt.getTop())) {
                                return true;
                            }
                        } else if (a(childAt, (i + scrollX) - childAt.getLeft(), (i2 + scrollY) - childAt.getTop())) {
                            return true;
                        } else {
                            if (childAt instanceof com.taobao.tao.flexbox.layoutmanager.view.b) {
                                break;
                            }
                        }
                    }
                }
            }
            return false;
        }

        private void c(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5dc60ea", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            float f3 = this.k;
            if (f > f3) {
                int i = this.l;
                if (f2 < i || (f < f3 * 2.0f && f2 < i / 2)) {
                    a();
                } else if (f2 > this.m) {
                    b();
                } else {
                    b();
                }
            } else if (f2 > this.m) {
                b();
            } else {
                a();
            }
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker == null) {
                this.o = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.recycle();
            this.o = null;
        }
    }
}

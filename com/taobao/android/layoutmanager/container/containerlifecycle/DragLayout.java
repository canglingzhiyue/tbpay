package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.oha;
import tb.ohd;

/* loaded from: classes5.dex */
public class DragLayout extends FrameLayout implements com.taobao.tao.flexbox.layoutmanager.animation.shareelement.a, com.taobao.tao.flexbox.layoutmanager.container.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean disableScroll;
    private a dragCloseHelper;
    private com.taobao.android.layoutmanager.container.a mBackInterceptListener;
    private oha.a mNavigationBarColorChangeListener;
    private f pageInterface;
    private View shadowView;

    static {
        kge.a(-555411305);
        kge.a(307677673);
        kge.a(-1841930748);
    }

    public static /* synthetic */ Object ipc$super(DragLayout dragLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75496caf", new Object[]{dragLayout});
        } else {
            dragLayout.performRollToNormalAnimation();
        }
    }

    public static /* synthetic */ f access$100(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("e55b7ac6", new Object[]{dragLayout}) : dragLayout.pageInterface;
    }

    public static /* synthetic */ oha.a access$200(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oha.a) ipChange.ipc$dispatch("b8923270", new Object[]{dragLayout}) : dragLayout.mNavigationBarColorChangeListener;
    }

    public static /* synthetic */ boolean access$300(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16b56eb6", new Object[]{dragLayout})).booleanValue() : dragLayout.shouldInterceptBack();
    }

    public static /* synthetic */ com.taobao.android.layoutmanager.container.a access$400(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.layoutmanager.container.a) ipChange.ipc$dispatch("8e1c289e", new Object[]{dragLayout}) : dragLayout.mBackInterceptListener;
    }

    public static /* synthetic */ View access$500(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cfe0edf6", new Object[]{dragLayout}) : dragLayout.shadowView;
    }

    public static /* synthetic */ void access$600(DragLayout dragLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0d18ee", new Object[]{dragLayout, new Integer(i)});
        } else {
            dragLayout.setRadius(i);
        }
    }

    public DragLayout(Context context) {
        this(context, null);
    }

    public DragLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.shadowView = new View(getContext());
        this.shadowView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (!this.pageInterface.isFullPage()) {
            setShadowViewBackgroundColor(Color.parseColor("#52000000"));
        }
        ((ViewGroup) getParent()).addView(this.shadowView, 0);
    }

    public void setShadowViewBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d05e2e", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.shadowView;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    public void setBackInterceptListener(com.taobao.android.layoutmanager.container.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517e4b0f", new Object[]{this, aVar});
        } else {
            this.mBackInterceptListener = aVar;
        }
    }

    private boolean shouldInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6a4761", new Object[]{this})).booleanValue();
        }
        com.taobao.android.layoutmanager.container.a aVar = this.mBackInterceptListener;
        return aVar != null && aVar.a();
    }

    private void setRadius(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fd848", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            setClipToOutline(true);
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ohd.b(DragLayout.this.getContext(), i));
                    }
                }
            });
        }
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
        } else {
            this.dragCloseHelper = new a(this) { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    DragLayout.access$000(DragLayout.this);
                    DragLayout.access$100(DragLayout.this).onWindowFocusChanged(true);
                    if (DragLayout.access$200(DragLayout.this) == null) {
                        return;
                    }
                    DragLayout.access$200(DragLayout.this).onBack(oha.f32049a);
                }

                @Override // com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (DragLayout.access$300(DragLayout.this)) {
                        DragLayout.access$400(DragLayout.this).b();
                    } else if (!DragLayout.access$100(DragLayout.this).isFullPage()) {
                        if (!oeb.a(DragLayout.access$100(DragLayout.this))) {
                            ((ViewGroup) DragLayout.this.getParent()).removeView(DragLayout.access$500(DragLayout.this));
                        }
                        DragLayout.access$100(DragLayout.this).finish(true);
                    } else if (DragLayout.this.performCloseAnimation()) {
                    } else {
                        DragLayout.access$100(DragLayout.this).finish(false);
                    }
                }

                @Override // com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.a
                public void a(float f, float f2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                    } else if (DragLayout.access$300(DragLayout.this)) {
                    } else {
                        float abs = 1.0f - ((Math.abs(f) / DragLayout.this.getWidth()) * 0.75f);
                        float f3 = 1.0f - abs;
                        float width = f3 * f3 * DragLayout.this.getWidth() * 0.5f;
                        if (f >= 0.0f) {
                            DragLayout.this.setTranslationX(f);
                            DragLayout.this.setTranslationY(f2 - width);
                            DragLayout.this.setScaleX(abs);
                            DragLayout.this.setScaleY(abs);
                        } else {
                            DragLayout.this.setTranslationX(f);
                            DragLayout.this.setTranslationY(f2);
                        }
                        DragLayout.access$100(DragLayout.this).onWindowFocusChanged(false);
                        if (DragLayout.access$200(DragLayout.this) == null) {
                            return;
                        }
                        DragLayout.access$200(DragLayout.this).onMove(oha.f32049a);
                    }
                }
            };
        }
    }

    public void bindPage(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7eab53", new Object[]{this, fVar});
        } else {
            this.pageInterface = fVar;
        }
    }

    public void bindNavigationBarColorChangeListener(oha.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12858437", new Object[]{this, aVar});
        } else {
            this.mNavigationBarColorChangeListener = aVar;
        }
    }

    public void disableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a473478", new Object[]{this, new Boolean(z)});
        } else {
            this.disableScroll = z;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableScroll) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.dragCloseHelper.a(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableScroll) {
            super.onTouchEvent(motionEvent);
        }
        return this.dragCloseHelper.b(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.dragCloseHelper.c();
        ((ViewGroup) getParent()).removeView(this.shadowView);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.animation.shareelement.a
    public RectF getContainerBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("7bac14a0", new Object[]{this});
        }
        RectF rectF = new RectF();
        rectF.left = getLeft() + getTranslationX() + (getWidth() * (1.0f - getScaleX()) * 0.5f);
        rectF.top = getTop() + getTranslationY() + (getHeight() * (1.0f - getScaleY()) * 0.5f);
        rectF.right = rectF.left + (getWidth() * getScaleX());
        rectF.bottom = rectF.top + (getHeight() * getScaleY());
        if (!oeb.a(this.pageInterface)) {
            setTranslationX((-getWidth()) * (1.0f - getScaleX()) * 0.5f);
            setTranslationY((-getHeight()) * (1.0f - getScaleY()) * 0.5f);
        }
        return rectF;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.c
    public View findShadowView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c33ded07", new Object[]{this}) : this.shadowView;
    }

    /* loaded from: classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f13186a;
        private float c;
        private float d;
        private float e;
        private boolean f;
        private boolean g;
        private int i;
        private float j;
        private View l;
        private int h = -1;
        private int k = 4;
        private VelocityTracker m = VelocityTracker.obtain();

        static {
            kge.a(-206346299);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public a(View view) {
            this.l = view;
            this.i = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.j = ohd.b(view.getContext()) * 0.2f;
        }

        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (a(this.l)) {
                    return false;
                }
                View view = this.l;
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
                this.f13186a = motionEvent.getX();
                this.c = motionEvent.getY();
            } else {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                c(motionEvent);
                            }
                        }
                    } else if (a(this.l) || this.g) {
                        return false;
                    } else {
                        if (this.f) {
                            return true;
                        }
                        int i = this.h;
                        if (i == -1) {
                            Log.e("DragCloseHelper", "Got ACTION_MOVE event but don't have an active pointer id.");
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
                        float f = x - this.f13186a;
                        if (f != 0.0f && a(this.l, false, (int) f, (int) x, (int) y)) {
                            this.f13186a = x;
                            this.g = true;
                            return false;
                        }
                        b(rawX, rawY);
                    }
                }
                this.f = false;
                this.g = false;
                this.h = -1;
            }
            return this.f;
        }

        private boolean a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
            }
            if ((view instanceof com.taobao.tao.flexbox.layoutmanager.view.b) && ((com.taobao.tao.flexbox.layoutmanager.view.b) view).canPullIntercept(com.taobao.tao.flexbox.layoutmanager.view.b.PULL_HORIZONTAL_DRAG)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        if (a(childAt)) {
                            return true;
                        }
                        if (childAt instanceof com.taobao.tao.flexbox.layoutmanager.view.b) {
                            break;
                        }
                    }
                }
            }
            return false;
        }

        public boolean b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f13186a = motionEvent.getRawX();
                this.c = motionEvent.getRawY();
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
                                    Log.e("DragCloseHelper", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    return false;
                                }
                                this.h = motionEvent.getPointerId(actionIndex);
                            } else if (actionMasked == 6) {
                                c(motionEvent);
                            }
                        }
                    } else if (motionEvent.findPointerIndex(this.h) < 0) {
                        Log.e("DragCloseHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        b(rawX, rawY);
                        if (this.f) {
                            a(rawX - this.f13186a, rawY - this.c);
                        }
                    }
                }
                if (motionEvent.findPointerIndex(this.h) < 0) {
                    Log.e("DragCloseHelper", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f) {
                    float rawX2 = motionEvent.getRawX() - this.f13186a;
                    this.f = false;
                    this.m.computeCurrentVelocity(1);
                    d(rawX2, this.m.getXVelocity());
                }
                this.h = -1;
                return false;
            }
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return true;
        }

        private void b(float f, float f2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
            } else if (this.f) {
            } else {
                float f3 = f - this.d;
                if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.e)) {
                    z = true;
                }
                if (f3 > this.i && z && c(f, f2)) {
                    this.f = true;
                }
                if (!this.f) {
                    return;
                }
                DragLayout.access$600(DragLayout.this, 20);
            }
        }

        private boolean c(float f, float f2) {
            aa A;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c5dc60ee", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            ab tNodeEngine = DragLayout.access$100(DragLayout.this).getTNodeEngine();
            return tNodeEngine == null || (A = tNodeEngine.A()) == null || ad.a(A, (int) f, (int) f2, true) == null;
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

        private void d(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fac29c2b", new Object[]{this, new Float(f), new Float(f2)});
            } else if (f > this.j) {
                b();
            } else if (f2 > this.k) {
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
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker == null) {
                this.m = VelocityTracker.obtain();
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
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.recycle();
            this.m = null;
        }
    }

    private void getBoundsOnScreen(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efed4c4", new Object[]{this, view, rect});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    private ViewGroup getSceneRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e1a44dd6", new Object[]{this});
        }
        f fVar = this.pageInterface;
        if (fVar != null) {
            return (ViewGroup) fVar.getPageContainer().c().getParent();
        }
        return null;
    }

    public boolean performCloseAnimation() {
        final View view;
        final ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd3f038", new Object[]{this})).booleanValue();
        }
        List<View> list = null;
        if (this.pageInterface.getPageTransition() != null) {
            list = this.pageInterface.getPageTransition().b();
        }
        if (list == null || list.size() == 0 || (view = list.get(0)) == null || (viewGroup = (ViewGroup) view.getParent()) == null || "OverlayViewGroup".equals(viewGroup.getClass().getSimpleName()) || (viewGroup instanceof ScrollView)) {
            return false;
        }
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        final View view2 = new View(ab.a());
        viewGroup.addView(view2, layoutParams);
        Rect rect = new Rect();
        getBoundsOnScreen(view, rect);
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        view.setVisibility(0);
        final ViewGroup sceneRoot = getSceneRoot();
        if (sceneRoot == null) {
            return false;
        }
        sceneRoot.getOverlay().add(view);
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        final float translationX = view.getTranslationX();
        final float translationY = view.getTranslationY();
        final float scaleX2 = getScaleX();
        final float scaleY2 = getScaleY();
        final float translationX2 = getTranslationX();
        final float translationY2 = getTranslationY();
        float f = width;
        final float width2 = f / getWidth();
        float f2 = height;
        final float height2 = f2 / getHeight();
        float width3 = getWidth() * (1.0f - width2) * 0.5f;
        float height3 = getHeight() * (1.0f - height2) * 0.5f;
        float f3 = i;
        final float f4 = f3 - width3;
        float f5 = i2;
        final float f6 = f5 - height3;
        final float width4 = (getWidth() * scaleX2) / f;
        final float height4 = (getHeight() * scaleY2) / f2;
        final float f7 = (translationX2 + width3) - f3;
        final float f8 = (translationY2 + height3) - f5;
        final float alpha = this.shadowView.getAlpha();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = this;
                float f9 = translationX2;
                view3.setTranslationX(f9 + ((f4 - f9) * floatValue));
                View view4 = this;
                float f10 = translationY2;
                view4.setTranslationY(f10 + ((f6 - f10) * floatValue));
                View view5 = this;
                float f11 = scaleX2;
                view5.setScaleX(f11 + ((width2 - f11) * floatValue));
                View view6 = this;
                float f12 = scaleY2;
                view6.setScaleY(f12 + ((height2 - f12) * floatValue));
                float f13 = 1.0f - floatValue;
                this.setAlpha(alpha * f13);
                View view7 = view;
                float f14 = f7;
                view7.setTranslationX(f14 + ((translationX - f14) * floatValue));
                View view8 = view;
                float f15 = f8;
                view8.setTranslationY(f15 + ((translationY - f15) * floatValue));
                View view9 = view;
                float f16 = width4;
                view9.setScaleX(f16 + ((scaleX - f16) * floatValue));
                View view10 = view;
                float f17 = height4;
                view10.setScaleY(f17 + ((scaleY - f17) * floatValue));
                view.setAlpha(floatValue);
                DragLayout.access$500(DragLayout.this).setAlpha(alpha * f13);
                if (DragLayout.access$200(DragLayout.this) == null) {
                    return;
                }
                DragLayout.access$200(DragLayout.this).onFinish(oha.f32049a, f13);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                sceneRoot.getOverlay().remove(view);
                viewGroup.removeView(view2);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                viewGroup.addView(view, layoutParams);
                if (DragLayout.access$100(DragLayout.this) == null) {
                    return;
                }
                DragLayout.access$100(DragLayout.this).finish(false);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration);
        animatorSet.start();
        return true;
    }

    private void performRollToNormalAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6707e10b", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "scaleX", getScaleX(), 1.0f).setDuration(200L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "scaleY", getScaleX(), 1.0f).setDuration(200L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "translationX", getTranslationX(), 0.0f).setDuration(200L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), 0.0f).setDuration(200L);
        arrayList.add(duration);
        arrayList.add(duration2);
        arrayList.add(duration3);
        arrayList.add(duration4);
        duration3.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                DragLayout.access$600(DragLayout.this, 0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }
}

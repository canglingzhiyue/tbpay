package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import tb.kge;
import tb.ohd;

/* loaded from: classes8.dex */
public class SheetViewGroup extends FlatViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ACTIVE = 2;
    public static final int STATE_APPEAR = 1;
    public static final int STATE_DISAPPEAR = 0;
    private static final Interpolator sInterpolator;
    private int activeNum;
    private int appearNum;
    private aa browserNode;
    private int currentState;
    private int disappearNum;
    private a mPullHelper;
    private Scroller mScroller;
    private int maxActiveNum;
    private int maxAppearNum;
    private aa sideNode;

    public static /* synthetic */ Object ipc$super(SheetViewGroup sheetViewGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -894236565:
                super.computeScroll();
                return null;
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfeee0a", new Object[]{sheetViewGroup});
        } else {
            sheetViewGroup.scrollBack();
        }
    }

    public static /* synthetic */ void access$100(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9be660b", new Object[]{sheetViewGroup});
        } else {
            sheetViewGroup.scrollFinish();
        }
    }

    public static /* synthetic */ int access$200(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("377dddff", new Object[]{sheetViewGroup})).intValue() : sheetViewGroup.getSideMaxScrollWidth();
    }

    public static /* synthetic */ void access$300(SheetViewGroup sheetViewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226dde96", new Object[]{sheetViewGroup, new Integer(i)});
        } else {
            sheetViewGroup.notifyStateChanged(i);
        }
    }

    public static /* synthetic */ int access$400(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d2fcce01", new Object[]{sheetViewGroup})).intValue() : sheetViewGroup.currentState;
    }

    public static /* synthetic */ aa access$500(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("ca14d80f", new Object[]{sheetViewGroup}) : sheetViewGroup.browserNode;
    }

    public static /* synthetic */ aa access$600(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("a8fedae", new Object[]{sheetViewGroup}) : sheetViewGroup.sideNode;
    }

    static {
        kge.a(-1483110116);
        sInterpolator = new Interpolator() { // from class: com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                }
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public SheetViewGroup(Context context) {
        super(context);
        this.currentState = 0;
    }

    public void setSideNode(final aa aaVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599eddca", new Object[]{this, aaVar, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.sideNode != aaVar) {
            this.sideNode = aaVar;
            if (aaVar != null) {
                this.mPullHelper = new a(this) { // from class: com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            SheetViewGroup.access$000(SheetViewGroup.this);
                        }
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.a
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else {
                            SheetViewGroup.access$100(SheetViewGroup.this);
                        }
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.a
                    public void a(float f) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                            return;
                        }
                        float f2 = -SheetViewGroup.access$200(SheetViewGroup.this);
                        if (f < f2) {
                            f = f2;
                        }
                        aaVar.x().setTranslationX(f);
                        int i3 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
                        if (i3 == 0) {
                            SheetViewGroup.access$300(SheetViewGroup.this, 2);
                        } else if (f == 0.0f) {
                            SheetViewGroup.access$300(SheetViewGroup.this, 0);
                        } else if (i3 <= 0 || f >= 0.0f || SheetViewGroup.access$400(SheetViewGroup.this) != 0) {
                        } else {
                            SheetViewGroup.access$300(SheetViewGroup.this, 1);
                        }
                    }
                };
                this.mScroller = new Scroller(getContext(), sInterpolator);
            }
        }
        this.maxAppearNum = i;
        this.maxActiveNum = i2;
    }

    public void setBrowserNode(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec22bb7", new Object[]{this, aaVar});
        } else {
            this.browserNode = aaVar;
        }
    }

    private void scrollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9febdb", new Object[]{this});
            return;
        }
        int translationX = (int) this.sideNode.x().getTranslationX();
        this.mScroller.startScroll(translationX, 0, -translationX, 0, 300);
        invalidate();
    }

    private int getSideMaxScrollWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b9159c", new Object[]{this})).intValue();
        }
        aa aaVar = this.sideNode;
        if (aaVar == null) {
            return 0;
        }
        return aaVar.x().getWidth();
    }

    private void scrollFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec3f647", new Object[]{this});
            return;
        }
        int translationX = (int) this.sideNode.x().getTranslationX();
        this.mScroller.startScroll(translationX, 0, (-translationX) - getSideMaxScrollWidth(), 0, 250);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && this.sideNode != null) {
            if (scroller.computeScrollOffset()) {
                this.sideNode.x().setTranslationX(this.mScroller.getCurrX());
                ViewCompat.postInvalidateOnAnimation(this);
                return;
            }
            float translationX = this.sideNode.x().getTranslationX();
            int i = (translationX > (-getSideMaxScrollWidth()) ? 1 : (translationX == (-getSideMaxScrollWidth()) ? 0 : -1));
            if (i == 0) {
                notifyStateChanged(2);
                return;
            } else if (translationX == 0.0f) {
                notifyStateChanged(0);
                return;
            } else if (translationX >= 0.0f || i <= 0 || this.currentState != 0) {
                return;
            } else {
                notifyStateChanged(1);
                return;
            }
        }
        super.computeScroll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r0 > r12.maxAppearNum) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r1 = r0;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r0 > r12.maxActiveNum) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void notifyStateChanged(int r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r12
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r13)
            r1[r4] = r2
            java.lang.String r13 = "bfa37810"
            r0.ipc$dispatch(r13, r1)
            return
        L1a:
            int r0 = r12.currentState
            if (r13 == r0) goto L86
            if (r13 != r4) goto L31
            int r0 = r12.appearNum
            int r0 = r0 + r4
            r12.appearNum = r0
            int r0 = r12.appearNum
            int r1 = r12.maxAppearNum
            if (r0 <= r1) goto L2e
        L2b:
            r1 = r0
            r0 = 0
            goto L4b
        L2e:
            r1 = r0
            r0 = 1
            goto L4b
        L31:
            if (r13 != 0) goto L3b
            int r0 = r12.disappearNum
            int r0 = r0 + r4
            r12.disappearNum = r0
            int r0 = r12.disappearNum
            goto L2e
        L3b:
            if (r13 != r2) goto L49
            int r0 = r12.activeNum
            int r0 = r0 + r4
            r12.activeNum = r0
            int r0 = r12.activeNum
            int r1 = r12.maxActiveNum
            if (r0 <= r1) goto L2e
            goto L2b
        L49:
            r0 = 1
            r1 = 0
        L4b:
            if (r0 == 0) goto L84
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.String r5 = "state"
            r10.put(r5, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "num"
            r10.put(r1, r0)
            if (r13 != r2) goto L69
            r3 = 1
        L69:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "active"
            r10.put(r1, r0)
            r6 = 130(0x82, float:1.82E-43)
            com.taobao.tao.flexbox.layoutmanager.core.aa r0 = r12.sideNode
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r0.I()
            com.taobao.tao.flexbox.layoutmanager.core.aa r7 = r12.sideNode
            r9 = 0
            r11 = 0
            java.lang.String r8 = "onstatechanged"
            r5.sendMessage(r6, r7, r8, r9, r10, r11)
        L84:
            r12.currentState = r13
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.notifyStateChanged(int):void");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        aa aaVar = this.browserNode;
        if (aaVar == null) {
            if (this.sideNode != null && canScrollSideView(i)) {
                return true;
            }
            return super.canScrollHorizontally(i);
        }
        ViewPager viewPager = (ViewPager) aaVar.x();
        if (viewPager.getCurrentItem() == viewPager.getAdapter().getCount() - 1 && this.sideNode != null && canScrollSideView(i)) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        aa aaVar = this.browserNode;
        if (aaVar == null) {
            if (this.sideNode != null) {
                return this.mPullHelper.a(motionEvent);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        ViewPager viewPager = (ViewPager) aaVar.x();
        if (viewPager.getCurrentItem() == viewPager.getAdapter().getCount() - 1 && this.sideNode != null) {
            return this.mPullHelper.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        aa aaVar = this.browserNode;
        if (aaVar == null) {
            if (this.sideNode != null) {
                return this.mPullHelper.b(motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        }
        ViewPager viewPager = (ViewPager) aaVar.x();
        if (viewPager.getCurrentItem() == viewPager.getAdapter().getCount() - 1 && this.sideNode != null) {
            return this.mPullHelper.b(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public boolean canScrollSideView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f660c87", new Object[]{this, new Integer(i)})).booleanValue();
        }
        float translationX = this.sideNode.x().getTranslationX();
        if (i > 0) {
            if (translationX <= 0.0f && translationX > (-getWidth())) {
                return true;
            }
        } else if (i < 0 && translationX < 0.0f && translationX >= (-getWidth())) {
            return true;
        }
        return false;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f20517a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private boolean g;
        private boolean h;
        private int j;
        private int k;
        private float l;
        private SheetViewGroup o;
        private int i = -1;
        private int m = -1;
        private int n = 1;
        private VelocityTracker p = VelocityTracker.obtain();

        static {
            kge.a(1725370107);
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

        public a(SheetViewGroup sheetViewGroup) {
            this.o = sheetViewGroup;
            this.j = ViewConfiguration.get(sheetViewGroup.getContext()).getScaledTouchSlop();
            this.k = ViewConfiguration.get(sheetViewGroup.getContext()).getScaledMinimumFlingVelocity();
            this.l = ohd.b(sheetViewGroup.getContext(), 60);
        }

        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.i = motionEvent.getPointerId(0);
                this.g = false;
                this.h = false;
                if (motionEvent.findPointerIndex(this.i) < 0) {
                    return false;
                }
                this.e = motionEvent.getRawX();
                this.f = motionEvent.getRawY();
                this.f20517a = motionEvent.getX();
                this.b = motionEvent.getY();
            } else {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                c(motionEvent);
                            }
                        }
                    } else if (this.h) {
                        return false;
                    } else {
                        if (this.g) {
                            return true;
                        }
                        int i = this.i;
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
                        float f = x - this.f20517a;
                        if (SheetViewGroup.access$500(this.o) == null && f != 0.0f && a(this.o, false, (int) f, (int) x, (int) y)) {
                            this.f20517a = x;
                            this.h = true;
                            return false;
                        }
                        a(rawX, rawY);
                    }
                }
                this.g = false;
                this.h = false;
                this.i = -1;
                SheetViewGroup sheetViewGroup = this.o;
                if (sheetViewGroup instanceof ViewGroup) {
                    sheetViewGroup.requestDisallowInterceptTouchEvent(false);
                }
            }
            return this.g;
        }

        public boolean b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            this.p.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.i = motionEvent.getPointerId(0);
                this.g = false;
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
                                this.i = motionEvent.getPointerId(actionIndex);
                            } else if (actionMasked == 6) {
                                c(motionEvent);
                            }
                        }
                    } else if (motionEvent.findPointerIndex(this.i) < 0) {
                        Log.e("PullLeftHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else {
                        float rawX = motionEvent.getRawX();
                        a(rawX, motionEvent.getRawY());
                        if (this.g) {
                            a((rawX - this.c) + this.d);
                        }
                    }
                }
                if (motionEvent.findPointerIndex(this.i) < 0) {
                    Log.e("PullLeftHelper", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.g) {
                    float rawX2 = motionEvent.getRawX() - this.c;
                    this.g = false;
                    this.p.computeCurrentVelocity(1);
                    b(rawX2, this.p.getXVelocity());
                }
                this.i = -1;
                return false;
            }
            return true;
        }

        private void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            } else if (this.g) {
            } else {
                float f3 = f - this.e;
                if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.f)) {
                    z = true;
                }
                if (Math.abs(f3) <= this.j || !z || !this.o.canScrollSideView((int) (-f3))) {
                    return;
                }
                this.c = this.e + this.j;
                this.g = true;
                this.d = SheetViewGroup.access$600(this.o).x().getTranslationX();
                SheetViewGroup sheetViewGroup = this.o;
                if (!(sheetViewGroup instanceof ViewGroup)) {
                    return;
                }
                sheetViewGroup.requestDisallowInterceptTouchEvent(true);
            }
        }

        private void c(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890944ff", new Object[]{this, motionEvent});
                return;
            }
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) != this.i) {
                return;
            }
            if (actionIndex != 0) {
                i = 0;
            }
            this.i = motionEvent.getPointerId(i);
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

        private void b(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
            } else if (this.d == 0.0f) {
                float f3 = -f;
                float f4 = this.l;
                if (f3 > f4) {
                    int i = this.n;
                    if (f2 > i || (f3 < f4 * 2.0f && f2 > i / 2)) {
                        a();
                    } else {
                        b();
                    }
                } else if (f2 < this.m) {
                    b();
                } else {
                    a();
                }
            } else {
                float f5 = this.l;
                if (f > f5) {
                    int i2 = this.m;
                    if (f2 < i2 || (f < f5 * 2.0f && f2 < i2 / 2)) {
                        b();
                    } else {
                        a();
                    }
                } else if (f2 > this.n) {
                    a();
                } else {
                    b();
                }
            }
        }
    }
}

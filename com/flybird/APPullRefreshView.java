package com.flybird;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.alipay.birdnest.api.FBOverView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class APPullRefreshView extends FrameLayout implements GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte f7105a;
    public GestureDetector b;
    public Flinger c;
    public RefreshListener d;
    public FBOverView e;
    public int f;
    public int g;
    public boolean h;

    /* loaded from: classes4.dex */
    public class Flinger implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Scroller f7107a;
        public int b;
        public boolean c = true;

        public Flinger() {
            this.f7107a = new Scroller(APPullRefreshView.this.getContext());
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i <= 0) {
            } else {
                APPullRefreshView.this.removeCallbacks(this);
                this.b = 0;
                this.c = false;
                this.f7107a.startScroll(0, 0, 0, i, 300);
                APPullRefreshView.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f7107a.computeScrollOffset()) {
                APPullRefreshView.this.a(this.b - this.f7107a.getCurrY(), false);
                this.b = this.f7107a.getCurrY();
                APPullRefreshView.this.post(this);
            } else {
                this.c = true;
                APPullRefreshView.this.removeCallbacks(this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface RefreshListener {
        boolean canRefresh();

        FBOverView getOverView();

        void onRefresh();
    }

    public APPullRefreshView(Context context) {
        super(context);
        this.h = true;
        a();
    }

    public static /* synthetic */ Object ipc$super(APPullRefreshView aPPullRefreshView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 728398312) {
            super.addTouchables((ArrayList) objArr[0]);
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = new GestureDetector(this);
        this.c = new Flinger();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6a79e8", new Object[]{this, arrayList});
            return;
        }
        super.addTouchables(arrayList);
        arrayList.add(this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View childAt = getChildAt(0);
        this.e.onFinish();
        this.e.setState((byte) 4);
        if (childAt.getBottom() > 0) {
            this.f7105a = (byte) 6;
            a(childAt.getBottom());
            return;
        }
        this.f7105a = (byte) 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.h) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.c.c) {
            return false;
        }
        View childAt = getChildAt(0);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 262 || motionEvent.getAction() == 518) && childAt.getBottom() > 0) {
            if (this.f7105a == 5 && childAt.getBottom() > this.g) {
                a(childAt.getBottom() - this.g);
                return false;
            } else if (this.f7105a != 5) {
                a(childAt.getBottom());
                return false;
            }
        }
        boolean onTouchEvent = this.b.onTouchEvent(motionEvent);
        if ((!onTouchEvent && ((b = this.f7105a) == 0 || b == 5)) || childAt.getBottom() == 0) {
            return onTouchEvent || super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.setAction(3);
        return super.dispatchTouchEvent(motionEvent);
    }

    public RefreshListener getRefreshListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RefreshListener) ipChange.ipc$dispatch("c7a0394b", new Object[]{this}) : this.d;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        int top = childAt2.getTop();
        if (this.f7105a == 5) {
            AdapterView adapterView = null;
            if (childAt2 instanceof AdapterView) {
                adapterView = (AdapterView) childAt2;
            } else {
                View childAt3 = ((ViewGroup) childAt2).getChildAt(0);
                if (childAt3 != null && (childAt3 instanceof AdapterView)) {
                    adapterView = (AdapterView) childAt3;
                }
            }
            if (adapterView != null && (adapterView.getFirstVisiblePosition() != 0 || (adapterView.getChildAt(0) != null && adapterView.getChildAt(0).getTop() < 0))) {
                z2 = false;
            }
            if (z2) {
                childAt.layout(0, this.g - childAt.getMeasuredHeight(), i3, childAt.getMeasuredHeight());
                int i5 = this.g;
                childAt2.layout(0, i5, i3, childAt2.getMeasuredHeight() + i5);
            }
        } else {
            childAt.layout(0, top - childAt.getMeasuredHeight(), i3, top);
            childAt2.layout(0, top, i3, childAt2.getMeasuredHeight() + top);
        }
        for (int i6 = 2; i6 < getChildCount(); i6++) {
            getChildAt(i6).layout(0, i2, i3, i4);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        byte b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (Math.abs(f) > Math.abs(f2)) {
            return false;
        }
        RefreshListener refreshListener = this.d;
        if (refreshListener != null && !refreshListener.canRefresh()) {
            return false;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        if (!(childAt2 instanceof AdapterView)) {
            View childAt3 = ((ViewGroup) getChildAt(1)).getChildAt(0);
            if (childAt3 instanceof AdapterView) {
                childAt2 = childAt3;
            }
        }
        if (childAt2 instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) childAt2;
            if (adapterView.getFirstVisiblePosition() != 0 || (adapterView.getFirstVisiblePosition() == 0 && adapterView.getChildAt(0) != null && adapterView.getChildAt(0).getTop() < 0)) {
                return false;
            }
        } else if (childAt2.getScrollY() > 0) {
            return false;
        }
        if ((this.f7105a == 5 && childAt.getTop() > 0 && f2 > 0.0f) || ((getChildAt(1).getTop() <= 0 && f2 > 0.0f) || (b = this.f7105a) == 3 || b == 4 || b == 6)) {
            return false;
        }
        int i = this.f;
        if (childAt.getTop() >= 0) {
            i = this.f / 2;
        }
        a(i, true);
        this.f = (int) (-f2);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public void setEnablePull(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa861d03", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void setRefreshListener(RefreshListener refreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b52ee27", new Object[]{this, refreshListener});
            return;
        }
        FBOverView fBOverView = this.e;
        if (fBOverView != null) {
            removeView(fBOverView);
        }
        this.d = refreshListener;
        this.e = refreshListener.getOverView();
        addView(this.e, 0, new FrameLayout.LayoutParams(-1, -2));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.flybird.APPullRefreshView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                APPullRefreshView aPPullRefreshView = APPullRefreshView.this;
                aPPullRefreshView.g = aPPullRefreshView.e.getOverViewHeight();
                APPullRefreshView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    public final void a(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.d != null && i > (i2 = this.g)) {
            this.f7105a = (byte) 4;
            this.c.a(i - i2);
        } else {
            this.f7105a = (byte) 3;
            this.c.a(i);
        }
    }

    public final boolean a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11929d", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        int top = childAt2.getTop() + i;
        int i2 = this.g;
        if (i2 > 0 && z) {
            this.e.onPullto(top / i2, this.f7105a);
        }
        if (top <= 0) {
            if (top < 0) {
                i = -childAt2.getTop();
            }
            childAt.offsetTopAndBottom(i);
            childAt2.offsetTopAndBottom(i);
            if (this.f7105a != 5) {
                this.f7105a = (byte) 0;
            }
        } else if (top <= this.g) {
            if (this.e.getState() != 1) {
                this.e.onOpen();
                this.e.setState((byte) 1);
            }
            childAt.offsetTopAndBottom(i);
            childAt2.offsetTopAndBottom(i);
            if (z && this.f7105a != 5) {
                this.f7105a = (byte) 1;
            } else if (top <= this.g && this.f7105a == 4 && this.d != null) {
                this.f7105a = (byte) 5;
                this.e.onLoad();
                this.e.setState((byte) 3);
                this.d.onRefresh();
            }
        } else if (this.f7105a != 5) {
            if (this.e.getState() != 2) {
                this.e.onOver();
                this.e.setState((byte) 2);
            }
            childAt.offsetTopAndBottom(i);
            childAt2.offsetTopAndBottom(i);
            if (z) {
                this.f7105a = (byte) 2;
            }
        }
        invalidate();
        return true;
    }
}

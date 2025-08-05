package com.etao.feimagesearch.result;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.t;
import tb.csl;
import tb.csm;
import tb.cso;
import tb.kge;
import tb.ruk;
import tb.ruw;

/* loaded from: classes3.dex */
public class ScrollInterceptView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ANIM = 2;
    public static final int STATE_DOWN = 0;
    public static final int STATE_DRAG = 1;
    public static final int STATE_FULL_DOWN = -1;
    public static final int STATE_HALF = 4;
    public static final int STATE_UP = 3;
    private boolean dropTouch;
    private csl mScrollLogic;

    /* loaded from: classes3.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(int i, int i2);

        void a(int i, int i2, int i3, int i4);
    }

    static {
        kge.a(-2023008105);
    }

    public static /* synthetic */ Object ipc$super(ScrollInterceptView scrollInterceptView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public ScrollInterceptView(Context context) {
        super(context);
        this.dropTouch = false;
        init();
    }

    public ScrollInterceptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dropTouch = false;
        init();
    }

    public ScrollInterceptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dropTouch = false;
        init();
    }

    public void setOffsetCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77605ab", new Object[]{this, bVar});
        } else {
            this.mScrollLogic.a(bVar);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mScrollLogic = new csm();
        this.mScrollLogic.a(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mScrollLogic.a() == -1) {
            int i5 = i4 - i2;
            ViewCompat.offsetTopAndBottom(getChildAt(0), i5);
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
            this.mScrollLogic.d(i5);
            return;
        }
        ViewCompat.offsetTopAndBottom(getChildAt(0), this.mScrollLogic.b());
        onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.dropTouch) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.dropTouch = false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.mScrollLogic.a(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : this.mScrollLogic.b(motionEvent);
    }

    public void setDownContentHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2597ba0", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.a(i);
        }
    }

    public void setContentUpStateOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc47e42a", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.b(i);
        }
    }

    public void moveChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26168f76", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.a(i, true);
        }
    }

    public void flyChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d6fd18", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.c(i);
        }
    }

    public void movePageToAssignPageLocationRatioWithAnim(float f, long j, cso csoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3753c5b0", new Object[]{this, new Float(f), new Long(j), csoVar});
        } else {
            this.mScrollLogic.a(f, j, csoVar);
        }
    }

    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue() : this.mScrollLogic.f();
    }

    public int getChildState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cab8fc5", new Object[]{this})).intValue() : this.mScrollLogic.a();
    }

    public void disappearAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b816db", new Object[]{this});
        } else {
            this.mScrollLogic.c(getHeight());
        }
    }

    public void setStateProvider(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16012a6", new Object[]{this, aVar});
        } else {
            this.mScrollLogic.a(aVar);
        }
    }

    public void setViewLockUp(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ba2699", new Object[]{this, bool});
        } else {
            this.mScrollLogic.a(bool.booleanValue());
        }
    }

    public void setAutoScrollInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f6eef9", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.i(i);
        }
    }

    public int getDownStateOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ba889ec6", new Object[]{this})).intValue() : this.mScrollLogic.c();
    }

    public void notifyScrollChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3cd04d", new Object[]{this});
        } else {
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
        }
    }

    public void setHeaderHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8bd86", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.f(i);
        }
    }

    public void setRollingThresholdOptionCallback(ruw<Boolean, Boolean, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8386a405", new Object[]{this, ruwVar});
        } else {
            this.mScrollLogic.a(ruwVar);
        }
    }

    public void setScrollTriggerListener(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230a5ac", new Object[]{this, rukVar});
        } else {
            this.mScrollLogic.b(rukVar);
        }
    }

    public void setOutOfChildAreaTouchUpListener(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e302417", new Object[]{this, rukVar});
        } else {
            this.mScrollLogic.a(rukVar);
        }
    }
}

package com.taobao.tao.topmultitab.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.view.widgets.ViewPagerFakeDragView;
import tb.kge;
import tb.lap;
import tb.mjx;
import tb.oiy;
import tb.ovj;

/* loaded from: classes8.dex */
public class HomeViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeViewPager";
    private boolean isEnableScroll;
    private ovj mAccidentSlideFeature;

    static {
        kge.a(55195699);
        kge.a(-924119294);
    }

    public static /* synthetic */ Object ipc$super(HomeViewPager homeViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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

    public void preLoadViewAppear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4096a", new Object[]{this, new Boolean(z)});
        }
    }

    public HomeViewPager(Context context) {
        super(context);
        this.isEnableScroll = true;
        this.mAccidentSlideFeature = new ovj(createITouchEventCallback());
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ViewPagerFakeDragView.setLastIsTouchFakeDragView(false);
        this.mAccidentSlideFeature.a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isEnableScroll()) {
            try {
                z = super.onInterceptTouchEvent(motionEvent);
            } catch (Throwable unused) {
            }
        }
        return this.mAccidentSlideFeature.a(motionEvent, z);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isEnableScroll()) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable th) {
                lap.a("AccidentSlide", "onTouchEvent error", th.getMessage());
            }
        }
        return true;
    }

    public void setEnableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnableScroll = z;
        }
    }

    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            this.mAccidentSlideFeature.a();
        }
    }

    private boolean isEnableScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fce3405", new Object[]{this})).booleanValue() : this.isEnableScroll;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            mjx i3 = oiy.a().b().getHomePageManager().i();
            if (i3 != null) {
                i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - i3.e(), View.MeasureSpec.getMode(i2));
            }
        } catch (Exception e) {
            e.e(TAG, "onMeasure except: " + e);
        }
        super.onMeasure(i, i2);
    }

    private ovj.a createITouchEventCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovj.a) ipChange.ipc$dispatch("a7d96b32", new Object[]{this}) : new ovj.a() { // from class: com.taobao.tao.topmultitab.view.HomeViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ovj.a
            public void a(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                } else {
                    HomeViewPager.this.onTouchEvent(motionEvent);
                }
            }
        };
    }
}

package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.i;
import java.lang.reflect.Field;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class SlideViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler H;
    private d adapter;
    private boolean attached;
    private boolean autoPlay;
    private Runnable autoPlayRunnable;
    private boolean hasTransformer;
    private boolean infinite;
    private int interval;
    private boolean scrollable;
    private boolean touching;

    public static /* synthetic */ Object ipc$super(SlideViewPager slideViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -672660879:
                super.setPageTransformer(((Boolean) objArr[0]).booleanValue(), (ViewPager.PageTransformer) objArr[1]);
                return null;
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(SlideViewPager slideViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b72c44c", new Object[]{slideViewPager});
        } else {
            slideViewPager.scrollToNext();
        }
    }

    public static /* synthetic */ void access$100(SlideViewPager slideViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a24c6b", new Object[]{slideViewPager});
        } else {
            slideViewPager.startAutoPlay();
        }
    }

    static {
        kge.a(-171125858);
        H = new Handler(Looper.getMainLooper());
    }

    public SlideViewPager(Context context) {
        super(context);
        this.autoPlayRunnable = new o() { // from class: com.taobao.android.weex_uikit.widget.slide.SlideViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                SlideViewPager.access$000(SlideViewPager.this);
                SlideViewPager.access$100(SlideViewPager.this);
            }
        };
        setOffscreenPageLimit(1);
        setOverScrollMode(2);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.touching = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue() : this.touching;
    }

    public void resetTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b9a39", new Object[]{this});
        } else {
            this.touching = false;
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void setPageTransformer(boolean z, ViewPager.PageTransformer pageTransformer) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e80271", new Object[]{this, new Boolean(z), pageTransformer});
            return;
        }
        super.setPageTransformer(z, pageTransformer);
        if (pageTransformer == null) {
            z2 = false;
        }
        this.hasTransformer = z2;
        d dVar = this.adapter;
        if (dVar == null) {
            return;
        }
        dVar.a(this.hasTransformer);
    }

    public void mount(MUSDKInstance mUSDKInstance, List<i> list, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b2db56", new Object[]{this, mUSDKInstance, list, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.touching = false;
        this.autoPlay = z3;
        this.scrollable = z2;
        this.infinite = z;
        this.adapter = m.f() ? new e(mUSDKInstance) : new f(mUSDKInstance);
        this.adapter.a(this.hasTransformer);
        if (i3 != 0) {
            setClipChildren(false);
            ((SlideContainer) getParent()).setClipChildren(false);
            if (list.size() >= 5) {
                setOffscreenPageLimit(2);
            } else {
                setOffscreenPageLimit(1);
            }
        }
        setAdapter(this.adapter);
        this.adapter.a(list, z);
        this.adapter.a(this, i);
        this.interval = i2;
        startAutoPlay();
        updatePageSize(i3, list);
    }

    private void updatePageSize(int i, List<i> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320e52d4", new Object[]{this, new Integer(i), list});
        } else if (i <= 0 || list == null || list.size() <= 0) {
        } else {
            View view = (View) getParent();
            int width = view.getWidth() - (i * 2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = width;
            layoutParams.leftMargin = (view.getWidth() - width) / 2;
            setLayoutParams(layoutParams);
        }
    }

    public void refresh(MUSDKInstance mUSDKInstance, List<i> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e7525e", new Object[]{this, mUSDKInstance, list, new Integer(i)});
        } else if (this.adapter == null) {
        } else {
            setAdapter(null);
            this.adapter = m.f() ? new e(mUSDKInstance) : new f(mUSDKInstance);
            this.adapter.a(list, this.infinite);
            this.adapter.a(this.hasTransformer);
            setAdapter(this.adapter);
            this.adapter.a(this, i);
            updatePageSize(getPageMargin(), list);
        }
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
            return;
        }
        this.autoPlay = z;
        startAutoPlay();
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
            return;
        }
        this.interval = i;
        startAutoPlay();
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    public void setInfinite(List<i> list, boolean z) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91604f86", new Object[]{this, list, new Boolean(z)});
        } else if (this.infinite == z || (dVar = this.adapter) == null) {
        } else {
            this.infinite = z;
            dVar.a(list, z);
        }
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.adapter;
        if (dVar == null) {
            return;
        }
        dVar.a(this, i);
    }

    public void scrollTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f85320", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        d dVar = this.adapter;
        if (dVar == null) {
            return;
        }
        dVar.a(this, i, z);
    }

    public int getRealPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
        }
        d dVar = this.adapter;
        if (dVar != null) {
            return dVar.a(i);
        }
        return -1;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onAttach();
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
            declaredField.setAccessible(true);
            declaredField.set(this, false);
            if (getAdapter() != null) {
                getAdapter().notifyDataSetChanged();
            }
            setCurrentItem(getCurrentItem());
        } catch (Exception e) {
            g.a(e);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        onAttach();
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        onDetach();
    }

    private void scrollToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd58c42", new Object[]{this});
            return;
        }
        d dVar = this.adapter;
        if (dVar == null || !dVar.c(getCurrentItem())) {
            return;
        }
        if (m.f()) {
            setCurrentItem(getCurrentItem() - 1, true);
        } else {
            setCurrentItem(getCurrentItem() + 1, true);
        }
    }

    private void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
            return;
        }
        this.attached = true;
        startAutoPlay();
    }

    private void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        this.attached = false;
        H.removeCallbacks(this.autoPlayRunnable);
    }

    private void startAutoPlay() {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96050e0c", new Object[]{this});
            return;
        }
        H.removeCallbacks(this.autoPlayRunnable);
        if (!this.autoPlay || !this.attached || (dVar = this.adapter) == null || !dVar.c(getCurrentItem())) {
            return;
        }
        H.postDelayed(this.autoPlayRunnable, this.interval * 1000);
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.adapter = null;
        setCurrentItem(0, false);
        H.removeCallbacks(this.autoPlayRunnable);
        setAdapter(null);
    }

    public void updateState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.adapter;
        if (dVar != null) {
            dVar.b(i);
        }
        if (i == 0) {
            onScrollSettled();
        } else if (i != 1) {
        } else {
            onPagerDragging();
        }
    }

    public void onScrollSettled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25ef354", new Object[]{this});
            return;
        }
        d dVar = this.adapter;
        if (dVar == null) {
            return;
        }
        dVar.a(this);
        startAutoPlay();
    }

    public void onPagerDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aeca59a", new Object[]{this});
        } else {
            H.removeCallbacks(this.autoPlayRunnable);
        }
    }
}

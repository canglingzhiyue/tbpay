package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import tb.kge;
import tb.ovj;

/* loaded from: classes8.dex */
public class MultiTabViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiTabViewPager";
    private ovj mAccidentSlideFeature;
    private boolean mEnableAccidentSlide;

    static {
        kge.a(-252920008);
    }

    public static /* synthetic */ Object ipc$super(MultiTabViewPager multiTabViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public MultiTabViewPager(Context context) {
        super(context);
        this.mEnableAccidentSlide = false;
        init();
    }

    public MultiTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEnableAccidentSlide = false;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mAccidentSlideFeature = new ovj(createITouchEventCallback());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ovj ovjVar = this.mAccidentSlideFeature;
        if (ovjVar != null && this.mEnableAccidentSlide) {
            ovjVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            z = super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            e.a(TAG, "onInterceptTouchEvent", e);
        }
        ovj ovjVar = this.mAccidentSlideFeature;
        return (ovjVar == null || !this.mEnableAccidentSlide) ? z : ovjVar.a(motionEvent, z);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            e.a(TAG, "onTouchEvent", e);
            return true;
        }
    }

    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        ovj ovjVar = this.mAccidentSlideFeature;
        if (ovjVar == null || !this.mEnableAccidentSlide) {
            return;
        }
        ovjVar.a();
    }

    public void setEnableAccidentSlide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5da90f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAccidentSlide = z;
        }
    }

    private ovj.a createITouchEventCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovj.a) ipChange.ipc$dispatch("a7d96b32", new Object[]{this}) : new ovj.a() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.viewpager.MultiTabViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ovj.a
            public void a(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                } else {
                    MultiTabViewPager.this.onTouchEvent(motionEvent);
                }
            }
        };
    }
}

package com.taobao.tao.infoflow.multitab;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import tb.kge;

/* loaded from: classes8.dex */
public class m implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final i b;

    /* renamed from: a  reason: collision with root package name */
    private float f20646a = -1.0f;
    private boolean c = false;

    static {
        kge.a(2040108890);
        kge.a(1848919473);
    }

    public m(i iVar) {
        this.b = iVar;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.f20646a = -1.0f;
            this.c = false;
        } else if (i != 1) {
        } else {
            this.c = true;
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (!this.c) {
        } else {
            float f2 = this.f20646a;
            if (f2 >= 0.0f) {
                if (f > f2) {
                    a(i + 1, IMultiTabPerformanceListener.TAB_SCROLL_SELECT);
                } else if (f < f2) {
                    a(i, IMultiTabPerformanceListener.TAB_SCROLL_SELECT);
                }
            }
            this.f20646a = f;
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else {
            a(i, "tabSelected");
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        View k = this.b.k(i);
        if (k == null || !(k instanceof SubWrapFrameLayout)) {
            return;
        }
        ((SubWrapFrameLayout) k).addTabView(this.b, str);
    }
}

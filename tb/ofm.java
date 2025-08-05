package tb;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ofm implements ViewPager.OnPageChangeListener, ofk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewPager f32002a;
    public int b;
    public float c;

    static {
        kge.a(1585490048);
        kge.a(630496629);
        kge.a(1848919473);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    public ofm(ViewPager viewPager) {
        this.b = 0;
        this.f32002a = viewPager;
        this.f32002a.addOnPageChangeListener(this);
        this.b = this.f32002a.getCurrentItem();
        this.c = 0.0f;
    }

    @Override // tb.ofk
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f32002a;
    }

    @Override // tb.ofk
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b == 0 && this.c == 0.0f;
    }

    @Override // tb.ofk
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b == this.f32002a.getAdapter().getCount() - 1 && this.c == 0.0f;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        this.b = i;
        this.c = f;
    }
}

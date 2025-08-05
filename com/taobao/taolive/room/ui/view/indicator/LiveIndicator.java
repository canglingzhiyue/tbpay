package com.taobao.taolive.room.ui.view.indicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveIndicator extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mNavigator;

    static {
        kge.a(2088107252);
    }

    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    public LiveIndicator(Context context) {
        this(context, null);
    }

    public LiveIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setNavigator(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5852", new Object[]{this, bVar});
        } else if (this.mNavigator == bVar) {
        } else {
            this.mNavigator = bVar;
            removeAllViews();
            if (!(this.mNavigator instanceof View)) {
                return;
            }
            addView((View) this.mNavigator, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public b getNavigator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a0fa18c6", new Object[]{this}) : this.mNavigator;
    }
}

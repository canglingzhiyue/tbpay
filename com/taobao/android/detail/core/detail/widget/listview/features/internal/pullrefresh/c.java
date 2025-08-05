package com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import tb.edb;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;

    /* renamed from: a  reason: collision with root package name */
    private RefreshHeadView f9690a;
    private TextView b;
    private TextView c;
    private CustomProgressBar d;
    private int e;
    private int f;
    private int g;
    private RotateAnimation h;
    private RotateAnimation i;
    private ScaleAnimation j;
    private AlphaAnimation k;
    private AnimationSet l;
    private String[] m;
    private boolean n = false;
    private int o = 0;
    private boolean p;

    static {
        kge.a(-66288608);
    }

    public c(Context context, int i, View view, View view2, int i2) {
        this.f9690a = new RefreshHeadView(context, i, view, view2);
        this.c = this.f9690a.getArrow();
        this.d = this.f9690a.getProgressbar();
        this.b = this.f9690a.getrefreshStateText();
        a(this.f9690a);
        this.f = this.f9690a.getMeasuredHeight();
        this.e = this.f9690a.getMeasuredWidth();
        if (i2 == 1 || i2 == 2) {
            this.f9690a.setPullDownDistance(this.f);
        } else {
            this.f9690a.setPullDownDistance(this.e);
        }
        this.g = i2;
        if (i2 == 1) {
            this.f9690a.setPadding(0, this.f * (-1), 0, 0);
        } else if (i2 == 2) {
            this.f9690a.setPadding(0, 0, 0, this.f * (-1));
        } else if (i2 == 3) {
            this.f9690a.setPadding(this.e * (-1), 0, 0, 0);
        } else {
            this.f9690a.setPadding(0, 0, this.e * (-1), 0);
        }
        this.f9690a.invalidate();
        this.h = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        this.h.setInterpolator(new LinearInterpolator());
        this.h.setDuration(250L);
        this.h.setFillAfter(true);
        this.j = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.j.setInterpolator(new AccelerateDecelerateInterpolator());
        this.k = new AlphaAnimation(1.0f, 0.0f);
        this.l = new AnimationSet(true);
        this.l.addAnimation(this.j);
        this.l.addAnimation(this.k);
        this.l.setDuration(200L);
        this.i = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.i.setInterpolator(new LinearInterpolator());
        this.i.setDuration(200L);
        this.i.setFillAfter(true);
        if (edb.f27204a) {
            i.d("size", "Type = " + i2 + "width:" + this.e + " height:" + this.f);
        }
        emu.a("com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.RefreshHeadViewManager");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            View childAt = this.f9690a.getChildAt(1);
            if (childAt != null) {
                this.o = childAt.getMeasuredHeight();
            }
            this.f9690a.setPullDownDistance(this.o);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.g;
        if ((i != 2 && i != 4) || !z) {
            return;
        }
        this.f9690a.setPadding(0, 0, 0, 0);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f9690a;
        if (refreshHeadView == null) {
            return;
        }
        refreshHeadView.setRefreshViewColor(i);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f9690a;
        if (refreshHeadView == null) {
            return;
        }
        refreshHeadView.setBackgroundColor(i);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f9690a;
        if (refreshHeadView == null) {
            return;
        }
        refreshHeadView.setProgressBarInitState(z);
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else {
            this.m = strArr;
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f9690a;
    }

    public void a(View view) {
        int makeMeasureSpec;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        if (i > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.f9690a.setPadding(i, i2, i3, i4);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f9690a.getPaddingTop();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f9690a.getPaddingBottom();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f9690a.getPaddingLeft();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f9690a.getPaddingRight();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.e;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.o;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n = z;
        if (this.p) {
            this.c.setVisibility(4);
            this.b.setVisibility(4);
        } else if (!this.n) {
        } else {
            this.c.setVisibility(0);
            this.b.setVisibility(0);
            this.c.clearAnimation();
            TextView textView = this.b;
            String[] strArr = this.m;
            textView.setText(strArr == null ? com.alibaba.android.ultron.common.page.i.LOAD_FINISH : strArr[3]);
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.n) {
        } else {
            if (this.p) {
                this.c.clearAnimation();
                this.b.clearAnimation();
                this.c.setVisibility(4);
                this.b.setVisibility(4);
            } else if (i == 0) {
                this.b.setVisibility(0);
                this.c.setVisibility(0);
                this.c.clearAnimation();
                this.c.startAnimation(this.h);
                TextView textView = this.b;
                String[] strArr = this.m;
                textView.setText((strArr == null || strArr.length < 2) ? "松开刷新" : strArr[1]);
                if (!edb.f27204a) {
                    return;
                }
                i.d("RefreshHeadViewManager", "当前状态，松开刷新");
            } else if (i == 1) {
                this.b.setVisibility(0);
                this.c.setVisibility(0);
                TextView textView2 = this.b;
                String[] strArr2 = this.m;
                textView2.setText((strArr2 == null || strArr2.length <= 0) ? "下拉刷新" : strArr2[0]);
                if (!edb.f27204a) {
                    return;
                }
                i.d("RefreshHeadViewManager", "当前状态，下拉刷新");
            } else if (i == 2) {
                this.c.setVisibility(4);
                TextView textView3 = this.b;
                String[] strArr3 = this.m;
                textView3.setText((strArr3 == null || strArr3.length < 3) ? "正在刷新..." : strArr3[2]);
                if (!edb.f27204a) {
                    return;
                }
                i.d("RefreshHeadViewManager", "当前状态,正在刷新...");
            } else if (i != 3) {
            } else {
                this.c.clearAnimation();
                this.c.startAnimation(this.l);
                TextView textView4 = this.b;
                String[] strArr4 = this.m;
                textView4.setText((strArr4 == null || strArr4.length < 3) ? "数据加载完毕" : strArr4[3]);
                if (!edb.f27204a) {
                    return;
                }
                i.d("RefreshHeadViewManager", "当前状态，done");
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.p = true;
        }
    }
}

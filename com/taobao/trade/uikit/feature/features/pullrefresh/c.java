package com.taobao.trade.uikit.feature.features.pullrefresh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.alibaba.android.ultron.common.page.i;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;

    /* renamed from: a  reason: collision with root package name */
    private RefreshHeadView f22995a;
    private TextView b;
    private TextView c;
    private CustomProgressBar d;
    private int e;
    private int f;
    private int g;
    private AnimationSet h;
    private String[] i;
    private boolean j = false;
    private int k = 0;

    static {
        kge.a(-964844940);
    }

    public c(Context context, int i, View view, boolean z, int i2) {
        this.f22995a = new RefreshHeadView(context, i, view, z);
        this.c = this.f22995a.getArrow();
        this.d = this.f22995a.getProgressbar();
        this.b = this.f22995a.getRefreshStateText();
        a(this.f22995a);
        this.f = this.f22995a.getMeasuredHeight();
        this.e = this.f22995a.getMeasuredWidth();
        if (i2 == 1 || i2 == 2) {
            this.f22995a.setPullDownDistance(this.f);
        } else {
            this.f22995a.setPullDownDistance(this.e);
        }
        this.g = i2;
        if (i2 == 1) {
            this.f22995a.setPadding(0, this.f * (-1), 0, 0);
        } else if (i2 == 2) {
            this.f22995a.setPadding(0, 0, 0, this.f * (-1));
        } else if (i2 == 3) {
            this.f22995a.setPadding(this.e * (-1), 0, 0, 0);
        } else {
            this.f22995a.setPadding(0, 0, this.e * (-1), 0);
        }
        this.f22995a.invalidate();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.h = new AnimationSet(true);
        this.h.addAnimation(scaleAnimation);
        this.h.addAnimation(alphaAnimation);
        this.h.setDuration(200L);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            View childAt = this.f22995a.getChildAt(1);
            if (childAt != null) {
                this.k = childAt.getMeasuredHeight();
            }
            this.f22995a.setPullDownDistance(this.k);
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
        this.f22995a.setPadding(0, 0, 0, 0);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f22995a;
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
        RefreshHeadView refreshHeadView = this.f22995a;
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
        RefreshHeadView refreshHeadView = this.f22995a;
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
            this.i = strArr;
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f22995a;
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
            this.f22995a.setPadding(i, i2, i3, i4);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f22995a.getPaddingTop();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f22995a.getPaddingBottom();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f22995a.getPaddingLeft();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f22995a.getPaddingRight();
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.k;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = z;
        if (this.j) {
            this.c.setVisibility(0);
            this.b.setVisibility(0);
            this.d.setVisibility(0);
            this.d.stopLoadingAnimation();
            this.c.clearAnimation();
            TextView textView = this.b;
            String[] strArr = this.i;
            textView.setText(strArr == null ? i.LOAD_FINISH : strArr[3]);
            return;
        }
        this.c.setVisibility(4);
        this.d.setVisibility(4);
        this.b.setVisibility(4);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.j) {
        } else {
            if (i == 0) {
                this.c.setVisibility(4);
                this.d.setVisibility(0);
                this.b.setVisibility(0);
                this.c.clearAnimation();
                this.c.startAnimation(this.h);
                TextView textView = this.b;
                String[] strArr = this.i;
                textView.setText((strArr == null || strArr.length < 2) ? "松开刷新" : strArr[1]);
            } else if (i == 1) {
                this.b.setVisibility(0);
                this.c.setVisibility(0);
                TextView textView2 = this.b;
                String[] strArr2 = this.i;
                textView2.setText((strArr2 == null || strArr2.length <= 0) ? "下拉刷新" : strArr2[0]);
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.d.stopLoadingAnimation();
                TextView textView3 = this.b;
                String[] strArr3 = this.i;
                textView3.setText((strArr3 == null || strArr3.length < 3) ? "数据加载完毕" : strArr3[3]);
            } else {
                this.b.setVisibility(0);
                this.d.setVisibility(0);
                this.d.startLoadingAnimaton();
                this.c.clearAnimation();
                this.c.setVisibility(4);
                TextView textView4 = this.b;
                String[] strArr4 = this.i;
                textView4.setText((strArr4 == null || strArr4.length < 3) ? "正在刷新..." : strArr4[2]);
            }
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.d.changeProgressBarState(i);
        }
    }
}

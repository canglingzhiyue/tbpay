package com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.alibaba.android.ultron.common.page.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.utils.UIKITLog;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;

    /* renamed from: a  reason: collision with root package name */
    private RefreshHeadView f20493a;
    private TextView b;
    private TextView c;
    private CustomProgressBar d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ObjectAnimator i;
    private String[] j;
    private boolean k = false;
    private int l = 0;
    private float m;
    private int n;

    static {
        kge.a(-969693700);
    }

    public c(Context context, int i, View view, boolean z, int i2, float f) {
        this.m = 0.0f;
        this.f20493a = new RefreshHeadView(context, i, view, z);
        this.c = this.f20493a.getArrow();
        this.d = this.f20493a.getProgressbar();
        this.b = this.f20493a.getRefreshStateText();
        this.m = f;
        a(this.f20493a);
        this.f = this.f20493a.getMeasuredHeight();
        this.e = this.f20493a.getMeasuredWidth();
        if (i2 == 1 || i2 == 2) {
            this.n = this.f;
        } else {
            this.n = this.e;
        }
        this.f20493a.setPullDownDistance(this.n);
        this.g = i2;
        if (i2 == 1) {
            this.f20493a.setPadding(0, this.f * (-1), 0, 0);
        } else if (i2 == 2) {
            this.f20493a.setPadding(0, 0, 0, this.f * (-1));
        } else if (i2 == 3) {
            this.f20493a.setPadding(this.e * (-1), 0, 0, 0);
        } else {
            this.f20493a.setPadding(0, 0, this.e * (-1), 0);
        }
        this.f20493a.invalidate();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            View childAt = this.f20493a.getChildAt(1);
            if (childAt != null) {
                this.l = childAt.getMeasuredHeight();
            }
            this.f20493a.setPullDownDistance(this.l);
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
        this.f20493a.setPadding(0, 0, 0, 0);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f20493a;
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
        RefreshHeadView refreshHeadView = this.f20493a;
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
        RefreshHeadView refreshHeadView = this.f20493a;
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
            this.j = strArr;
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f20493a;
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
            return;
        }
        int i5 = this.f;
        int i6 = i2 + i5;
        int i7 = this.h;
        if (i6 > i7 && i7 > 0) {
            i2 = i7 - i5;
        }
        this.f20493a.setPadding(i, i2, i3, i4);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f20493a.getPaddingTop();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f20493a.getPaddingBottom();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f20493a.getPaddingLeft();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f20493a.getPaddingRight();
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.l;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = z;
        if (this.k) {
            this.c.setVisibility(0);
            this.b.setVisibility(0);
            this.d.setVisibility(0);
            this.d.stopLoadingAnimation();
            TextView textView = this.b;
            String[] strArr = this.j;
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
        } else if (this.k) {
        } else {
            if (i == 0) {
                this.d.setVisibility(0);
                this.b.setVisibility(0);
                TextView textView = this.b;
                String[] strArr = this.j;
                textView.setText((strArr == null || strArr.length < 2) ? "释放刷新" : strArr[1]);
                i();
                UIKITLog.v("RefreshHeadViewManager", "当前状态，松开刷新", new Object[0]);
            } else if (i == 1) {
                this.b.setVisibility(0);
                TextView textView2 = this.b;
                String[] strArr2 = this.j;
                textView2.setText((strArr2 == null || strArr2.length <= 0) ? "下拉刷新" : strArr2[0]);
                j();
                UIKITLog.v("RefreshHeadViewManager", "当前状态，下拉刷新", new Object[0]);
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.d.stopLoadingAnimation();
                TextView textView3 = this.b;
                String[] strArr3 = this.j;
                textView3.setText((strArr3 == null || strArr3.length < 3) ? "刷新完成" : strArr3[3]);
                UIKITLog.v("RefreshHeadViewManager", "当前状态，done", new Object[0]);
                View findViewById = this.f20493a.findViewById(R.id.tnode_refresh_header_view);
                if (findViewById == null) {
                    return;
                }
                findViewById.setAlpha(1.0f);
            } else {
                this.b.setVisibility(0);
                TextView textView4 = this.b;
                String[] strArr4 = this.j;
                textView4.setText((strArr4 == null || strArr4.length < 3) ? "正在刷新" : strArr4[2]);
                this.d.setVisibility(0);
                this.d.startLoadingAnimaton();
                this.c.setVisibility(4);
                UIKITLog.v("RefreshHeadViewManager", "当前状态,正在刷新...", new Object[0]);
                View findViewById2 = this.f20493a.findViewById(R.id.tnode_refresh_header_view);
                if (findViewById2 == null) {
                    return;
                }
                findViewById2.setAlpha(1.0f);
            }
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.n;
        float f = i2 != 0 ? i / i2 : 0.0f;
        float f2 = this.m;
        if (f2 > 0.0f) {
            f = f <= f2 ? 0.0f : (f - f2) * 2.0f;
            i = (int) (this.n * f);
        }
        this.f20493a.setAlpha(f * 255.0f);
        this.d.changeProgressBarState(i);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.i == null) {
            this.i = ObjectAnimator.ofPropertyValuesHolder(this.c, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            this.i.setInterpolator(new AccelerateDecelerateInterpolator());
            this.i.setDuration(200L);
        }
        this.i.start();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.c.setScaleX(1.0f);
        this.c.setScaleY(1.0f);
        this.c.setAlpha(1.0f);
        this.c.setVisibility(0);
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }
}

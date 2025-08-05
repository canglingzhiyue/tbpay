package com.alibaba.android.ultron.common.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.e;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f2540a;
    private View b;
    private int c;
    private int d;
    private int e;
    private View f;
    private TextView g;
    private ImageView h;
    private ProgressBar i;
    private RefreshCustomProgressBar j;
    private int k = -1;
    private int l;

    static {
        kge.a(-881989005);
        kge.a(127538407);
    }

    public a(Context context, View view) {
        this.f2540a = context;
        this.b = view;
        this.d = a(context, 24);
        this.e = (int) TypedValue.applyDimension(1, 64.0f, context.getResources().getDisplayMetrics());
        this.c = ((int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics())) + this.d;
    }

    private int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{this, context, new Integer(i)})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = resources.getDimensionPixelSize(identifier);
        }
        return i2 <= 0 ? (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()) : i2;
    }

    @Override // com.taobao.ptr.e
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.f = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.common_page_refresh_ptr_loading_vertical, viewGroup, false);
        View findViewById = this.f.findViewById(R.id.tv_ptr_label);
        if (findViewById instanceof TextView) {
            this.g = (TextView) findViewById;
            this.g.setTextColor(-16777216);
        }
        View findViewById2 = this.f.findViewById(R.id.iv_ptr_indicator);
        if (findViewById2 instanceof ImageView) {
            this.h = (ImageView) findViewById2;
        }
        View findViewById3 = this.f.findViewById(R.id.pb_ptr_progress);
        if (findViewById3 instanceof ProgressBar) {
            this.i = (ProgressBar) findViewById3;
        }
        b("下拉刷新页面...");
        return this.f;
    }

    @Override // com.taobao.ptr.e
    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.b.getVisibility() == 0) {
            return this.c + this.e;
        }
        return this.c;
    }

    private void b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdf7d8d", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.g;
        if (textView == null || charSequence == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // com.taobao.ptr.e
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    private float c(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{this, new Float(f)})).floatValue() : Math.abs(f) / a(this.l);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.clearAnimation();
            view.setVisibility(0);
        }
    }

    private void b(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setDuration(200L);
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.alibaba.android.ultron.common.widget.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else {
                        view.setVisibility(8);
                    }
                }
            });
            view.clearAnimation();
            view.startAnimation(animationSet);
        }
    }

    @Override // com.taobao.ptr.e
    public void a(float f) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        float c = c(f);
        if (c < 1.0d) {
            TextView textView = this.g;
            if (textView != null) {
                textView.setText("下拉刷新页面...");
            }
        } else {
            TextView textView2 = this.g;
            if (textView2 != null) {
                textView2.setText("释放刷新页面...");
            }
        }
        TextView textView3 = this.g;
        if (textView3 != null && (i = this.k) > 0) {
            textView3.setTextColor(i);
        }
        a(this.h);
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null && refreshCustomProgressBar.getVisibility() == 0) {
            this.j.onPullDownDistance(c);
        }
        ProgressBar progressBar = this.i;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        this.i.setVisibility(8);
    }

    @Override // com.taobao.ptr.e
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (c(f) < 1.0d) {
        } else {
            b(this.h);
        }
    }

    @Override // com.taobao.ptr.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TextView textView = this.g;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.g.setVisibility(0);
            }
            this.g.setText("加载中...");
        }
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null && refreshCustomProgressBar.getVisibility() == 0) {
            this.j.setVisibility(8);
        }
        ProgressBar progressBar = this.i;
        if (progressBar == null || progressBar.getVisibility() != 8) {
            return;
        }
        this.i.setVisibility(0);
    }

    @Override // com.taobao.ptr.e
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null) {
            refreshCustomProgressBar.setVisibility(0);
        }
        ProgressBar progressBar = this.i;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.g;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // com.taobao.ptr.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TextView textView = this.g;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.g.setVisibility(0);
            }
            this.g.setText("下拉刷新页面...");
        }
        a(this.h);
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null) {
            refreshCustomProgressBar.reset();
            if (this.j.getVisibility() == 8) {
                this.j.setVisibility(0);
            }
        }
        ProgressBar progressBar = this.i;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        this.i.setVisibility(8);
    }

    @Override // com.taobao.ptr.e
    public void a(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7013410", new Object[]{this, new Boolean(z), charSequence});
        } else if (z) {
            RefreshCustomProgressBar refreshCustomProgressBar = this.j;
            if (refreshCustomProgressBar != null) {
                refreshCustomProgressBar.setVisibility(8);
            }
            ProgressBar progressBar = this.i;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.g;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        } else {
            RefreshCustomProgressBar refreshCustomProgressBar2 = this.j;
            if (refreshCustomProgressBar2 != null) {
                refreshCustomProgressBar2.setVisibility(0);
            }
            ProgressBar progressBar2 = this.i;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.g;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
            this.g.setText("下拉刷新页面...");
        }
    }
}

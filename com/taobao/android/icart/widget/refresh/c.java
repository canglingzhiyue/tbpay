package com.taobao.android.icart.widget.refresh;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.ptr.e;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.bbz;
import tb.bew;
import tb.dcn;
import tb.jqi;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f12888a;
    private TextView b;
    private ImageView c;
    private ProgressBar d;
    private CartCustomProgressBar e;
    private int f;
    private View g;
    private boolean h;
    private final bbz j;

    static {
        kge.a(-38788082);
        kge.a(127538407);
    }

    public c(Context context, bbz bbzVar) {
        this.f12888a = bbzVar.x().a(20.0f) + SystemBarDecorator.SystemBarConfig.getStatusBarHeight(context);
        this.j = bbzVar;
    }

    @Override // com.taobao.ptr.e
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        if (!jqi.a("iCart", "enableReusePtrLoadingInflate", true)) {
            this.g = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            c();
        } else if (this.g == null) {
            this.g = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            c();
        }
        ViewParent parent = this.g.getParent();
        if ((parent instanceof ViewGroup) && parent != viewGroup) {
            ((ViewGroup) parent).removeView(this.g);
        }
        KeyEvent.Callback callback = this.b;
        if (callback == null) {
            callback = this.g.findViewById(R.id.tv_ptr_label);
        }
        if (callback instanceof TextView) {
            this.b = (TextView) callback;
            if (bew.a().b()) {
                this.b.setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
            } else {
                this.b.setTextColor(-1);
            }
            if (dcn.a()) {
                ((LinearLayout.LayoutParams) this.b.getLayoutParams()).weight = 6.0f;
            }
        }
        if (this.c == null) {
            View findViewById = this.g.findViewById(R.id.iv_ptr_indicator);
            if (findViewById instanceof ImageView) {
                this.c = (ImageView) findViewById;
            }
        }
        if (this.d == null) {
            View findViewById2 = this.g.findViewById(R.id.pb_ptr_progress);
            if (findViewById2 instanceof ProgressBar) {
                this.d = (ProgressBar) findViewById2;
            }
        }
        if (this.e == null) {
            View findViewById3 = this.g.findViewById(R.id.cpb_ptr_progress);
            if (findViewById3 instanceof CartCustomProgressBar) {
                this.e = (CartCustomProgressBar) findViewById3;
            }
        }
        b(com.alibaba.ability.localization.b.a(R.string.app_reload_page));
        return this.g;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // com.taobao.ptr.e
    public int a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.h) {
            i2 = this.j.x().a(36.0f);
        }
        return this.f12888a + i2;
    }

    private void b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdf7d8d", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.b;
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
            this.f = i;
        }
    }

    private float c(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{this, new Float(f)})).floatValue() : Math.abs(f) / a(this.f);
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

    public static void b(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else if (view == null) {
        } else {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setDuration(200L);
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.icart.widget.refresh.c.1
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        float c = c(f);
        if (c < 1.0d) {
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(com.alibaba.ability.localization.b.a(R.string.app_reload_page));
            }
        } else {
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21625));
            }
        }
        if (this.b != null) {
            if (bew.a().b() || this.j.n().o().o()) {
                this.b.setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
            } else {
                this.b.setTextColor(-1);
            }
        }
        a(this.c);
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.e.onPullDownDistance(c);
        }
        ProgressBar progressBar = this.d;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        this.d.setVisibility(8);
    }

    @Override // com.taobao.ptr.e
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (c(f) < 1.0d) {
        } else {
            b(this.c);
        }
    }

    @Override // com.taobao.ptr.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TextView textView = this.b;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.b.setVisibility(0);
            }
            this.b.setText(com.alibaba.ability.localization.b.a(R.string.app_loading_progress));
        }
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.e.setVisibility(8);
        }
        ProgressBar progressBar = this.d;
        if (progressBar == null || progressBar.getVisibility() != 8) {
            return;
        }
        this.d.setVisibility(0);
    }

    @Override // com.taobao.ptr.e
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.setVisibility(0);
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.b;
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
        TextView textView = this.b;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.b.setVisibility(0);
            }
            this.b.setText(com.alibaba.ability.localization.b.a(R.string.app_reload_page));
        }
        a(this.c);
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.reset();
            if (this.e.getVisibility() == 8) {
                this.e.setVisibility(0);
            }
        }
        ProgressBar progressBar = this.d;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        this.d.setVisibility(8);
    }

    @Override // com.taobao.ptr.e
    public void a(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7013410", new Object[]{this, new Boolean(z), charSequence});
        } else if (z) {
            CartCustomProgressBar cartCustomProgressBar = this.e;
            if (cartCustomProgressBar != null) {
                cartCustomProgressBar.setVisibility(8);
            }
            ProgressBar progressBar = this.d;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.b;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        } else {
            CartCustomProgressBar cartCustomProgressBar2 = this.e;
            if (cartCustomProgressBar2 != null) {
                cartCustomProgressBar2.setVisibility(0);
            }
            ProgressBar progressBar2 = this.d;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.b;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
            this.b.setText(com.alibaba.ability.localization.b.a(R.string.app_reload_page));
        }
    }
}

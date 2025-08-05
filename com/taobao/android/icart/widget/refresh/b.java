package com.taobao.android.icart.widget.refresh;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.ptr.PtrLayout;
import com.taobao.ptr.e;
import com.taobao.taobao.R;
import tb.jqi;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PtrLayout f12887a;
    private View b;
    private TextView c;
    private ImageView d;
    private ProgressBar e;
    private CartCustomProgressBar f;
    private int g;
    private e h;

    static {
        kge.a(161424450);
        kge.a(127538407);
    }

    @Override // com.taobao.ptr.e
    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    public b(PtrLayout ptrLayout) {
        this.f12887a = ptrLayout;
    }

    @Override // com.taobao.ptr.e
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        if (!jqi.a("iCart", "enableReusePtrLoadingInflate", true)) {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            c();
        } else if (this.b == null) {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            c();
        }
        ViewParent parent = this.b.getParent();
        if ((parent instanceof ViewGroup) && parent != viewGroup) {
            ((ViewGroup) parent).removeView(this.b);
        }
        if (this.h != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.b;
            viewGroup2.removeAllViews();
            this.c = null;
            this.e = null;
            viewGroup2.addView(this.h.a(viewGroup2));
        } else {
            if (this.c == null) {
                View findViewById = this.b.findViewById(R.id.tv_ptr_label);
                if (findViewById instanceof TextView) {
                    this.c = (TextView) findViewById;
                }
            }
            if (this.d == null) {
                View findViewById2 = this.b.findViewById(R.id.iv_ptr_indicator);
                if (findViewById2 instanceof ImageView) {
                    this.d = (ImageView) findViewById2;
                }
            }
            if (this.e == null) {
                View findViewById3 = this.b.findViewById(R.id.pb_ptr_progress);
                if (findViewById3 instanceof ProgressBar) {
                    this.e = (ProgressBar) findViewById3;
                }
            }
            if (this.f == null) {
                View findViewById4 = this.b.findViewById(R.id.cpb_ptr_progress);
                if (findViewById4 instanceof CartCustomProgressBar) {
                    this.f = (CartCustomProgressBar) findViewById4;
                }
            }
            b(com.alibaba.ability.localization.b.a(R.string.app_pull_up_to_load));
            TextView textView = this.c;
            if (textView != null) {
                textView.setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
            }
        }
        return this.b;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    private void b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdf7d8d", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.c;
        if (textView == null || charSequence == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void a(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe686e6", new Object[]{this, colorStateList});
            return;
        }
        TextView textView = this.c;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37f9886", new Object[]{this, eVar});
        } else {
            this.h = eVar;
        }
    }

    @Override // com.taobao.ptr.e
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.b(i);
    }

    private float c(float f) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{this, new Float(f)})).floatValue();
        }
        View view = this.b;
        if (view != null) {
            i = view.getHeight();
        }
        return Math.abs(f) / i;
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

    @Override // com.taobao.ptr.e
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        float c = c(f);
        if (c < 1.0d) {
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(com.alibaba.ability.localization.b.a(R.string.app_pull_up_to_load));
            }
        } else {
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21638));
            }
        }
        a(this.d);
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.f.onPullDownDistance(c);
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.e.setVisibility(8);
        }
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.a(f);
    }

    @Override // com.taobao.ptr.e
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        if (c(f) >= 1.0d) {
            c.b(this.d);
        }
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.b(f);
    }

    @Override // com.taobao.ptr.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TextView textView = this.c;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(com.alibaba.ability.localization.b.a(R.string.app_loading_progress));
        }
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.f.setVisibility(8);
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null && progressBar.getVisibility() == 8) {
            this.e.setVisibility(0);
        }
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Override // com.taobao.ptr.e
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.setVisibility(0);
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        }
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.a(charSequence);
    }

    @Override // com.taobao.ptr.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TextView textView = this.c;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(com.alibaba.ability.localization.b.a(R.string.app_pull_up_to_load));
        }
        a(this.d);
        CartCustomProgressBar cartCustomProgressBar = this.f;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.reset();
            if (this.f.getVisibility() == 8) {
                this.f.setVisibility(0);
            }
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.e.setVisibility(8);
        }
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    @Override // com.taobao.ptr.e
    public void a(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7013410", new Object[]{this, new Boolean(z), charSequence});
            return;
        }
        if (z) {
            CartCustomProgressBar cartCustomProgressBar = this.f;
            if (cartCustomProgressBar != null) {
                cartCustomProgressBar.setVisibility(8);
            }
            ProgressBar progressBar = this.e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else {
            CartCustomProgressBar cartCustomProgressBar2 = this.f;
            if (cartCustomProgressBar2 != null) {
                cartCustomProgressBar2.setVisibility(0);
            }
            ProgressBar progressBar2 = this.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.c.setText(com.alibaba.ability.localization.b.a(R.string.app_pull_up_to_load));
            }
        }
        e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.a(z, charSequence);
    }
}

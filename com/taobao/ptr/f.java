package com.taobao.ptr;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class f implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PtrLayout f18959a;
    private View b;
    private TextView c;
    private ProgressBar d;
    private int e;
    private e f;

    static {
        kge.a(1191753616);
        kge.a(127538407);
    }

    public f(PtrLayout ptrLayout) {
        this.f18959a = ptrLayout;
    }

    @Override // com.taobao.ptr.e
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        if (this.e == 1) {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ptr_loading_horizontal, viewGroup, false);
        } else {
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ptr_loading_vertical, viewGroup, false);
        }
        if (this.f != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.b;
            viewGroup2.removeAllViews();
            this.c = null;
            this.d = null;
            viewGroup2.addView(this.f.a(viewGroup2));
        } else {
            View findViewById = this.b.findViewById(R.id.tv_ptr_label);
            if (findViewById instanceof TextView) {
                this.c = (TextView) findViewById;
            }
            View findViewById2 = this.b.findViewById(R.id.pb_ptr_progress);
            if (findViewById2 instanceof ProgressBar) {
                this.d = (ProgressBar) findViewById2;
            }
            PtrLayout ptrLayout = this.f18959a;
            if (ptrLayout != null) {
                a(ptrLayout.getLoadingDrawable());
                a(this.f18959a.getTextColor());
                b(this.f18959a.getPullLabel());
            }
        }
        return this.b;
    }

    @Override // com.taobao.ptr.e
    public int a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        e eVar = this.f;
        if (eVar != null) {
            i2 = eVar.a(i);
        }
        if (i2 != 0) {
            return i2;
        }
        if (i == 1) {
            View view = this.b;
            return view != null ? view.getWidth() : i2;
        }
        View view2 = this.b;
        return view2 != null ? view2.getHeight() : i2;
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

    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        ProgressBar progressBar = this.d;
        if (progressBar == null || drawable == null) {
            return;
        }
        progressBar.setIndeterminateDrawable(drawable);
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37f9886", new Object[]{this, eVar});
        } else {
            this.f = eVar;
        }
    }

    @Override // com.taobao.ptr.e
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        e eVar = this.f;
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
        if (this.e == 1) {
            View view = this.b;
            if (view != null) {
                i = view.getWidth();
            }
        } else {
            View view2 = this.b;
            if (view2 != null) {
                i = view2.getHeight();
            }
        }
        return Math.abs(f) / i;
    }

    @Override // com.taobao.ptr.e
    public void a(float f) {
        PtrLayout ptrLayout;
        PtrLayout ptrLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        if (c(f) < 1.0d) {
            TextView textView = this.c;
            if (textView != null && (ptrLayout2 = this.f18959a) != null) {
                textView.setText(ptrLayout2.getPullLabel());
            }
        } else {
            TextView textView2 = this.c;
            if (textView2 != null && (ptrLayout = this.f18959a) != null) {
                textView2.setText(ptrLayout.getReleaseLabel());
            }
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
        e eVar = this.f;
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
        e eVar = this.f;
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
        if (textView != null && this.f18959a != null) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(this.f18959a.getRefreshingLabel());
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 8) {
            this.d.setVisibility(0);
        }
        e eVar = this.f;
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
        ProgressBar progressBar = this.d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        }
        e eVar = this.f;
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
        if (textView != null && this.f18959a != null) {
            if (textView.getVisibility() == 8) {
                this.c.setVisibility(0);
            }
            this.c.setText(this.f18959a.getPullLabel());
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
        e eVar = this.f;
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
            ProgressBar progressBar = this.d;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else {
            ProgressBar progressBar2 = this.d;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.c;
            if (textView2 != null && this.f18959a != null) {
                textView2.setVisibility(0);
                this.c.setText(this.f18959a.getPullLabel());
            }
        }
        e eVar = this.f;
        if (eVar == null) {
            return;
        }
        eVar.a(z, charSequence);
    }
}

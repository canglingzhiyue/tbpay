package com.alibaba.android.ultron.vfw.popupwindow;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.List;
import tb.bnn;
import tb.bnv;
import tb.bny;
import tb.bpl;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float p;

    /* renamed from: a */
    private bnv f2724a;
    private PopupWindow b;
    private bny c;
    private FrameLayout d;
    private LinearLayout e;
    private RecyclerView f;
    private LinearLayout g;
    private ImageView h;
    private bnn i;
    private View j;
    private AlphaAnimation k;
    private AlphaAnimation l;
    private TranslateAnimation m;
    private TranslateAnimation n;
    private RelativeLayout o;
    private a q;
    private com.alibaba.android.ultron.vfw.popupwindow.a r;
    private boolean s = false;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ PopupWindow a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("a63cce8a", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ View b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("5386752d", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ AlphaAnimation c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlphaAnimation) ipChange.ipc$dispatch("e335eb22", new Object[]{bVar}) : bVar.l;
    }

    public static /* synthetic */ a d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2e509aae", new Object[]{bVar}) : bVar.q;
    }

    public static /* synthetic */ boolean e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("218c2af2", new Object[]{bVar})).booleanValue() : bVar.s;
    }

    static {
        kge.a(722015846);
        p = 0.6f;
    }

    public b(bny bnyVar) {
        this.c = bnyVar;
        d();
        f();
        e();
    }

    public void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
        } else {
            this.f2724a = bnvVar;
        }
    }

    public bnv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnv) ipChange.ipc$dispatch("f02dcb4", new Object[]{this}) : this.f2724a;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = new FrameLayout(this.c.k());
        this.j = new View(this.c.k());
        this.j.setBackgroundColor(Color.parseColor("#7F000000"));
        this.d.addView(this.j);
        this.o = (RelativeLayout) LayoutInflater.from(this.c.k()).inflate(R.layout.ultron_popop_window, (ViewGroup) this.d, false);
        this.o.setClickable(true);
        this.e = (LinearLayout) this.o.findViewById(R.id.ultron_popup_header_view);
        this.f = (RecyclerView) this.o.findViewById(R.id.ultron_popup_recycler_view);
        this.g = (LinearLayout) this.o.findViewById(R.id.ultron_popup_footer_view);
        this.h = (ImageView) this.o.findViewById(R.id.ultron_popup_close_button);
        this.d.addView(this.o, new FrameLayout.LayoutParams(-1, (int) (bpl.b(this.c.k()) * p), 80));
        this.d.setFocusable(true);
        this.d.setFocusableInTouchMode(true);
        this.i = new bnn(this.c);
        this.r = new com.alibaba.android.ultron.vfw.popupwindow.a(this.c.k());
        this.r.setOrientation(1);
        this.f.setLayoutManager(this.r);
        this.f.setAdapter(this.i);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.k = new AlphaAnimation(0.0f, 1.0f);
        this.k.setDuration(200L);
        this.l = new AlphaAnimation(1.0f, 0.0f);
        this.l.setDuration(200L);
        this.l.setAnimationListener(new Animation.AnimationListener() { // from class: com.alibaba.android.ultron.vfw.popupwindow.b.1
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

            {
                b.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    b.a(b.this).dismiss();
                }
            }
        });
        this.m = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.m.setDuration(200L);
        this.n = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.n.setDuration(200L);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.vfw.popupwindow.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b.b(b.this).setEnabled(false);
                b.this.a(false);
            }
        });
        this.d.setOnKeyListener(new View.OnKeyListener() { // from class: com.alibaba.android.ultron.vfw.popupwindow.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 4 && b.a(b.this).isShowing() && !b.c(b.this).hasStarted()) {
                    b.this.a(false);
                }
                return false;
            }
        });
    }

    public void a(C0102b c0102b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b917cdec", new Object[]{this, c0102b});
            return;
        }
        if (this.b == null) {
            this.b = new PopupWindow(this.c.k());
            this.b.setBackgroundDrawable(new ColorDrawable(0));
            this.b.setWidth(-1);
            this.b.setHeight(-1);
            this.b.setInputMethodMode(1);
            this.b.setSoftInputMode(32);
            this.b.setOutsideTouchable(true);
            this.b.setFocusable(true);
        }
        if (c0102b != null) {
            if (C0102b.a(c0102b) < 0) {
                this.j.setBackgroundColor(C0102b.a(c0102b));
            }
            if (C0102b.b(c0102b) > 0.0f && C0102b.b(c0102b) != p) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.o.getLayoutParams();
                layoutParams.height = (int) (bpl.b(this.c.k()) * C0102b.b(c0102b));
                this.o.setLayoutParams(layoutParams);
            }
            if (C0102b.c(c0102b) != null) {
                this.h.setVisibility(0);
                this.h.setContentDescription(com.alibaba.ability.localization.b.a(R.string.app_close));
                this.h.setImageDrawable(C0102b.c(c0102b));
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.vfw.popupwindow.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        b.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            b.this.a(false);
                        }
                    }
                });
            } else {
                this.h.setVisibility(8);
            }
            if (C0102b.d(c0102b) < 0) {
                this.o.setBackgroundDrawable(bpl.a(C0102b.d(c0102b), C0102b.e(c0102b), C0102b.f(c0102b)));
            }
        }
        this.j.setEnabled(true);
        this.b.setContentView(this.d);
        this.b.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager$5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (b.d(b.this) == null || b.e(b.this)) {
                } else {
                    b.d(b.this).a();
                }
            }
        });
        g();
        h();
        i();
        this.j.startAnimation(this.k);
        this.o.startAnimation(this.m);
        this.b.showAtLocation(this.d, C0102b.g(c0102b), 0, 0);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.s = z;
        this.j.startAnimation(this.l);
        this.o.startAnimation(this.n);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.e.removeAllViews();
        }
        j jVar = (j) this.c.a(j.class);
        List<IDMComponent> e = this.f2724a.e();
        if (e == null || e.size() <= 0) {
            return;
        }
        for (IDMComponent iDMComponent : e) {
            h a2 = jVar.a(this.e, jVar.a(iDMComponent));
            View view = a2.itemView;
            if (view != null) {
                this.e.addView(view);
            }
            jVar.a(a2, iDMComponent);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        List<IDMComponent> f = this.f2724a.f();
        if (f != null && f.size() <= 1) {
            this.r.a(false);
        } else {
            this.r.a(true);
        }
        this.i.b(f);
        this.i.notifyDataSetChanged();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.i.notifyDataSetChanged();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.g.removeAllViews();
        }
        List<IDMComponent> g = this.f2724a.g();
        j jVar = (j) this.c.a(j.class);
        if (g == null || g.size() <= 0) {
            return;
        }
        for (IDMComponent iDMComponent : g) {
            h a2 = jVar.a(this.g, jVar.a(iDMComponent));
            View view = a2.itemView;
            if (view != null) {
                this.g.addView(view);
            }
            jVar.a(a2, iDMComponent);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b917598d", new Object[]{this, aVar});
        } else {
            this.q = aVar;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        PopupWindow popupWindow = this.b;
        return popupWindow != null && popupWindow.isShowing();
    }

    /* renamed from: com.alibaba.android.ultron.vfw.popupwindow.b$b */
    /* loaded from: classes2.dex */
    public static class C0102b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_BOTTOM_RADIUS = "popupWindowBottomRadius";
        public static final String KEY_TOP_RADIUS = "popupWindowTopRadius";

        /* renamed from: a */
        private float f2729a;
        private int c;
        private Drawable e;
        private float f;
        private float g;
        private int b = 0;
        private int d = 0;

        static {
            kge.a(259577072);
        }

        public static /* synthetic */ int a(C0102b c0102b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b917cddf", new Object[]{c0102b})).intValue() : c0102b.b;
        }

        public static /* synthetic */ float b(C0102b c0102b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46527f5d", new Object[]{c0102b})).floatValue() : c0102b.f2729a;
        }

        public static /* synthetic */ Drawable c(C0102b c0102b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("dc99620c", new Object[]{c0102b}) : c0102b.e;
        }

        public static /* synthetic */ int d(C0102b c0102b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("60c7e262", new Object[]{c0102b})).intValue() : c0102b.d;
        }

        public static /* synthetic */ float e(C0102b c0102b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee0293e0", new Object[]{c0102b})).floatValue() : c0102b.f;
        }

        public static /* synthetic */ float f(C0102b c0102b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b3d4561", new Object[]{c0102b})).floatValue() : c0102b.g;
        }

        public static /* synthetic */ int g(C0102b c0102b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("877f6e5", new Object[]{c0102b})).intValue() : c0102b.c;
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                this.f2729a = f;
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            this.f = f;
            this.g = f2;
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            } else {
                this.e = drawable;
            }
        }

        public float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f2729a;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
        }

        public Drawable d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("23d2f6ef", new Object[]{this}) : this.e;
        }

        public float e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.f;
        }

        public float f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : this.g;
        }
    }
}

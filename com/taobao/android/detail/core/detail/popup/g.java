package com.taobao.android.detail.core.detail.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.RoundRelativeLayout;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.detail.core.open.n;
import com.taobao.taobao.R;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float i;

    /* renamed from: a */
    private PopupWindow f9642a;
    private FrameLayout b;
    private RoundRelativeLayout c;
    private View d;
    private AlphaAnimation e;
    private AlphaAnimation f;
    private TranslateAnimation g;
    private TranslateAnimation h;
    private a j;
    private boolean k = false;
    private View l;
    private Context m;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a7c7ee", new Object[]{gVar});
        } else {
            gVar.d();
        }
    }

    public static /* synthetic */ View b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("eea9e14f", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ PopupWindow c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("701e1c88", new Object[]{gVar}) : gVar.f9642a;
    }

    public static /* synthetic */ AlphaAnimation d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlphaAnimation) ipChange.ipc$dispatch("4995e381", new Object[]{gVar}) : gVar.f;
    }

    public static /* synthetic */ a e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("957e5d3", new Object[]{gVar}) : gVar.j;
    }

    public static /* synthetic */ boolean f(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e2cbcd", new Object[]{gVar})).booleanValue() : gVar.k;
    }

    static {
        kge.a(-1495964831);
        i = 0.6f;
    }

    public g(Context context) {
        this.m = context;
        b();
        e();
        c();
        emu.a("com.taobao.android.detail.core.detail.popup.PopupWindowContainer");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = new FrameLayout(this.m);
        this.d = new View(this.m);
        this.d.setBackgroundColor(Color.parseColor("#7F000000"));
        this.b.addView(this.d);
        this.c = new RoundRelativeLayout(this.m);
        this.c.setBackgroundResource(R.drawable.shape_float_bg);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, (int) (a(this.m) * i), 80));
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e = new AlphaAnimation(0.0f, 1.0f);
        this.e.setDuration(200L);
        this.f = new AlphaAnimation(1.0f, 0.0f);
        this.f.setDuration(200L);
        this.f.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail.core.detail.popup.g.1
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
                g.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    g.a(g.this);
                }
            }
        });
        this.g = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.g.setDuration(200L);
        this.h = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.h.setDuration(200L);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!a()) {
        } else {
            Context context = this.m;
            if (!(context instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                return;
            }
            try {
                this.f9642a.dismiss();
            } catch (Exception e) {
                String stackTraceString = Log.getStackTraceString(e);
                com.taobao.android.detail.core.utils.i.a("PopupWindowContainer", "Exception:" + stackTraceString);
                ecg.i(this.m, stackTraceString);
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.popup.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                g.b(g.this).setEnabled(false);
                g.this.a(false);
            }
        });
        this.b.setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.android.detail.core.detail.popup.g.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i2), keyEvent})).booleanValue();
                }
                if (i2 == 4 && g.c(g.this).isShowing() && !g.d(g.this).hasStarted()) {
                    g.this.a(false);
                }
                return false;
            }
        });
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16aaf0f0", new Object[]{this, bVar});
        } else {
            a(bVar, LayoutInflater.from(this.m).inflate(R.layout.x_taodetail_loading_mask, (ViewGroup) null), null);
        }
    }

    public void a(b bVar, com.taobao.android.detail.core.detail.popup.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c47c8b", new Object[]{this, bVar, bVar2});
        } else if (bVar2 == null || bVar2.a() == null) {
        } else {
            a(bVar, bVar2.a(), bVar2);
        }
    }

    private void a(b bVar, View view, com.taobao.android.detail.core.detail.popup.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9bb159", new Object[]{this, bVar, view, bVar2});
            return;
        }
        if (this.f9642a == null) {
            this.f9642a = new PopupWindow(this.m);
            this.f9642a.setBackgroundDrawable(new ColorDrawable(0));
            this.f9642a.setWidth(-1);
            this.f9642a.setHeight(-1);
            this.f9642a.setSoftInputMode(16);
            this.f9642a.setOutsideTouchable(true);
            this.f9642a.setFocusable(true);
        }
        this.l = view;
        this.l.setClickable(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (a(this.m) * i));
        this.c.removeAllViews();
        this.c.addView(this.l, layoutParams);
        if (bVar != null && b.a(bVar) > 0.0f) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams2.height = (int) (a(this.m) * b.a(bVar));
            this.l.setLayoutParams(layoutParams2);
            this.c.getLayoutParams().height = layoutParams2.height;
            RoundRelativeLayout roundRelativeLayout = this.c;
            roundRelativeLayout.setLayoutParams(roundRelativeLayout.getLayoutParams());
        }
        this.d.setEnabled(true);
        this.f9642a.setContentView(this.b);
        final com.taobao.android.detail.core.open.g a2 = n.a(this.m);
        final l lVar = null;
        if (bVar2 != null && bVar2.b() != null) {
            lVar = bVar2.b();
        }
        if (a2 != null && lVar != null) {
            a2.a(lVar);
        }
        this.f9642a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.detail.core.detail.popup.PopupWindowContainer$4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                com.taobao.android.detail.core.open.g gVar;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                l lVar2 = lVar;
                if (lVar2 != null && (gVar = a2) != null) {
                    gVar.b(lVar2);
                }
                if (g.e(g.this) == null || g.f(g.this)) {
                    return;
                }
                g.e(g.this).a();
            }
        });
        if (a()) {
            return;
        }
        this.d.startAnimation(this.e);
        this.c.startAnimation(this.g);
        this.f9642a.showAtLocation(this.b, b.b(bVar), 0, 0);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = z;
        this.d.startAnimation(this.f);
        this.c.startAnimation(this.h);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16aa7c91", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        PopupWindow popupWindow = this.f9642a;
        return popupWindow != null && popupWindow.isShowing();
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        /* renamed from: a */
        private float f9646a = 0.6f;
        private int c = 0;

        static {
            kge.a(1803335637);
        }

        public static /* synthetic */ float a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("16aaf0e0", new Object[]{bVar})).floatValue() : bVar.f9646a;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30c66f82", new Object[]{bVar})).intValue() : bVar.b;
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                this.f9646a = f;
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return context.getResources().getConfiguration().orientation == 1 ? displayMetrics.heightPixels : displayMetrics.widthPixels;
    }
}
